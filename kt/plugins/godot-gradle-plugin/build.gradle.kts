plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.1"
    id("com.utopia-rise.godot-publish")
}

gradlePlugin {
    plugins {
        create("godotPlugin") {
            id = "com.utopia-rise.godot-jvm"
            displayName = "Gradle plugin for godot-jvm"
            implementationClass = "godot.gradle.GodotPlugin"
        }
    }
    isAutomatedPublishing = false
}

pluginBundle {
    website = "https://github.com/utopia-rise/godot-jvm"
    vcsUrl = "https://github.com/utopia-rise/godot-jvm.git"
    tags = listOf("kotlin", "godot", "gamedev")

    mavenCoordinates {
        groupId = "${project.group}"
        artifactId = "godot-gradle-plugin"
        version = "${project.version}"
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin"))
    implementation(kotlin("gradle-plugin-api"))
    implementation("com.github.jengelman.gradle.plugins:shadow:${DependenciesVersions.shadowJarPluginVersion}")

    implementation(project(":godot-build-props"))
    implementation("com.utopia-rise:godot-kotlin-entry-generator")
    compileOnly(project(":godot-kotlin-compiler-plugin-common"))
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotGradlePlugin by creating(MavenPublication::class) {
            artifactId = project.name
            description = "Godot gradle plugin for kotlin language support."
            from(components.getByName("java"))
        }
    }
}

project.extra["artifacts"] = arrayOf("godotGradlePlugin")
