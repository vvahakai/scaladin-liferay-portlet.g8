name := "$name$"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "com.vaadin" % "vaadin-server" % "7.0.5",
  "com.vaadin" % "vaadin-client-compiled" % "7.0.5",
  "com.vaadin" % "vaadin-themes" % "7.0.5",
  "vaadin.scala" %% "scaladin" % "3.0.0-SNAPSHOT",
  "javax.servlet" % "servlet-api" % "2.4",
)

seq(webSettings :_*)

excludeFilter in unmanagedJars in Compile := "portlet-api-2.0.jar"
