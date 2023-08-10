package godot.intellij.plugin.gradle

import godot.plugins.common.GodotKotlinJvmPropertiesFile
import org.gradle.tooling.BuildAction
import org.gradle.tooling.BuildController
import org.gradle.tooling.UnknownModelException


/**
 * Gradle build action to fetch the settings file from the gradle process
 */
object FetchProjectModelsBuildAction : BuildAction<Map<String, GodotKotlinJvmPropertiesFile>> {
    private fun readResolve(): Any = FetchProjectModelsBuildAction

    override fun execute(controller: BuildController): Map<String, GodotKotlinJvmPropertiesFile> {
        val models = mutableMapOf<String, GodotKotlinJvmPropertiesFile>()
        for (project in controller.buildModel.projects) {
            // Make sure the keys of our map always use '/' as path separator
            val path = project.projectDirectory.absoluteFile.invariantSeparatorsPath
            try {
                models[path] = controller.getModel(project, GodotKotlinJvmPropertiesFile::class.java)
            } catch (e: UnknownModelException) {
                // no op
            }
        }
        return models
    }
}
