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
import godot.core.Quaternion
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

public infix fun Long.or(other: OpenXRInterface.HandJointFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: OpenXRInterface.HandJointFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: OpenXRInterface.HandJointFlags): Long = this.and(other.flag)

/**
 * The OpenXR interface allows Godot to interact with OpenXR runtimes and make it possible to create
 * XR experiences and games.
 *
 * Due to the needs of OpenXR this interface works slightly different than other plugin based XR
 * interfaces. It needs to be initialized when Godot starts. You need to enable OpenXR, settings for
 * this can be found in your games project settings under the XR heading. You do need to mark a
 * viewport for use with XR in order for Godot to know which render result should be output to the
 * headset.
 */
@GodotBaseType
public open class OpenXRInterface : XRInterface() {
  /**
   * Informs our OpenXR session has been started.
   */
  public val sessionBegun: Signal0 by Signal0

  /**
   * Informs our OpenXR session is stopping.
   */
  public val sessionStopping: Signal0 by Signal0

  /**
   * Informs our OpenXR session now has focus.
   */
  public val sessionFocussed: Signal0 by Signal0

  /**
   * Informs our OpenXR session is now visible (output is being sent to the HMD).
   */
  public val sessionVisible: Signal0 by Signal0

  /**
   * Informs our OpenXR session is in the process of being lost.
   */
  public val sessionLossPending: Signal0 by Signal0

  /**
   * Informs our OpenXR instance is exiting.
   */
  public val instanceExiting: Signal0 by Signal0

  /**
   * Informs the user queued a recenter of the player position.
   */
  public val poseRecentered: Signal0 by Signal0

  /**
   * Informs the user the HMD refresh rate has changed.
   *
   * **Note:** Only emitted if XR runtime supports the refresh rate extension.
   */
  public val refreshRateChanged: Signal1<Double> by Signal1

  /**
   * The display refresh rate for the current HMD. Only functional if this feature is supported by
   * the OpenXR runtime and after the interface has been initialized.
   */
  public final inline var displayRefreshRate: Float
    @JvmName("displayRefreshRateProperty")
    get() = getDisplayRefreshRate()
    @JvmName("displayRefreshRateProperty")
    set(`value`) {
      setDisplayRefreshRate(value)
    }

  /**
   * The render size multiplier for the current HMD. Must be set before the interface has been
   * initialized.
   */
  public final inline var renderTargetSizeMultiplier: Double
    @JvmName("renderTargetSizeMultiplierProperty")
    get() = getRenderTargetSizeMultiplier()
    @JvmName("renderTargetSizeMultiplierProperty")
    set(`value`) {
      setRenderTargetSizeMultiplier(value)
    }

  /**
   * Set foveation level from 0 (off) to 3 (high), the interface must be initialized before this is
   * accessible.
   *
   * **Note:** Only works on compatibility renderer.
   */
  public final inline var foveationLevel: Int
    @JvmName("foveationLevelProperty")
    get() = getFoveationLevel()
    @JvmName("foveationLevelProperty")
    set(`value`) {
      setFoveationLevel(value)
    }

  /**
   * Enable dynamic foveation adjustment, the interface must be initialized before this is
   * accessible. If enabled foveation will automatically adjusted between low and [foveationLevel].
   *
   * **Note:** Only works on compatibility renderer.
   */
  public final inline var foveationDynamic: Boolean
    @JvmName("foveationDynamicProperty")
    get() = getFoveationDynamic()
    @JvmName("foveationDynamicProperty")
    set(`value`) {
      setFoveationDynamic(value)
    }

  /**
   * The minimum radius around the focal point where full quality is guaranteed if VRS is used as a
   * percentage of screen size.
   *
   * **Note:** Mobile and Forward+ renderers only. Requires [Viewport.vrsMode] to be set to
   * [Viewport.VRS_XR].
   */
  public final inline var vrsMinRadius: Float
    @JvmName("vrsMinRadiusProperty")
    get() = getVrsMinRadius()
    @JvmName("vrsMinRadiusProperty")
    set(`value`) {
      setVrsMinRadius(value)
    }

  /**
   * The strength used to calculate the VRS density map. The greater this value, the more noticeable
   * VRS is. This improves performance at the cost of quality.
   *
   * **Note:** Mobile and Forward+ renderers only. Requires [Viewport.vrsMode] to be set to
   * [Viewport.VRS_XR].
   */
  public final inline var vrsStrength: Float
    @JvmName("vrsStrengthProperty")
    get() = getVrsStrength()
    @JvmName("vrsStrengthProperty")
    set(`value`) {
      setVrsStrength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(430, scriptIndex)
  }

