import org.jetbrains.changelog.Changelog
import org.jetbrains.changelog.markdownToHTML
import versioninfo.fullBuildVersion
import versioninfo.isSnapshot

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

// needed as the intellij plugin does add its own repositories and thus the ones defined in the settings.gradle.kts are ignored. Hence, we need to redefine them here
repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven { url = uri("https://plugins.gradle.org/m2/") } // needed for shadowJar plugin dependency implementation in `godot-gradle-plugin`

    intellijPlatform {
        defaultRepositories()
    }
}

version = fullBuildVersion
group = "com.utopia-rise"

val intellijVersion: String = project.properties["godot.plugins.intellij.version"]?.toString() ?: libs.versions.ideaPluginDefaultIntellijVersion.get()

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("com.utopia-rise:tools-common:$fullBuildVersion")

    // https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
    intellijPlatform {
        intellijIdeaCommunity(intellijVersion)

        bundledPlugin("com.intellij.java")
        bundledPlugin("org.jetbrains.kotlin")

        pluginVerifier()
        zipSigner()
    }
}

intellijPlatform.pluginVerification.ides.ide(intellijVersion)

tasks {
    runIde {
        jvmArgs("-Xmx2000m")

        jvmArgumentProviders += CommandLineArgumentProvider {
            listOf("-Didea.kotlin.plugin.use.k2=true")
        }
    }

    patchPluginXml {
        if (isSnapshot) {
            val projectVersion = project.version as String
            this.pluginVersion.set("${projectVersion.removeSuffix("-SNAPSHOT")}-IJ$intellijVersion-SNAPSHOT")
        } else {
            this.pluginVersion.set("${project.version}-IJ$intellijVersion")
        }
        sinceBuild.set("251.1")
        // magic values like 999.* are no longer supported. But we can support current version +2 years. Example: current 242.3 (2024.2.3) until 279.* (2027.9.*)
        // this prevents us from needing to update the ide plugin with every ide version update and gives us ~2 years time for that after the last release
        untilBuild.set("289.*") // until the end of 2028

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
        compilerOptions {
            freeCompilerArgs.add("-jvm-default=no-compatibility")
            freeCompilerArgs.add("-Xcontext-parameters") // The analysis API requires context support; Kotlin 2.3 uses context parameters.
        }
    }

    test {
        jvmArgumentProviders += CommandLineArgumentProvider {
            listOf("-Didea.kotlin.plugin.use.k2=true")
        }
    }
}
