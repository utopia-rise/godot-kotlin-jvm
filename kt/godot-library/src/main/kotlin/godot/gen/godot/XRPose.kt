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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public var hasTrackingData: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHasTrackingDataPtr, NIL)
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
  public var name: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNamePtr, NIL)
    }

  /**
   * The transform containing the original and transform as reported by the XR runtime.
   */
  @CoreTypeLocalCopy
  public var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  /**
   * The linear velocity of this pose.
   */
  @CoreTypeLocalCopy
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
    }

  /**
   * The angular velocity for this pose.
   */
  @CoreTypeLocalCopy
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
    }

  /**
   * The tracking confidence for this pose, provides insight on how accurate the spatial positioning
   * of this record is.
   */
  public var trackingConfidence: TrackingConfidence
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackingConfidencePtr, LONG)
      return XRPose.TrackingConfidence.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackingConfidencePtr, NIL)
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
  public open fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
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
  public open fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
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
  public open fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      block(this)
      angularVelocity = this
  }


  /**
   * Returns the [transform] with world scale and our reference frame applied. This is the transform
   * used to position [XRNode3D] objects.
   */
  public fun getAdjustedTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAdjustedTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
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
        TypeManager.getMethodBindPtr("XRPose", "set_has_tracking_data")

    public val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_has_tracking_data")

    public val setNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPose", "set_name")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRPose", "get_name")

    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("XRPose", "set_transform")

    public val getTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("XRPose", "get_transform")

    public val getAdjustedTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_adjusted_transform")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_linear_velocity")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_linear_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_angular_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_angular_velocity")

    public val setTrackingConfidencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "set_tracking_confidence")

    public val getTrackingConfidencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPose", "get_tracking_confidence")
  }
}
