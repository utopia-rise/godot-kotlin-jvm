// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * A hand tracking system will create an instance of this object and add it to the [XRServer]. This
 * tracking system will then obtain skeleton data, convert it to the Godot Humanoid hand skeleton and
 * store this data on the [XRHandTracker] object.
 * Use [XRHandModifier3D] to animate a hand mesh using hand tracking data.
 */
@GodotBaseType
public open class XRHandTracker : XRPositionalTracker() {
  /**
   * If `true`, the hand tracking data is valid.
   */
  public var hasTrackingData: Boolean
    @JvmName("hasTrackingDataProperty")
    get() = getHasTrackingData()
    @JvmName("hasTrackingDataProperty")
    set(`value`) {
      setHasTrackingData(value)
    }

  /**
   * The source of the hand tracking data.
   */
  public var handTrackingSource: HandTrackingSource
    @JvmName("handTrackingSourceProperty")
    get() = getHandTrackingSource()
    @JvmName("handTrackingSourceProperty")
    set(`value`) {
      setHandTrackingSource(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRHANDTRACKER, scriptIndex)
  }

  public fun setHasTrackingData(hasData: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hasData)
    TransferContext.callMethod(rawPtr, MethodBindings.setHasTrackingDataPtr, NIL)
  }

  public fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setHandTrackingSource(source: HandTrackingSource): Unit {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandTrackingSourcePtr, NIL)
  }

  public fun getHandTrackingSource(): HandTrackingSource {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHandTrackingSourcePtr, LONG)
    return XRHandTracker.HandTrackingSource.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets flags about the validity of the tracking data for the given hand joint.
   */
  public fun setHandJointFlags(joint: HandJoint, flags: HandJointFlags): Unit {
    TransferContext.writeArguments(LONG to joint.id, LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandJointFlagsPtr, NIL)
  }

  /**
   * Returns flags about the validity of the tracking data for the given hand joint (see
   * [XRHandTracker.HandJointFlags]).
   */
  public fun getHandJointFlags(joint: HandJoint): HandJointFlags {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getHandJointFlagsPtr, LONG)
    return HandJointFlagsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the transform for the given hand joint.
   */
  public fun setHandJointTransform(joint: HandJoint, transform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to joint.id, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandJointTransformPtr, NIL)
  }

  /**
   * Returns the transform for the given hand joint.
   */
  public fun getHandJointTransform(joint: HandJoint): Transform3D {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getHandJointTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the radius of the given hand joint.
   */
  public fun setHandJointRadius(joint: HandJoint, radius: Float): Unit {
    TransferContext.writeArguments(LONG to joint.id, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setHandJointRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the given hand joint.
   */
  public fun getHandJointRadius(joint: HandJoint): Float {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getHandJointRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the linear velocity for the given hand joint.
   */
  public fun setHandJointLinearVelocity(joint: HandJoint, linearVelocity: Vector3): Unit {
    TransferContext.writeArguments(LONG to joint.id, VECTOR3 to linearVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandJointLinearVelocityPtr, NIL)
  }

  /**
   * Returns the linear velocity for the given hand joint.
   */
  public fun getHandJointLinearVelocity(joint: HandJoint): Vector3 {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getHandJointLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the angular velocity for the given hand joint.
   */
  public fun setHandJointAngularVelocity(joint: HandJoint, angularVelocity: Vector3): Unit {
    TransferContext.writeArguments(LONG to joint.id, VECTOR3 to angularVelocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandJointAngularVelocityPtr, NIL)
  }

  /**
   * Returns the angular velocity for the given hand joint.
   */
  public fun getHandJointAngularVelocity(joint: HandJoint): Vector3 {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getHandJointAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public enum class HandTrackingSource(
    id: Long,
  ) {
    /**
     * The source of hand tracking data is unknown.
     */
    HAND_TRACKING_SOURCE_UNKNOWN(0),
    /**
     * The source of hand tracking data is unobstructed, meaning that an accurate method of hand
     * tracking is used. These include optical hand tracking, data gloves, etc.
     */
    HAND_TRACKING_SOURCE_UNOBSTRUCTED(1),
    /**
     * The source of hand tracking data is a controller, meaning that joint positions are inferred
     * from controller inputs.
     */
    HAND_TRACKING_SOURCE_CONTROLLER(2),
    /**
     * Represents the size of the [HandTrackingSource] enum.
     */
    HAND_TRACKING_SOURCE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandTrackingSource = entries.single { it.id == `value` }
    }
  }

  public enum class HandJoint(
    id: Long,
  ) {
    /**
     * Palm joint.
     */
    HAND_JOINT_PALM(0),
    /**
     * Wrist joint.
     */
    HAND_JOINT_WRIST(1),
    /**
     * Thumb metacarpal joint.
     */
    HAND_JOINT_THUMB_METACARPAL(2),
    /**
     * Thumb phalanx proximal joint.
     */
    HAND_JOINT_THUMB_PHALANX_PROXIMAL(3),
    /**
     * Thumb phalanx distal joint.
     */
    HAND_JOINT_THUMB_PHALANX_DISTAL(4),
    /**
     * Thumb tip joint.
     */
    HAND_JOINT_THUMB_TIP(5),
    /**
     * Index finger metacarpal joint.
     */
    HAND_JOINT_INDEX_FINGER_METACARPAL(6),
    /**
     * Index finger phalanx proximal joint.
     */
    HAND_JOINT_INDEX_FINGER_PHALANX_PROXIMAL(7),
    /**
     * Index finger phalanx intermediate joint.
     */
    HAND_JOINT_INDEX_FINGER_PHALANX_INTERMEDIATE(8),
    /**
     * Index finger phalanx distal joint.
     */
    HAND_JOINT_INDEX_FINGER_PHALANX_DISTAL(9),
    /**
     * Index finger tip joint.
     */
    HAND_JOINT_INDEX_FINGER_TIP(10),
    /**
     * Middle finger metacarpal joint.
     */
    HAND_JOINT_MIDDLE_FINGER_METACARPAL(11),
    /**
     * Middle finger phalanx proximal joint.
     */
    HAND_JOINT_MIDDLE_FINGER_PHALANX_PROXIMAL(12),
    /**
     * Middle finger phalanx intermediate joint.
     */
    HAND_JOINT_MIDDLE_FINGER_PHALANX_INTERMEDIATE(13),
    /**
     * Middle finger phalanx distal joint.
     */
    HAND_JOINT_MIDDLE_FINGER_PHALANX_DISTAL(14),
    /**
     * Middle finger tip joint.
     */
    HAND_JOINT_MIDDLE_FINGER_TIP(15),
    /**
     * Ring finger metacarpal joint.
     */
    HAND_JOINT_RING_FINGER_METACARPAL(16),
    /**
     * Ring finger phalanx proximal joint.
     */
    HAND_JOINT_RING_FINGER_PHALANX_PROXIMAL(17),
    /**
     * Ring finger phalanx intermediate joint.
     */
    HAND_JOINT_RING_FINGER_PHALANX_INTERMEDIATE(18),
    /**
     * Ring finger phalanx distal joint.
     */
    HAND_JOINT_RING_FINGER_PHALANX_DISTAL(19),
    /**
     * Ring finger tip joint.
     */
    HAND_JOINT_RING_FINGER_TIP(20),
    /**
     * Pinky finger metacarpal joint.
     */
    HAND_JOINT_PINKY_FINGER_METACARPAL(21),
    /**
     * Pinky finger phalanx proximal joint.
     */
    HAND_JOINT_PINKY_FINGER_PHALANX_PROXIMAL(22),
    /**
     * Pinky finger phalanx intermediate joint.
     */
    HAND_JOINT_PINKY_FINGER_PHALANX_INTERMEDIATE(23),
    /**
     * Pinky finger phalanx distal joint.
     */
    HAND_JOINT_PINKY_FINGER_PHALANX_DISTAL(24),
    /**
     * Pinky finger tip joint.
     */
    HAND_JOINT_PINKY_FINGER_TIP(25),
    /**
     * Represents the size of the [HandJoint] enum.
     */
    HAND_JOINT_MAX(26),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandJoint = entries.single { it.id == `value` }
    }
  }

  public sealed interface HandJointFlags {
    public val flag: Long

    public infix fun or(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): HandJointFlags = HandJointFlagsValue(flag.or(other))

    public infix fun xor(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): HandJointFlags = HandJointFlagsValue(flag.xor(other))

    public infix fun and(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): HandJointFlags = HandJointFlagsValue(flag.and(other))

    public operator fun plus(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): HandJointFlags = HandJointFlagsValue(flag.plus(other))

    public operator fun minus(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): HandJointFlags = HandJointFlagsValue(flag.minus(other))

    public operator fun times(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): HandJointFlags = HandJointFlagsValue(flag.times(other))

    public operator fun div(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): HandJointFlags = HandJointFlagsValue(flag.div(other))

    public operator fun rem(other: HandJointFlags): HandJointFlags =
        HandJointFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): HandJointFlags = HandJointFlagsValue(flag.rem(other))

    public fun unaryPlus(): HandJointFlags = HandJointFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): HandJointFlags = HandJointFlagsValue(flag.unaryMinus())

    public fun inv(): HandJointFlags = HandJointFlagsValue(flag.inv())

    public infix fun shl(bits: Int): HandJointFlags = HandJointFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): HandJointFlags = HandJointFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): HandJointFlags = HandJointFlagsValue(flag ushr bits)

    public companion object {
      public val HAND_JOINT_FLAG_ORIENTATION_VALID: HandJointFlags = HandJointFlagsValue(1)

      public val HAND_JOINT_FLAG_ORIENTATION_TRACKED: HandJointFlags = HandJointFlagsValue(2)

      public val HAND_JOINT_FLAG_POSITION_VALID: HandJointFlags = HandJointFlagsValue(4)

      public val HAND_JOINT_FLAG_POSITION_TRACKED: HandJointFlags = HandJointFlagsValue(8)

      public val HAND_JOINT_FLAG_LINEAR_VELOCITY_VALID: HandJointFlags = HandJointFlagsValue(16)

      public val HAND_JOINT_FLAG_ANGULAR_VELOCITY_VALID: HandJointFlags = HandJointFlagsValue(32)
    }
  }

  @JvmInline
  internal value class HandJointFlagsValue internal constructor(
    public override val flag: Long,
  ) : HandJointFlags

  public companion object

  internal object MethodBindings {
    public val setHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_has_tracking_data", 2586408642)

    public val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_has_tracking_data", 36873697)

    public val setHandTrackingSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_tracking_source", 2958308861)

    public val getHandTrackingSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_tracking_source", 2475045250)

    public val setHandJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_flags", 3028437365)

    public val getHandJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_flags", 1730972401)

    public val setHandJointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_transform", 2529959613)

    public val getHandJointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_transform", 1090840196)

    public val setHandJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_radius", 2723659615)

    public val getHandJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_radius", 3400025734)

    public val setHandJointLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_linear_velocity", 1978646737)

    public val getHandJointLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_linear_velocity", 547240792)

    public val setHandJointAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_angular_velocity", 1978646737)

    public val getHandJointAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_angular_velocity", 547240792)
  }
}

public infix fun Long.or(other: godot.XRHandTracker.HandJointFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.XRHandTracker.HandJointFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.XRHandTracker.HandJointFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.XRHandTracker.HandJointFlags): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.XRHandTracker.HandJointFlags): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.XRHandTracker.HandJointFlags): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.XRHandTracker.HandJointFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.XRHandTracker.HandJointFlags): Long = this.rem(other.flag)
