package godot.intellij.plugin.extension

import com.intellij.openapi.components.service
import com.intellij.openapi.module.Module
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCache
import godot.intellij.plugin.data.cache.signalconnection.SignalConnectionCache
import godot.intellij.plugin.data.model.GodotRoot
import godot.intellij.plugin.project.GodotJvmProjectService

val Module.registeredClassNameCache: RegisteredClassNameCache
    get() = project.service<GodotJvmProjectService>().provideRegisteredClassNameCache(this)

val Module.signalConnectionCache: SignalConnectionCache
    get() = project.service<GodotJvmProjectService>().provideSignalConnectionCache(this)

val Module.godotRoot: GodotRoot?
    get() = project.service<GodotJvmProjectService>().provideGodotRoot(this)
