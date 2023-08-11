package godot.gradle.properties

import godot.plugins.common.GodotKotlinJvmPropertiesFile
import godot.tools.common.constants.FileExtensions
import godot.utils.GodotBuildProperties

data class GodotKotlinJvmPropertiesFileImpl(
    override val isFqNameRegistrationEnabled: Boolean = false,
    override val isRegistrationFileHierarchyEnabled: Boolean = true,
    override val currentGradlePluginVersion: String = GodotBuildProperties.assembledGodotKotlinJvmVersion,
    override val minimumIdePluginVersion: String = GodotBuildProperties.assembledGodotKotlinJvmVersion,
    override val registrationFileBaseDir: String = FileExtensions.GodotKotlinJvm.registrationFile
) : GodotKotlinJvmPropertiesFile
