@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName

object Internal {
    val transferContext = ClassName(godotMemoryPackage, "TransferContext")
    val memoryManager = ClassName(godotMemoryPackage, "MemoryManager")
    val typeManager = ClassName(godotReflectionPackage, "TypeManager")
    val objectId = ClassName(godotInteropPackage, "ObjectID")
    val voidPtr = ClassName(godotInteropPackage, "VoidPtr")
}
