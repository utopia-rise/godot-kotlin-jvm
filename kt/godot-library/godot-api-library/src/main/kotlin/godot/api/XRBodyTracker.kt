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
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public infix fun Long.or(other: XRBodyTracker.BodyFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: XRBodyTracker.BodyFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: XRBodyTracker.BodyFlags): Long = this.and(other.flag)

public infix fun Long.or(other: XRBodyTracker.JointFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: XRBodyTracker.JointFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: XRBodyTracker.JointFlags): Long = this.and(other.flag)

/**
 * A body tracking system will create an instance of this object and add it to the [XRServer]. This
 * tracking system will then obtain skeleton data, convert it to the Godot Humanoid skeleton and store
 * this data on the [XRBodyTracker] object.
 * Use [XRBodyModifier3D] to animate a body mesh using body tracking data.
 */
@GodotBaseType
public open class XRBodyTracker : XRPositionalTracker() {
  /**
   * If `true`, the body tracking data is valid.
   */
  public final inline var hasTrackingData: Boolean
    @JvmName("hasTrackingDataProperty")
    get() = getHasTrackingData()
    @JvmName("hasTrackingDataProperty")
    set(`value`) {
      setHasTrackingData(value)
    }

  /**
   * The type of body tracking data captured.
   */
  public final inline var bodyFlags: BodyFlags
    @JvmName("bodyFlagsProperty")
    get() = getBodyFlags()
    @JvmName("bodyFlagsProperty")
    set(`value`) {
      setBodyFlags(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(863, scriptIndex)
  }

  public final fun setHasTrackingData(hasData: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hasData)
    TransferContext.callMethod(ptr, MethodBindings.setHasTrackingDataPtr, NIL)
  }

