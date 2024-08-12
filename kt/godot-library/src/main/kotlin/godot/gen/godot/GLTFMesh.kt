// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * GLTFMesh handles 3D mesh data imported from GLTF files. It includes properties for blend
 * channels, blend weights, instance materials, and the mesh itself.
 */
@GodotBaseType
public open class GLTFMesh : Resource() {
  /**
   * The original name of the mesh.
   */
  public var originalName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOriginalNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOriginalNamePtr, NIL)
    }

  /**
   * The [ImporterMesh] object representing the mesh itself.
   */
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

  /**
   * An array of floats representing the blend weights of the mesh.
   */
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

  /**
   * An array of Material objects representing the materials used in the mesh.
   */
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

  /**
   * Gets additional arbitrary data in this [GLTFMesh] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the GLTF file), and the return value can be anything you set. If nothing was set, the
   * return value is null.
   */
  public fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFMesh] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the GLTF file), and the second argument can be anything you want.
   */
  public fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_original_name")

    public val setOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_original_name")

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

    public val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_additional_data")

    public val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_additional_data")
  }
}
