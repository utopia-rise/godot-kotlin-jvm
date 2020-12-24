include("godot-runtime")
include("godot-library")

includeBuild("entry-generation/godot-kotlin-entry-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-kotlin-entry-generator")).with(project(":")) // assuming godot-kotlin-entry-generator is the root project of entry-generator/godot-kotlin-entry-generator
    }
}

subdir("entry-generation") {
    include("godot-annotation-processor")
    include("godot-kotlin-compiler-plugin-common")
    include("godot-kotlin-compiler-plugin")
}

subdir("plugins") {
    include("godot-gradle-plugin")
}
includeBuild("plugins/godot-intellij-plugin")

subdir("utils") {
    include("godot-build-props")
}

class IncludeDsl(val root: String) {
    fun include(project: String) {
        settings.include(project)
        settings.project(":$project").also {
            it.projectDir = file("$root/$project")
        }
    }
}

fun subdir(root: String, block: IncludeDsl.() -> Unit) {
    block(IncludeDsl(root))
}
