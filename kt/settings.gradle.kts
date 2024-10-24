
pluginManagement {
    includeBuild("build-logic")

    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    resolutionStrategy.eachPlugin {
        when(requested.id.id) {
            "com.utopia-rise.api-generator" -> useModule("com.utopia-rise:api-generator:0.0.1")
            "com.github.johnrengelman.shadow" -> useVersion("7.1.2")
        }
    }
}

dependencyResolutionManagement {
    // cannot be used as the intellij plugin adds maven repositories itself. Uncomment the following line once that is no longer the case
//    this.repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS

    @Suppress("UnstableApiUsage")
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://plugins.gradle.org/m2/") } // needed for shadowJar plugin dependency implementation in `godot-gradle-plugin`
    }
}

plugins {
    // to automatically download the toolchain jdk if missing
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.6.0"
}

includeBuild("api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).using(project(":"))
    }
}

include("godot-internal-library")
include("godot-core-library")
include("godot-coroutine-library")


subdir("entry-generation") {
    include("godot-kotlin-symbol-processor")
    include("godot-entry-generator")
}

subdir("plugins") {
    include("godot-gradle-plugin")
    include("godot-intellij-plugin")
    include("godot-plugins-common")
}

subdir("utils") {
    include("godot-build-props")
}

includeBuild("common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:common")).using(project(":"))
    }
}

includeBuild("tools-common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:tools-common")).using(project(":"))
    }
}

class IncludeDsl(val root: String) {
    fun include(project: String) {
        settings.include(project)
        settings.project(":$project").also {
            it.projectDir = file("$root/$project")
        }
    }

    fun includeBuild(project: String, configuration: Action<ConfigurableIncludedBuild>) {
        settings.includeBuild("$root/$project", configuration)
    }
}

fun subdir(root: String, block: IncludeDsl.() -> Unit) {
    block(IncludeDsl(root))
}
