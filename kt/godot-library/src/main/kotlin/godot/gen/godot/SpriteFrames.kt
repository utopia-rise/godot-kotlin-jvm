// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Sprite frame library for AnimatedSprite.
 *
 * Sprite frame library for [godot.AnimatedSprite]. Contains frames and animation data for playback.
 *
 * **Note:** You can associate a set of normal maps by creating additional [godot.SpriteFrames] resources with a `_normal` suffix. For example, having 2 [godot.SpriteFrames] resources `run` and `run_normal` will make it so the `run` animation uses the normal map.
 */
@GodotBaseType
open class SpriteFrames : Resource() {
  override fun __new() {
    callConstructor(ENGINECLASS_SPRITEFRAMES)
  }

  open fun _getAnimations(): VariantArray<Any?> {
    throw NotImplementedError("_get_animations is not implemented for SpriteFrames")
  }

  open fun _getFrames(): VariantArray<Any?> {
    throw NotImplementedError("_get_frames is not implemented for SpriteFrames")
  }

  open fun _setAnimations(arg0: VariantArray<Any?>) {
  }

  open fun _setFrames(arg0: VariantArray<Any?>) {
  }

  /**
   * Adds a new animation to the library.
   */
  open fun addAnimation(anim: String) {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_ANIMATION, NIL)
  }

  /**
   * Adds a frame to the given animation.
   */
  open fun addFrame(
    anim: String,
    frame: Texture,
    atPosition: Long = -1
  ) {
    TransferContext.writeArguments(STRING to anim, OBJECT to frame, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_FRAME, NIL)
  }

  /**
   * Removes all frames from the given animation.
   */
  open fun clear(anim: String) {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR, NIL)
  }

  /**
   * Removes all animations. A "default" animation will be created.
   */
  open fun clearAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR_ALL, NIL)
  }

  /**
   * If `true`, the given animation will loop.
   */
  open fun getAnimationLoop(anim: String): Boolean {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_LOOP,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array containing the names associated to each animation. Values are placed in alphabetical order.
   */
  open fun getAnimationNames(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_NAMES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * The animation's speed in frames per second.
   */
  open fun getAnimationSpeed(anim: String): Double {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the animation's selected frame.
   */
  open fun getFrame(anim: String, idx: Long): Texture? {
    TransferContext.writeArguments(STRING to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the number of frames in the animation.
   */
  open fun getFrameCount(anim: String): Long {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If `true`, the named animation exists.
   */
  open fun hasAnimation(anim: String): Boolean {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the given animation.
   */
  open fun removeAnimation(anim: String) {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_ANIMATION, NIL)
  }

  /**
   * Removes the animation's selected frame.
   */
  open fun removeFrame(anim: String, idx: Long) {
    TransferContext.writeArguments(STRING to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_FRAME, NIL)
  }

  /**
   * Changes the animation's name to `newname`.
   */
  open fun renameAnimation(anim: String, newname: String) {
    TransferContext.writeArguments(STRING to anim, STRING to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_RENAME_ANIMATION, NIL)
  }

  /**
   * If `true`, the animation will loop.
   */
  open fun setAnimationLoop(anim: String, loop: Boolean) {
    TransferContext.writeArguments(STRING to anim, BOOL to loop)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_LOOP,
        NIL)
  }

  /**
   * The animation's speed in frames per second.
   */
  open fun setAnimationSpeed(anim: String, speed: Double) {
    TransferContext.writeArguments(STRING to anim, DOUBLE to speed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_SPEED,
        NIL)
  }

  /**
   * Sets the texture of the given frame.
   */
  open fun setFrame(
    anim: String,
    idx: Long,
    txt: Texture
  ) {
    TransferContext.writeArguments(STRING to anim, LONG to idx, OBJECT to txt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_FRAME, NIL)
  }
}
