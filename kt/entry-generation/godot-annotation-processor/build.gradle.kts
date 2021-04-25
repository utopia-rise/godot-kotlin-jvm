plugins {
    kotlin("jvm")
    `maven-publish`
    id("com.utopia-rise.godot-publish")
}

dependencies {
    implementation("com.utopia-rise:godot-kotlin-entry-generator:${project.version}")
    implementation(project(":godot-library"))
    compileOnly(kotlin("compiler-embeddable"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotAnnotationProcessor by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Processor for Godot kotlin's annotations.")
            }
            artifactId = project.name
            description = "Processor for Godot kotlin's annotations."
            from(components.getByName("java"))
        }
    }
}
