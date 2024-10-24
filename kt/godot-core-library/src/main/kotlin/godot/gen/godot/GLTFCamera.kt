// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a camera as defined by the base GLTF spec.
 */
@GodotBaseType
public open class GLTFCamera : Resource() {
  /**
   * Whether or not the camera is in perspective mode. If false, the camera is in
   * orthographic/orthogonal mode. This maps to GLTF's camera `type` property. See
   * [Camera3D.projection] and the GLTF spec for more information.
   */
  public final inline var perspective: Boolean
    @JvmName("perspectiveProperty")
    get() = getPerspective()
    @JvmName("perspectiveProperty")
    set(`value`) {
      setPerspective(value)
    }

  /**
   * The FOV of the camera. This class and GLTF define the camera FOV in radians, while Godot uses
   * degrees. This maps to GLTF's `yfov` property. This value is only used for perspective cameras,
   * when [perspective] is true.
   */
  public final inline var fov: Float
    @JvmName("fovProperty")
    get() = getFov()
    @JvmName("fovProperty")
    set(`value`) {
      setFov(value)
    }

  /**
   * The size of the camera. This class and GLTF define the camera size magnitude as a radius in
   * meters, while Godot defines it as a diameter in meters. This maps to GLTF's `ymag` property. This
   * value is only used for orthographic/orthogonal cameras, when [perspective] is false.
   */
  public final inline var sizeMag: Float
    @JvmName("sizeMagProperty")
    get() = getSizeMag()
    @JvmName("sizeMagProperty")
    set(`value`) {
      setSizeMag(value)
    }

  /**
   * The distance to the far culling boundary for this camera relative to its local Z axis, in
   * meters. This maps to GLTF's `zfar` property.
   */
  public final inline var depthFar: Float
    @JvmName("depthFarProperty")
    get() = getDepthFar()
    @JvmName("depthFarProperty")
    set(`value`) {
      setDepthFar(value)
    }

  /**
   * The distance to the near culling boundary for this camera relative to its local Z axis, in
   * meters. This maps to GLTF's `znear` property.
   */
  public final inline var depthNear: Float
    @JvmName("depthNearProperty")
    get() = getDepthNear()
    @JvmName("depthNearProperty")
    set(`value`) {
      setDepthNear(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_GLTFCAMERA, scriptIndex)
  }

  /**
   * Converts this GLTFCamera instance into a Godot [Camera3D] node.
   */
  public final fun toNode(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Camera3D?)
  }

  /**
   * Serializes this GLTFCamera instance into a [Dictionary].
   */
  public final fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun getPerspective(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPerspectivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPerspective(perspective: Boolean): Unit {
    TransferContext.writeArguments(BOOL to perspective)
    TransferContext.callMethod(ptr, MethodBindings.setPerspectivePtr, NIL)
  }

  public final fun getFov(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFovPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFov(fov: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fov.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFovPtr, NIL)
  }

  public final fun getSizeMag(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizeMagPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSizeMag(sizeMag: Float): Unit {
    TransferContext.writeArguments(DOUBLE to sizeMag.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSizeMagPtr, NIL)
  }

  public final fun getDepthFar(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthFarPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthFar(zdepthFar: Float): Unit {
    TransferContext.writeArguments(DOUBLE to zdepthFar.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthFarPtr, NIL)
  }

  public final fun getDepthNear(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthNearPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthNear(zdepthNear: Float): Unit {
    TransferContext.writeArguments(DOUBLE to zdepthNear.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthNearPtr, NIL)
  }

  public companion object {
    /**
     * Create a new GLTFCamera instance from the given Godot [Camera3D] node.
     */
    public final fun fromNode(cameraNode: Camera3D?): GLTFCamera? {
      TransferContext.writeArguments(OBJECT to cameraNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFCamera?)
    }

    /**
     * Creates a new GLTFCamera instance by parsing the given [Dictionary].
     */
    public final fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFCamera? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFCamera?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "from_node", 237784)

    public val toNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "to_node", 2285090890)

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "from_dictionary", 2495512509)

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "to_dictionary", 3102165223)

    public val getPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_perspective", 36873697)

    public val setPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "set_perspective", 2586408642)

    public val getFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_fov", 1740695150)

    public val setFovPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "set_fov", 373806689)

    public val getSizeMagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_size_mag", 1740695150)

    public val setSizeMagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "set_size_mag", 373806689)

    public val getDepthFarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_depth_far", 1740695150)

    public val setDepthFarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "set_depth_far", 373806689)

    public val getDepthNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_depth_near", 1740695150)

    public val setDepthNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "set_depth_near", 373806689)
  }
}
