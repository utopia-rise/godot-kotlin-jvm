import org.apache.tools.ant.filters.ReplaceTokens
import godot.dependencies.gradle.DependenciesVersions

plugins {
    kotlin("jvm")
    `maven-publish`
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependenices")
}

dependencies {
    compileOnly(kotlin("stdlib"))
}

tasks {
    val processResources by getting(Copy::class) {
        outputs.upToDateWhen { false }
        val tokens = mapOf(
            "version" to version.toString(),
            "kotlin.version" to DependenciesVersions.supportedKotlinVersion
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
                name.set(project.name)
                description.set("Properties for Godot Kotlin building.")
            }
            artifactId = project.name
            description = "Properties for Godot Kotlin building."
            from(components.getByName("java"))
        }
    }
}

project.extra["artifacts"] = arrayOf("buildProps")

// copy task needs an explicit duplication strategy set for gradle >= 7
// see: https://docs.gradle.org/7.0.2/dsl/org.gradle.api.tasks.Copy.html#org.gradle.api.tasks.Copy:duplicatesStrategy
tasks.withType<Copy> { duplicatesStrategy = DuplicatesStrategy.INCLUDE }
