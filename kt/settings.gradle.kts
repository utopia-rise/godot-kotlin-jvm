include("godot-runtime")
include("godot-library")

subdir("plugins") {
    include("godot-gradle-plugin")
}

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