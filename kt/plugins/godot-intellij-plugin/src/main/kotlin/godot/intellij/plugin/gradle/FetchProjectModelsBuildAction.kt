package godot.intellij.plugin.gradle

import godot.plugins.common.GodotKotlinJvmPropertiesFile
import org.gradle.tooling.BuildAction
import org.gradle.tooling.BuildController
import org.gradle.tooling.UnknownModelException

object FetchProjectModelsBuildAction : BuildAction<Map<String, GodotKotlinJvmPropertiesFile>> {
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
