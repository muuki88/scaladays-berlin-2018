name := "ScalaDays-2018"
version := "1.0"
scalaVersion := "2.11.12"

// (1) enabling JavaAppPackaging
enablePlugins(JavaAppPackaging)

// (2) configure a general setting
maintainer := "Nepomuk Seiler <muki@gutefrage.net>"

// (3) configure scoped settings
packageDescription in Debian := "Debian package description"
packageDescription in Rpm := "Rpm package description"

// (4) configure format specific settings
rpmVendor := "rocks.muki"
rpmLicense := Some("MIT")
