package godot.intellij.plugin.extension

import godot.intellij.plugin.data.model.ResPath

val String.asResPath: ResPath
    get() = ResPath(path = this)
