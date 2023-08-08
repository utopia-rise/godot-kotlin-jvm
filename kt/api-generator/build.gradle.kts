import godot.dependencies.gradle.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
    id("com.utopia-rise.godot-dependencies")
}

kotlin {
    jvmToolchain(17)
}

gradlePlugin {
    plugins {
        create("apiGeneratorPlugin") {
            id = "com.utopia-rise.api-generator"
            implementationClass = "godot.gradle.ApiGeneratorPlugin"
        }
    }
}

dependencies {
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    implementation(libs.kotlinPoet)
    implementation(libs.jacksonDataBind)
    implementation(libs.jacksonDataFormatXml)
}
