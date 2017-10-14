lazy val `hello-play-26` = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "hello-play-26",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.12.2",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatest" %% "scalatest" % "3.0.4" % "test"
    )
  )
