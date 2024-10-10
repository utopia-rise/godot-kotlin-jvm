// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRBODYTRACKER_INDEX: Int = 751

public infix fun Long.or(other: godot.XRBodyTracker.BodyFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.XRBodyTracker.BodyFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.XRBodyTracker.BodyFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.XRBodyTracker.BodyFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: godot.XRBodyTracker.BodyFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: godot.XRBodyTracker.BodyFlags): Long = this.times(other.flag)

public operator fun Long.div(other: godot.XRBodyTracker.BodyFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.XRBodyTracker.BodyFlags): Long = this.rem(other.flag)

public infix fun Long.or(other: godot.XRBodyTracker.JointFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.XRBodyTracker.JointFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.XRBodyTracker.JointFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.XRBodyTracker.JointFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: godot.XRBodyTracker.JointFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: godot.XRBodyTracker.JointFlags): Long = this.times(other.flag)

public operator fun Long.div(other: godot.XRBodyTracker.JointFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.XRBodyTracker.JointFlags): Long = this.rem(other.flag)

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
    Internals.callConstructor(this, ENGINE_CLASS_XRBODYTRACKER_INDEX, scriptIndex)
  }

  public final fun setHasTrackingData(hasData: Boolean): Unit {
    Internals.writeArguments(BOOL to hasData)
    Internals.callMethod(rawPtr, MethodBindings.setHasTrackingDataPtr, NIL)
  }

  public final fun getHasTrackingData(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBodyFlags(flags: BodyFlags): Unit {
    Internals.writeArguments(LONG to flags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setBodyFlagsPtr, NIL)
  }

  public final fun getBodyFlags(): BodyFlags {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBodyFlagsPtr, LONG)
    return BodyFlagsValue(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets flags about the validity of the tracking data for the given body joint.
   */
  public final fun setJointFlags(joint: Joint, flags: JointFlags): Unit {
    Internals.writeArguments(LONG to joint.id, LONG to flags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setJointFlagsPtr, NIL)
  }

  /**
   * Returns flags about the validity of the tracking data for the given body joint (see
   * [XRBodyTracker.JointFlags]).
   */
  public final fun getJointFlags(joint: Joint): JointFlags {
    Internals.writeArguments(LONG to joint.id)
    Internals.callMethod(rawPtr, MethodBindings.getJointFlagsPtr, LONG)
    return JointFlagsValue(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the transform for the given body joint.
   */
  public final fun setJointTransform(joint: Joint, transform: Transform3D): Unit {
    Internals.writeArguments(LONG to joint.id, TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.setJointTransformPtr, NIL)
  }

  /**
   * Returns the transform for the given body joint.
   */
  public final fun getJointTransform(joint: Joint): Transform3D {
    Internals.writeArguments(LONG to joint.id)
    Internals.callMethod(rawPtr, MethodBindings.getJointTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public sealed interface BodyFlags {
    public val flag: Long

    public infix fun or(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): BodyFlags = BodyFlagsValue(flag.or(other))

    public infix fun xor(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): BodyFlags = BodyFlagsValue(flag.xor(other))

    public infix fun and(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): BodyFlags = BodyFlagsValue(flag.and(other))

    public operator fun plus(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): BodyFlags = BodyFlagsValue(flag.plus(other))

    public operator fun minus(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): BodyFlags = BodyFlagsValue(flag.minus(other))

    public operator fun times(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): BodyFlags = BodyFlagsValue(flag.times(other))

    public operator fun div(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): BodyFlags = BodyFlagsValue(flag.div(other))

    public operator fun rem(other: BodyFlags): BodyFlags = BodyFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): BodyFlags = BodyFlagsValue(flag.rem(other))

    public fun unaryPlus(): BodyFlags = BodyFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): BodyFlags = BodyFlagsValue(flag.unaryMinus())

    public fun inv(): BodyFlags = BodyFlagsValue(flag.inv())

    public infix fun shl(bits: Int): BodyFlags = BodyFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): BodyFlags = BodyFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): BodyFlags = BodyFlagsValue(flag ushr bits)

    public companion object {
      public val BODY_FLAG_UPPER_BODY_SUPPORTED: BodyFlags = BodyFlagsValue(1)

      public val BODY_FLAG_LOWER_BODY_SUPPORTED: BodyFlags = BodyFlagsValue(2)

      public val BODY_FLAG_HANDS_SUPPORTED: BodyFlags = BodyFlagsValue(4)
    }
  }

  @JvmInline
  internal value class BodyFlagsValue internal constructor(
    public override val flag: Long,
  ) : BodyFlags

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

  public sealed interface JointFlags {
    public val flag: Long

    public infix fun or(other: JointFlags): JointFlags = JointFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): JointFlags = JointFlagsValue(flag.or(other))

    public infix fun xor(other: JointFlags): JointFlags = JointFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): JointFlags = JointFlagsValue(flag.xor(other))

    public infix fun and(other: JointFlags): JointFlags = JointFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): JointFlags = JointFlagsValue(flag.and(other))

    public operator fun plus(other: JointFlags): JointFlags = JointFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): JointFlags = JointFlagsValue(flag.plus(other))

    public operator fun minus(other: JointFlags): JointFlags =
        JointFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): JointFlags = JointFlagsValue(flag.minus(other))

    public operator fun times(other: JointFlags): JointFlags =
        JointFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): JointFlags = JointFlagsValue(flag.times(other))

    public operator fun div(other: JointFlags): JointFlags = JointFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): JointFlags = JointFlagsValue(flag.div(other))

    public operator fun rem(other: JointFlags): JointFlags = JointFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): JointFlags = JointFlagsValue(flag.rem(other))

    public fun unaryPlus(): JointFlags = JointFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): JointFlags = JointFlagsValue(flag.unaryMinus())

    public fun inv(): JointFlags = JointFlagsValue(flag.inv())

    public infix fun shl(bits: Int): JointFlags = JointFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): JointFlags = JointFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): JointFlags = JointFlagsValue(flag ushr bits)

    public companion object {
      public val JOINT_FLAG_ORIENTATION_VALID: JointFlags = JointFlagsValue(1)

      public val JOINT_FLAG_ORIENTATION_TRACKED: JointFlags = JointFlagsValue(2)

      public val JOINT_FLAG_POSITION_VALID: JointFlags = JointFlagsValue(4)

      public val JOINT_FLAG_POSITION_TRACKED: JointFlags = JointFlagsValue(8)
    }
  }

  @JvmInline
  internal value class JointFlagsValue internal constructor(
    public override val flag: Long,
  ) : JointFlags

  public companion object

  internal object MethodBindings {
    public val setHasTrackingDataPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "set_has_tracking_data", 2586408642)

    public val getHasTrackingDataPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "get_has_tracking_data", 36873697)

    public val setBodyFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "set_body_flags", 2103235750)

    public val getBodyFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "get_body_flags", 3543166366)

    public val setJointFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "set_joint_flags", 592144999)

    public val getJointFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "get_joint_flags", 1030162609)

    public val setJointTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "set_joint_transform", 2635424328)

    public val getJointTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyTracker", "get_joint_transform", 3474811534)
  }
}