  public final fun getDisplayRefreshRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisplayRefreshRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDisplayRefreshRate(refreshRate: Float): Unit {
    TransferContext.writeArguments(DOUBLE to refreshRate.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDisplayRefreshRatePtr, NIL)
  }

  public final fun getRenderTargetSizeMultiplier(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderTargetSizeMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setRenderTargetSizeMultiplier(multiplier: Double): Unit {
    TransferContext.writeArguments(DOUBLE to multiplier)
    TransferContext.callMethod(ptr, MethodBindings.setRenderTargetSizeMultiplierPtr, NIL)
  }

  /**
   * Returns `true` if OpenXR's foveation extension is supported, the interface must be initialized
   * before this returns a valid value.
   *
   * **Note:** This feature is only available on the compatibility renderer and currently only
   * available on some stand alone headsets. For Vulkan set [Viewport.vrsMode] to `VRS_XR` on desktop.
   */
  public final fun isFoveationSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFoveationSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getFoveationLevel(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFoveationLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFoveationLevel(foveationLevel: Int): Unit {
    TransferContext.writeArguments(LONG to foveationLevel.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFoveationLevelPtr, NIL)
  }

  public final fun getFoveationDynamic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFoveationDynamicPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFoveationDynamic(foveationDynamic: Boolean): Unit {
    TransferContext.writeArguments(BOOL to foveationDynamic)
    TransferContext.callMethod(ptr, MethodBindings.setFoveationDynamicPtr, NIL)
  }

  /**
   * Returns `true` if the given action set is active.
   */
  public final fun isActionSetActive(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.isActionSetActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the given action set as active or inactive.
   */
  public final fun setActionSetActive(name: String, active: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setActionSetActivePtr, NIL)
  }

  /**
   * Returns a list of action sets registered with Godot (loaded from the action map at runtime).
   */
  public final fun getActionSets(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionSetsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns display refresh rates supported by the current HMD. Only returned if this feature is
   * supported by the OpenXR runtime and after the interface has been initialized.
   */
  public final fun getAvailableDisplayRefreshRates(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvailableDisplayRefreshRatesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * If handtracking is enabled and motion range is supported, sets the currently configured motion
   * range for [hand] to [motionRange].
   */
  public final fun setMotionRange(hand: Hand, motionRange: HandMotionRange): Unit {
    TransferContext.writeArguments(LONG to hand.id, LONG to motionRange.id)
    TransferContext.callMethod(ptr, MethodBindings.setMotionRangePtr, NIL)
  }

  /**
   * If handtracking is enabled and motion range is supported, gets the currently configured motion
   * range for [hand].
   */
  public final fun getMotionRange(hand: Hand): HandMotionRange {
    TransferContext.writeArguments(LONG to hand.id)
    TransferContext.callMethod(ptr, MethodBindings.getMotionRangePtr, LONG)
    return HandMotionRange.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If handtracking is enabled and hand tracking source is supported, gets the source of the hand
   * tracking data for [hand].
   */
  public final fun getHandTrackingSource(hand: Hand): HandTrackedSource {
    TransferContext.writeArguments(LONG to hand.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandTrackingSourcePtr, LONG)
    return HandTrackedSource.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If handtracking is enabled, returns flags that inform us of the validity of the tracking data.
   */
  public final fun getHandJointFlags(hand: Hand, joint: HandJoints): HandJointFlags {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointFlagsPtr, LONG)
    return HandJointFlags(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If handtracking is enabled, returns the rotation of a joint ([joint]) of a hand ([hand]) as
   * provided by OpenXR.
   */
  public final fun getHandJointRotation(hand: Hand, joint: HandJoints): Quaternion {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointRotationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  /**
   * If handtracking is enabled, returns the position of a joint ([joint]) of a hand ([hand]) as
   * provided by OpenXR. This is relative to [XROrigin3D] without worldscale applied!
   */
  public final fun getHandJointPosition(hand: Hand, joint: HandJoints): Vector3 {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * If handtracking is enabled, returns the radius of a joint ([joint]) of a hand ([hand]) as
   * provided by OpenXR. This is without worldscale applied!
   */
  public final fun getHandJointRadius(hand: Hand, joint: HandJoints): Float {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * If handtracking is enabled, returns the linear velocity of a joint ([joint]) of a hand ([hand])
   * as provided by OpenXR. This is relative to [XROrigin3D] without worldscale applied!
   */
  public final fun getHandJointLinearVelocity(hand: Hand, joint: HandJoints): Vector3 {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * If handtracking is enabled, returns the angular velocity of a joint ([joint]) of a hand
   * ([hand]) as provided by OpenXR. This is relative to [XROrigin3D]!
   */
  public final fun getHandJointAngularVelocity(hand: Hand, joint: HandJoints): Vector3 {
    TransferContext.writeArguments(LONG to hand.id, LONG to joint.id)
    TransferContext.callMethod(ptr, MethodBindings.getHandJointAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns `true` if OpenXR's hand tracking is supported and enabled.
   *
   * **Note:** This only returns a valid value after OpenXR has been initialized.
   */
  public final fun isHandTrackingSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHandTrackingSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if OpenXR's hand interaction profile is supported and enabled.
   *
   * **Note:** This only returns a valid value after OpenXR has been initialized.
   */
  public final fun isHandInteractionSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHandInteractionSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the capabilities of the eye gaze interaction extension.
   *
   * **Note:** This only returns a valid value after OpenXR has been initialized.
   */
  public final fun isEyeGazeInteractionSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEyeGazeInteractionSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getVrsMinRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsMinRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsMinRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVrsMinRadiusPtr, NIL)
  }

  public final fun getVrsStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVrsStrengthPtr, NIL)
  }

  public enum class Hand(
    id: Long,
  ) : GodotEnum {
    /**
     * Left hand.
     */
    LEFT(0),
    /**
     * Right hand.
     */
    RIGHT(1),
    /**
     * Maximum value for the hand enum.
     */
    MAX(2),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Hand = entries.single { it.id == `value` }
    }
  }

  public enum class HandMotionRange(
    id: Long,
  ) : GodotEnum {
    /**
     * Full hand range, if user closes their hands, we make a full fist.
     */
    UNOBSTRUCTED(0),
    /**
     * Conform to controller, if user closes their hands, the tracked data conforms to the shape of
     * the controller.
     */
    CONFORM_TO_CONTROLLER(1),
    /**
     * Maximum value for the motion range enum.
     */
    MAX(2),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandMotionRange = entries.single { it.id == `value` }
    }
  }

  public enum class HandTrackedSource(
    id: Long,
  ) : GodotEnum {
    /**
     * The source of hand tracking data is unknown (the extension is likely unsupported).
     */
    UNKNOWN(0),
    /**
     * The source of hand tracking is unobstructed, this means that an accurate method of hand
     * tracking is used, e.g. optical hand tracking, data gloves, etc.
     */
    UNOBSTRUCTED(1),
    /**
     * The source of hand tracking is a controller, bone positions are inferred from controller
     * inputs.
     */
    CONTROLLER(2),
    /**
     * Maximum value for the hand tracked source enum.
     */
    MAX(3),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandTrackedSource = entries.single { it.id == `value` }
    }
  }

  public enum class HandJoints(
    id: Long,
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
     * Thumb proximal joint.
     */
    THUMB_PROXIMAL(3),
    /**
     * Thumb distal joint.
     */
    THUMB_DISTAL(4),
    /**
     * Thumb tip joint.
     */
    THUMB_TIP(5),
    /**
     * Index metacarpal joint.
     */
    INDEX_METACARPAL(6),
    /**
     * Index proximal joint.
     */
    INDEX_PROXIMAL(7),
    /**
     * Index intermediate joint.
     */
    INDEX_INTERMEDIATE(8),
    /**
     * Index distal joint.
     */
    INDEX_DISTAL(9),
    /**
     * Index tip joint.
     */
    INDEX_TIP(10),
    /**
     * Middle metacarpal joint.
     */
    MIDDLE_METACARPAL(11),
    /**
     * Middle proximal joint.
     */
    MIDDLE_PROXIMAL(12),
    /**
     * Middle intermediate joint.
     */
    MIDDLE_INTERMEDIATE(13),
    /**
     * Middle distal joint.
     */
    MIDDLE_DISTAL(14),
    /**
     * Middle tip joint.
     */
    MIDDLE_TIP(15),
    /**
     * Ring metacarpal joint.
     */
    RING_METACARPAL(16),
    /**
     * Ring proximal joint.
     */
    RING_PROXIMAL(17),
    /**
     * Ring intermediate joint.
     */
    RING_INTERMEDIATE(18),
    /**
     * Ring distal joint.
     */
    RING_DISTAL(19),
    /**
     * Ring tip joint.
     */
    RING_TIP(20),
    /**
     * Little metacarpal joint.
     */
    LITTLE_METACARPAL(21),
    /**
     * Little proximal joint.
     */
    LITTLE_PROXIMAL(22),
    /**
     * Little intermediate joint.
     */
    LITTLE_INTERMEDIATE(23),
    /**
     * Little distal joint.
     */
    LITTLE_DISTAL(24),
    /**
     * Little tip joint.
     */
    LITTLE_TIP(25),
    /**
     * Maximum value for the hand joint enum.
     */
    MAX(26),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandJoints = entries.single { it.id == `value` }
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
       * No flags are set.
       */
      @JvmField
      public val NONE: HandJointFlags = HandJointFlags(0)

      /**
       * If set, the orientation data is valid, otherwise, the orientation data is unreliable and
       * should not be used.
       */
      @JvmField
      public val ORIENTATION_VALID: HandJointFlags = HandJointFlags(1)

      /**
       * If set, the orientation data comes from tracking data, otherwise, the orientation data
       * contains predicted data.
       */
      @JvmField
      public val ORIENTATION_TRACKED: HandJointFlags = HandJointFlags(2)

      /**
       * If set, the positional data is valid, otherwise, the positional data is unreliable and
       * should not be used.
       */
      @JvmField
      public val POSITION_VALID: HandJointFlags = HandJointFlags(4)

      /**
       * If set, the positional data comes from tracking data, otherwise, the positional data
       * contains predicted data.
       */
      @JvmField
      public val POSITION_TRACKED: HandJointFlags = HandJointFlags(8)

      /**
       * If set, our linear velocity data is valid, otherwise, the linear velocity data is
       * unreliable and should not be used.
       */
      @JvmField
      public val LINEAR_VELOCITY_VALID: HandJointFlags = HandJointFlags(16)

      /**
       * If set, our angular velocity data is valid, otherwise, the angular velocity data is
       * unreliable and should not be used.
       */
      @JvmField
      public val ANGULAR_VELOCITY_VALID: HandJointFlags = HandJointFlags(32)
    }
  }

  public companion object

  public object MethodBindings {
    internal val getDisplayRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_display_refresh_rate", 1740695150)

    internal val setDisplayRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_display_refresh_rate", 373806689)

    internal val getRenderTargetSizeMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_render_target_size_multiplier", 1740695150)

    internal val setRenderTargetSizeMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_render_target_size_multiplier", 373806689)

    internal val isFoveationSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "is_foveation_supported", 36873697)

    internal val getFoveationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_foveation_level", 3905245786)

    internal val setFoveationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_foveation_level", 1286410249)

    internal val getFoveationDynamicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_foveation_dynamic", 36873697)

    internal val setFoveationDynamicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_foveation_dynamic", 2586408642)

    internal val isActionSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "is_action_set_active", 3927539163)

    internal val setActionSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_action_set_active", 2678287736)

    internal val getActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_action_sets", 3995934104)

    internal val getAvailableDisplayRefreshRatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_available_display_refresh_rates", 3995934104)

    internal val setMotionRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_motion_range", 855158159)

    internal val getMotionRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_motion_range", 3955838114)

    internal val getHandTrackingSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_tracking_source", 4092421202)

    internal val getHandJointFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_joint_flags", 720567706)

    internal val getHandJointRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_joint_rotation", 1974618321)

    internal val getHandJointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_joint_position", 3529194242)

    internal val getHandJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_joint_radius", 901522724)

    internal val getHandJointLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_joint_linear_velocity", 3529194242)

    internal val getHandJointAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_hand_joint_angular_velocity", 3529194242)

    internal val isHandTrackingSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "is_hand_tracking_supported", 2240911060)

    internal val isHandInteractionSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "is_hand_interaction_supported", 36873697)

    internal val isEyeGazeInteractionSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "is_eye_gaze_interaction_supported", 2240911060)

    internal val getVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_vrs_min_radius", 1740695150)

    internal val setVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_vrs_min_radius", 373806689)

    internal val getVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "get_vrs_strength", 1740695150)

    internal val setVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInterface", "set_vrs_strength", 373806689)
  }
}
