// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A resource to add to an [AnimationNodeBlendTree]. This animation node will execute a
 * sub-animation and return once it finishes. Blend times for fading in and out can be customized, as
 * well as filters.
 * After setting the request and changing the animation playback, the one-shot node automatically
 * clears the request on the next process frame by setting its `request` value to [constant
 * ONE_SHOT_REQUEST_NONE].
 *
 * gdscript:
 * ```gdscript
 * # Play child animation connected to "shot" port.
 * animation_tree.set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_FIRE)
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/OneShot/request"] = AnimationNodeOneShot.ONE_SHOT_REQUEST_FIRE
 *
 * # Abort child animation connected to "shot" port.
 * animation_tree.set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_ABORT)
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/OneShot/request"] = AnimationNodeOneShot.ONE_SHOT_REQUEST_ABORT
 *
 * # Abort child animation with fading out connected to "shot" port.
 * animation_tree.set("parameters/OneShot/request", AnimationNodeOneShot.ONE_SHOT_REQUEST_FADE_OUT)
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/OneShot/request"] = AnimationNodeOneShot.ONE_SHOT_REQUEST_FADE_OUT
 *
 * # Get current state (read-only).
 * animation_tree.get("parameters/OneShot/active")
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/OneShot/active"]
 *
 * # Get current internal state (read-only).
 * animation_tree.get("parameters/OneShot/internal_active")
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/OneShot/internal_active"]
 * ```
 * csharp:
 * ```csharp
 * // Play child animation connected to "shot" port.
 * animationTree.Set("parameters/OneShot/request", (int)AnimationNodeOneShot.OneShotRequest.Fire);
 *
 * // Abort child animation connected to "shot" port.
 * animationTree.Set("parameters/OneShot/request", (int)AnimationNodeOneShot.OneShotRequest.Abort);
 *
 * // Abort child animation with fading out connected to "shot" port.
 * animationTree.Set("parameters/OneShot/request",
 * (int)AnimationNodeOneShot.OneShotRequest.FadeOut);
 *
 * // Get current state (read-only).
 * animationTree.Get("parameters/OneShot/active");
 *
 * // Get current internal state (read-only).
 * animationTree.Get("parameters/OneShot/internal_active");
 * ```
 */
@GodotBaseType
public open class AnimationNodeOneShot : AnimationNodeSync() {
  /**
   * The blend type.
   */
  public var mixMode: MixMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixModePtr, LONG)
      return AnimationNodeOneShot.MixMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMixModePtr, NIL)
    }

  /**
   * The fade-in duration. For example, setting this to `1.0` for a 5 second length animation will
   * produce a cross-fade that starts at 0 second and ends at 1 second during the animation.
   */
  public var fadeinTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeinTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeinTimePtr, NIL)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be
   * linear.
   */
  public var fadeinCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeinCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeinCurvePtr, NIL)
    }

  /**
   * The fade-out duration. For example, setting this to `1.0` for a 5 second length animation will
   * produce a cross-fade that starts at 4 second and ends at 5 second during the animation.
   */
  public var fadeoutTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeoutTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeoutTimePtr, NIL)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be
   * linear.
   */
  public var fadeoutCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeoutCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeoutCurvePtr, NIL)
    }

  /**
   * If `true`, the sub-animation will restart automatically after finishing.
   * In other words, to start auto restarting, the animation must be played once with the [constant
   * ONE_SHOT_REQUEST_FIRE] request. The [constant ONE_SHOT_REQUEST_ABORT] request stops the auto
   * restarting, but it does not disable the [autorestart] itself. So, the [constant
   * ONE_SHOT_REQUEST_FIRE] request will start auto restarting again.
   */
  public var autorestart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutorestartPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartPtr, NIL)
    }

  /**
   * The delay after which the automatic restart is triggered, in seconds.
   */
  public var autorestartDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutorestartDelayPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartDelayPtr, NIL)
    }

  /**
   * If [autorestart] is `true`, a random additional delay (in seconds) between 0 and this value
   * will be added to [autorestartDelay].
   */
  public var autorestartRandomDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutorestartRandomDelayPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartRandomDelayPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEONESHOT, scriptIndex)
    return true
  }

  public enum class OneShotRequest(
    id: Long,
  ) {
    /**
     * The default state of the request. Nothing is done.
     */
    ONE_SHOT_REQUEST_NONE(0),
    /**
     * The request to play the animation connected to "shot" port.
     */
    ONE_SHOT_REQUEST_FIRE(1),
    /**
     * The request to stop the animation connected to "shot" port.
     */
    ONE_SHOT_REQUEST_ABORT(2),
    /**
     * The request to fade out the animation connected to "shot" port.
     */
    ONE_SHOT_REQUEST_FADE_OUT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class MixMode(
    id: Long,
  ) {
    /**
     * Blends two animations. See also [AnimationNodeBlend2].
     */
    MIX_MODE_BLEND(0),
    /**
     * Blends two animations additively. See also [AnimationNodeAdd2].
     */
    MIX_MODE_ADD(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFadeinTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadein_time")

    public val getFadeinTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadein_time")

    public val setFadeinCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadein_curve")

    public val getFadeinCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadein_curve")

    public val setFadeoutTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadeout_time")

    public val getFadeoutTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadeout_time")

    public val setFadeoutCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadeout_curve")

    public val getFadeoutCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadeout_curve")

    public val setAutorestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart")

    public val hasAutorestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "has_autorestart")

    public val setAutorestartDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart_delay")

    public val getAutorestartDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_autorestart_delay")

    public val setAutorestartRandomDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart_random_delay")

    public val getAutorestartRandomDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_autorestart_random_delay")

    public val setMixModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_mix_mode")

    public val getMixModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_mix_mode")
  }
}
