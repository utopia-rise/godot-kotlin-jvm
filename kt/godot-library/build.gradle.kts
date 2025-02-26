import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
    id("com.utopia-rise.api-generator")
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
    coreOutputDir.set(project.file("$rootDir/godot-library/godot-core-library/src/main/kotlin/gen"))
    apiOutputDir.set(project.file("$rootDir/godot-library/godot-api-library/src/main/kotlin/"))
    extensionOutputDir.set(project.file("$rootDir/godot-library/godot-extension-library/src/main/kotlin/gen"))
    coroutineOutputDir.set(project.file("$rootDir/godot-library/godot-coroutine-library/src/main/kotlin/gen"))
}


kotlin {
    jvmToolchain(libs.versions.toolchain.jvm.get().toInt())
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
    implementation (project(":godot-internal-library"))
    api(project(":godot-core-library"))
    api(project(":godot-api-library"))
    api(project(":godot-extension-library"))
}


tasks {
    compileKotlin {
        dependsOn(generateAPI)
    }
    // here so the sourcesJar task has an explicit dependency on the generateApi task. Needed since gradle 8
    withType<Jar> {
        dependsOn(generateAPI)
    }

    @Suppress("UNUSED_VARIABLE")
    val jar by getting {
        outputs.upToDateWhen {
            // force this to always run. So we ensure that the bootstrap jar in the godot bin dir is always up to date
            // only relevant for local testing
            false
        }
        finalizedBy(shadowJar)
    }
    build.get().finalizedBy(shadowJar)

    val copyBootstrapJar by creating(Copy::class.java) {
        group = "godot-jvm"
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
}

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("A library allowing to define scripts for the Godot Engine.")
            }
            artifactId = "godot-library-$targetSuffix"
            description = "A library allowing to define scripts for the Godot Engine."
            artifact(tasks.jar)
            artifact(tasks.getByName("sourcesJar"))
            artifact(tasks.getByName("javadocJar"))
        }
    }
}
