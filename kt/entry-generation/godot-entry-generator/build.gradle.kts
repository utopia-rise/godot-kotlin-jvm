import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    implementation(project(":godot-core-library"))
    implementation(libs.kotlinPoet)
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotEntryGenerator by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot Kotlin entry code generator.")
            }
            artifactId = project.name
            description = "Godot Kotlin entry code generator."
            from(components.getByName("java"))
        }
    }
}
