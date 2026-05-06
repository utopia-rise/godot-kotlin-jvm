@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.MemberName

object Function {
    @Suppress("NOTHING_TO_INLINE")
    private inline fun functionName(simpleName: String) = MemberName(godotCorePackage, simpleName)

    val notification = functionName("_notification")
    val toGodotName = functionName("toGodotName")
    val variantArrayOf = functionName("variantArrayOf")
    val variantMapper = functionName("variantMapper")
    val asCallable = functionName("asCallable")
    val asCachedStringName = functionName("asCachedStringName")
    val asCachedNodePath = functionName("asCachedNodePath")
    val promise = MemberName(godotExtensionPackage, "promise")
}
