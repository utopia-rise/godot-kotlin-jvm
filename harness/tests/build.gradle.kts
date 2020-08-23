import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.4.0"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

repositories {
    jcenter()
}


val bootstrap by configurations.creating
val main by configurations.creating {
    extendsFrom(configurations.getByName("implementation"), configurations.getByName("runtimeOnly"))
    exclude("org.jetbrains.kotlin")
}

dependencies {
    bootstrap(kotlin("stdlib"))
    bootstrap("com.utopia-rise:godot-runtime-jvm:0.1.0")
    compileOnly("com.utopia-rise:godot-library:0.1.0")
}

tasks {
    val bootstrapJar by creating(ShadowJar::class) {
        archiveBaseName.set("godot-bootstrap")
        configurations.add(bootstrap)
    }

    shadowJar {
        archiveBaseName.set("main")
        archiveVersion.set("")
        archiveClassifier.set("")
        configurations.clear()
        configurations.add(main)
    }

    build {
        dependsOn(bootstrapJar, shadowJar)
    }
}