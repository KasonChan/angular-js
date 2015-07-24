name := "Angularjs"

version := "1.0"

lazy val `angularjs` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(jdbc,
  anorm,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "angularjs" % "1.1.5-1",
  "org.webjars" % "bootstrap" % "2.3.2")

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")