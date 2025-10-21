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
import godot.core.GodotEnum
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

public infix fun Long.or(other: XRHandTracker.HandJointFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: XRHandTracker.HandJointFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: XRHandTracker.HandJointFlags): Long = this.and(other.flag)

/**
 * A hand tracking system will create an instance of this object and add it to the [XRServer]. This
 * tracking system will then obtain skeleton data, convert it to the Godot Humanoid hand skeleton and
 * store this data on the [XRHandTracker] object.
 *
 * Use [XRHandModifier3D] to animate a hand mesh using hand tracking data.
 */
@GodotBaseType
public open class XRHandTracker : XRPositionalTracker() {
  /**
   * If `true`, the hand tracking data is valid.
   */
  public final inline var hasTrackingData: Boolean
    @JvmName("hasTrackingDataProperty")
    get() = getHasTrackingData()
    @JvmName("hasTrackingDataProperty")
    set(`value`) {
      setHasTrackingData(value)
    }

  /**
   * The source of the hand tracking data.
   */
  public final inline var handTrackingSource: HandTrackingSource
    @JvmName("handTrackingSourceProperty")
    get() = getHandTrackingSource()
    @JvmName("handTrackingSourceProperty")
    set(`value`) {
      setHandTrackingSource(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(884, scriptIndex)
  }

  public final fun setHasTrackingData(hasData: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hasData)
    TransferContext.callMethod(ptr, MethodBindings.setHasTrackingDataPtr, NIL)
  }

  public final fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHandTrackingSource(source: HandTrackingSource): Unit {
    TransferContext.writeArguments(LONG to source.value)
    TransferContext.callMethod(ptr, MethodBindings.setHandTrackingSourcePtr, NIL)
  }

  public final fun getHandTrackingSource(): HandTrackingSource {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHandTrackingSourcePtr, LONG)
    return HandTrackingSource.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets flags about the validity of the tracking data for the given hand joint.
   */
  public final fun setHandJointFlags(joint: HandJoint, flags: HandJointFlags): Unit {
    TransferContext.writeArguments(LONG to joint.value, LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setHandJointFlagsPtr, NIL)
  }

  /**
   * Returns flags about the validity of the tracking data for the given hand joint.
   */
  public final fun getHandJointFlags(joint: HandJoint): HandJointFlags {
    TransferContext.writeArguments(LONG to joint.value)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointFlagsPtr, LONG)
    return HandJointFlags(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the transform for the given hand joint.
   */
  public final fun setHandJointTransform(joint: HandJoint, transform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to joint.value, TRANSFORM3D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setHandJointTransformPtr, NIL)
  }

