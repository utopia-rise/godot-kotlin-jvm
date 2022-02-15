// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Sprite frame library for AnimatedSprite2D and AnimatedSprite3D.
 *
 * Sprite frame library for an [godot.AnimatedSprite2D] or [godot.AnimatedSprite3D] node. Contains frames and animation data for playback.
 *
 * **Note:** You can associate a set of normal or specular maps by creating additional [godot.SpriteFrames] resources with a `_normal` or `_specular` suffix. For example, having 3 [godot.SpriteFrames] resources `run`, `run_normal`, and `run_specular` will make it so the `run` animation uses normal and specular maps.
 */
@GodotBaseType
public open class SpriteFrames : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPRITEFRAMES)
  }

  /**
   * Adds a new animation to the library.
   */
  public open fun addAnimation(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_ANIMATION, NIL)
  }

  /**
   * If `true`, the named animation exists.
   */
  public open fun hasAnimation(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the given animation.
   */
  public open fun removeAnimation(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_ANIMATION, NIL)
  }

  /**
   * Changes the animation's name to `newname`.
   */
  public open fun renameAnimation(anim: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_RENAME_ANIMATION, NIL)
  }

  /**
   * Returns an array containing the names associated to each animation. Values are placed in alphabetical order.
   */
  public open fun getAnimationNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_NAMES,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * The animation's speed in frames per second.
   */
  public open fun setAnimationSpeed(anim: StringName, speed: Double): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, DOUBLE to speed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_SPEED,
        NIL)
  }

  /**
   * The animation's speed in frames per second.
   */
  public open fun getAnimationSpeed(anim: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * If `true`, the animation will loop.
   */
  public open fun setAnimationLoop(anim: StringName, loop: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, BOOL to loop)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_LOOP,
        NIL)
  }

  /**
   * Returns `true` if the given animation is configured to loop when it finishes playing. Otherwise, returns `false`.
   */
  public open fun getAnimationLoop(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_LOOP,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a frame to the given animation.
   */
  public open fun addFrame(
    anim: StringName,
    frame: Texture2D,
    atPosition: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, OBJECT to frame, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_FRAME, NIL)
  }

  /**
   * Returns the number of frames in the animation.
   */
  public open fun getFrameCount(anim: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the animation's selected frame.
   */
  public open fun getFrame(anim: StringName, idx: Long): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets the texture of the given frame.
   */
  public open fun setFrame(
    anim: StringName,
    idx: Long,
    txt: Texture2D
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx, OBJECT to txt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_FRAME, NIL)
  }

  /**
   * Removes the animation's selected frame.
   */
  public open fun removeFrame(anim: StringName, idx: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_FRAME, NIL)
  }

  /**
   * Removes all frames from the given animation.
   */
  public open fun clear(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR, NIL)
  }

  /**
   * Removes all animations. A "default" animation will be created.
   */
  public open fun clearAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR_ALL, NIL)
  }

  public companion object
}
