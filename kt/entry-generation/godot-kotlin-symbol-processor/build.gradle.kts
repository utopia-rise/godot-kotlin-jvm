import godot.dependencies.gradle.DependenciesVersions
import godot.dependencies.gradle.fullGodotKotlinJvmVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependencies")
}

repositories {
    google()
}

dependencies {
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    implementation(project(":godot-library"))
    implementation(project(":godot-entry-generator"))

    implementation("com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.kspVersion}")
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")

    compileOnly(kotlin("compiler-embeddable"))
}

publishing {
    publications {
        val godotKotlinSymbolProcessor by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot Kotlin symbol processor")
            }
            artifactId = project.name
            description = "Godot Kotlin symbol processor"
            from(components.getByName("java"))
        }
    }
}


tasks {
    withType(KotlinCompile::class.java) {
        kotlinOptions {
            freeCompilerArgs += listOf(
                    "-opt-in=com.google.devtools.ksp.KspExperimental" // needed for resolve by package path
            )
        }
    }
}
