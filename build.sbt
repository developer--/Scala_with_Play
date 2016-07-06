name := "Scala_with_Play"

version := "1.0"

lazy val `scala_with_play` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  jdbc , cache , ws   , specs2 % Test ,
  "org.sorm-framework" % "sorm" % "0.3.19"
)

dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

