name := "scala-akka-sample"

version := "1.0"

scalaVersion := "2.10.0"

//resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"


//libraryDependencies +=
//  "com.typesafe.akka" % "akka-actor_2.10" % "2.4-SNAPSHOT"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
   
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.2-M1"

mainClass in (Compile, run) := Some("PingPongTest")
//mainClass in (Compile, run) := Some("Main")

