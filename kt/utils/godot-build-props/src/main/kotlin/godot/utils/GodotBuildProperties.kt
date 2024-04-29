package godot.utils

import java.util.*

object GodotBuildProperties {
    private val buildProperties by lazy {
        val props = Properties()
        props.load(GodotBuildProperties::class.java.classLoader.getResourceAsStream("build.properties"))
        props
    }

    val assembledGodotKotlinJvmVersion by lazy {
        buildProperties["godot.kotlin.jvm.assembled.version"] as String
    }

    val godotKotlinJvmVersion by lazy {
        buildProperties["godot.kotlin.jvm.version"] as String
    }

    val godotVersion by lazy {
        buildProperties["godot.version"] as String
    }

    val supportedKotlinVersion by lazy {
        buildProperties["kotlin.version"] as String
    }

    val iosJdkVersion by lazy {
        buildProperties["ios.jdk.version"] as String
    }

    val iosGraalJdkBuildVersion by lazy {
        buildProperties["ios.graal.jdk.build.version"] as String
    }
}
