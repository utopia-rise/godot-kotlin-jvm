package godot.intellij.plugin.gradle

import godot.intellij.plugin.GodotPluginBundle
import godot.plugins.common.GodotKotlinJvmPropertiesFile
import godot.utils.GodotBuildProperties

/**
 * Validates that the gradle plugin and the ide plugin are compatible with each other. Defined by [GodotKotlinJvmSettings]
 */
object GradleCompatibility {
    fun validate(propertiesFile: GodotKotlinJvmPropertiesFile): CompatibilityReport {
        val (minimumIdeVersion, currentGradleVersion) = try {
            SemVer(propertiesFile.minimumIdePluginVersion) to SemVer(propertiesFile.currentGradlePluginVersion)
        } catch (e: Throwable) {
            // If we can't even read the properties file version, it is not compatible
            return CompatibilityReport.Incompatible(
                reason = GodotPluginBundle.message("settingsIndex.error.compatibility.semVerFailure"),
            )
        }

        val currentVersion = SemVer(GodotBuildProperties.godotKotlinJvmVersion)

        if (currentVersion < minimumIdeVersion) {
            return CompatibilityReport.Incompatible(
                reason = GodotPluginBundle.message("settingsIndex.error.compatibility.idePluginOutOfDate", minimumIdeVersion),
            )
        }

        val minimumGradleVersion = SemVer(GodotBuildProperties.godotKotlinJvmVersion)

        if (currentGradleVersion < minimumGradleVersion) {
            return CompatibilityReport.Incompatible(
                reason = GodotPluginBundle.message("settingsIndex.error.compatibility.gradlePluginOutOfDate", minimumGradleVersion),
            )
        }

        return CompatibilityReport.Compatible
    }

    private data class SemVer(
        val major: Int,
        val minor: Int,
        val patch: Int,
        val snapshot: Boolean,
    ) {
        constructor(semVerText: String) : this(
            major = semVerText.split('.')[0].toInt(),
            minor = semVerText.split('.')[1].toInt(),
            patch = semVerText.split('.')[2].filter { it.isDigit() }.toInt(),
            snapshot = semVerText.endsWith("-SNAPSHOT"),
        )

        operator fun compareTo(other: SemVer): Int {
            val majorCompare = major.compareTo(other.major)
            if (majorCompare != 0) return majorCompare
            val minorCompare = minor.compareTo(other.minor)
            if (minorCompare != 0) return minorCompare
            return patch.compareTo(other.patch)
        }

        override fun toString() = "$major.$minor.$patch"
    }

    sealed class CompatibilityReport {
        data object Compatible : CompatibilityReport()
        data class Incompatible(
            val reason: String,
        ) : CompatibilityReport()
    }
}
