package godot.intellij.plugin.project

import com.intellij.openapi.components.service
import com.intellij.openapi.module.Module
import godot.intellij.plugin.GodotKotlinJvmProjectService
import godot.intellij.plugin.GodotProjectScopeService
import godot.intellij.plugin.RegisteredClassNameCache

val Module.registeredClassNameCache: RegisteredClassNameCache
    get() = project.service<GodotKotlinJvmProjectService>().provideRegisteredClassNameCache(this)

val Module.godotRoot: GodotRoot?
    get() = project.service<GodotProjectScopeService>().provideGodotRoot(this)
