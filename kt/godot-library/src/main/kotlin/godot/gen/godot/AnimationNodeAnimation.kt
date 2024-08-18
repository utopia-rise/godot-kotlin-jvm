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
  public var animation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPtr, NIL)
    }

  /**
   * Determines the playback direction of the animation.
   */
  public var playMode: PlayMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlayModePtr, LONG)
      return AnimationNodeAnimation.PlayMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlayModePtr, NIL)
    }

  /**
   * If `true`, [AnimationNode] provides an animation based on the [Animation] resource with some
   * parameters adjusted.
   */
  public var useCustomTimeline: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingCustomTimelinePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomTimelinePtr, NIL)
    }

  /**
   * If [useCustomTimeline] is `true`, offset the start position of the animation.
   */
  public var timelineLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimelineLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTimelineLengthPtr, NIL)
    }

  /**
   * If `true`, scales the time so that the length specified in [timelineLength] is one cycle.
   * This is useful for matching the periods of walking and running animations.
   * If `false`, the original animation length is respected. If you set the loop to [loopMode], the
   * animation will loop in [timelineLength].
   */
  public var stretchTimeScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isStretchingTimeScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchTimeScalePtr, NIL)
    }

  /**
   * If [useCustomTimeline] is `true`, offset the start position of the animation.
   * This is useful for adjusting which foot steps first in 3D walking animations.
   */
  public var startOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStartOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStartOffsetPtr, NIL)
    }

  /**
   * If [useCustomTimeline] is `true`, override the loop settings of the original [Animation]
   * resource with the value.
   * **Note:** If the [Animation.loopMode] isn't set to looping, the
   * [Animation.trackSetInterpolationLoopWrap] option will not be respected. If you cannot get the
   * expected behavior, consider duplicating the [Animation] resource and changing the loop settings.
   */
  public var loopMode: Animation.LoopMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopModePtr, LONG)
      return Animation.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEANIMATION, scriptIndex)
    return true
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
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_animation")

    public val setPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_play_mode")

    public val getPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_play_mode")

    public val setUseCustomTimelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_use_custom_timeline")

    public val isUsingCustomTimelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_using_custom_timeline")

    public val setTimelineLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_timeline_length")

    public val getTimelineLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_timeline_length")

    public val setStretchTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_stretch_time_scale")

    public val isStretchingTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_stretching_time_scale")

    public val setStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_start_offset")

    public val getStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_start_offset")

    public val setLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_loop_mode")

    public val getLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_loop_mode")
  }
}
