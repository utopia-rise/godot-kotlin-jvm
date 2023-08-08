

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "com.utopia-rise.godot-dependencies" -> useModule("com.utopia-rise:godot-convention-gradle-plugin:0.0.1")
        }
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

includeBuild("../plugins/godot-convention-gradle-plugin") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-convention-gradle-plugin")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
    }
}

includeBuild("../tools-common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:tools-common")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
    }
}
