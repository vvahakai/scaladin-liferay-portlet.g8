import sbt._
import Keys._
import com.earldouglas.xsbtwebplugin.WebPlugin.webSettings
import org.scalastyle.sbt.ScalastylePlugin.{Settings => ScalaStyleSettings}

object $name;format="Camel"$Build extends Build {
  val Organization = "$organization$"
  val Name = "$name$"
  val Version = "$version$"
  val ScalaVersion = "$scala_version$"

  val repositories = Seq(
  	"Arcusys snapshots" at "https://dev-1.arcusys.fi/mvn/content/repositories/public/"
  )

  val dependencies = Seq(
  	"com.vaadin" % "vaadin-server" % "7.0.6" % "provided",
  	"com.vaadin" % "vaadin-client-compiled" % "7.0.6" % "provided",
    "com.vaadin" % "vaadin-themes" % "7.0.6" % "provided",
    "org.scala-lang" % "scala-library" % "2.10.1" % "provided",
    "org.scala-lang" % "scala-reflect" % "2.10.1" % "provided",
    "vaadin.scala" %% "scaladin" % "3.0.0-SNAPSHOT" exclude("com.vaadin", "vaadin-server") exclude("org.scala-lang", "scala-library") exclude("org.scala-lang", "scala-reflect"),
    "javax.servlet" % "servlet-api" % "2.4" % "provided",
    "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container" artifacts Artifact("javax.servlet", "jar", "jar")
  )

  lazy val project = Project (
  	"$name;format="norm"$",
  	file("."),
  	settings = Defaults.defaultSettings ++ webSettings ++ ScalaStyleSettings ++ Seq(
  		organization := Organization,
  		name := Name,
  		version := Version,
  		scalaVersion := ScalaVersion,
  		resolvers ++= repositories,
  		libraryDependencies ++= dependencies,
  		excludeFilter in unmanagedJars in Compile := "portlet-api-2.0.jar",
  		autoScalaLibrary := false
  	)
  )
}