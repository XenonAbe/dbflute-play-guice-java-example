name := "dbflute-exampledb"

version := "1.0-SNAPSHOT"

autoScalaLibrary := false

crossPaths := false

javacOptions ++= Seq("-encoding", "utf8")

libraryDependencies ++= Seq(
  Common.libDbfluteRuntime,
  Common.libGuice,
  "joda-time" % "joda-time" % "2.3",
  "net.arnx" % "jsonic" % "1.2.11",
  "net.vvakame" % "jsonpullparser-core" % "1.4.11",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.1.3"
)

resolvers += Common.additionalResolvers

sources in (Compile, doc) := Seq.empty

// eclipse settings

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE17)

EclipseKeys.withSource := true

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.skipParents in ThisBuild := false
