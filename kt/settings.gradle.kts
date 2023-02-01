include("godot-library")

pluginManagement {
    resolutionStrategy.eachPlugin {
        when(requested.id.id) {
            "com.utopia-rise.api-generator" -> useModule("com.utopia-rise:api-generator:0.0.1")
            "com.utopia-rise.godot-publish" -> useModule("com.utopia-rise:godot-publish-gradle-plugin:0.0.1")
            "org.ajoberstar.grgit" -> useVersion("4.1.1")
        }
    }
}

includeBuild("api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
    }
}

subdir("entry-generation") {
    include("godot-kotlin-symbol-processor")
    include("godot-entry-generator")
}

subdir("plugins") {
    include("godot-gradle-plugin")
    include("godot-intellij-plugin")

    includeBuild("godot-publish-gradle-plugin") {
        dependencySubstitution {
            substitute(module("com.utopia-rise:godot-publish-gradle-plugin")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
        }
    }
}

subdir("utils") {
    include("godot-build-props")
}

includeBuild("tools-common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:tools-common")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
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
