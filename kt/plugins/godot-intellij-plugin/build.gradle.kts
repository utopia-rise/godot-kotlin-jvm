import org.jetbrains.changelog.markdownToHTML
import plugins.intellij.BuildConfig
import plugins.intellij.VersionRange

plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm")
    // gradle-intellij-plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
    id("org.jetbrains.intellij") version "1.7.0"
    // gradle-changelog-plugin - read more: https://github.com/JetBrains/gradle-changelog-plugin
    id("org.jetbrains.changelog") version "1.3.1"
    // detekt linter - read more: https://detekt.github.io/detekt/gradle.html
    id("io.gitlab.arturbosch.detekt") version "1.20.0"
}

//sdk version: https://github.com/JetBrains/intellij-community/tags
//kotlin plugin version: https://plugins.jetbrains.com/plugin/6954-kotlin/versions
val buildMatrix: Map<String, BuildConfig> = mapOf(
    "IJ213" to BuildConfig(
        sdk = "213.6777.52",
        prefix = "IJ2021.3",
        extraSource = "IJ213",
        version = VersionRange("213.2", "213.*"),
        ideVersionsForVerifierTask = listOf("2021.3"),
        deps = listOf("java", "org.jetbrains.kotlin:213-1.6.21-release-334-IJ6777.52", "gradle")
    ),
    "IJ221" to BuildConfig(
        sdk = "221.5591.52",
        prefix = "IJ2022.1",
        extraSource = "IJ221",
        version = VersionRange("221.3", "999.*"),
        ideVersionsForVerifierTask = listOf("2022.1"),
        deps = listOf("java", "org.jetbrains.kotlin:221-1.7.10-release-333-IJ5591.52", "gradle")
    ),
    "IJ222" to BuildConfig(
        sdk = "222.3345.118",
        prefix = "IJ2022.2",
        extraSource = "IJ221", // hasn't changed. Thus no need to update
        version = VersionRange("222.2", "999.*"),
        ideVersionsForVerifierTask = listOf("2022.2"),
        deps = listOf("java", "org.jetbrains.kotlin", "gradle") // kotlin plugin version no longer needed as it's now bundled with the IDE
    )
)

repositories {
    mavenCentral()
    maven {
        url = uri("https://www.jetbrains.com/intellij-repository/releases/")
    }
    maven {
        url = uri("https://www.jetbrains.com/intellij-repository/snapshots/")
    }
    maven {
        url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}

val currentCommit: org.ajoberstar.grgit.Commit = grgit.head()
// check if the current commit is tagged
var tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
var releaseMode = tagOnCurrentCommit != null

val isSnapshot = !releaseMode || requireNotNull(tagOnCurrentCommit).name.contains("-SNAPSHOT")

version = if (!releaseMode) {
    "$godotKotlinJvmVersion-${DependenciesVersions.godotVersion}-${currentCommit.abbreviatedId}-SNAPSHOT"
} else {
    val baseVersion = "$godotKotlinJvmVersion-${DependenciesVersions.godotVersion}"
    if (isSnapshot) {
        "$baseVersion-SNAPSHOT"
    } else {
        baseVersion
    }
}

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
    sourceSets {
        main {
            kotlin.srcDirs("src/${settings.extraSource}/kotlin")
        }
    }
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.20.0")
    implementation("com.utopia-rise:jvm-godot-resource-serialization:0.1.0")
    implementation(project(":godot-build-props"))
}

// Configure detekt plugin.
// Read more: https://detekt.github.io/detekt/kotlindsl.html
detekt {
    config = files("$projectDir/detekt-config.yml")
    buildUponDefaultConfig = true

    reports {
        html.enabled = false
        xml.enabled = false
        txt.enabled = false
    }
}

tasks {
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
        changeNotes.set(changelog.getLatest().toHTML())
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
        kotlinOptions.jvmTarget = "11"
        kotlinOptions {
            freeCompilerArgs += "-Xjvm-default=all"
        }
    }
}
