package godot.intellij.plugin.gradle

import godot.gradle.GodotKotlinJvmPropertiesFile
import godot.utils.GodotBuildProperties

object GradleCompatibility {
  fun validate(propertiesFile: GodotKotlinJvmPropertiesFile): CompatibilityReport {
      val (minimumIdeVersion, currentGradleVersion) = try {
          SemVer(propertiesFile.minimumIdePluginVersion) to SemVer(propertiesFile.currentGradlePluginVersion)
      } catch (e: Throwable) {
          // If we can't even read the properties file version, it is not compatibile
          return CompatibilityReport.Incompatible(
              reason = "Plugin 'GodotKotlinJvm' is incompatible with the current version of the GodotKotlinJvm Gradle plugin. Upgrade the version of the gradle plugin com.utopia-rise.godot-kotlin-jvm",
          )
      }

    val currentVersion = SemVer(GodotBuildProperties.godotKotlinJvmVersion)

    if (currentVersion < minimumIdeVersion) {
      return CompatibilityReport.Incompatible(
        reason = "Plugin 'GodotKotlinJvm' is no longer compatible with the current version of the GodotKotlinJvm Gradle plugin. Use version $minimumIdeVersion or later.",
      )
    }

    val minimumGradleVersion = SemVer(GodotBuildProperties.godotKotlinJvmVersion)

    if (currentGradleVersion < minimumGradleVersion) {
      return CompatibilityReport.Incompatible(
        reason = "Gradle plugin 'com.utopia-rise.godot-kotlin-jvm' is incompatible with the current GodotKotlinJvm IntelliJ Plugin version. Use version $minimumGradleVersion or later.",
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
    object Compatible : CompatibilityReport()
    data class Incompatible(
      val reason: String,
    ) : CompatibilityReport()
  }
}
