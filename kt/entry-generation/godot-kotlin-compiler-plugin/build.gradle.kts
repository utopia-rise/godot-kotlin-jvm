plugins {
    kotlin("jvm")
    kotlin("kapt")
    `maven-publish`
    id("com.utopia-rise.godot-publish")
}

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-kotlin-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler-embeddable"))
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotKotlinCompilerPlugin by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Compiler plugin for godot kotlin project building.")
            }
            artifactId = project.name
            description = "Compiler plugin for godot kotlin project building."
            from(components.getByName("java"))
        }
    }
}
