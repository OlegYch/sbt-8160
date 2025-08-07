Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / usePipelining := true
ThisBuild / scalaVersion := "3.7.1"
lazy val a = project.enablePlugins(SbtTwirl)
lazy val b = project.enablePlugins(SbtTwirl)
lazy val c = project.dependsOn(a,b).enablePlugins(SbtTwirl)