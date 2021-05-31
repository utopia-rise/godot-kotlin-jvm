import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    kotlin("jvm")
    `maven-publish`
    id("com.utopia-rise.godot-publish")
}

dependencies {
    compileOnly(kotlin("stdlib"))
}

tasks {
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

tasks.withType<Copy> { duplicatesStrategy = DuplicatesStrategy.INCLUDE}
