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

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.18")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.15")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.7.0"
