rootProject.name = "godot-kotlin-bunnymark"

includeBuild("../../kt/api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).with(project(":")) // assuming godot-entry-generator is the root project of entry-generator/godot-entry-generator
    }
}
includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).with(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-annotation-processor")).with(project(":godot-annotation-processor"))
        substitute(module("com.utopia-rise:godot-runtime")).with(project(":godot-runtime"))
        substitute(module("com.utopia-rise:godot-library")).with(project(":godot-library"))
        substitute(module("com.utopia-rise:godot-kotlin-compiler-plugin-common")).with(project(":godot-kotlin-compiler-plugin-common"))
        substitute(module("com.utopia-rise:godot-kotlin-compiler-plugin")).with(project(":godot-kotlin-compiler-plugin"))
    }
}

includeBuild("../../kt/entry-generation/godot-kotlin-entry-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-kotlin-entry-generator")).with(project(":")) // assuming godot-kotlin-entry-generator is the root project of entry-generator/godot-kotlin-entry-generator
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
        if (requested.id.id == "com.utopia-rise.api-generator") {
            useModule("com.utopia-rise:api-generator:0.0.1")
        }
    }
}
