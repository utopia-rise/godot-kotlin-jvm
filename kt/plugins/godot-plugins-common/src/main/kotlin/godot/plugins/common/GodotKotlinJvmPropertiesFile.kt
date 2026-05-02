package godot.plugins.common

import godot.tools.common.constants.FileExtensions
import godot.utils.GodotBuildProperties
import java.io.Serializable

/**
 * Properties file to load gradle configuration from ide plugin
 *
 * This enables us to read the users configuration of our gradle extension and use that information for code checks in the IDE plugin
 */
interface GodotKotlinJvmPropertiesFile : Serializable {
    val currentGradlePluginVersion: String
        get() = GodotBuildProperties.godotKotlinJvmVersion
    val minimumIdePluginVersion: String
        get() = GodotBuildProperties.godotKotlinJvmVersion
    val registeredNameMode: String
        get() = "SIMPLE_NAME"
    val registrationFileLayoutMode: String
        get() = "FLAT"
    val registrationFileBaseDir: String
        get() = FileExtensions.GodotKotlinJvm.registrationFile
}
