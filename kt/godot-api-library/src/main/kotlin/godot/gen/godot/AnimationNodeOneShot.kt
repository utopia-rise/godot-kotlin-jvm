// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_ANIMATIONNODEONESHOT_INDEX: Int = 59

/**
 * A resource to add to an [AnimationNodeBlendTree]. This animation node will execute a
 * sub-animation and return once it finishes. Blend times for fading in and out can be customized, as
 * well as filters.
 * After setting the request and changing the animation playback, the one-shot node automatically
 * clears the request on the next process frame by setting its `request` value to
 * [ONE_SHOT_REQUEST_NONE].
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
  public final inline var mixMode: MixMode
    @JvmName("mixModeProperty")
    get() = getMixMode()
    @JvmName("mixModeProperty")
    set(`value`) {
      setMixMode(value)
    }

  /**
   * The fade-in duration. For example, setting this to `1.0` for a 5 second length animation will
   * produce a cross-fade that starts at 0 second and ends at 1 second during the animation.
   * **Note:** [AnimationNodeOneShot] transitions the current state after the end of the fading.
   * When [AnimationNodeOutput] is considered as the most upstream, so the [fadeinTime] is scaled
   * depending on the downstream delta. For example, if this value is set to `1.0` and a
   * [AnimationNodeTimeScale] with a value of `2.0` is chained downstream, the actual processing time
   * will be 0.5 second.
   */
  public final inline var fadeinTime: Double
    @JvmName("fadeinTimeProperty")
    get() = getFadeinTime()
    @JvmName("fadeinTimeProperty")
    set(`value`) {
      setFadeinTime(value)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be
   * linear.
   */
  public final inline var fadeinCurve: Curve?
    @JvmName("fadeinCurveProperty")
    get() = getFadeinCurve()
    @JvmName("fadeinCurveProperty")
    set(`value`) {
      setFadeinCurve(value)
    }

  /**
   * The fade-out duration. For example, setting this to `1.0` for a 5 second length animation will
   * produce a cross-fade that starts at 4 second and ends at 5 second during the animation.
   * **Note:** [AnimationNodeOneShot] transitions the current state after the end of the fading.
   * When [AnimationNodeOutput] is considered as the most upstream, so the [fadeoutTime] is scaled
   * depending on the downstream delta. For example, if this value is set to `1.0` and an
   * [AnimationNodeTimeScale] with a value of `2.0` is chained downstream, the actual processing time
   * will be 0.5 second.
   */
  public final inline var fadeoutTime: Double
    @JvmName("fadeoutTimeProperty")
    get() = getFadeoutTime()
    @JvmName("fadeoutTimeProperty")
    set(`value`) {
      setFadeoutTime(value)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be
   * linear.
   */
  public final inline var fadeoutCurve: Curve?
    @JvmName("fadeoutCurveProperty")
    get() = getFadeoutCurve()
    @JvmName("fadeoutCurveProperty")
    set(`value`) {
      setFadeoutCurve(value)
    }

  /**
   * If `true`, breaks the loop at the end of the loop cycle for transition, even if the animation
   * is looping.
   */
  public final inline var breakLoopAtEnd: Boolean
    @JvmName("breakLoopAtEndProperty")
    get() = isLoopBrokenAtEnd()
    @JvmName("breakLoopAtEndProperty")
    set(`value`) {
      setBreakLoopAtEnd(value)
    }

  /**
   * If `true`, the sub-animation will restart automatically after finishing.
   * In other words, to start auto restarting, the animation must be played once with the
   * [ONE_SHOT_REQUEST_FIRE] request. The [ONE_SHOT_REQUEST_ABORT] request stops the auto restarting,
   * but it does not disable the [autorestart] itself. So, the [ONE_SHOT_REQUEST_FIRE] request will
   * start auto restarting again.
   */
  public final inline var autorestart: Boolean
    @JvmName("autorestartProperty")
    get() = hasAutorestart()
    @JvmName("autorestartProperty")
    set(`value`) {
      setAutorestart(value)
    }

  /**
   * The delay after which the automatic restart is triggered, in seconds.
   */
  public final inline var autorestartDelay: Double
    @JvmName("autorestartDelayProperty")
    get() = getAutorestartDelay()
    @JvmName("autorestartDelayProperty")
    set(`value`) {
      setAutorestartDelay(value)
    }

  /**
   * If [autorestart] is `true`, a random additional delay (in seconds) between 0 and this value
   * will be added to [autorestartDelay].
   */
  public final inline var autorestartRandomDelay: Double
    @JvmName("autorestartRandomDelayProperty")
    get() = getAutorestartRandomDelay()
    @JvmName("autorestartRandomDelayProperty")
    set(`value`) {
      setAutorestartRandomDelay(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_ANIMATIONNODEONESHOT_INDEX, scriptIndex)
  }

  public final fun setFadeinTime(time: Double): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.setFadeinTimePtr, NIL)
  }

  public final fun getFadeinTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadeinTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setFadeinCurve(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(rawPtr, MethodBindings.setFadeinCurvePtr, NIL)
  }

  public final fun getFadeinCurve(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadeinCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setFadeoutTime(time: Double): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.setFadeoutTimePtr, NIL)
  }

  public final fun getFadeoutTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadeoutTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setFadeoutCurve(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(rawPtr, MethodBindings.setFadeoutCurvePtr, NIL)
  }

  public final fun getFadeoutCurve(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadeoutCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setBreakLoopAtEnd(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBreakLoopAtEndPtr, NIL)
  }

  public final fun isLoopBrokenAtEnd(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLoopBrokenAtEndPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutorestart(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartPtr, NIL)
  }

  public final fun hasAutorestart(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutorestartPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutorestartDelay(time: Double): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartDelayPtr, NIL)
  }

  public final fun getAutorestartDelay(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutorestartDelayPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setAutorestartRandomDelay(time: Double): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutorestartRandomDelayPtr, NIL)
  }

  public final fun getAutorestartRandomDelay(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutorestartRandomDelayPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setMixMode(mode: MixMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMixModePtr, NIL)
  }

  public final fun getMixMode(): MixMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMixModePtr, LONG)
    return AnimationNodeOneShot.MixMode.from(TransferContext.readReturnValue(LONG) as Long)
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
      public fun from(`value`: Long): OneShotRequest = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): MixMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFadeinTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadein_time", 373806689)

    public val getFadeinTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadein_time", 1740695150)

    public val setFadeinCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadein_curve", 270443179)

    public val getFadeinCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadein_curve", 2460114913)

    public val setFadeoutTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadeout_time", 373806689)

    public val getFadeoutTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadeout_time", 1740695150)

    public val setFadeoutCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_fadeout_curve", 270443179)

    public val getFadeoutCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_fadeout_curve", 2460114913)

    public val setBreakLoopAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_break_loop_at_end", 2586408642)

    public val isLoopBrokenAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "is_loop_broken_at_end", 36873697)

    public val setAutorestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart", 2586408642)

    public val hasAutorestartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "has_autorestart", 36873697)

    public val setAutorestartDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart_delay", 373806689)

    public val getAutorestartDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_autorestart_delay", 1740695150)

    public val setAutorestartRandomDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_autorestart_random_delay", 373806689)

    public val getAutorestartRandomDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_autorestart_random_delay", 1740695150)

    public val setMixModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "set_mix_mode", 1018899799)

    public val getMixModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeOneShot", "get_mix_mode", 3076550526)
  }
}
