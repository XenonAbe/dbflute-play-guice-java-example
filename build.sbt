name := """dbflute-play-guice-java-example"""

def commonSettings = Seq(
  version := "2.4.1",
  scalaVersion := "2.11.6",     // cf. templates/build.sbt in Play Framework Source
  javacOptions ++= Seq("-encoding", "utf8")
)

lazy val root = Project("Example-Main", file("."))
  .enablePlugins(PlayJava)
  .dependsOn(dbflute)
  .aggregate(dbflute)
  .settings(
    commonSettings,
    libraryDependencies ++= Seq(
      javaJdbc,
      cache,
      javaWs,
      filters,
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

routesGenerator := InjectedRoutesGenerator

javaOptions in Test ++= Seq(
  "-Dconfig.resource=application-test.conf",
  "-Dlogger.resource=logback-test.xml"
)
