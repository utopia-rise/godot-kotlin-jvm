package godot.annotation.processor.compiler

import com.google.devtools.ksp.processing.Resolver
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.BindingTrace

object CompilerDataProvider {
    lateinit var project: Project
    lateinit var bindingContext: BindingContext
    lateinit var srcDirs: List<String>

    fun extractNecessaryCompilerClasses(resolver: Resolver) {
        project = resolver::class.java.getDeclaredField("project").let {
            it.isAccessible = true
            (it.get(resolver) as Project)
        }
        bindingContext = resolver::class.java.getDeclaredField("bindingTrace").let {
            it.isAccessible = true
            (it.get(resolver) as BindingTrace).bindingContext
        }
    }
}
