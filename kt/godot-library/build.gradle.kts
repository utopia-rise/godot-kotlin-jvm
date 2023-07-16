import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm")
    id("com.utopia-rise.api-generator")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependencies")
    id("com.github.johnrengelman.shadow")
}

apiGenerator {
    outputDir.set(project.file("$rootDir/godot-library/src/main/kotlin/godot/gen"))
    sourceJson.set(project.file("$rootDir/api-generator/src/main/resources/api.json"))
    docsDir.set(project.file("$projectDir/../../../../doc/classes"))
}

dependencies {
    // added here as a transitive dependency so the user can use reflection
    // we need to add it here so reflection is available where the code is loaded (Bootstrap.kt) otherwise it will not work
    api(kotlin("reflect"))
}

tasks {
    compileKotlin {
        dependsOn(generateAPI)
        kotlinOptions.jvmTarget = "11"
    }

    build.get().finalizedBy(shadowJar)

    @Suppress("UNUSED_VARIABLE")
    val jar by getting {
        outputs.upToDateWhen {
            // force this to always run. So we ensure that the bootstrap jar in the godot bin dir is always up to date
            // only relevant for local testing
            false
        }
        finalizedBy(shadowJar)
    }

    val copyBootstrapJar by creating(Copy::class.java) {
        group = "godot-kotlin-jvm"
        from(shadowJar)
        destinationDir = File("${projectDir.absolutePath}/../../../../bin/")
        dependsOn(shadowJar)
    }

    withType<ShadowJar> {
        archiveBaseName.set("godot-bootstrap")
        archiveVersion.set("")
        archiveClassifier.set("")
        exclude("**/module-info.class") //for android support: excludes java 9+ module info which cannot be parsed by the dx tool
        finalizedBy(copyBootstrapJar)
    }

    // here so the sourcesJar task has an explicit dependency on the generateApi task. Needed since gradle 8
    withType<Jar> {
        dependsOn(generateAPI)
    }
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Contains godot api as kotlin classes and jvm cpp interaction code.")
            }
            artifactId = "godot-library"
            description = "Contains godot api as kotlin classes and jvm cpp interaction code."
            artifact(tasks.jar)
        }
    }
}

java {
    targetCompatibility = JavaVersion.VERSION_11
}
