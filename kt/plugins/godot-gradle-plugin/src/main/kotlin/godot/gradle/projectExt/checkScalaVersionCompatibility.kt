package godot.gradle.projectExt

import org.gradle.api.Project

private const val MINIMUM_SCALA_VERSION = "3.0.0"

fun Project.checkScalaVersionCompatibility() {
    afterEvaluate {
        val configuredScalaVersion = godotJvmExtension.scalaVersion.get()

        require(!isVersionLowerThan(configuredScalaVersion, MINIMUM_SCALA_VERSION)) {
            "godot.scalaVersion is set to $configuredScalaVersion, but Godot-Kotlin requires at least Scala $MINIMUM_SCALA_VERSION."
        }
    }
}
