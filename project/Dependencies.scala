import sbt._
import sbt.Keys._

object Dependencies {

  val circeVersion = "0.14.1"
  val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

  val shapeless = Seq("com.chuusai" %% "shapeless" % "2.3.7")

}