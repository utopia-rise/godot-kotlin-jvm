import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    kotlin("jvm")
    `maven-publish`
}

dependencies {
    compileOnly(kotlin("stdlib"))
}

tasks {
    val sourceJar by creating(Jar::class) {
        archiveBaseName.set(project.name)
        archiveVersion.set(project.version.toString())
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    val processResources by getting(Copy::class) {
        outputs.upToDateWhen { false }
        val tokens = mapOf(
            "version" to version.toString()
        )
        from("src/main/resources") {
            include("*.properties")
            filter<ReplaceTokens>("tokens" to tokens)
        }
    }

    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        // this is only used for publishing locally.
        val buildProps by creating(MavenPublication::class) {
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

project.extra["artifacts"] = arrayOf("buildProps")
