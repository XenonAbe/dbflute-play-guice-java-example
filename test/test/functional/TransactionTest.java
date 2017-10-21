package test.functional;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.*;
import org.seasar.dbflute.QLog;
import org.springframework.transaction.UnexpectedRollbackException;
import play.Logger;
import play.test.FakeApplication;
import play.test.Helpers;
import utils.DBFluteTestUtils;
import utils.TestUtils;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TransactionTest {
    private static final Logger.ALogger logger = Logger.of(TransactionTest.class);

    private static FakeApplication app;
    private static TransactionTestService transactionTestService;

    @BeforeClass
    public static void start() {
        app = Helpers.fakeApplication();
        Helpers.start(app);
        transactionTestService = TestUtils.instanceOf(app, TransactionTestService.class);

        QLog.unlock();
    }

    @AfterClass
    public static void stop() {
        if (QLog.isLogEnabled())
            QLog.setLoggingInHolidayMood(true);
        transactionTestService.termination();
        QLog.setLoggingInHolidayMood(false);
        QLog.lock();

        transactionTestService = null;

        if (app != null) {
            Helpers.stop(app);
            app = null;
        }
    }

    @Before
    public void setup() {
        DBFluteTestUtils.setAccessContextInTest();

        if (QLog.isLogEnabled())
            QLog.setLoggingInHolidayMood(true);
        transactionTestService.initialize();
        QLog.setLoggingInHolidayMood(false);
    }

    @After
    public void teardown() {

    }

    private List<String> selectResultValues() {
        if (QLog.isLogEnabled())
            QLog.setLoggingInHolidayMood(true);
        final List<String> result = transactionTestService.selectValues();
        QLog.setLoggingInHolidayMood(false);
        return result;
    }

    @Test
    public void commitTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");

        try {
            transactionTestService.insertRequired(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo(values));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void commitTest2() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");

        try {
            transactionTestService.insertRequiresNew(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo(values));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void commitTest3() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");

        try {
            transactionTestService.insertNested(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo(values));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void commitMixTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");

        try {
            transactionTestService.insertTriple(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo((List<String>)new ImmutableList.Builder<String>().addAll(values).addAll(values2).addAll(values3).build()));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void commitMixByTemplateTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");

        try {
            transactionTestService.insertTripleByTemplate(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo((List<String>)new ImmutableList.Builder<String>().addAll(values).addAll(values2).addAll(values3).build()));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void rollbackTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertRequiredAndAbort(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName + "1", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertTripleAndAbort(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertByProtectedMethodAndAbort(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, is(Collections.EMPTY_LIST));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void rollbackByTemplateTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertRequiredAndAbortByTemplate(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName + "1", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertTripleAndAbortByTemplate(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, is(Collections.EMPTY_LIST));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void noRollbackTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        try {
            transactionTestService.insertAndNoRollbackNoEffectAbort(values, values2);
        } catch (Error e) {
            logger.warn(e.getMessage());
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName + "1", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertAndNoRollbackAbort(values, values2);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, equalTo((List<String>)new ImmutableList.Builder<String>().addAll(values).addAll(values2).build()));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void rollbackWholeTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        try {
            transactionTestService.insertDeeplyAndAbort(values);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName + "1", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertAndAbortDeeply(values, values2);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, is(Collections.EMPTY_LIST));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void unexpectedRollbackTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertAndAbortThenInsert(values, values2, values3);

            // 必ず例外発生
            assertThat(testName, true);

        } catch (UnexpectedRollbackException ignored) {
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
            assertThat(testName, true);
        }

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void requiresNewRollbackTest1() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertTripleWithRequiresNewAndAbort(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo(values2));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void requiresNewRollbackTest2() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertTripleWithRequiresNewAndAbortRequiresNewOnly(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo((List<String>)new ImmutableList.Builder<String>().addAll(values).addAll(values3).build()));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void requiresNewRollbackByTemplateTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertTripleWithRequiresNewAndAbortByTemplate(values, values2, values3);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName, result, equalTo(values2));

        logger.info("----------------------------------------------------{}-", testName);
    }


    @Test
    public void nestedRollbackTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertTripleWithNestedAndAbort(values, values2, values3);

        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName + "1", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertTripleWithNestedAndAbortNestedOnly(values, values2, values3);

        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, equalTo((List<String>)new ImmutableList.Builder<String>().addAll(values).addAll(values3).build()));

        logger.info("----------------------------------------------------{}-", testName);
    }

    @Test
    public void nestedRollbackByTemplateTest() {
        final String testName = TestUtils.getMethodName();
        logger.info("-{}----------------------------------------------------", testName);

        List<String> values = Lists.newArrayList(TransactionTestService.ValuePrefix + "X01");
        List<String> values2 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X02");
        List<String> values3 = Lists.newArrayList(TransactionTestService.ValuePrefix + "X03");
        try {
            transactionTestService.insertTripleWithNestedAndAbortByTemplate(values, values2, values3);

        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        List<String> result = selectResultValues();

        assertThat(testName + "1", result, is(Collections.EMPTY_LIST));

        logger.info("-----------------------------------------------------");

        try {
            transactionTestService.insertTripleWithNestedAndAbortNestedOnlyByTemplate(values, values2, values3);

        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        result = selectResultValues();

        assertThat(testName + "2", result, equalTo((List<String>)new ImmutableList.Builder<String>().addAll(values).addAll(values3).build()));

        logger.info("----------------------------------------------------{}-", testName);
    }

}
