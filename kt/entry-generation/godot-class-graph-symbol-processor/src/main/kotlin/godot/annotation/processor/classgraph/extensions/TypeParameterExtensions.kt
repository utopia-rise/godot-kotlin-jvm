package godot.annotation.processor.classgraph.extensions

import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult
import io.github.classgraph.TypeParameter

context(ScanResult)
internal val TypeParameter.typeClassInfo: ClassInfo
    get() = this@ScanResult.getClassInfo(name)
