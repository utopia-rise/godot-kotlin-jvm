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

dependencies {
    implementation(libs.kotlinPoet)
    api("com.utopia-rise:common:$fullGodotKotlinJvmVersion")
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotToolsCommonGenerator by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot common module for all tools.")
            }
            artifactId = project.name
            description = "Godot common module for all tools."
            from(components.getByName("java"))
        }
    }
}
