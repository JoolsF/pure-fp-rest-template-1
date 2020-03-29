import Dependencies._

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-fp-experiment-1",
    libraryDependencies ++= Seq(
      Libraries.cats,
      Libraries.catsEffect,
      Libraries.http4sDsl,
      Libraries.http4sServer,
      Libraries.http4sClient,
      Libraries.http4sCirce,
      Libraries.http4sJwtAuth,
      Libraries.circeCore,
      Libraries.circeGeneric,
      Libraries.circeParser,
      Libraries.circeRefined
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
