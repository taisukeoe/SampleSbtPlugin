lazy val root = (project in file(".")).settings(
  name := "SampleSbtPlugin",
  version := "0.1-SNAPSHOT",
  organization := "com.github.mysbtplugin",
  sbtPlugin := true,
  scriptedLaunchOpts := {
    scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
  },
  scriptedBufferLog := false
)