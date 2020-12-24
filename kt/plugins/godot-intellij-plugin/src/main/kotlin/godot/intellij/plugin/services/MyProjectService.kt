package godot.intellij.plugin.services

import com.intellij.openapi.project.Project
import godot.intellij.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
