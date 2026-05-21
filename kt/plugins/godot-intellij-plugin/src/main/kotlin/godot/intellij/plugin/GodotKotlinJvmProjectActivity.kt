package godot.intellij.plugin

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import com.intellij.openapi.startup.StartupManager

class GodotKotlinJvmProjectActivity : ProjectActivity {
    override suspend fun execute(project: Project) {
        StartupManager.getInstance(project).runAfterOpened {
            if (!project.isDisposed) {
                project.getService(GodotKotlinJvmProjectService::class.java).start()
            }
        }
    }
}
