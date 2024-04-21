ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "test-repo",
    idePackagePrefix := Some("io.github.thanhz")
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.18" % "test",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.5.6",
  "com.softwaremill.sttp.client" %% "core" % "2.3.0",
  "com.softwaremill.sttp.client" %% "circe" % "2.3.0",
  "com.softwaremill.sttp.client" %% "async-http-client-backend-future" % "2.3.0"
)