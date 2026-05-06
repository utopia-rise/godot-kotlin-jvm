package godot.intellij.plugin.project

import com.squareup.kotlinpoet.ClassName
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName

fun String.asClassId(): ClassId = ClassId.topLevel(FqName(this))

fun ClassName.asClassId(): ClassId = ClassId.topLevel(FqName(canonicalName))
