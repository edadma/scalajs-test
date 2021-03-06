addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1")

resolvers += Resolver.bintrayRepo("oyvindberg", "converter")

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta12")

resolvers += Resolver.bintrayRepo("edadma", "sbt-plugins")

addSbtPlugin("xyz.hyperreal" % "npm-plugin" % "0.1.6")
