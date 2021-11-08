// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PackedSceneGLTF : PackedScene() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKEDSCENEGLTF)
  }

  public open fun exportGltf(
    node: Node,
    path: String,
    flags: Long = 0,
    bakeFps: Double = 1000.0
  ): GodotError {
    TransferContext.writeArguments(OBJECT to node, STRING to path, LONG to flags, DOUBLE to bakeFps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENEGLTF_EXPORT_GLTF, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun importGltfScene(
    path: String,
    flags: Long = 0,
    bakeFps: Double = 1000.0,
    compressFlags: Long = 2194432,
    state: GLTFState? = null
  ): Node? {
    TransferContext.writeArguments(STRING to path, LONG to flags, DOUBLE to bakeFps, LONG to
        compressFlags, OBJECT to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENEGLTF_IMPORT_GLTF_SCENE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  public open fun packGltf(
    path: String,
    flags: Long = 0,
    bakeFps: Double = 1000.0,
    compressFlags: Long = 2194432,
    state: GLTFState? = null
  ): Unit {
    TransferContext.writeArguments(STRING to path, LONG to flags, DOUBLE to bakeFps, LONG to
        compressFlags, OBJECT to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENEGLTF_PACK_GLTF, NIL)
  }
}
