
include("godot-library")

pluginManagement {
    resolutionStrategy.eachPlugin {
        when(requested.id.id) {
            "com.utopia-rise.godot-dependencies" -> useModule("com.utopia-rise:godot-dependencies-gradle-plugin:0.0.1")
            "com.utopia-rise.api-generator" -> useModule("com.utopia-rise:api-generator:0.0.1")
            "com.utopia-rise.godot-publish" -> useModule("com.utopia-rise:godot-publish-gradle-plugin:0.0.1")
            "com.github.johnrengelman.shadow" -> useVersion("7.1.2")
        }
    }
}

includeBuild("api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).using(project(":")) // assuming api-generator is the root project of api-generator
    }
}

subdir("entry-generation") {
    include("godot-kotlin-symbol-processor")
    include("godot-entry-generator")
}

subdir("plugins") {
    include("godot-gradle-plugin")
    include("godot-intellij-plugin")

    includeBuild("godot-dependencies-gradle-plugin") {
        dependencySubstitution {
            substitute(module("com.utopia-rise:godot-dependencies-gradle-plugin")).using(project(":")) // assuming godot-dependencies-gradle-plugin is the root project of godot-dependencies-gradle-plugin
        }
    }

    includeBuild("godot-publish-gradle-plugin") {
        dependencySubstitution {
            substitute(module("com.utopia-rise:godot-publish-gradle-plugin")).using(project(":")) // assuming godot-publish-gradle-plugin is the root project of godot-publish-gradle-plugin
        }
    }
}

subdir("utils") {
    include("godot-build-props")
}

includeBuild("tools-common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:tools-common")).using(project(":")) // assuming tools-common is the root project of tools-common
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
