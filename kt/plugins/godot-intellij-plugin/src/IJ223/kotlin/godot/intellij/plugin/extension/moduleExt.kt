package godot.intellij.plugin.extension

import com.intellij.openapi.module.Module
import org.jetbrains.kotlin.idea.configuration.isGradleModule

fun Module.isGradleModule(): Boolean = this.isGradleModule()
