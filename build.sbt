name := """dbflute-play-guice-java-example"""

def commonSettings = Seq(
  version := "2.6.1",
  scalaVersion := "2.12.2",     // cf. play-java-starter-example
  javacOptions ++= Seq("-encoding", "utf8")
)

lazy val root = Project("Example-Main", file("."))
  .enablePlugins(PlayJava)
  .dependsOn(dbflute)
  .aggregate(dbflute)
  .settings(
    commonSettings,
    libraryDependencies ++= Seq(
      guice,
      javaJdbc,
      "com.h2database" % "h2" % Dependencies.h2databaseVersion,
      "org.springframework" % "spring-jdbc" % Dependencies.springframeworkVersion,
      "org.springframework" % "spring-aop" % Dependencies.springframeworkVersion
    )
  )

lazy val dbflute = Project("Example-DBFlute", file("dbflute"))
//  .disablePlugins(PlayEnhancer)
  .settings(
    commonSettings,
    autoScalaLibrary := false,
    crossPaths := false,
    libraryDependencies ++= Seq(
      Dependencies.guice,
      Dependencies.dbfluteRuntime
    )
  )

javaOptions in Test ++= Seq(
  "-Dconfig.resource=application-test.conf",
  "-Dlogger.resource=logback-test.xml"
)

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
