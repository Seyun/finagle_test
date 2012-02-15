name := "finagle_test"

scalaVersion := "2.9.1"

resolvers += "Twitter" at "http://maven.twttr.com"

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

libraryDependencies += "com.twitter" % "finagle-core" % "1.11.0"

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.9.1" 