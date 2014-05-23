import sbt._
import sbt.Keys._
import xerial.sbt.Pack._

object Build extends sbt.Build {

  lazy val root = Project(
    id = "min-project",
    base = file("."),
    settings = Defaults.defaultSettings ++ packSettings ++
      Seq(
        scalaVersion := "2.10.3",
        // Mapping from program name -> Main class
        packMain := Map("hello" -> "minproject.Hello"),
        // custom settings here
        crossPaths := false,

        libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.0" % "test"
      )
  )
}
