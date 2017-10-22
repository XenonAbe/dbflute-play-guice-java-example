package test.functional;

import dbflute.exbhv.WidgetBhv;
import dbflute.exentity.Widget;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import play.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class TransactionTestService {
    private static final Logger.ALogger logger = Logger.of(TransactionTestService.class);

    private final WidgetBhv widgetBhv;
    private final TransactionTemplate transactionTemplate;
    private final TransactionTemplate transactionTemplateRequiresNew;
    private final TransactionTemplate transactionTemplateNested;

    static final String ValuePrefix = "$TXTEST$";

    @Inject
    public TransactionTestService(PlatformTransactionManager transactionManager, WidgetBhv widgetBhv) {
        this.widgetBhv = widgetBhv;
        transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplateRequiresNew = new TransactionTemplate(transactionManager);
        transactionTemplateRequiresNew.setPropagationBehavior(Propagation.REQUIRES_NEW.value());
        transactionTemplateNested = new TransactionTemplate(transactionManager);
        transactionTemplateNested.setPropagationBehavior(Propagation.NESTED.value());
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     */
    @Transactional
    public void insertRequired(List<String> values) {
        insertInternal(values);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * 例外を発生させてRollbackする
     */
    @Transactional
    public void insertRequiredAndAbort(List<String> values) {
        insertInternal(values);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * RuntimeExceptionではロールバックしない
     * 例外を発生させてRollbackする
     */
    @Transactional(noRollbackFor = {RuntimeException.class})
    public void insertRequiredAndNoRollbackNoEffectAbort(List<String> values) {
        insertInternal(values);

        throw new Error("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * RuntimeExceptionではロールバックしない
     * 例外を発生させるがRollbackしない
     */
    @Transactional(noRollbackFor = {RuntimeException.class})
    public void insertRequiredAndNoRollbackAbort(List<String> values) {
        insertInternal(values);

        throw new RuntimeException("Abort");
    }

    /**
     * TransactionTemplateによるトランザクション制御
     * 例外を発生させてRollbackする
     */
    public void insertRequiredAndAbortByTemplate(List<String> values) {
        transactionTemplate.execute(status -> {
            insertInternal(values);

            throw new RuntimeException("Abort");
        });
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * 新しいトランザクションを開始
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertRequiresNew(List<String> values) {
        insertInternal(values);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * 新しいトランザクションを開始
     * 例外を発生させてRollbackする
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertRequiresNewAndAbort(List<String> values) {
        insertInternal(values);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * ネストしたトランザクションを開始
     */
    @Transactional(propagation = Propagation.NESTED)
    public void insertNested(List<String> values) {
        insertInternal(values);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * ネストしたトランザクションを開始
     * 例外を発生させてRollbackする
     */
    @Transactional(propagation = Propagation.NESTED)
    public void insertNestedAndAbort(List<String> values) {
        insertInternal(values);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * Propagation混在
     */
    @Transactional
    public void insertTriple(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        insertRequiresNew(values2);

        insertNested(values3);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * Propagation混在
     * 例外を発生させてRollbackする
     */
    @Transactional
    public void insertTripleAndAbort(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        insertNested(values2);

        insertRequiresNewAndAbort(values3);
    }

    /**
     * TransactionTemplateによるトランザクション制御
     * Propagation混在
     */
    public void insertTripleByTemplate(List<String> values, List<String> values2, List<String> values3) {
        transactionTemplate.execute(status -> {
            insertInternal(values);

            transactionTemplateRequiresNew.execute(status2 -> {
                insertInternal(values2);
                return null;
            });

            transactionTemplateNested.execute(status2 -> {
                insertInternal(values3);
                return null;
            });
            return null;
        });
    }

    /**
     * TransactionTemplateによるトランザクション制御
     * Propagation混在
     * 例外を発生させてRollbackする
     */
    public void insertTripleAndAbortByTemplate(List<String> values, List<String> values2, List<String> values3) {
        transactionTemplate.execute(status -> {
            insertInternal(values);

            transactionTemplateNested.execute(status2 -> {
                insertInternal(values2);
                return null;
            });

            transactionTemplateRequiresNew.execute(status2 -> {
                insertInternal(values3);
                throw new RuntimeException("Abort");
            });
            return null;
        });
    }

    /**
     * 呼び出し先のprotected メソッドでTransactionalアノテーションによるトランザクション制御
     */
    public void insertByProtectedMethodAndAbort(List<String> values) {
        insertOnProtectedMethodAndAbort(values);
    }

    /**
     * protected メソッドのTransactionalアノテーションによるトランザクション制御
     * 例外を発生させてRollbackする
     * @see AnnotationTransactionAttributeSource#publicMethodsOnly
     */
    @Transactional
    protected void insertOnProtectedMethodAndAbort(List<String> values) {
        insertInternal(values);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * サブルーチンで例外発生してRollbackする
     */
    @Transactional
    public void insertAndNoRollbackNoEffectAbort(List<String> values, List<String> values2) {
        insertInternal(values);

        try {
            insertRequiredAndNoRollbackNoEffectAbort(values2);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * サブルーチンで例外発生するがRollbackしない
     */
    @Transactional
    public void insertAndNoRollbackAbort(List<String> values, List<String> values2) {
        insertInternal(values);

        try {
            insertRequiredAndNoRollbackAbort(values2);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * サブルーチンもTransactionalアノテーションによるトランザクション制御
     * 例外を発生させてRollbackする
     */
    @Transactional
    public void insertDeeplyAndAbort(List<String> values) {
        insertRequired(values);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * サブルーチンもTransactionalアノテーションによるトランザクション制御
     * 例外を発生させてRollbackする
     */
    @Transactional
    public void insertAndAbortDeeply(List<String> values, List<String> values2) {
        insertInternal(values);

        insertRequiredAndAbort(values2);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * サブルーチンでRollbackした後さらにinsertしようとするため
     * 必ず例外が発生する
     */
    @Transactional
    public void insertAndAbortThenInsert(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        try {
            insertRequiredAndAbort(values2);
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }

        insertInternal(values3);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * 別トランザクションも使用
     * 例外を発生させてRollbackするが別トランザクションはCommitしている
     */
    @Transactional
    public void insertTripleWithRequiresNewAndAbort(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        insertRequiresNew(values2);

        insertRequired(values3);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * 別トランザクションも使用
     * 新しいトランザクションのみRollback
     */
    @Transactional
    public void insertTripleWithRequiresNewAndAbortRequiresNewOnly(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        try {
            insertRequiresNewAndAbort(values2);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        insertRequired(values3);
    }

    /**
     * TransactionTemplateによるトランザクション制御
     * 別トランザクションも使用
     * 例外を発生させてRollbackするが別トランザクションはCommitしている
     */
    @Transactional
    public void insertTripleWithRequiresNewAndAbortByTemplate(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        transactionTemplateRequiresNew.execute(status -> {
            insertInternal(values2);
            return null;
        });

        insertRequired(values3);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * ネストしたトランザクションともにRollback
     */
    @Transactional
    public void insertTripleWithNestedAndAbort(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        insertNestedAndAbort(values2);

        insertInternal(values3);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * ネストしたトランザクションともにRollback
     */
    @Transactional
    public void insertTripleWithNestedAndAbortByTemplate(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        transactionTemplateNested.execute(status -> {
            insertInternal(values2);
            return null;
        });

        insertInternal(values3);

        throw new RuntimeException("Abort");
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * ネストしたトランザクションのみRollback
     */
    @Transactional
    public void insertTripleWithNestedAndAbortNestedOnly(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        try {
            insertNestedAndAbort(values2);
        } catch (RuntimeException e) {
            logger.warn(e.getMessage());
        }

        insertInternal(values3);
    }

    /**
     * Transactionalアノテーションによるトランザクション制御
     * ネストしたトランザクションのみRollback
     */
    @Transactional
    public void insertTripleWithNestedAndAbortNestedOnlyByTemplate(List<String> values, List<String> values2, List<String> values3) {
        insertInternal(values);

        try {
            transactionTemplateNested.execute(status -> {
                insertInternal(values2);

                throw new RuntimeException("Abort");
            });
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }

        insertInternal(values3);
    }

    /**
     * 初期化
     * データのクリーンアップ
     */
    @Transactional
    public void initialize() {
        deleteAll();
    }

    /**
     * 終了処理
     * データのクリーンアップ
     */
    @Transactional
    public void termination() {
        deleteAll();
    }

    public List<String> selectValues() {
        return widgetBhv.selectList(cb -> {
            cb.query().setName_LikeSearch(ValuePrefix, option -> option.likePrefix());
            cb.query().addOrderBy_Name_Asc();
            cb.specify().columnName();
        })
                .stream().map(entity -> entity.getName()).collect(Collectors.toList());
    }

    private void insertInternal(List<String> values) {
        values.stream().forEach(value -> {
            Widget entity = new Widget();
            entity.setName(value);
            entity.setPrice(0);
            widgetBhv.insert(entity);
        });
    }

    /**
     * テストで使用する, ValuePrefixで始まるデータをすべて削除
     */
    private void deleteAll() {
        widgetBhv.queryDelete(cb -> {
            cb.query().setName_LikeSearch(ValuePrefix, option -> option.likePrefix());
        });
    }
}
