package godot.plugins.common.gradle.action

import godot.plugins.common.GodotJvmPropertiesFile


/**
 * Gradle build action to fetch the settings file from the gradle process
 */
object FetchProjectModelsBuildAction : org.gradle.tooling.BuildAction<Map<String, GodotJvmPropertiesFile>> {
    private fun readResolve(): Any = FetchProjectModelsBuildAction

    override fun execute(controller: org.gradle.tooling.BuildController): Map<String, GodotJvmPropertiesFile> {
        val models = mutableMapOf<String, GodotJvmPropertiesFile>()
        for (project in controller.buildModel.projects) {
            // Make sure the keys of our map always use '/' as path separator
            val path = project.projectDirectory.absoluteFile.invariantSeparatorsPath
            try {
                models[path] = controller.getModel(project, GodotJvmPropertiesFile::class.java)
            } catch (e: org.gradle.tooling.UnknownModelException) {
                // no op
            }
        }
        return models
    }
}
