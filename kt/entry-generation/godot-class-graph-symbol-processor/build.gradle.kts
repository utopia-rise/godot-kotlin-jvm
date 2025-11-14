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
    implementation(project(":godot-bootstrap-library"))
    implementation(project(":godot-entry-generator"))

    implementation(libs.classGraph)
    api(libs.slf4jApi)
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotClassGraphSymbolProcessor by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot ClassGraph symbol processor")
            }
            artifactId = project.name
            description = "Godot ClassGraph symbol processor"
            from(components.getByName("java"))
        }
    }
}
