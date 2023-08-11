package godot.plugins.common

import godot.utils.GodotBuildProperties
import java.io.Serializable

/**
 * Properties file to load gradle configuration from ide plugin
 *
 * This enables us to read the users configuration of our gradle extension and use that information for code checks in the IDE plugin
 */
interface GodotKotlinJvmPropertiesFile : Serializable {
    val currentGradlePluginVersion: String
        get() = GodotBuildProperties.assembledGodotKotlinJvmVersion
    val minimumIdePluginVersion: String
        get() = GodotBuildProperties.assembledGodotKotlinJvmVersion
    val isFqNameRegistrationEnabled: Boolean
        get() = false
    val isRegistrationFileHierarchyEnabled: Boolean
        get() = true
    val registrationFileBaseDir: String
        get() = "gdj"
}
