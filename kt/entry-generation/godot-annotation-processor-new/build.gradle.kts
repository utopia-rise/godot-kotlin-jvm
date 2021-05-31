import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.utopia-rise.godot-publish")
}

repositories {
    google()
}

dependencies {
    implementation(project(":godot-library"))
    implementation(project(":godot-entry-generator"))
    implementation(project(":godot-kotlin-compiler-plugin"))

    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.0-1.0.0-alpha09")
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
