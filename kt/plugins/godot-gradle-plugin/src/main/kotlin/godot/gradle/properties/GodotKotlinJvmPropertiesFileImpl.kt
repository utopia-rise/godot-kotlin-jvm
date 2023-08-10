package godot.gradle.properties

import godot.plugins.common.GodotKotlinJvmPropertiesFile
import godot.utils.GodotBuildProperties

data class GodotKotlinJvmPropertiesFileImpl(
    override val isFqNameRegistrationEnabled: Boolean = false,
    override val currentGradlePluginVersion: String = GodotBuildProperties.godotKotlinJvmVersion,
    override val minimumIdePluginVersion: String = GodotBuildProperties.godotKotlinJvmVersion,
) : GodotKotlinJvmPropertiesFile
