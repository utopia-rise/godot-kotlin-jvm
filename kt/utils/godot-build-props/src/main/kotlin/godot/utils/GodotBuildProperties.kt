package godot.utils

import java.util.*

object GodotBuildProperties {
    private val buildProperties by lazy {
        val props = Properties()
        props.load(GodotBuildProperties::class.java.classLoader.getResourceAsStream("build.properties"))
        props
    }

    val godotKotlinVersion by lazy {
        buildProperties["godot.jvm.version"] as String
    }

    val supportedKotlinVersion by lazy {
        buildProperties["godot.jvm.kotlin.version"] as String
    }
}
