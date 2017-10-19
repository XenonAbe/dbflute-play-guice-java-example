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
      filters,
      Dependencies.guice,
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

PlayKeys.ebeanEnabled := false
