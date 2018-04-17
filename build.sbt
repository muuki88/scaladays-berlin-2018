name := "ScalaDays-2018"
version := "1.0"
scalaVersion := "2.12.5"

enablePlugins(JavaAppPackaging)

maintainer := "Nepomuk Seiler <muki@gutefrage.net>"

packageDescription in Debian := "Debian package description"
packageDescription in Rpm := "Rpm package description"

rpmVendor := "rocks.muki"
rpmLicense := Some("MIT")
