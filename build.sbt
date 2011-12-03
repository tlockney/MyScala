import AssemblyKeys._

name := "myscala"

organization := "net.lockney"

version := "0.1"

seq(assemblySettings: _*)

mainClass in assembly := Some("scala.tools.nsc.MainGenericRunner")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % "2.9.1",
  "org.scala-lang" % "jline" % "2.9.1"
)
