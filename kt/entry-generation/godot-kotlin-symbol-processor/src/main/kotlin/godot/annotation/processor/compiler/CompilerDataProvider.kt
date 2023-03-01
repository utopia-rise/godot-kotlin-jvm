package godot.annotation.processor.compiler

import com.google.devtools.ksp.processing.Resolver
import org.jetbrains.kotlin.com.intellij.openapi.project.Project

object CompilerDataProvider {
    private var _project: Project? = null
    val project: Project
        get() = _project ?: throw UninitializedPropertyAccessException("CompilerDataProvider not yet initialized")

    private var _srcDirs: List<String>? = null
    val srcDirs: List<String>
        get() = _srcDirs ?: throw UninitializedPropertyAccessException("CompilerDataProvider not yet initialized")

    fun init(resolver: Resolver, sourceDirs: List<String>) {
        //get compilation project through reflection
        //the underlying compiler plugin of ksp is a AnalysisExtension which provides the project
        //here we just access it to make use of it to gather all psi files which are needed for the psi based default value extraction
        _project = resolver::class.java.getDeclaredField("project").let {
            it.isAccessible = true
            (it.get(resolver) as Project)
        }
        _srcDirs = sourceDirs
    }
}
