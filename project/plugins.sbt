scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

addSbtPlugin("org.playframework.twirl" % "sbt-twirl" % "2.0.1") // https://github.com/sbt/sbt/issues/6400
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.9.0")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.6")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.14"
libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % "always"
