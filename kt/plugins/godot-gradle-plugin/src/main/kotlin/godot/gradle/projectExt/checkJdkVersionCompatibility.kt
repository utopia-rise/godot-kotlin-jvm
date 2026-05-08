package godot.gradle.projectExt

import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.jvm.toolchain.JavaLanguageVersion

private const val MINIMUM_JDK_VERSION = 11

fun Project.checkJdkVersionCompatibility() {
    afterEvaluate {
        val configuredJdkVersion = godotJvmExtension.javaVersion.get()

        require(configuredJdkVersion >= MINIMUM_JDK_VERSION) {
            "godot.javaVersion is set to $configuredJdkVersion, but Godot-Kotlin requires at least JDK $MINIMUM_JDK_VERSION."
        }

        extensions.configure(JavaPluginExtension::class.java) { javaExtension ->
            javaExtension.toolchain.languageVersion.set(JavaLanguageVersion.of(configuredJdkVersion))
        }

        kotlinJvmExtension.jvmToolchain(configuredJdkVersion)
    }
}
