rootProject.name = "flattened-library-tests"

includeBuild("../../kt/api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).using(project(":"))
    }
}
includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).using(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-core-library-debug")).using(project(":godot-core-library"))
        substitute(module("com.utopia-rise:godot-core-library-release")).using(project(":godot-core-library"))
        substitute(module("com.utopia-rise:godot-api-library-debug")).using(project(":godot-api-library"))
        substitute(module("com.utopia-rise:godot-api-library-release")).using(project(":godot-api-library"))
        substitute(module("com.utopia-rise:godot-extension-library-debug")).using(project(":godot-extension-library"))
        substitute(module("com.utopia-rise:godot-extension-library-release")).using(project(":godot-extension-library"))
        substitute(module("com.utopia-rise:godot-coroutine-library-debug")).using(project(":godot-coroutine-library"))
        substitute(module("com.utopia-rise:godot-coroutine-library-release")).using(project(":godot-coroutine-library"))
        substitute(module("com.utopia-rise:godot-kotlin-symbol-processor")).using(project(":godot-kotlin-symbol-processor"))
        substitute(module("com.utopia-rise:godot-entry-generator")).using(project(":godot-entry-generator"))
        substitute(module("com.utopia-rise:godot-build-props")).using(project(":godot-build-props"))
    }
}

includeBuild("../../kt/common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:common")).using(project(":"))
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
