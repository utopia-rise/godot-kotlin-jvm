import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
    id("com.utopia-rise.versioninfo")
}

kotlin {
    jvmToolchain(11)
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
