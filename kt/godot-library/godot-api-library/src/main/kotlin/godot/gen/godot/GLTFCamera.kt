// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFCAMERA_INDEX: Int = 253

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
    Internals.callConstructor(this, ENGINE_CLASS_GLTFCAMERA_INDEX, scriptIndex)
  }

  /**
   * Converts this GLTFCamera instance into a Godot [Camera3D] node.
   */
  public final fun toNode(): Camera3D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Camera3D?)
  }

  /**
   * Serializes this GLTFCamera instance into a [Dictionary].
   */
  public final fun toDictionary(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun getPerspective(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPerspectivePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPerspective(perspective: Boolean): Unit {
    Internals.writeArguments(BOOL to perspective)
    Internals.callMethod(rawPtr, MethodBindings.setPerspectivePtr, NIL)
  }

  public final fun getFov(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFovPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFov(fov: Float): Unit {
    Internals.writeArguments(DOUBLE to fov.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFovPtr, NIL)
  }

  public final fun getSizeMag(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizeMagPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSizeMag(sizeMag: Float): Unit {
    Internals.writeArguments(DOUBLE to sizeMag.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSizeMagPtr, NIL)
  }

  public final fun getDepthFar(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthFarPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthFar(zdepthFar: Float): Unit {
    Internals.writeArguments(DOUBLE to zdepthFar.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthFarPtr, NIL)
  }

  public final fun getDepthNear(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthNearPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthNear(zdepthNear: Float): Unit {
    Internals.writeArguments(DOUBLE to zdepthNear.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthNearPtr, NIL)
  }

  public companion object {
    /**
     * Create a new GLTFCamera instance from the given Godot [Camera3D] node.
     */
    public final fun fromNode(cameraNode: Camera3D?): GLTFCamera? {
      Internals.writeArguments(OBJECT to cameraNode)
      Internals.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as GLTFCamera?)
    }

    /**
     * Creates a new GLTFCamera instance by parsing the given [Dictionary].
     */
    public final fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFCamera? {
      Internals.writeArguments(DICTIONARY to dictionary)
      Internals.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as GLTFCamera?)
    }
  }

  public object MethodBindings {
    internal val fromNodePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "from_node", 237784)

    internal val toNodePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "to_node", 2285090890)

    internal val fromDictionaryPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "from_dictionary", 2495512509)

    internal val toDictionaryPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "to_dictionary", 3102165223)

    internal val getPerspectivePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "get_perspective", 36873697)

    internal val setPerspectivePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "set_perspective", 2586408642)

    internal val getFovPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "get_fov", 1740695150)

    internal val setFovPtr: VoidPtr = Internals.getMethodBindPtr("GLTFCamera", "set_fov", 373806689)

    internal val getSizeMagPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "get_size_mag", 1740695150)

    internal val setSizeMagPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "set_size_mag", 373806689)

    internal val getDepthFarPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "get_depth_far", 1740695150)

    internal val setDepthFarPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "set_depth_far", 373806689)

    internal val getDepthNearPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "get_depth_near", 1740695150)

    internal val setDepthNearPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFCamera", "set_depth_near", 373806689)
  }
}
