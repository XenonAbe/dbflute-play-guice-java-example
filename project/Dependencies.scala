import sbt._
import sbt.Keys._
import Keys._
import com.typesafe.sbteclipse.core._
import com.typesafe.sbteclipse.plugin.EclipsePlugin._
import com.typesafe.sbteclipse.core.Validation
import scala.xml._
import scala.xml.transform.RewriteRule

object Dependencies {

  // see framework/project/Dependencies.scala in Play Framework Source
  val springframeworkVersion = "4.0.3.RELEASE"
  val h2databaseVersion = "1.3.175"

  val guiceVersion = "3.0"
  val guice = "com.google.inject" % "guice" % Dependencies.guiceVersion

  val dbFluteVersion = "1.0.5N"
  val dbfluteRuntime = "org.seasar.dbflute" % "dbflute-runtime" % dbFluteVersion

  val additionalResolvers = "The Seasar Foundation Maven2 Repository" at "http://maven.seasar.org/maven2"
}
