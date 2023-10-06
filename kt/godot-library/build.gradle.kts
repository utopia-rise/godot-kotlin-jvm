import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.api-generator")
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
    alias(libs.plugins.shadowJar)
}

apiGenerator {
    outputDir.set(project.file("$rootDir/godot-library/src/main/kotlin/godot/gen"))
    sourceJson.set(project.file("$rootDir/api-generator/src/main/resources/api.json"))
    docsDir.set(project.file("$projectDir/../../../../doc/classes"))
}

kotlin {
    jvmToolchain(11)
}

java {
    withSourcesJar()
}

dependencies {
    // added here as a transitive dependency so the user can use reflection
    // we need to add it here so reflection is available where the code is loaded (Bootstrap.kt) otherwise it will not work
    api(kotlin("reflect", version = libs.versions.kotlin.get()))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
}

tasks {
    compileKotlin {
        dependsOn(generateAPI)
    }

    assemble.get().finalizedBy(shadowJar)

    // copies the `godot-bootstrap` jar alongside the godot editor executable. Needed for local development
    val copyBootstrapJar by creating(Copy::class.java) {
        group = "godot-kotlin-jvm"
        from(shadowJar)
        destinationDir = File("${projectDir.absolutePath}/../../../../bin/")
    }

    // this tasks renames any jar prefixed with `godot-bootstrap` to just `godot-bootstrap.jar`. Needed for bundling the `godot-bootstrap` jar with the pre built editor
    val renameBootstrapJar by creating(Copy::class) {
        group = "godot-kotlin-jvm"
        from(shadowJar)
        rename { name ->
            if (name.contains("godot-bootstrap")) {
                "godot-bootstrap.jar"
            } else name
        }
        destinationDir = project.buildDir.resolve("libs")
        finalizedBy(copyBootstrapJar)
    }

    // the shadow jar is only used for the bootstrap jar bundling with the editor
    val shadowJar = withType<ShadowJar> {
        archiveBaseName.set("godot-bootstrap")
        exclude("**/module-info.class") //for android support: excludes java 9+ module info which cannot be parsed by the dx tool
        finalizedBy(renameBootstrapJar)
    }

    @Suppress("UNUSED_VARIABLE")
    val jar by getting(org.gradle.jvm.tasks.Jar::class) {
        outputs.upToDateWhen {
            // force this to always run. So we ensure that the bootstrap jar in the godot bin dir is always up to date
            // only relevant for local testing
            false
        }
        finalizedBy(shadowJar)
    }

    // here so the sourcesJar task has an explicit dependency on the generateApi task. Needed since gradle 8
    withType<Jar> {
        dependsOn(generateAPI)
    }

    // here so the metadata tasks have an explicit dependency on the renameBootstrapJar task. Needed since gradle 8
    withType<GenerateModuleMetadata> {
        dependsOn(renameBootstrapJar)
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

            // with this we publish the following artifacts:
            // - jar <- dependency added by our gradle plugin
            // - shadow jar <- actually not needed by the user directly, but it does not hurt
            // - sources jar <- used by the ide to resolve sources
            // - docs jar <- not needed by us but does not hurt
            // - pom data <- needed by maven
            // - module data <- more data for gradle
            from(components["java"])
        }
    }
}
