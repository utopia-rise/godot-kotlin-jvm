package godot.plugins.common

import godot.utils.GodotBuildProperties
import java.io.Serializable

interface GodotKotlinJvmPropertiesFile : Serializable {
    val currentGradlePluginVersion: String
    val minimumIdePluginVersion: String
    val isFqNameRegistrationEnabled: Boolean
}

data class GodotKotlinJvmPropertiesFileImpl(
    override val isFqNameRegistrationEnabled: Boolean = false,
    override val currentGradlePluginVersion: String = GodotBuildProperties.godotKotlinJvmVersion,
    override val minimumIdePluginVersion: String = GodotBuildProperties.godotKotlinJvmVersion,
) : GodotKotlinJvmPropertiesFile
