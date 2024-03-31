ThisBuild / organization := "org.galaxio"
ThisBuild / scmInfo      := Some(
  ScmInfo(
    url("https://github.com/galax-io/gatling-kafka-plugin"),
    "git@github.com:galax-io/gatling-kafka-plugin.git",
  ),
)

ThisBuild / developers := List(
  Developer(
    id = "jigarkhwar",
    name = "Ioann Akhaltsev",
    email = "none",
    url = url("https://github.com/jigarkhwar"),
  ),
)

ThisBuild / description := "Plugin to support kafka performance testing in Gatling(3.9.x)."
ThisBuild / licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
ThisBuild / homepage    := Some(url("https://github.com/galax-io/gatling-kafka-plugin"))
