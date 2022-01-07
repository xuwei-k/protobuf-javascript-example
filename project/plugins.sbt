scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.5.1") // https://github.com/sbt/sbt/issues/6400
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.12")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.6")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.8"
