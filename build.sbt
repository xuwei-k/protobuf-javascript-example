import scalapb.compiler.Version.scalapbVersion

name := "protobuf-javascript-esample"

enablePlugins(PlayScala)

scalaVersion := "2.13.16"

licenses := Seq("MIT License" -> url("https://www.opensource.org/licenses/mit-license"))

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)

shellPrompt := { state =>
  val branch = if(file(".git").exists){
    sys.process.Process("git branch").lineStream_!.find{_.head == '*'}.map{_.drop(1)}.getOrElse("")
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

libraryDependencies ++= Seq(
  guice,
  "org.webjars" %% "webjars-play" % "3.0.2",
  "org.webjars" % "closure-library" % "20150412-848686a",
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
)
