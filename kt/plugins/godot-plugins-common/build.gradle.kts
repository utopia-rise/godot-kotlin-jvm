import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    implementation(project(":godot-build-props"))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotGradlePlugin by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot gradle plugin for kotlin language support.")
            }
            artifactId = project.name
            description = "Godot gradle plugin for kotlin language support."
            from(components.getByName("java"))
        }
    }
}
