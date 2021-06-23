package godot.annotation.processor.compiler

import com.google.devtools.ksp.processing.Resolver
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.BindingTrace

object CompilerDataProvider {
    private var _project: Project? = null
    val project: Project
        get() = _project ?: throw UninitializedPropertyAccessException("CompilerDataProvider not yet initialized")

    private var _bindingContext: BindingContext? = null
    val bindingContext: BindingContext
        get() = _bindingContext
            ?: throw UninitializedPropertyAccessException("CompilerDataProvider not yet initialized")

    private var _srcDirs: List<String>? = null
    val srcDirs: List<String>
        get() = _srcDirs ?: throw UninitializedPropertyAccessException("CompilerDataProvider not yet initialized")

    fun init(resolver: Resolver, sourceDirs: List<String>) {
        _project = resolver::class.java.getDeclaredField("project").let {
            it.isAccessible = true
            (it.get(resolver) as Project)
        }
        _bindingContext = resolver::class.java.getDeclaredField("bindingTrace").let {
            it.isAccessible = true
            (it.get(resolver) as BindingTrace).bindingContext
        }
        _srcDirs = sourceDirs
    }
}
