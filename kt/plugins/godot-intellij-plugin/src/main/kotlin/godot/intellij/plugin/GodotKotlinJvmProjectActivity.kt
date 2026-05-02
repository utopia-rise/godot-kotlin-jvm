package godot.intellij.plugin

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class GodotKotlinJvmProjectActivity : ProjectActivity {
    override suspend fun execute(project: Project) {
        project.getService(GodotKotlinJvmProjectService::class.java).start()
    }
}
