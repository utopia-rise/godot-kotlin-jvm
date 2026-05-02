package godot.gradle.properties

import godot.plugins.common.GodotKotlinJvmPropertiesFile
import godot.tools.common.constants.FileExtensions
import godot.utils.GodotBuildProperties

data class GodotKotlinJvmPropertiesFileImpl(
    override val registeredNameMode: String = "SIMPLE_NAME",
    override val registrationFileLayoutMode: String = "FLAT",
    override val currentGradlePluginVersion: String = GodotBuildProperties.godotKotlinJvmVersion,
    override val minimumIdePluginVersion: String = GodotBuildProperties.godotKotlinJvmVersion,
    override val registrationFileBaseDir: String = FileExtensions.GodotKotlinJvm.registrationFile
) : GodotKotlinJvmPropertiesFile
