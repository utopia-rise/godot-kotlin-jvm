
plugins {
    kotlin("jvm")
    id("com.utopia-rise.api-generator")
    id("com.utopia-rise.godot-publish")
}

apiGenerator {
    outputDir.set(project.file("$rootDir/godot-library/src/main/kotlin/godot/gen"))
    sourceJson.set(project.file("$rootDir/api-generator/src/main/resources/api.json"))
    docsDir.set(project.file("$projectDir/../../../../doc/classes"))
}

dependencies {
    api(project(":godot-runtime"))
}

tasks {
    compileKotlin {
        dependsOn(generateAPI)
    }
}

publishing {
    publications {
        val godotLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Contains godot api as kotlin classes and jvm cpp interaction code.")
            }
            artifactId = "godot-library"
            description = "Contains godot api as kotlin classes and jvm cpp interaction code."
            from(components.getByName("java"))
        }
    }
}
