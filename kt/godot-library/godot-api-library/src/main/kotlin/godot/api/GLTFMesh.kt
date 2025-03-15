// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedFloat32Array
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * GLTFMesh handles 3D mesh data imported from glTF files. It includes properties for blend
 * channels, blend weights, instance materials, and the mesh itself.
 */
@GodotBaseType
public open class GLTFMesh : Resource() {
  /**
   * The original name of the mesh.
   */
  public final inline var originalName: String
    @JvmName("originalNameProperty")
    get() = getOriginalName()
    @JvmName("originalNameProperty")
    set(`value`) {
      setOriginalName(value)
    }

  /**
   * The [ImporterMesh] object representing the mesh itself.
   */
  public final inline var mesh: ImporterMesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  /**
   * An array of floats representing the blend weights of the mesh.
   */
  public final inline var blendWeights: PackedFloat32Array
    @JvmName("blendWeightsProperty")
    get() = getBlendWeights()
    @JvmName("blendWeightsProperty")
    set(`value`) {
      setBlendWeights(value)
    }

  /**
   * An array of Material objects representing the materials used in the mesh.
   */
  public final inline var instanceMaterials: VariantArray<Material>
    @JvmName("instanceMaterialsProperty")
    get() = getInstanceMaterials()
    @JvmName("instanceMaterialsProperty")
    set(`value`) {
      setInstanceMaterials(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(232, scriptIndex)
  }

  public final fun getOriginalName(): String {
    TransferContext.callMethod(ptr, MethodBindings.getOriginalNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setOriginalName(originalName: String): Unit {
    TransferContext.writeArguments(STRING to originalName)
    TransferContext.callMethod(ptr, MethodBindings.setOriginalNamePtr, NIL)
  }

  public final fun getMesh(): ImporterMesh? {
    TransferContext.callMethod(ptr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ImporterMesh?)
  }

  public final fun setMesh(mesh: ImporterMesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getBlendWeights(): PackedFloat32Array {
    TransferContext.callMethod(ptr, MethodBindings.getBlendWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  public final fun setBlendWeights(blendWeights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to blendWeights)
    TransferContext.callMethod(ptr, MethodBindings.setBlendWeightsPtr, NIL)
  }

  public final fun getInstanceMaterials(): VariantArray<Material> {
    TransferContext.callMethod(ptr, MethodBindings.getInstanceMaterialsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Material>)
  }

  public final fun setInstanceMaterials(instanceMaterials: VariantArray<Material>): Unit {
    TransferContext.writeArguments(ARRAY to instanceMaterials)
    TransferContext.callMethod(ptr, MethodBindings.setInstanceMaterialsPtr, NIL)
  }

  /**
   * Gets additional arbitrary data in this [GLTFMesh] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the glTF file), and the return value can be anything you set. If nothing was set, the
   * return value is `null`.
   */
  public final fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(ptr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFMesh] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the glTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(ptr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  /**
   * Gets additional arbitrary data in this [GLTFMesh] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the glTF file), and the return value can be anything you set. If nothing was set, the
   * return value is `null`.
   */
  public final fun getAdditionalData(extensionName: String): Any? =
      getAdditionalData(extensionName.asCachedStringName())

  /**
   * Sets additional arbitrary data in this [GLTFMesh] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the glTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: String, additionalData: Any?) =
      setAdditionalData(extensionName.asCachedStringName(), additionalData)

  public companion object

  public object MethodBindings {
    internal val getOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_original_name", 2841200299)

    internal val setOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_original_name", 83702148)

    internal val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_mesh", 3754628756)

    internal val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_mesh", 2255166972)

    internal val getBlendWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_blend_weights", 2445143706)

    internal val setBlendWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_blend_weights", 2899603908)

    internal val getInstanceMaterialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_instance_materials", 2915620761)

    internal val setInstanceMaterialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_instance_materials", 381264803)

    internal val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "get_additional_data", 2138907829)

    internal val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFMesh", "set_additional_data", 3776071444)
  }
}
