import godot.dependencies.gradle.DependenciesVersions

plugins {
    kotlin("jvm")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependenices")
}

repositories {
    google()
}

dependencies {
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
