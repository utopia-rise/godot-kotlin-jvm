// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolRealArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_REAL_ARRAY
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFMesh : Resource() {
  public open var blendWeights: PoolRealArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFMESH_GET_BLEND_WEIGHTS,
          POOL_REAL_ARRAY)
      return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_REAL_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFMESH_SET_BLEND_WEIGHTS, NIL)
    }

  public open var instanceMaterials: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFMESH_GET_INSTANCE_MATERIALS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFMESH_SET_INSTANCE_MATERIALS,
          NIL)
    }

  public open var mesh: ArrayMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFMESH_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFMESH_SET_MESH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFMESH)
  }
}
