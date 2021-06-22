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

    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.10-1.0.0-beta02")
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")

    compileOnly(kotlin("compiler-embeddable"))
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
