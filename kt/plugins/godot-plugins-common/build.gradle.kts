import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")

    // needed to be able to use the gradle ide plugin as a dependency. see: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html#multi-module-project-structure
    // see comments below why this is needed
    id("org.jetbrains.intellij.platform.module")
}

kotlin {
    jvmToolchain(libs.versions.toolchain.jvm.get().toInt())
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven { url = uri("https://plugins.gradle.org/m2/") } // needed for shadowJar plugin dependency implementation in `godot-gradle-plugin`

    // needed for idea gradle dependency below
    intellijPlatform {
        defaultRepositories()
    }
}

// needed for idea gradle IDE plugin dependency below
// This is needed for the gradle actions which we want to trigger from the IDE like `FetchProjectModelsBuildAction`
// These are moved here as the jetbrains intellij platform requires java 21, but we do not want to force java 21 upon the user
// Hence we move shared gradle actions to the common module which is built with java 11 support.
// Although the actions are only defined inside the IDE plugin, they are in fact executed by gradle and the jvm version gradle runs with (JAVA_HOME)
// Thus, they are implicitly used by both the IDE plugin and gradle, and therefore it make sense to share them to keep compatibility between the gradle plugin and the IDE plugin
// If not done this way, as soon as we execute the gradle actions from the IDE we get a class version mismatch exception as the gradle jvm (JAVA_HOME) can't read the class files (java 21) of the actions
// The IDE can, as the IDE run's with its own bundled JRE (21 at the time of writing)
val intellijVersion: String = project.properties["godot.plugins.intellij.version"]?.toString() ?: libs.versions.ideaPluginDefaultIntellijVersion.get()

dependencies {
    implementation(project(":godot-build-props"))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")

    // needed for gradle plugin dependency
    // https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
    intellijPlatform {
        intellijIdeaCommunity(intellijVersion)

        bundledPlugin("com.intellij.gradle")

        instrumentationTools()
    }
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotPluginsCommon by creating(MavenPublication::class) {
            pom {
                this.name.set(project.name)
                this.description.set("Common module for godot kotlin jvm plugins.")
            }
            artifactId = project.name
            description = "Common module for godot kotlin jvm plugins."
            from(components.getByName("java"))
        }
    }
}
