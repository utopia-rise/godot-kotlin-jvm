import org.jetbrains.changelog.markdownToHTML
import versioninfo.intellij.BuildConfig
import versioninfo.intellij.VersionRange
import versioninfo.fullGodotKotlinJvmVersion
import versioninfo.isSnapshot
import org.jetbrains.changelog.Changelog

plugins {
    // Java support
    id("java")
    // Kotlin support
    alias(libs.plugins.kotlin.jvm)
    // gradle-intellij-plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
    alias(libs.plugins.gradleIntelliJPlugin)
    // gradle-changelog-plugin - read more: https://github.com/JetBrains/gradle-changelog-plugin
    alias(libs.plugins.changelog)

    id("com.utopia-rise.versioninfo")
}

//sdk version: https://github.com/JetBrains/intellij-community/tags
//kotlin plugin version: https://plugins.jetbrains.com/plugin/6954-kotlin/versions
val buildMatrix: Map<String, BuildConfig> = mapOf(
    "IJ222" to BuildConfig(
        sdk = "222.4554.10",
        prefix = "IJ2022.2",
        extraSource = "",
        version = VersionRange("222.1", "999.*"),
        ideVersionsForVerifierTask = listOf("2022.2"),
        deps = listOf(
            "java",
            "org.jetbrains.kotlin",
            "gradle"
        ) // kotlin plugin version no longer needed as it's now bundled with the IDE
    )
)

// needed as the intellij plugin does add its own repositories and thus the ones defined in the settings.gradle.kts are ignored. Hence, we need to redefine them here
repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven { url = uri("https://plugins.gradle.org/m2/") } // needed for shadowJar plugin dependency implementation in `godot-gradle-plugin`
}

version = fullGodotKotlinJvmVersion

group = "com.utopia-rise"

val sdkVersion = project.properties["godot.plugins.intellij.version"] ?: "IJ222"
val settings = checkNotNull(buildMatrix[sdkVersion])

// Configure gradle-intellij-plugin plugin.
// Read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    pluginName.set("godot-jvm-idea-plugin")
    version.set(settings.sdk)
    type.set("IC")
    downloadSources.set(true)
    updateSinceUntilBuild.set(true)

    plugins.set(settings.deps)
}

kotlin {
    jvmToolchain(17)

    sourceSets {
        main {
            kotlin.srcDirs("src/${settings.extraSource}/kotlin")
        }
    }
}

dependencies {
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    implementation("com.utopia-rise:jvm-godot-resource-serialization:0.1.0")
    implementation(project(":godot-build-props"))
    implementation(project(":godot-plugins-common"))
}

tasks {
    runIde {
        jvmArgs("-Xmx2000m")
    }

    patchPluginXml {
        if (isSnapshot) {
            val projectVersion = project.version as String
            version.set("${projectVersion.removeSuffix("-SNAPSHOT")}-${settings.prefix}-SNAPSHOT")
        } else {
            version.set("${project.version}-${settings.prefix}")
        }
        sinceBuild.set(settings.version.since)
        untilBuild.set(settings.version.until)

        // Extract the <!-- Plugin description --> section from README.md and provide for the plugin's manifest
        pluginDescription.set(
                File("$projectDir/README.md").readText().lines().run {
                    val start = "<!-- Plugin description -->"
                    val end = "<!-- Plugin description end -->"

                    if (!containsAll(listOf(start, end))) {
                        throw GradleException("Plugin description section not found in README.md:\n$start ... $end")
                    }
                    subList(indexOf(start) + 1, indexOf(end))
                }.joinToString("\n").run { markdownToHTML(this) }
        )

        // Get the latest available change notes from the changelog file
        changeNotes.set(changelog.renderItem(changelog.getLatest(), Changelog.OutputType.HTML))
    }

    runPluginVerifier {
        ideVersions.set(settings.ideVersionsForVerifierTask)
    }

    publishPlugin {
        dependsOn("patchChangelog")
        token.set(System.getenv("GODOT_KOTLIN_INTELLIJ_PLUGIN_PUBLISH"))
        // pluginVersion is based on the SemVer (https://semver.org) and supports pre-release labels, like 2.1.7-alpha.3
        // Specify pre-release label to publish the plugin in a custom Release Channel automatically. Read more:
        // https://jetbrains.org/intellij/sdk/docs/tutorials/build_system/deployment.html#specifying-a-release-channel
        // TODO: change back to commented variant once we're out of alpha/beta
        if (isSnapshot) {
            channels.set(listOf("alpha"))
        } else {
            channels.set(listOf("stable"))
        }
    }

    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjvm-default=all"
        }
    }
}
