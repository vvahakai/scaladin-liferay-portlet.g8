name := "$name$"

scalaVersion := "$scala_version$"

autoScalaLibrary := false

resolvers ++= Seq(
   "Arcusys snapshots" at "https://dev-1.arcusys.fi/mvn/content/repositories/public/"
)

libraryDependencies ++= Seq(
  "com.vaadin" % "vaadin-server" % "7.0.6" % "provided",
  "com.vaadin" % "vaadin-client-compiled" % "7.0.6" % "provided",
  "com.vaadin" % "vaadin-themes" % "7.0.6" % "provided",
  "vaadin.scala" %% "scaladin" % "3.0.0-SNAPSHOT" exclude("com.vaadin", "vaadin-server") exclude("org.scala-lang", "scala-library") exclude("org.scala-lang", "scala-reflect"),
  "javax.servlet" % "servlet-api" % "2.4" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container" artifacts Artifact("javax.servlet", "jar", "jar")
)

seq(webSettings :_*)

excludeFilter in unmanagedJars in Compile := "portlet-api-2.0.jar"
