name := """dbflute-play-guice-java-example"""

def commonSettings = Seq(
  version := "2.3.1-SNAPSHOT",
  scalaVersion := "2.11.6",     // cf. templates/build.sbt in Play Framework Source
  javacOptions ++= Seq("-encoding", "utf8"),
  resolvers += Dependencies.additionalResolvers
)

lazy val root = Project("Example-Main", file("."))
  .enablePlugins(PlayJava)
  .dependsOn(dbflute)
  .aggregate(dbflute)
  .settings(
    commonSettings,
    libraryDependencies ++= Seq(
      javaJdbc,
      //javaEbean,
      cache,
      javaWs,
      Dependencies.guice,
      "org.springframework" % "spring-jdbc" % Dependencies.springframeworkVersion,
      "org.springframework" % "spring-aop" % Dependencies.springframeworkVersion,
      "com.h2database" % "h2" % Dependencies.h2databaseVersion
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
      Dependencies.dbfluteRuntime,
      "joda-time" % "joda-time" % "2.3",
      "net.arnx" % "jsonic" % "1.2.11",
      "net.vvakame" % "jsonpullparser-core" % "1.4.11",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.1.3"
    )
  )

PlayKeys.ebeanEnabled := false
