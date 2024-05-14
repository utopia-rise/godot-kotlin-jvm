rootProject.name = "godot-kotlin-benchmarks"

includeBuild("../../kt/api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).using(project(":"))
    }
}
includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).using(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-library-debug")).using(project(":godot-library"))
        substitute(module("com.utopia-rise:godot-library-release")).using(project(":godot-library"))
        substitute(module("com.utopia-rise:godot-kotlin-symbol-processor")).using(project(":godot-kotlin-symbol-processor"))
        substitute(module("com.utopia-rise:godot-entry-generator")).using(project(":godot-entry-generator"))
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
