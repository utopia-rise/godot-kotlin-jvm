
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

// we need to target java 1.6 in order to support android
// before kotlin 1.5.x, kotlin was actually targeting java 1.6 by default. But since 1.5.x we need to do this explicitly
// see: https://kotlinlang.org/docs/whatsnew15.html#new-default-jvm-target-1-8
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_6.toString()
    }
}
