ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "InvestigacionReactiva",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % "2.7.0",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.7.0"
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % "2.7.0",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.7.0"
    )
  )
