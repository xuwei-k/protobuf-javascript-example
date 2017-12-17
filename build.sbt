import scalapb.compiler.Version.scalapbVersion

name := "protobuf-javascript-esample"

enablePlugins(PlayScala)

scalaVersion := "2.11.11"

licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license"))

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

shellPrompt := { state =>
  val branch = if(file(".git").exists){
    "git branch".lines_!.find{_.head == '*'}.map{_.drop(1)}.getOrElse("")
  }else ""
  Project.extract(state).currentRef.project + branch + " > "
}

PB.targets in Compile := Seq(
  protocbridge.Target(
    PB.gens.js,
    (baseDirectory in LocalRootProject).value / "public" / "javascripts",
    Seq("library=my-protobuf,binary")
  )
)

PB.protoSources in Compile += PB.externalIncludePath.value

libraryDependencies ++= (
  ("org.webjars" %% "webjars-play" % "2.5.0-4") ::
  ("org.webjars" % "closure-library" % "20150412-848686a") ::
  ("com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf") ::
  Nil
)
