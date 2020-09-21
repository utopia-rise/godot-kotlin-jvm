plugins {
    kotlin("jvm")
    id("com.utopia-rise.api-generator")
}

apply<godot.gradle.ApiGeneratorPlugin>()

configure<godot.gradle.ApiGeneratorPluginExtension> {
    outputDir.set(project.file("$rootDir/godot-library/src/main/kotlin/godot/gen"))
    sourceJson.set(project.file("$rootDir/api-generator/src/main/resources/api.json"))
}

dependencies {
    api(project(":godot-runtime"))
}
