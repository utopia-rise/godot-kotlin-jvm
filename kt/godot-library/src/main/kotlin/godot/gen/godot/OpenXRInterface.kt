// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Quaternion
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline

@GodotBaseType
public open class OpenXRInterface : XRInterface() {
  public val sessionBegun: Signal0 by signal()

  public val sessionStopping: Signal0 by signal()

  public val sessionFocussed: Signal0 by signal()

  public val sessionVisible: Signal0 by signal()

  public val poseRecentered: Signal0 by signal()

  public var displayRefreshRate: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_DISPLAY_REFRESH_RATE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_DISPLAY_REFRESH_RATE, NIL)
    }

  public var renderTargetSizeMultiplier: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_RENDER_TARGET_SIZE_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_RENDER_TARGET_SIZE_MULTIPLIER, NIL)
    }

  public var foveationLevel: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_FOVEATION_LEVEL, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_FOVEATION_LEVEL, NIL)
    }

  public var foveationDynamic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_FOVEATION_DYNAMIC, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_FOVEATION_DYNAMIC, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRINTERFACE, scriptIndex)
    return true
  }

  public fun isFoveationSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_IS_FOVEATION_SUPPORTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isActionSetActive(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_IS_ACTION_SET_ACTIVE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setActionSetActive(name: String, active: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to active)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_ACTION_SET_ACTIVE, NIL)
  }

  public fun getActionSets(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_ACTION_SETS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getAvailableDisplayRefreshRates(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_AVAILABLE_DISPLAY_REFRESH_RATES, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun setMotionRange(hand: Hand, motionRange: HandMotionRange): Unit {
    TransferContext.writeArguments(LONG to hand.id, LONG to motionRange.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_MOTION_RANGE,
        NIL)
  }

  public fun getMotionRange(hand: Hand): HandMotionRange {
    TransferContext.writeArguments(LONG to hand.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_MOTION_RANGE,
        LONG)
    return OpenXRInterface.HandMotionRange.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getHandJointFlags(hand: Hand, joint: HandJoints): HandJointFlags {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_HAND_JOINT_FLAGS, LONG)
    return HandJointFlagsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getHandJointRotation(hand: Hand, joint: HandJoints): Quaternion {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_HAND_JOINT_ROTATION, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  public fun getHandJointPosition(hand: Hand, joint: HandJoints): Vector3 {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_HAND_JOINT_POSITION, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getHandJointRadius(hand: Hand, joint: HandJoints): Float {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_HAND_JOINT_RADIUS, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getHandJointLinearVelocity(hand: Hand, joint: HandJoints): Vector3 {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_HAND_JOINT_LINEAR_VELOCITY, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun getHandJointAngularVelocity(hand: Hand, joint: HandJoints): Vector3 {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_HAND_JOINT_ANGULAR_VELOCITY, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun isHandTrackingSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_IS_HAND_TRACKING_SUPPORTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isEyeGazeInteractionSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_IS_EYE_GAZE_INTERACTION_SUPPORTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Hand(
    id: Long,
  ) {
    HAND_LEFT(0),
    HAND_RIGHT(1),
    HAND_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class HandMotionRange(
    id: Long,
  ) {
    HAND_MOTION_RANGE_UNOBSTRUCTED(0),
    HAND_MOTION_RANGE_CONFORM_TO_CONTROLLER(1),
    HAND_MOTION_RANGE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class HandJoints(
    id: Long,
  ) {
    HAND_JOINT_PALM(0),
    HAND_JOINT_WRIST(1),
    HAND_JOINT_THUMB_METACARPAL(2),
    HAND_JOINT_THUMB_PROXIMAL(3),
    HAND_JOINT_THUMB_DISTAL(4),
    HAND_JOINT_THUMB_TIP(5),
    HAND_JOINT_INDEX_METACARPAL(6),
    HAND_JOINT_INDEX_PROXIMAL(7),
    HAND_JOINT_INDEX_INTERMEDIATE(8),
    HAND_JOINT_INDEX_DISTAL(9),
    HAND_JOINT_INDEX_TIP(10),
    HAND_JOINT_MIDDLE_METACARPAL(11),
    HAND_JOINT_MIDDLE_PROXIMAL(12),
    HAND_JOINT_MIDDLE_INTERMEDIATE(13),
    HAND_JOINT_MIDDLE_DISTAL(14),
    HAND_JOINT_MIDDLE_TIP(15),
    HAND_JOINT_RING_METACARPAL(16),
    HAND_JOINT_RING_PROXIMAL(17),
    HAND_JOINT_RING_INTERMEDIATE(18),
    HAND_JOINT_RING_DISTAL(19),
    HAND_JOINT_RING_TIP(20),
    HAND_JOINT_LITTLE_METACARPAL(21),
    HAND_JOINT_LITTLE_PROXIMAL(22),
    HAND_JOINT_LITTLE_INTERMEDIATE(23),
    HAND_JOINT_LITTLE_DISTAL(24),
    HAND_JOINT_LITTLE_TIP(25),
    HAND_JOINT_MAX(26),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public val HAND_JOINT_NONE: HandJointFlags = HandJointFlagsValue(0)

      public val HAND_JOINT_ORIENTATION_VALID: HandJointFlags = HandJointFlagsValue(1)

      public val HAND_JOINT_ORIENTATION_TRACKED: HandJointFlags = HandJointFlagsValue(2)

      public val HAND_JOINT_POSITION_VALID: HandJointFlags = HandJointFlagsValue(4)

      public val HAND_JOINT_POSITION_TRACKED: HandJointFlags = HandJointFlagsValue(8)

      public val HAND_JOINT_LINEAR_VELOCITY_VALID: HandJointFlags = HandJointFlagsValue(16)

      public val HAND_JOINT_ANGULAR_VELOCITY_VALID: HandJointFlags = HandJointFlagsValue(32)
    }
  }

  @JvmInline
  internal value class HandJointFlagsValue internal constructor(
    public override val flag: Long,
  ) : HandJointFlags

  public companion object
}

public infix fun Long.or(other: godot.OpenXRInterface.HandJointFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.OpenXRInterface.HandJointFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.OpenXRInterface.HandJointFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.OpenXRInterface.HandJointFlags): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.OpenXRInterface.HandJointFlags): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.OpenXRInterface.HandJointFlags): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.OpenXRInterface.HandJointFlags): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.OpenXRInterface.HandJointFlags): Long =
    this.rem(other.flag)
