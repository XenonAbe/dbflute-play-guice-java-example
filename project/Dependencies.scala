import sbt._

object Dependencies {

  // see framework/project/Dependencies.scala in Play Framework Source
  val springframeworkVersion = "4.2.7.RELEASE"
  val guiceVersion = "4.0"

  val guice = "com.google.inject" % "guice" % Dependencies.guiceVersion

  val dbFluteVersion = "1.1.4"
  val dbfluteRuntime = "org.dbflute" % "dbflute-runtime" % dbFluteVersion
}
