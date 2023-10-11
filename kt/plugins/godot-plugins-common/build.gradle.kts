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
        val godotPluginsCommon by creating(MavenPublication::class) {
            pom {
                this.name.set(project.name)
                this.description.set("Common module for godot kotlin jvm plugins.")
            }
            artifactId = project.name
            description = "Common module for godot kotlin jvm plugins."
            from(components.getByName("java"))
        }
    }
}
