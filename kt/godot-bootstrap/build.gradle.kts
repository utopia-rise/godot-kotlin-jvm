import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version DependenciesVersions.shadowJarPluginVersion
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

// we need to target java 1.6 in order to support android
// before kotlin 1.5.x, kotlin was actually targeting java 1.6 by default. But since 1.5.x we need to do this explicitly
// see: https://kotlinlang.org/docs/whatsnew15.html#new-default-jvm-target-1-8
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_6.toString()
    }
}
