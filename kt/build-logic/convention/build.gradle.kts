import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.grgit)
}

gradlePlugin {
    plugins {
        register("versioninfo") {
            id = "com.utopia-rise.versioninfo"
            implementationClass = "versioninfo.VersionInfoPlugin"
        }
    }
}
