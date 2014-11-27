import sbt._
import sbt.Keys._
import Keys._
import com.typesafe.sbteclipse.core._
import com.typesafe.sbteclipse.plugin.EclipsePlugin._
import com.typesafe.sbteclipse.core.Validation
import scala.xml._
import scala.xml.transform.RewriteRule

object Common {
    val libDbfluteRuntime = "org.seasar.dbflute" % "dbflute-runtime" % "1.0.5N"
    val libGuice = "com.google.inject" % "guice" % "3.0"
    val additionalResolvers = "The Seasar Foundation Maven2 Repository" at "http://maven.seasar.org/maven2"
}
