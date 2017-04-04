scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.13")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.7")
libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.0-pre3"
