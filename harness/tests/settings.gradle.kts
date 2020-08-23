rootProject.name = "godot-kotlin-tests"

includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-runtime")).with(project(":godot-runtime"))
        substitute(module("com.utopia-rise:godot-library")).with(project(":godot-library"))
        substitute(module("com.utopia-rise:godot-runtime-jvm")).with(project(":godot-runtime-jvm"))
        substitute(module("com.utopia-rise:godot-runtime-ios")).with(project(":godot-runtime-ios"))
    }
}