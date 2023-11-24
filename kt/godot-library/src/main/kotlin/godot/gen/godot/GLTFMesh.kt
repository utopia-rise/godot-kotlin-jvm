// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class GLTFMesh : Resource() {
  public var mesh: ImporterMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ImporterMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  public var blendWeights: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendWeightsPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendWeightsPtr, NIL)
    }

  public var instanceMaterials: VariantArray<Material>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInstanceMaterialsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Material>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInstanceMaterialsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFMESH, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFMesh", "get_mesh")

    public val setMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFMesh", "set_mesh")

    public val getBlendWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_blend_weights")

    public val setBlendWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_blend_weights")

    public val getInstanceMaterialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_instance_materials")

    public val setInstanceMaterialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_instance_materials")
  }
}
