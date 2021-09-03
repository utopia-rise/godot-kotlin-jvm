package godot.gradle.projectExt

import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

fun Project.checkKotlinVersionCompatibility() {
    val kotlinPlugin = plugins.findPlugin(KotlinPluginWrapper::class.java)
    val kotlinPluginVersion = buildscript
        .configurations
        .firstOrNull { it.name == "classpath" }
        ?.dependencies
        ?.firstOrNull { it.name == "org.jetbrains.kotlin.jvm.gradle.plugin" }
        ?.version

    val isSuppressingKotlinIncompatibility =
        (findProperty("godot.jvm.suppressKotlinIncompatibility") as? String)?.toBoolean() ?: false

    if (!isSuppressingKotlinIncompatibility) {
        logger.info("Kotlin plugin already applied: ${kotlinPlugin != null}; detected version: ${kotlinPluginVersion ?: "none"}")

        when {
            kotlinPlugin != null && kotlinPluginVersion != null && kotlinPluginVersion != GodotBuildProperties.supportedKotlinVersion -> throw IllegalArgumentException(
                "Detected that a kotlin plugin with version $kotlinPluginVersion is already applied. But Godot-Kotlin is only compatible with kotlin ${GodotBuildProperties.supportedKotlinVersion}, please change the version to ${GodotBuildProperties.supportedKotlinVersion}"
            )
            kotlinPlugin == null && kotlinPluginVersion != null && kotlinPluginVersion != GodotBuildProperties.supportedKotlinVersion -> throw IllegalArgumentException(
                "Detected that kotlin plugin version $kotlinPluginVersion is already defined. But Godot-Kotlin is only compatible with kotlin ${GodotBuildProperties.supportedKotlinVersion}, please change the version to ${GodotBuildProperties.supportedKotlinVersion}"
            )
            kotlinPlugin == null && kotlinPluginVersion == null || kotlinPluginVersion == GodotBuildProperties.supportedKotlinVersion -> {
                pluginManager.apply("org.jetbrains.kotlin.jvm") // the version will be the one with which this plugin was built
            }
        }
    } else {
        // warn is not really visible enough in the log. As this is a very important print, error is used to print it more visible
        logger.error("Found property \"godot.jvm.suppressKotlinIncompatibility\" is set to \"true\". This is an advanced feature! Only use it if you know what you're doing. We cannot guarantee that our compiler plugin is compatible with other kotlin version that ${GodotBuildProperties.supportedKotlinVersion} (found version: $kotlinPluginVersion). Setting this property to true can lead to build and/or runtime errors.")
    }
}
