package godot.gradle.projectExt

import godot.utils.GodotBuildProperties
import org.gradle.api.Project


fun Project.setupConfigurationsAndCompilations() {
    //add our dependencies to the main compilation -> convenience for the user
    kotlinJvmExtension.target.compilations.getByName("main").apply {
        dependencies {
            implementation("org.jetbrains.kotlin:kotlin-stdlib:${kotlinJvmExtension.coreLibrariesVersion}")
            implementation("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
            compileOnly("com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.godotKotlinVersion}")
        }
        dependencies.add(
            "ksp",
            "com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.godotKotlinVersion}"
        )
    }
}
