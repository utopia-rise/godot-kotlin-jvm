import godot.dependencies.gradle.DependenciesVersions
import godot.dependencies.gradle.fullGodotKotlinJvmVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependencies")
}

dependencies {
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    implementation(project(":godot-library"))
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
}

publishing {
    publications {
        val godotEntryGenerator by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot Kotlin entry code generator.")
            }
            artifactId = project.name
            description = "Godot Kotlin entry code generator."
            from(components.getByName("java"))
        }
    }
}

java {
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += listOf(
                "-opt-in=kotlin.ExperimentalStdlibApi"
            )
        }

        kotlinOptions.jvmTarget = "11"
    }
}
