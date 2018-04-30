name := "ScalaDays-2018"
version := "1.0"
scalaVersion := "2.11.12"

// (2) configure a general setting
maintainer := "Nepomuk Seiler <muki@gutefrage.net>"

// (3) configure scoped settings
packageDescription in Debian := "Debian package description"
packageDescription in Rpm := "Rpm package description"

// (4) configure format specific settings
rpmVendor := "rocks.muki"
rpmLicense := Some("MIT")

// (5) scala native package
enablePlugins(UniversalPlugin, ScalaNativePlugin)
mappings in Universal += (nativeLink in Compile).value -> executableScriptName.value

// (6) debian package with /usr/bin link
enablePlugins(DebianPlugin)

import com.typesafe.sbt.packager.linux._
linuxPackageSymlinks += LinuxSymlink(
  link = s"/usr/bin/${executableScriptName.value}",
  destination = (file(defaultLinuxInstallLocation.value) / packageName.value / executableScriptName.value).toString
)
