import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
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
    implementation(project(":godot-library"))
    implementation(project(":godot-entry-generator"))

    implementation(libs.ksp)
    implementation(libs.kotlinPoet)

    compileOnly(kotlin("compiler-embeddable"))
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotKotlinSymbolProcessor by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot Kotlin symbol processor")
            }
            artifactId = project.name
            description = "Godot Kotlin symbol processor"
            from(components.getByName("java"))
        }
    }
}

tasks {
    withType<KotlinCompile> {
        compilerOptions {
            freeCompilerArgs.addAll(
                "-opt-in=com.google.devtools.ksp.KspExperimental", // needed for resolve by package path
            )
        }
    }
}