  public final fun getHasTrackingData(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBodyFlags(flags: BodyFlags): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setBodyFlagsPtr, NIL)
  }

  public final fun getBodyFlags(): BodyFlags {
    TransferContext.callMethod(ptr, MethodBindings.getBodyFlagsPtr, LONG)
    return BodyFlags(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets flags about the validity of the tracking data for the given body joint.
   */
  public final fun setJointFlags(joint: Joint, flags: JointFlags): Unit {
    TransferContext.writeArguments(LONG to joint.id, LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setJointFlagsPtr, NIL)
  }

  /**
   * Returns flags about the validity of the tracking data for the given body joint (see
   * [XRBodyTracker.JointFlags]).
   */
  public final fun getJointFlags(joint: Joint): JointFlags {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getJointFlagsPtr, LONG)
    return JointFlags(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the transform for the given body joint.
   */
  public final fun setJointTransform(joint: Joint, transform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to joint.id, TRANSFORM3D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setJointTransformPtr, NIL)
  }

  /**
   * Returns the transform for the given body joint.
   */
  public final fun getJointTransform(joint: Joint): Transform3D {
    TransferContext.writeArguments(LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getJointTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  @JvmInline
  public value class BodyFlags(
    public val flag: Long,
  ) {
    public infix fun or(other: BodyFlags): BodyFlags = BodyFlags(flag.or(other.flag))

    public infix fun or(other: Long): BodyFlags = BodyFlags(flag.or(other))

    public infix fun xor(other: BodyFlags): BodyFlags = BodyFlags(flag.xor(other.flag))

    public infix fun xor(other: Long): BodyFlags = BodyFlags(flag.xor(other))

    public infix fun and(other: BodyFlags): BodyFlags = BodyFlags(flag.and(other.flag))

    public infix fun and(other: Long): BodyFlags = BodyFlags(flag.and(other))

    public fun unaryPlus(): BodyFlags = BodyFlags(flag.unaryPlus())

    public fun unaryMinus(): BodyFlags = BodyFlags(flag.unaryMinus())

    public fun inv(): BodyFlags = BodyFlags(flag.inv())

    public infix fun shl(bits: Int): BodyFlags = BodyFlags(flag shl bits)

    public infix fun shr(bits: Int): BodyFlags = BodyFlags(flag shr bits)

    public infix fun ushr(bits: Int): BodyFlags = BodyFlags(flag ushr bits)

    public companion object {
      /**
       * Upper body tracking supported.
       */
      public val BODY_FLAG_UPPER_BODY_SUPPORTED: BodyFlags = BodyFlags(1)

      /**
       * Lower body tracking supported.
       */
      public val BODY_FLAG_LOWER_BODY_SUPPORTED: BodyFlags = BodyFlags(2)

      /**
       * Hand tracking supported.
       */
      public val BODY_FLAG_HANDS_SUPPORTED: BodyFlags = BodyFlags(4)
    }
  }

  public enum class Joint(
    id: Long,
  ) {
    /**
     * Root joint.
     */
    JOINT_ROOT(0),
    /**
     * Hips joint.
     */
    JOINT_HIPS(1),
    /**
     * Spine joint.
     */
    JOINT_SPINE(2),
    /**
     * Chest joint.
     */
    JOINT_CHEST(3),
    /**
     * Upper chest joint.
     */
    JOINT_UPPER_CHEST(4),
    /**
     * Neck joint.
     */
    JOINT_NECK(5),
    /**
     * Head joint.
     */
    JOINT_HEAD(6),
    /**
     * Head tip joint.
     */
    JOINT_HEAD_TIP(7),
    /**
     * Left shoulder joint.
     */
    JOINT_LEFT_SHOULDER(8),
    /**
     * Left upper arm joint.
     */
    JOINT_LEFT_UPPER_ARM(9),
    /**
     * Left lower arm joint.
     */
    JOINT_LEFT_LOWER_ARM(10),
    /**
     * Right shoulder joint.
     */
    JOINT_RIGHT_SHOULDER(11),
    /**
     * Right upper arm joint.
     */
    JOINT_RIGHT_UPPER_ARM(12),
    /**
     * Right lower arm joint.
     */
    JOINT_RIGHT_LOWER_ARM(13),
    /**
     * Left upper leg joint.
     */
    JOINT_LEFT_UPPER_LEG(14),
    /**
     * Left lower leg joint.
     */
    JOINT_LEFT_LOWER_LEG(15),
    /**
     * Left foot joint.
     */
    JOINT_LEFT_FOOT(16),
    /**
     * Left toes joint.
     */
    JOINT_LEFT_TOES(17),
    /**
     * Right upper leg joint.
     */
    JOINT_RIGHT_UPPER_LEG(18),
    /**
     * Right lower leg joint.
     */
    JOINT_RIGHT_LOWER_LEG(19),
    /**
     * Right foot joint.
     */
    JOINT_RIGHT_FOOT(20),
    /**
     * Right toes joint.
     */
    JOINT_RIGHT_TOES(21),
    /**
     * Left hand joint.
     */
    JOINT_LEFT_HAND(22),
    /**
     * Left palm joint.
     */
    JOINT_LEFT_PALM(23),
    /**
     * Left wrist joint.
     */
    JOINT_LEFT_WRIST(24),
    /**
     * Left thumb metacarpal joint.
     */
    JOINT_LEFT_THUMB_METACARPAL(25),
    /**
     * Left thumb phalanx proximal joint.
     */
    JOINT_LEFT_THUMB_PHALANX_PROXIMAL(26),
    /**
     * Left thumb phalanx distal joint.
     */
    JOINT_LEFT_THUMB_PHALANX_DISTAL(27),
    /**
     * Left thumb tip joint.
     */
    JOINT_LEFT_THUMB_TIP(28),
    /**
     * Left index finger metacarpal joint.
     */
    JOINT_LEFT_INDEX_FINGER_METACARPAL(29),
    /**
     * Left index finger phalanx proximal joint.
     */
    JOINT_LEFT_INDEX_FINGER_PHALANX_PROXIMAL(30),
    /**
     * Left index finger phalanx intermediate joint.
     */
    JOINT_LEFT_INDEX_FINGER_PHALANX_INTERMEDIATE(31),
    /**
     * Left index finger phalanx distal joint.
     */
    JOINT_LEFT_INDEX_FINGER_PHALANX_DISTAL(32),
    /**
     * Left index finger tip joint.
     */
    JOINT_LEFT_INDEX_FINGER_TIP(33),
    /**
     * Left middle finger metacarpal joint.
     */
    JOINT_LEFT_MIDDLE_FINGER_METACARPAL(34),
    /**
     * Left middle finger phalanx proximal joint.
     */
    JOINT_LEFT_MIDDLE_FINGER_PHALANX_PROXIMAL(35),
    /**
     * Left middle finger phalanx intermediate joint.
     */
    JOINT_LEFT_MIDDLE_FINGER_PHALANX_INTERMEDIATE(36),
    /**
     * Left middle finger phalanx distal joint.
     */
    JOINT_LEFT_MIDDLE_FINGER_PHALANX_DISTAL(37),
    /**
     * Left middle finger tip joint.
     */
    JOINT_LEFT_MIDDLE_FINGER_TIP(38),
    /**
     * Left ring finger metacarpal joint.
     */
    JOINT_LEFT_RING_FINGER_METACARPAL(39),
    /**
     * Left ring finger phalanx proximal joint.
     */
    JOINT_LEFT_RING_FINGER_PHALANX_PROXIMAL(40),
    /**
     * Left ring finger phalanx intermediate joint.
     */
    JOINT_LEFT_RING_FINGER_PHALANX_INTERMEDIATE(41),
    /**
     * Left ring finger phalanx distal joint.
     */
    JOINT_LEFT_RING_FINGER_PHALANX_DISTAL(42),
    /**
     * Left ring finger tip joint.
     */
    JOINT_LEFT_RING_FINGER_TIP(43),
    /**
     * Left pinky finger metacarpal joint.
     */
    JOINT_LEFT_PINKY_FINGER_METACARPAL(44),
    /**
     * Left pinky finger phalanx proximal joint.
     */
    JOINT_LEFT_PINKY_FINGER_PHALANX_PROXIMAL(45),
    /**
     * Left pinky finger phalanx intermediate joint.
     */
    JOINT_LEFT_PINKY_FINGER_PHALANX_INTERMEDIATE(46),
    /**
     * Left pinky finger phalanx distal joint.
     */
    JOINT_LEFT_PINKY_FINGER_PHALANX_DISTAL(47),
    /**
     * Left pinky finger tip joint.
     */
    JOINT_LEFT_PINKY_FINGER_TIP(48),
    /**
     * Right hand joint.
     */
    JOINT_RIGHT_HAND(49),
    /**
     * Right palm joint.
     */
    JOINT_RIGHT_PALM(50),
    /**
     * Right wrist joint.
     */
    JOINT_RIGHT_WRIST(51),
    /**
     * Right thumb metacarpal joint.
     */
    JOINT_RIGHT_THUMB_METACARPAL(52),
    /**
     * Right thumb phalanx proximal joint.
     */
    JOINT_RIGHT_THUMB_PHALANX_PROXIMAL(53),
    /**
     * Right thumb phalanx distal joint.
     */
    JOINT_RIGHT_THUMB_PHALANX_DISTAL(54),
    /**
     * Right thumb tip joint.
     */
    JOINT_RIGHT_THUMB_TIP(55),
    /**
     * Right index finger metacarpal joint.
     */
    JOINT_RIGHT_INDEX_FINGER_METACARPAL(56),
    /**
     * Right index finger phalanx proximal joint.
     */
    JOINT_RIGHT_INDEX_FINGER_PHALANX_PROXIMAL(57),
    /**
     * Right index finger phalanx intermediate joint.
     */
    JOINT_RIGHT_INDEX_FINGER_PHALANX_INTERMEDIATE(58),
    /**
     * Right index finger phalanx distal joint.
     */
    JOINT_RIGHT_INDEX_FINGER_PHALANX_DISTAL(59),
    /**
     * Right index finger tip joint.
     */
    JOINT_RIGHT_INDEX_FINGER_TIP(60),
    /**
     * Right middle finger metacarpal joint.
     */
    JOINT_RIGHT_MIDDLE_FINGER_METACARPAL(61),
    /**
     * Right middle finger phalanx proximal joint.
     */
    JOINT_RIGHT_MIDDLE_FINGER_PHALANX_PROXIMAL(62),
    /**
     * Right middle finger phalanx intermediate joint.
     */
    JOINT_RIGHT_MIDDLE_FINGER_PHALANX_INTERMEDIATE(63),
    /**
     * Right middle finger phalanx distal joint.
     */
    JOINT_RIGHT_MIDDLE_FINGER_PHALANX_DISTAL(64),
    /**
     * Right middle finger tip joint.
     */
    JOINT_RIGHT_MIDDLE_FINGER_TIP(65),
    /**
     * Right ring finger metacarpal joint.
     */
    JOINT_RIGHT_RING_FINGER_METACARPAL(66),
    /**
     * Right ring finger phalanx proximal joint.
     */
    JOINT_RIGHT_RING_FINGER_PHALANX_PROXIMAL(67),
    /**
     * Right ring finger phalanx intermediate joint.
     */
    JOINT_RIGHT_RING_FINGER_PHALANX_INTERMEDIATE(68),
    /**
     * Right ring finger phalanx distal joint.
     */
    JOINT_RIGHT_RING_FINGER_PHALANX_DISTAL(69),
    /**
     * Right ring finger tip joint.
     */
    JOINT_RIGHT_RING_FINGER_TIP(70),
    /**
     * Right pinky finger metacarpal joint.
     */
    JOINT_RIGHT_PINKY_FINGER_METACARPAL(71),
    /**
     * Right pinky finger phalanx proximal joint.
     */
    JOINT_RIGHT_PINKY_FINGER_PHALANX_PROXIMAL(72),
    /**
     * Right pinky finger phalanx intermediate joint.
     */
    JOINT_RIGHT_PINKY_FINGER_PHALANX_INTERMEDIATE(73),
    /**
     * Right pinky finger phalanx distal joint.
     */
    JOINT_RIGHT_PINKY_FINGER_PHALANX_DISTAL(74),
    /**
     * Right pinky finger tip joint.
     */
    JOINT_RIGHT_PINKY_FINGER_TIP(75),
    /**
     * Represents the size of the [Joint] enum.
     */
    JOINT_MAX(76),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Joint = entries.single { it.id == `value` }
    }
  }

  @JvmInline
  public value class JointFlags(
    public val flag: Long,
  ) {
    public infix fun or(other: JointFlags): JointFlags = JointFlags(flag.or(other.flag))

    public infix fun or(other: Long): JointFlags = JointFlags(flag.or(other))

    public infix fun xor(other: JointFlags): JointFlags = JointFlags(flag.xor(other.flag))

    public infix fun xor(other: Long): JointFlags = JointFlags(flag.xor(other))

    public infix fun and(other: JointFlags): JointFlags = JointFlags(flag.and(other.flag))

    public infix fun and(other: Long): JointFlags = JointFlags(flag.and(other))

    public fun unaryPlus(): JointFlags = JointFlags(flag.unaryPlus())

    public fun unaryMinus(): JointFlags = JointFlags(flag.unaryMinus())

    public fun inv(): JointFlags = JointFlags(flag.inv())

    public infix fun shl(bits: Int): JointFlags = JointFlags(flag shl bits)

    public infix fun shr(bits: Int): JointFlags = JointFlags(flag shr bits)

    public infix fun ushr(bits: Int): JointFlags = JointFlags(flag ushr bits)

    public companion object {
      /**
       * The joint's orientation data is valid.
       */
      public val JOINT_FLAG_ORIENTATION_VALID: JointFlags = JointFlags(1)

      /**
       * The joint's orientation is actively tracked. May not be set if tracking has been
       * temporarily lost.
       */
      public val JOINT_FLAG_ORIENTATION_TRACKED: JointFlags = JointFlags(2)

      /**
       * The joint's position data is valid.
       */
      public val JOINT_FLAG_POSITION_VALID: JointFlags = JointFlags(4)

      /**
       * The joint's position is actively tracked. May not be set if tracking has been temporarily
       * lost.
       */
      public val JOINT_FLAG_POSITION_TRACKED: JointFlags = JointFlags(8)
    }
  }

  public companion object

  public object MethodBindings {
    internal val setHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "set_has_tracking_data", 2586408642)

    internal val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "get_has_tracking_data", 36873697)

    internal val setBodyFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "set_body_flags", 2103235750)

    internal val getBodyFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "get_body_flags", 3543166366)

    internal val setJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "set_joint_flags", 592144999)

    internal val getJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "get_joint_flags", 1030162609)

    internal val setJointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "set_joint_transform", 2635424328)

    internal val getJointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyTracker", "get_joint_transform", 3474811534)
  }
}
