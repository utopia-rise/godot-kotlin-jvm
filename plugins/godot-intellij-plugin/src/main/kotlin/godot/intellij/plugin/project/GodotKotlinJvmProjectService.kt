package godot.intellij.plugin.project

import com.intellij.openapi.components.service
import com.intellij.openapi.module.Module
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCache
import godot.intellij.plugin.data.cache.signalconnection.SignalConnectionCache
import godot.intellij.plugin.data.model.GodotRoot

interface GodotKotlinJvmProjectService {
    fun provideSignalConnectionCache(module: Module): SignalConnectionCache
    fun provideRegisteredClassNameCache(module: Module): RegisteredClassNameCache

    fun provideGodotRoot(module: Module): GodotRoot?

    companion object {
        fun getInstance(module: Module): GodotKotlinJvmProjectService = module.project.service()
    }
}
