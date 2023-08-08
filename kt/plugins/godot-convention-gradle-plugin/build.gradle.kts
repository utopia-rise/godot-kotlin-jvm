import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
}

kotlin {
    jvmToolchain(17)
}

gradlePlugin {
    plugins {
        create("godotDependenciesPlugin") {
            id = "com.utopia-rise.godot-dependencies"
            displayName = "Gradle plugin for central dependency version management"
            implementationClass = "godot.dependencies.gradle.DependenciesPlugin"
        }
    }
    isAutomatedPublishing = false
}

dependencies {
    compileOnly(kotlin("gradle-plugin", version = libs.versions.kotlin.get()))
    implementation(libs.grgit)
}


tasks {
    @Suppress("UNUSED_VARIABLE")
    val processResources by getting(Copy::class) {
        outputs.upToDateWhen { false }
        val tokens = mapOf(
            "godot.kotlin.jvm.version" to libs.versions.godotKotlinJvm.get(),
            "godot.version" to libs.versions.godot.get(),
            "kotlin.version" to libs.versions.kotlin.get(),
        )
        from("src/main/resources") {
            include("*.properties")
            filter<ReplaceTokens>("tokens" to tokens)
        }
    }
}

// copy task needs an explicit duplication strategy set for gradle >= 7
// see: https://docs.gradle.org/7.0.2/dsl/org.gradle.api.tasks.Copy.html#org.gradle.api.tasks.Copy:duplicatesStrategy
tasks.withType<Copy> { duplicatesStrategy = DuplicatesStrategy.INCLUDE }
