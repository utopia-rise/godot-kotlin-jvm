// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Sprite frame library for AnimatedSprite2D and AnimatedSprite3D.
 *
 * Sprite frame library for an [godot.AnimatedSprite2D] or [godot.AnimatedSprite3D] node. Contains frames and animation data for playback.
 */
@GodotBaseType
public open class SpriteFrames : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRITEFRAMES, scriptIndex)
    return true
  }

  /**
   * Adds a new [anim] animation to the library.
   */
  public fun addAnimation(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_ANIMATION, NIL)
  }

  /**
   * Returns `true` if the [anim] animation exists.
   */
  public fun hasAnimation(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the [anim] animation.
   */
  public fun removeAnimation(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_ANIMATION, NIL)
  }

  /**
   * Changes the [anim] animation's name to [newname].
   */
  public fun renameAnimation(anim: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_RENAME_ANIMATION, NIL)
  }

  /**
   * Returns an array containing the names associated to each animation. Values are placed in alphabetical order.
   */
  public fun getAnimationNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_NAMES,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Sets the speed for the [anim] animation in frames per second.
   */
  public fun setAnimationSpeed(anim: StringName, fps: Double): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, DOUBLE to fps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_SPEED,
        NIL)
  }

  /**
   * Returns the speed in frames per second for the [anim] animation.
   */
  public fun getAnimationSpeed(anim: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * If [loop] is `true`, the [anim] animation will loop when it reaches the end, or the start if it is played in reverse.
   */
  public fun setAnimationLoop(anim: StringName, loop: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, BOOL to loop)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_LOOP,
        NIL)
  }

  /**
   * Returns `true` if the given animation is configured to loop when it finishes playing. Otherwise, returns `false`.
   */
  public fun getAnimationLoop(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_LOOP,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a frame to the [anim] animation. If [atPosition] is `-1`, the frame will be added to the end of the animation.
   */
  public fun addFrame(
    anim: StringName,
    texture: Texture2D,
    duration: Double = 1.0,
    atPosition: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, OBJECT to texture, DOUBLE to duration, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_FRAME, NIL)
  }

  /**
   * Sets the [texture] and the [duration] of the frame [idx] in the [anim] animation.
   */
  public fun setFrame(
    anim: StringName,
    idx: Long,
    texture: Texture2D,
    duration: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx, OBJECT to texture, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_FRAME, NIL)
  }

  /**
   * Removes the [anim] animation's frame [idx].
   */
  public fun removeFrame(anim: StringName, idx: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_FRAME, NIL)
  }

  /**
   * Returns the number of frames for the [anim] animation.
   */
  public fun getFrameCount(anim: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture of the frame [idx] in the [anim] animation.
   */
  public fun getFrameTexture(anim: StringName, idx: Long): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME_TEXTURE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns a relative duration of the frame [idx] in the [anim] animation (defaults to `1.0`). For example, a frame with a duration of `2.0` is displayed twice as long as a frame with a duration of `1.0`. You can calculate the absolute duration (in seconds) of a frame using the following formula:
   *
   * ```
   * 				absolute_duration = relative_duration / (animation_fps * abs(speed_scale))
   * 				```
   *
   * In this example, `speed_scale` refers to either [godot.AnimatedSprite2D.speedScale] or [godot.AnimatedSprite3D.speedScale].
   */
  public fun getFrameDuration(anim: StringName, idx: Long): Double {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME_DURATION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Removes all frames from the [anim] animation.
   */
  public fun clear(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR, NIL)
  }

  /**
   * Removes all animations. An empty `default` animation will be created.
   */
  public fun clearAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR_ALL, NIL)
  }

  public companion object
}
