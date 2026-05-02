package godot.gradle.projectExt

import godot.tools.common.KOTLIN_VERSION
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

fun Project.checkKotlinVersionCompatibility() {
    val kotlinPlugin = plugins.findPlugin(KotlinPluginWrapper::class.java)
    val kotlinPluginVersion = detectedKotlinPluginVersion()

    logger.info("Kotlin plugin already applied: ${kotlinPlugin != null}; detected version: ${kotlinPluginVersion ?: "none"}")

    when {
        kotlinPluginVersion != null && isVersionLowerThan(kotlinPluginVersion, KOTLIN_VERSION) -> throw IllegalArgumentException(
            "Detected Kotlin Gradle plugin version $kotlinPluginVersion, but Godot-Kotlin requires at least Kotlin $KOTLIN_VERSION."
        )

        kotlinPlugin == null && kotlinPluginVersion == null -> {
            pluginManager.apply(KotlinPluginWrapper::class.java)
        }
    }

    afterEvaluate {
        val configuredKotlinVersion = godotJvmExtension.kotlinVersion.get()
        val resolvedKotlinVersion = resolvedKotlinBuildVersion()

        require(!isVersionLowerThan(configuredKotlinVersion, KOTLIN_VERSION)) {
            "godot.kotlinVersion is set to $configuredKotlinVersion, but Godot-Kotlin requires at least Kotlin $KOTLIN_VERSION."
        }

        if (configuredKotlinVersion != KOTLIN_VERSION && configuredKotlinVersion != resolvedKotlinVersion) {
            throw IllegalArgumentException(
                "godot.kotlinVersion is set to $configuredKotlinVersion, but the applied Kotlin Gradle plugin version is $resolvedKotlinVersion. " +
                    "To use a custom Kotlin version, apply `org.jetbrains.kotlin.jvm` explicitly with version $configuredKotlinVersion before `com.utopia-rise.godot-kotlin-jvm`."
            )
        }
    }
}

fun Project.detectedKotlinPluginVersion(): String? = buildscript
    .configurations
    .firstOrNull { it.name == "classpath" }
    ?.dependencies
    ?.firstOrNull { it.name == "org.jetbrains.kotlin.jvm.gradle.plugin" }
    ?.version

fun Project.resolvedKotlinBuildVersion(): String = detectedKotlinPluginVersion() ?: KOTLIN_VERSION
