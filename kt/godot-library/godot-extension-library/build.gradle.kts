import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
    alias(libs.plugins.kotlinPreProcessors)
}

val isRelease = project.hasProperty("release")

kotlinDefinitions {
    definitionsObjectName.set("GodotJvmBuildConfig")
    define("DEBUG", !isRelease)
}


kotlin {
    jvmToolchain(libs.versions.toolchain.jvm.get().toInt())
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    api("com.utopia-rise:common:$fullGodotKotlinJvmVersion")
    implementation(project(":godot-internal-library"))
    api(project(":godot-core-library"))
    api(project(":godot-api-library"))
}

tasks {
    compileKotlin {
        dependsOn(":godot-library:generateAPI")
    }

    // here so the sourcesJar task has an explicit dependency on the generateApi task. Needed since gradle 8
    withType<Jar> {
        dependsOn(":godot-library:generateAPI")
    }
}

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotCoroutineLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("Godot library extension build on top of the base Godot API.")
            }
            artifactId = "godot-extension-library-$targetSuffix"
            description = "Godot library extension build on top of the base Godot API."
            artifact(tasks.jar)
            artifact(tasks.getByName("sourcesJar"))
            artifact(tasks.getByName("javadocJar"))
        }
    }
}
