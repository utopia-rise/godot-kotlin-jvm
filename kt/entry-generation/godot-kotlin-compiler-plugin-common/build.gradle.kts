plugins {
    kotlin("jvm")
    `maven-publish`
    id("com.utopia-rise.godot-publish")
}

dependencies {
    compileOnly(kotlin("compiler"))
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}


publishing {
    publications {
        val godotKotlinCompilerPluginCommon by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Common library for godot compiler plugin")
            }
            artifactId = project.name
            description = "Common library for godot compiler plugin"
            from(components.getByName("java"))
        }
    }
}
