// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * XR runtimes often identify multiple locations on devices such as controllers that are spatially
 * tracked.
 * Orientation, location, linear velocity and angular velocity are all provided for each pose by the
 * XR runtime. This object contains this state of a pose.
 */
@GodotBaseType
public open class XRPose : RefCounted() {
  /**
   * If `true` our tracking data is up to date. If `false` we're no longer receiving new tracking
   * data and our state is whatever that last valid state was.
   */
  public final inline var hasTrackingData: Boolean
    @JvmName("hasTrackingDataProperty")
    get() = getHasTrackingData()
    @JvmName("hasTrackingDataProperty")
    set(`value`) {
      setHasTrackingData(value)
    }

  /**
   * The name of this pose. Pose names are often driven by an action map setup by the user. Godot
   * does suggest a number of pose names that it expects [XRInterface]s to implement:
   * - `root` defines a root location, often used for tracked objects that do not have further
   * nodes.
   * - `aim` defines the tip of a controller with the orientation pointing outwards, for example:
   * add your raycasts to this.
   * - `grip` defines the location where the user grips the controller
   * - `skeleton` defines the root location a hand mesh should be placed when using hand tracking
   * and the animated skeleton supplied by the XR runtime.
   */
  public final inline var name: StringName
    @JvmName("nameProperty")
    get() = getName()
    @JvmName("nameProperty")
    set(`value`) {
      setName(value)
    }

  /**
   * The transform containing the original and transform as reported by the XR runtime.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform3D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * The linear velocity of this pose.
   */
  @CoreTypeLocalCopy
  public final inline var linearVelocity: Vector3
    @JvmName("linearVelocityProperty")
    get() = getLinearVelocity()
    @JvmName("linearVelocityProperty")
    set(`value`) {
      setLinearVelocity(value)
    }

  /**
   * The angular velocity for this pose.
   */
  @CoreTypeLocalCopy
  public final inline var angularVelocity: Vector3
    @JvmName("angularVelocityProperty")
    get() = getAngularVelocity()
    @JvmName("angularVelocityProperty")
    set(`value`) {
      setAngularVelocity(value)
    }

  /**
   * The tracking confidence for this pose, provides insight on how accurate the spatial positioning
   * of this record is.
   */
  public final inline var trackingConfidence: TrackingConfidence
    @JvmName("trackingConfidenceProperty")
    get() = getTrackingConfidence()
    @JvmName("trackingConfidenceProperty")
    set(`value`) {
      setTrackingConfidence(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRPOSE, scriptIndex)
  }

  /**
   * The transform containing the original and transform as reported by the XR runtime.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = xrpose.transform
   * //Your changes
   * xrpose.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
      block(this)
      transform = this
  }


  /**
   * The linear velocity of this pose.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = xrpose.linearVelocity
   * //Your changes
   * xrpose.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      block(this)
      linearVelocity = this
  }


  /**
   * The angular velocity for this pose.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = xrpose.angularVelocity
   * //Your changes
   * xrpose.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  public final fun setHasTrackingData(hasTrackingData: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hasTrackingData)
    TransferContext.callMethod(rawPtr, MethodBindings.setHasTrackingDataPtr, NIL)
  }

  public final fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setName(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setNamePtr, NIL)
  }

  public final fun getName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTransform(transform: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the [transform] with world scale and our reference frame applied. This is the transform
   * used to position [XRNode3D] objects.
   */
  public final fun getAdjustedTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAdjustedTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setLinearVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setTrackingConfidence(trackingConfidence: TrackingConfidence): Unit {
    TransferContext.writeArguments(LONG to trackingConfidence.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTrackingConfidencePtr, NIL)
  }

  public final fun getTrackingConfidence(): TrackingConfidence {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackingConfidencePtr, LONG)
    return XRPose.TrackingConfidence.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class TrackingConfidence(
    id: Long,
  ) {
    /**
     * No tracking information is available for this pose.
     */
    XR_TRACKING_CONFIDENCE_NONE(0),
    /**
     * Tracking information may be inaccurate or estimated. For example, with inside out tracking
     * this would indicate a controller may be (partially) obscured.
     */
    XR_TRACKING_CONFIDENCE_LOW(1),
    /**
     * Tracking information is considered accurate and up to date.
     */
    XR_TRACKING_CONFIDENCE_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackingConfidence = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_has_tracking_data", 2586408642)

    public val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_has_tracking_data", 36873697)

    public val setNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPose", "set_name", 3304788590)

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPose", "get_name", 2002593661)

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_transform", 2952846383)

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_transform", 3229777777)

    public val getAdjustedTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_adjusted_transform", 3229777777)

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_linear_velocity", 3460891852)

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_linear_velocity", 3360562783)

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_angular_velocity", 3460891852)

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_angular_velocity", 3360562783)

    public val setTrackingConfidencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_tracking_confidence", 4171656666)

    public val getTrackingConfidencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_tracking_confidence", 2064923680)
  }
}
