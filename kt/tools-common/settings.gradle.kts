
pluginManagement {
    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "com.utopia-rise.godot-dependencies" -> useModule("com.utopia-rise:godot-dependencies-gradle-plugin:0.0.1")
        }
    }
}

includeBuild("../plugins/godot-dependencies-gradle-plugin") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-dependencies-gradle-plugin")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
    }
}
