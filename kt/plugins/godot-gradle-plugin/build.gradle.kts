import godot.dependencies.gradle.DependenciesVersions
import godot.dependencies.gradle.fullGodotKotlinJvmVersion

plugins {
    kotlin("jvm")
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependencies")
}

gradlePlugin {
    website.set("https://github.com/utopia-rise/godot-kotlin-jvm")
    vcsUrl.set("https://github.com/utopia-rise/godot-kotlin-jvm.git")

    plugins {
        create("godotPlugin") {
            id = "com.utopia-rise.godot-kotlin-jvm"
            displayName = "Gradle plugin for godot-kotlin-jvm"
            implementationClass = "godot.gradle.GodotPlugin"
            description = "Automatically setup of godot kotlin jvm specific project configurations"

            tags.set(listOf("kotlin", "godot", "gamedev"))
        }
    }
}

repositories {
    google()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin"))
    implementation(kotlin("gradle-plugin-api"))
    implementation("gradle.plugin.com.github.johnrengelman:shadow:${DependenciesVersions.shadowJarPluginVersion}")
    implementation("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:${DependenciesVersions.kspVersion}")

    implementation(project(":godot-build-props"))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotGradlePlugin by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot gradle plugin for kotlin language support.")
            }
            artifactId = project.name
            description = "Godot gradle plugin for kotlin language support."
            from(components.getByName("java"))
        }
    }
}

project.extra["artifacts"] = arrayOf("godotGradlePlugin")

val currentCommit: org.ajoberstar.grgit.Commit = grgit.head()
// check if the current commit is tagged
var tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
var releaseMode = tagOnCurrentCommit != null

fun isSnapshotBuild(): Boolean = tagOnCurrentCommit?.name?.endsWith("SNAPSHOT") == true
