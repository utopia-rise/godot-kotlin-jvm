import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

dependencies {
    api(project(":godot-runtime"))
    api(project(":godot-library"))
}

tasks {
    build.get().finalizedBy(shadowJar)

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
}
