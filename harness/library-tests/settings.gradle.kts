rootProject.name = "library-tests"

includeBuild("../../kt/api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).with(project(":"))
    }
}
includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).with(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-library")).with(project(":godot-library"))
        substitute(module("com.utopia-rise:godot-kotlin-symbol-processor")).with(project(":godot-kotlin-symbol-processor"))
        substitute(module("com.utopia-rise:godot-entry-generator")).with(project(":godot-entry-generator"))
    }
}

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
    resolutionStrategy.eachPlugin {
        if (requested.id.id == "com.utopia-rise.godot-kotlin-jvm") {
            useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
        }
        if (requested.id.id == "com.utopia-rise.api-generator") {
            useModule("com.utopia-rise:api-generator:${requested.version}")
        }
    }
}
