package com.github.mysbtplugin

import sbt._

object SampleSbtPlugin extends AutoPlugin{

  object autoImport{
    val sampleKey = settingKey[String]("sampleKey")
  }

  override def trigger = allRequirements

  override def requires = plugins.JvmPlugin

  override def buildSettings = Seq(autoImport.sampleKey := "fromBuildSettings")
}
