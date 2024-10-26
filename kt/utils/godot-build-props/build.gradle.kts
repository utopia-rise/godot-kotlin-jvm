import org.apache.tools.ant.filters.ReplaceTokens
import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
}

kotlin {
    jvmToolchain(22)
}

tasks {
    @Suppress("UNUSED_VARIABLE")
    val processResources by getting(Copy::class) {
        outputs.upToDateWhen { false }
        val tokens = mapOf(
            "godot.kotlin.jvm.assembled.version" to fullGodotKotlinJvmVersion,
            "godot.kotlin.jvm.version" to libs.versions.godotKotlinJvm.get(),
            "godot.kotlinx.coroutine.version" to libs.versions.kotlinCoroutine.get(),
            "godot.version" to libs.versions.godot.get(),
            "kotlin.version" to libs.versions.kotlin.get(),
            "ios.jdk.version" to libs.versions.iosJdk.get(),
            "ios.graal.jdk.build.version" to libs.versions.iosGraalJdkBuild.get(),
            "ios.cap.cache.version" to libs.versions.iosCapCache.get()
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
        @Suppress("UNUSED_VARIABLE")
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
