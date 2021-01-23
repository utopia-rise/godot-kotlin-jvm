package godot.intellij.plugin.annotator.clazz

import com.intellij.openapi.project.Project

object RegisteredClassNameCheckerProvider {
    private val registeredClassNameChecker: MutableMap<Project, RegisteredClassNameChecker> = mutableMapOf()

    fun provide(project: Project): RegisteredClassNameChecker {
        var checker = registeredClassNameChecker[project]
        if (checker == null) {
            registeredClassNameChecker[project] = RegisteredClassNameChecker()
            checker = registeredClassNameChecker[project]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        registeredClassNameChecker.remove(project)
    }
}
