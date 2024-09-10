// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A resource to add to an [AnimationNodeBlendTree]. Only has one output port using the [animation]
 * property. Used as an input for [AnimationNode]s that blend animations together.
 */
@GodotBaseType
public open class AnimationNodeAnimation : AnimationRootNode() {
  /**
   * Animation to use as an output. It is one of the animations provided by
   * [AnimationTree.animPlayer].
   */
  public final inline var animation: StringName
    @JvmName("animationProperty")
    get() = getAnimation()
    @JvmName("animationProperty")
    set(`value`) {
      setAnimation(value)
    }

  /**
   * Determines the playback direction of the animation.
   */
  public final inline var playMode: PlayMode
    @JvmName("playModeProperty")
    get() = getPlayMode()
    @JvmName("playModeProperty")
    set(`value`) {
      setPlayMode(value)
    }

  /**
   * If `true`, [AnimationNode] provides an animation based on the [Animation] resource with some
   * parameters adjusted.
   */
  public final inline var useCustomTimeline: Boolean
    @JvmName("useCustomTimelineProperty")
    get() = isUsingCustomTimeline()
    @JvmName("useCustomTimelineProperty")
    set(`value`) {
      setUseCustomTimeline(value)
    }

  /**
   * If [useCustomTimeline] is `true`, offset the start position of the animation.
   */
  public final inline var timelineLength: Double
    @JvmName("timelineLengthProperty")
    get() = getTimelineLength()
    @JvmName("timelineLengthProperty")
    set(`value`) {
      setTimelineLength(value)
    }

  /**
   * If `true`, scales the time so that the length specified in [timelineLength] is one cycle.
   * This is useful for matching the periods of walking and running animations.
   * If `false`, the original animation length is respected. If you set the loop to [loopMode], the
   * animation will loop in [timelineLength].
   */
  public final inline var stretchTimeScale: Boolean
    @JvmName("stretchTimeScaleProperty")
    get() = isStretchingTimeScale()
    @JvmName("stretchTimeScaleProperty")
    set(`value`) {
      setStretchTimeScale(value)
    }

  /**
   * If [useCustomTimeline] is `true`, offset the start position of the animation.
   * This is useful for adjusting which foot steps first in 3D walking animations.
   */
  public final inline var startOffset: Double
    @JvmName("startOffsetProperty")
    get() = getStartOffset()
    @JvmName("startOffsetProperty")
    set(`value`) {
      setStartOffset(value)
    }

  /**
   * If [useCustomTimeline] is `true`, override the loop settings of the original [Animation]
   * resource with the value.
   * **Note:** If the [Animation.loopMode] isn't set to looping, the
   * [Animation.trackSetInterpolationLoopWrap] option will not be respected. If you cannot get the
   * expected behavior, consider duplicating the [Animation] resource and changing the loop settings.
   */
  public final inline var loopMode: Animation.LoopMode
    @JvmName("loopModeProperty")
    get() = getLoopMode()
    @JvmName("loopModeProperty")
    set(`value`) {
      setLoopMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEANIMATION, scriptIndex)
  }

  public final fun setAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPtr, NIL)
  }

  public final fun getAnimation(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public final fun setPlayMode(mode: PlayMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPlayModePtr, NIL)
  }

  public final fun getPlayMode(): PlayMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayModePtr, LONG)
    return AnimationNodeAnimation.PlayMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUseCustomTimeline(useCustomTimeline: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useCustomTimeline)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomTimelinePtr, NIL)
  }

  public final fun isUsingCustomTimeline(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomTimelinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setTimelineLength(timelineLength: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timelineLength)
    TransferContext.callMethod(rawPtr, MethodBindings.setTimelineLengthPtr, NIL)
  }

  public final fun getTimelineLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimelineLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public final fun setStretchTimeScale(stretchTimeScale: Boolean): Unit {
    TransferContext.writeArguments(BOOL to stretchTimeScale)
    TransferContext.callMethod(rawPtr, MethodBindings.setStretchTimeScalePtr, NIL)
  }

  public final fun isStretchingTimeScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStretchingTimeScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setStartOffset(startOffset: Double): Unit {
    TransferContext.writeArguments(DOUBLE to startOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setStartOffsetPtr, NIL)
  }

  public final fun getStartOffset(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStartOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public final fun setLoopMode(loopMode: Animation.LoopMode): Unit {
    TransferContext.writeArguments(LONG to loopMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setLoopModePtr, NIL)
  }

  public final fun getLoopMode(): Animation.LoopMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoopModePtr, LONG)
    return Animation.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class PlayMode(
    id: Long,
  ) {
    /**
     * Plays animation in forward direction.
     */
    PLAY_MODE_FORWARD(0),
    /**
     * Plays animation in backward direction.
     */
    PLAY_MODE_BACKWARD(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlayMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_animation", 3304788590)

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_animation", 2002593661)

    public val setPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_play_mode", 3347718873)

    public val getPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_play_mode", 2061244637)

    public val setUseCustomTimelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_use_custom_timeline", 2586408642)

    public val isUsingCustomTimelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_using_custom_timeline", 36873697)

    public val setTimelineLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_timeline_length", 373806689)

    public val getTimelineLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_timeline_length", 1740695150)

    public val setStretchTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_stretch_time_scale", 2586408642)

    public val isStretchingTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_stretching_time_scale", 36873697)

    public val setStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_start_offset", 373806689)

    public val getStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_start_offset", 1740695150)

    public val setLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_loop_mode", 3155355575)

    public val getLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_loop_mode", 1988889481)
  }
}
