plugins {
    kotlin("jvm")
    kotlin("kapt")
    `maven-publish`
}

dependencies {
    implementation("com.utopia-rise:godot-kotlin-entry-generator")
    implementation(project(":godot-library"))
    compileOnly(kotlin("compiler-embeddable"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")

    //TODO: remove once decision about runtime default values is made
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:${DependenciesVersions.kotlinMetadataVersion}")

    //TODO: remove once decision about runtime default values is made
    implementation("com.google.auto.service:auto-service:1.0-rc4")
    //TODO: remove once decision about runtime default values is made
    kapt("com.google.auto.service:auto-service:1.0-rc4")
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
        val godotAnnotationProcessor by creating(MavenPublication::class) {
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

project.extra["artifacts"] = arrayOf("godotAnnotationProcessor")
