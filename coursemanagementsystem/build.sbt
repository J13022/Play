name := """coursemanagementsystem"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
   "mysql" % "mysql-connector-java" % "5.1.20",
   "com.adrianhurt" %% "play-bootstrap" % "1.1-P25-B3",
   filters,
"org.webjars" % "bootstrap" % "3.3.7",
"org.webjars" % "jquery" % "2.2.3"
)
