import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.api-generator")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
    alias(libs.plugins.shadowJar)
    alias(libs.plugins.kotlinPreProcessors)
}

val isRelease = project.hasProperty("release")

kotlinDefinitions {
    definitionsObjectName.set("GodotJvmBuildConfig")

    define("DEBUG", !isRelease)
}

apiGenerator {
    sourceJson.set(project.file("$rootDir/api-generator/src/main/resources/api.json"))
    coreOutputDir.set(project.file("$rootDir/godot-core-library/src/main/kotlin/godot/gen"))
    coroutineOutputDir.set(project.file("$rootDir/godot-coroutine-library/src/main/kotlin/gen"))
}

kotlin {
    jvmToolchain(11)
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    // added here as a transitive dependency so the user can use reflection
    // we need to add it here so reflection is available where the code is loaded (Bootstrap.kt) otherwise it will not work
    api(kotlin("reflect", version = libs.versions.kotlin.get()))
    api("com.utopia-rise:common:$fullGodotKotlinJvmVersion")
    testImplementation("junit", "junit", "4.12")
}


tasks {
    compileKotlin {
        dependsOn(generateAPI)
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

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("Contains godot api as kotlin classes and jvm cpp interaction code.")
            }
            artifactId = "godot-core-library-$targetSuffix"
            description = "Contains godot api as kotlin classes and jvm cpp interaction code."
            artifact(tasks.jar)
            artifact(tasks.getByName("sourcesJar"))
            artifact(tasks.getByName("javadocJar"))
        }
    }
}
