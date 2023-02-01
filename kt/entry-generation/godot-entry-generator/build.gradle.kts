import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import godot.dependencies.gradle.DependenciesVersions

plugins {
    kotlin("jvm")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependenices")
}

dependencies {
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
}

tasks {
    withType<KotlinCompile>().all {
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.ExperimentalStdlibApi"
    }
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
