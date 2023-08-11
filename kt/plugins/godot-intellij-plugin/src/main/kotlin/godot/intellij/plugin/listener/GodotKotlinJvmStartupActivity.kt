package godot.intellij.plugin.listener

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import godot.intellij.plugin.project.GodotKotlinJvmProjectService

class GodotKotlinJvmStartupActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        // initialize our service eagerly, so we can do file indexing asap
        project.service<GodotKotlinJvmProjectService>()
    }
}
