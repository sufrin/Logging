// Build and locally publish by: sbt publishLocal

ThisBuild / version := "0.9.0"
ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "logging",
    idePackagePrefix := Some("org.sufrin.logging")
  )

ThisBuild / crossPaths := false
ThisBuild / organization := "org.sufrin"
ThisBuild / name := "glyph"
ThisBuild / version := "0.9.0"

resolvers += Resolver.file("local-ivy", new File(Path.userHome.absolutePath + "/.ivy2/repository"))(Resolver.ivyStylePatterns)

publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath + "/.m2/repository")))
