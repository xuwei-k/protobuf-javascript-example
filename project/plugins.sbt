scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.7")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.2")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.0"
