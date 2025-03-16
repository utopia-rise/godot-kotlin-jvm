package godot.intellij.plugin.extension

import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName

fun asClassId(fqName: String): ClassId {
    val packageName = fqName.substringBeforeLast(".")
    val simpleName = fqName.substringAfterLast(".")
    return ClassId(FqName(packageName), FqName(simpleName), false)
}
