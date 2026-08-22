package com.utopiarise.godotjvm

import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin

class GodotJvmPlugin(godot: Godot) : GodotPlugin(godot) {
    init {
        check(nativeInitialize()) { "Could not pass Android's Java VM to Godot-JVM" }
    }

    override fun getPluginName() = "GodotJvm"

    override fun getPluginGDExtensionLibrariesPaths() = setOf("res://addons/jvm/jvm.gdextension")

    private external fun nativeInitialize(): Boolean

    companion object {
        init {
            System.loadLibrary("godot_jvm")
        }
    }
}
