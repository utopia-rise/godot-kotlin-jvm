rootProject.name = "godot-kotlin-tests"

includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).with(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-annotation-processor")).with(project(":godot-annotation-processor"))
        substitute(module("com.utopia-rise:godot-runtime")).with(project(":godot-runtime"))
        substitute(module("com.utopia-rise:godot-library")).with(project(":godot-library"))
    }
}

pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
    resolutionStrategy.eachPlugin {
        if (requested.id.id == "com.utopia-rise.godot-jvm") {
            useModule("com.utopia-rise:godot-gradle-plugin:0.1.0-3.2")
        }
    }
}