  /**
   * Returns the transform for the given hand joint.
   */
  public final fun getHandJointTransform(joint: HandJoint): Transform3D {
    TransferContext.writeArguments(LONG to joint.value)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Sets the radius of the given hand joint.
   */
  public final fun setHandJointRadius(joint: HandJoint, radius: Float): Unit {
    TransferContext.writeArguments(LONG to joint.value, DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHandJointRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the given hand joint.
   */
  public final fun getHandJointRadius(joint: HandJoint): Float {
    TransferContext.writeArguments(LONG to joint.value)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the linear velocity for the given hand joint.
   */
  public final fun setHandJointLinearVelocity(joint: HandJoint, linearVelocity: Vector3): Unit {
    TransferContext.writeArguments(LONG to joint.value, VECTOR3 to linearVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setHandJointLinearVelocityPtr, NIL)
  }

  /**
   * Returns the linear velocity for the given hand joint.
   */
  public final fun getHandJointLinearVelocity(joint: HandJoint): Vector3 {
    TransferContext.writeArguments(LONG to joint.value)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the angular velocity for the given hand joint.
   */
  public final fun setHandJointAngularVelocity(joint: HandJoint, angularVelocity: Vector3): Unit {
    TransferContext.writeArguments(LONG to joint.value, VECTOR3 to angularVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setHandJointAngularVelocityPtr, NIL)
  }

  /**
   * Returns the angular velocity for the given hand joint.
   */
  public final fun getHandJointAngularVelocity(joint: HandJoint): Vector3 {
    TransferContext.writeArguments(LONG to joint.value)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public enum class HandTrackingSource(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The source of hand tracking data is unknown.
     */
    UNKNOWN(0),
    /**
     * The source of hand tracking data is unobstructed, meaning that an accurate method of hand
     * tracking is used. These include optical hand tracking, data gloves, etc.
     */
    UNOBSTRUCTED(1),
    /**
     * The source of hand tracking data is a controller, meaning that joint positions are inferred
     * from controller inputs.
     */
    CONTROLLER(2),
    /**
     * No hand tracking data is tracked, this either means the hand is obscured, the controller is
     * turned off, or tracking is not supported for the current input type.
     */
    NOT_TRACKED(3),
    /**
     * Represents the size of the [HandTrackingSource] enum.
     */
    MAX(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): HandTrackingSource = entries.single { it.`value` == `value` }
    }
  }

  public enum class HandJoint(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Palm joint.
     */
    PALM(0),
    /**
     * Wrist joint.
     */
    WRIST(1),
    /**
     * Thumb metacarpal joint.
     */
    THUMB_METACARPAL(2),
    /**
     * Thumb phalanx proximal joint.
     */
    THUMB_PHALANX_PROXIMAL(3),
    /**
     * Thumb phalanx distal joint.
     */
    THUMB_PHALANX_DISTAL(4),
    /**
     * Thumb tip joint.
     */
    THUMB_TIP(5),
    /**
     * Index finger metacarpal joint.
     */
    INDEX_FINGER_METACARPAL(6),
    /**
     * Index finger phalanx proximal joint.
     */
    INDEX_FINGER_PHALANX_PROXIMAL(7),
    /**
     * Index finger phalanx intermediate joint.
     */
    INDEX_FINGER_PHALANX_INTERMEDIATE(8),
    /**
     * Index finger phalanx distal joint.
     */
    INDEX_FINGER_PHALANX_DISTAL(9),
    /**
     * Index finger tip joint.
     */
    INDEX_FINGER_TIP(10),
    /**
     * Middle finger metacarpal joint.
     */
    MIDDLE_FINGER_METACARPAL(11),
    /**
     * Middle finger phalanx proximal joint.
     */
    MIDDLE_FINGER_PHALANX_PROXIMAL(12),
    /**
     * Middle finger phalanx intermediate joint.
     */
    MIDDLE_FINGER_PHALANX_INTERMEDIATE(13),
    /**
     * Middle finger phalanx distal joint.
     */
    MIDDLE_FINGER_PHALANX_DISTAL(14),
    /**
     * Middle finger tip joint.
     */
    MIDDLE_FINGER_TIP(15),
    /**
     * Ring finger metacarpal joint.
     */
    RING_FINGER_METACARPAL(16),
    /**
     * Ring finger phalanx proximal joint.
     */
    RING_FINGER_PHALANX_PROXIMAL(17),
    /**
     * Ring finger phalanx intermediate joint.
     */
    RING_FINGER_PHALANX_INTERMEDIATE(18),
    /**
     * Ring finger phalanx distal joint.
     */
    RING_FINGER_PHALANX_DISTAL(19),
    /**
     * Ring finger tip joint.
     */
    RING_FINGER_TIP(20),
    /**
     * Pinky finger metacarpal joint.
     */
    PINKY_FINGER_METACARPAL(21),
    /**
     * Pinky finger phalanx proximal joint.
     */
    PINKY_FINGER_PHALANX_PROXIMAL(22),
    /**
     * Pinky finger phalanx intermediate joint.
     */
    PINKY_FINGER_PHALANX_INTERMEDIATE(23),
    /**
     * Pinky finger phalanx distal joint.
     */
    PINKY_FINGER_PHALANX_DISTAL(24),
    /**
     * Pinky finger tip joint.
     */
    PINKY_FINGER_TIP(25),
    /**
     * Represents the size of the [HandJoint] enum.
     */
    MAX(26),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): HandJoint = entries.single { it.`value` == `value` }
    }
  }

  public class HandJointFlags(
    public val flag: Long,
  ) {
    public infix fun or(other: HandJointFlags): HandJointFlags = HandJointFlags(flag.or(other.flag))

    public infix fun or(other: Long): HandJointFlags = HandJointFlags(flag.or(other))

    public infix fun xor(other: HandJointFlags): HandJointFlags =
        HandJointFlags(flag.xor(other.flag))

    public infix fun xor(other: Long): HandJointFlags = HandJointFlags(flag.xor(other))

    public infix fun and(other: HandJointFlags): HandJointFlags =
        HandJointFlags(flag.and(other.flag))

    public infix fun and(other: Long): HandJointFlags = HandJointFlags(flag.and(other))

    public fun unaryPlus(): HandJointFlags = HandJointFlags(flag.unaryPlus())

    public fun unaryMinus(): HandJointFlags = HandJointFlags(flag.unaryMinus())

    public fun inv(): HandJointFlags = HandJointFlags(flag.inv())

    public infix fun shl(bits: Int): HandJointFlags = HandJointFlags(flag shl bits)

    public infix fun shr(bits: Int): HandJointFlags = HandJointFlags(flag shr bits)

    public infix fun ushr(bits: Int): HandJointFlags = HandJointFlags(flag ushr bits)

    public companion object {
      /**
       * The hand joint's orientation data is valid.
       */
      @JvmField
      public val ORIENTATION_VALID: HandJointFlags = HandJointFlags(1)

      /**
       * The hand joint's orientation is actively tracked. May not be set if tracking has been
       * temporarily lost.
       */
      @JvmField
      public val ORIENTATION_TRACKED: HandJointFlags = HandJointFlags(2)

      /**
       * The hand joint's position data is valid.
       */
      @JvmField
      public val POSITION_VALID: HandJointFlags = HandJointFlags(4)

      /**
       * The hand joint's position is actively tracked. May not be set if tracking has been
       * temporarily lost.
       */
      @JvmField
      public val POSITION_TRACKED: HandJointFlags = HandJointFlags(8)

      /**
       * The hand joint's linear velocity data is valid.
       */
      @JvmField
      public val LINEAR_VELOCITY_VALID: HandJointFlags = HandJointFlags(16)

      /**
       * The hand joint's angular velocity data is valid.
       */
      @JvmField
      public val ANGULAR_VELOCITY_VALID: HandJointFlags = HandJointFlags(32)
    }
  }

  public companion object

  public object MethodBindings {
    internal val setHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_has_tracking_data", 2586408642)

    internal val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_has_tracking_data", 36873697)

    internal val setHandTrackingSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_tracking_source", 2958308861)

    internal val getHandTrackingSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_tracking_source", 2475045250)

    internal val setHandJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_flags", 3028437365)

    internal val getHandJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_flags", 1730972401)

    internal val setHandJointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_transform", 2529959613)

    internal val getHandJointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_transform", 1090840196)

    internal val setHandJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_radius", 2723659615)

    internal val getHandJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_radius", 3400025734)

    internal val setHandJointLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_linear_velocity", 1978646737)

    internal val getHandJointLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_linear_velocity", 547240792)

    internal val setHandJointAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "set_hand_joint_angular_velocity", 1978646737)

    internal val getHandJointAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandTracker", "get_hand_joint_angular_velocity", 547240792)
  }
}
