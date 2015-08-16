

import AssemblyKeys._

assemblySettings

name := "Test"

version := "1.0"

scalaVersion := "2.11.7"

jarName in assembly := "hello.jar"

mainClass in Compile := Some("hw")