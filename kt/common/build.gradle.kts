import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.grgit)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
}

// the version is not inherited from the root build.gradle.kts as this here is a separate gradle project. Hence, we set it
// through the godot-dependencies plugin
version = fullGodotKotlinJvmVersion
group = "com.utopia-rise"

kotlin {
    jvmToolchain(libs.versions.toolchain.jvm.get().toInt())
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotCommonGenerator by registering(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot common module other libraries.")
            }
            artifactId = project.name
            description = "Godot common module other libraries."
            from(components.getByName("java"))
        }
    }
}
