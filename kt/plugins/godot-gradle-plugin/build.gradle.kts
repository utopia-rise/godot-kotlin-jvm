import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
    alias(libs.plugins.gradlePublish)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
}

kotlin {
    jvmToolchain(libs.versions.toolchain.jvm.get().toInt())
}

gradlePlugin {
    @Suppress("UnstableApiUsage")
    website.set("https://github.com/utopia-rise/godot-kotlin-jvm")
    @Suppress("UnstableApiUsage")
    vcsUrl.set("https://github.com/utopia-rise/godot-kotlin-jvm.git")

    plugins {
        create("godotPlugin") {
            id = "com.utopia-rise.godot-kotlin-jvm"
            displayName = "Gradle plugin for godot-kotlin-jvm"
            implementationClass = "godot.gradle.GodotPlugin"
            description = "Automatically setup of godot kotlin jvm specific project configurations"

            @Suppress("UnstableApiUsage")
            tags.set(listOf("kotlin", "godot", "gamedev"))
        }
    }
}

dependencies {
    implementation(kotlin("gradle-plugin", version = libs.versions.kotlin.get()))
    implementation(libs.shadowJar)
    implementation(libs.kspGradlePlugin)

    // used for idea sync gradle task integration (ex. generateGdIgnoreFilesTask)
    implementation(libs.ideaSync)

    implementation(project(":godot-build-props"))
    implementation(project(":godot-plugins-common"))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
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
