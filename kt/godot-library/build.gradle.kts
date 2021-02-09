plugins {
    kotlin("jvm")
    id("com.utopia-rise.api-generator")
}

apiGenerator {
    outputDir.set(project.file("$rootDir/godot-library/src/main/kotlin/godot/gen"))
    sourceJson.set(project.file("$rootDir/api-generator/src/main/resources/api.json"))
    isNative.set(false)
}

tasks.compileKotlin {
    dependsOn(tasks.generateAPI)
}

dependencies {
    api(project(":godot-runtime"))
}
