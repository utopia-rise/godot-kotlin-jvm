plugins {
    kotlin("jvm")
    kotlin("kapt")
    `maven-publish`
}

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-kotlin-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler-embeddable"))
}

tasks {
    val sourceJar by creating(Jar::class) {
        archiveBaseName.set(project.name)
        archiveVersion.set(project.version.toString())
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotKotlinCompilerPlugin by creating(MavenPublication::class) {

            pom {
                groupId = "${project.group}"
                artifactId = project.name
                version = "${project.version}"
            }
            from(components.getByName("java"))
            artifact(tasks.getByName("sourceJar"))
        }
    }
}

project.extra["artifacts"] = arrayOf("godotCompilerPlugin")
