@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName

val ClassName.qualifiedName: String
    get() = canonicalName

val MemberName.qualifiedName: String
    get() = if (packageName.isEmpty()) simpleName else "$packageName.$simpleName"

fun ClassName.fileSpecBuilder(fileName: String? = null) = FileSpec.builder(packageName, fileName ?: simpleName)

fun ClassName.sibling(simpleName: String) = ClassName(packageName, simpleName)

fun ClassName.member(simpleName: String) = MemberName(canonicalName, simpleName)
