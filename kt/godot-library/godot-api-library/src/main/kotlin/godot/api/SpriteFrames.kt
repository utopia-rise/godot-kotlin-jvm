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
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Sprite frame library for an [AnimatedSprite2D] or [AnimatedSprite3D] node. Contains frames and
 * animation data for playback.
 */
@GodotBaseType
public open class SpriteFrames : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(635, scriptIndex)
  }

  /**
   * Adds a new [anim] animation to the library.
   */
  public final fun addAnimation(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.addAnimationPtr, NIL)
  }

  /**
   * Returns `true` if the [anim] animation exists.
   */
  public final fun hasAnimation(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Duplicates the animation [animFrom] to a new animation named [animTo]. Fails if [animTo]
   * already exists, or if [animFrom] does not exist.
   */
  public final fun duplicateAnimation(animFrom: StringName, animTo: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(ptr, MethodBindings.duplicateAnimationPtr, NIL)
  }

  /**
   * Removes the [anim] animation.
   */
  public final fun removeAnimation(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.removeAnimationPtr, NIL)
  }

  /**
   * Changes the [anim] animation's name to [newname].
   */
  public final fun renameAnimation(anim: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, STRING_NAME to newname)
    TransferContext.callMethod(ptr, MethodBindings.renameAnimationPtr, NIL)
  }

  /**
   * Returns an array containing the names associated to each animation. Values are placed in
   * alphabetical order.
   */
  public final fun getAnimationNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnimationNamesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Sets the speed for the [anim] animation in frames per second.
   */
  public final fun setAnimationSpeed(anim: StringName, fps: Double): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, DOUBLE to fps)
    TransferContext.callMethod(ptr, MethodBindings.setAnimationSpeedPtr, NIL)
  }

  /**
   * Returns the speed in frames per second for the [anim] animation.
   */
  public final fun getAnimationSpeed(anim: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.getAnimationSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * If [loop] is `true`, the [anim] animation will loop when it reaches the end, or the start if it
   * is played in reverse.
   */
  public final fun setAnimationLoop(anim: StringName, loop: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, BOOL to loop)
    TransferContext.callMethod(ptr, MethodBindings.setAnimationLoopPtr, NIL)
  }

  /**
   * Returns `true` if the given animation is configured to loop when it finishes playing.
   * Otherwise, returns `false`.
   */
  public final fun getAnimationLoop(anim: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.getAnimationLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a frame to the [anim] animation. If [atPosition] is `-1`, the frame will be added to the
   * end of the animation. [duration] specifies the relative duration, see [getFrameDuration] for
   * details.
   */
  @JvmOverloads
  public final fun addFrame(
    anim: StringName,
    texture: Texture2D?,
    duration: Float = 1.0f,
    atPosition: Int = -1,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, OBJECT to texture, DOUBLE to duration.toDouble(), LONG to atPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addFramePtr, NIL)
  }

  /**
   * Sets the [texture] and the [duration] of the frame [idx] in the [anim] animation. [duration]
   * specifies the relative duration, see [getFrameDuration] for details.
   */
  @JvmOverloads
  public final fun setFrame(
    anim: StringName,
    idx: Int,
    texture: Texture2D?,
    duration: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong(), OBJECT to texture, DOUBLE to duration.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFramePtr, NIL)
  }

  /**
   * Removes the [anim] animation's frame [idx].
   */
  public final fun removeFrame(anim: StringName, idx: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeFramePtr, NIL)
  }

  /**
   * Returns the number of frames for the [anim] animation.
   */
  public final fun getFrameCount(anim: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.getFrameCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the texture of the frame [idx] in the [anim] animation.
   */
  public final fun getFrameTexture(anim: StringName, idx: Int): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns a relative duration of the frame [idx] in the [anim] animation (defaults to `1.0`). For
   * example, a frame with a duration of `2.0` is displayed twice as long as a frame with a duration of
   * `1.0`. You can calculate the absolute duration (in seconds) of a frame using the following
   * formula:
   * [codeblock]
   * absolute_duration = relative_duration / (animation_fps * abs(playing_speed))
   * [/codeblock]
   * In this example, `playing_speed` refers to either [AnimatedSprite2D.getPlayingSpeed] or
   * [AnimatedSprite3D.getPlayingSpeed].
   */
  public final fun getFrameDuration(anim: StringName, idx: Int): Float {
    TransferContext.writeArguments(STRING_NAME to anim, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Removes all frames from the [anim] animation.
   */
  public final fun clear(anim: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to anim)
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Removes all animations. An empty `default` animation will be created.
   */
  public final fun clearAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearAllPtr, NIL)
  }

  /**
   * Adds a new [anim] animation to the library.
   */
  public final fun addAnimation(anim: String) = addAnimation(anim.asCachedStringName())

  /**
   * Returns `true` if the [anim] animation exists.
   */
  public final fun hasAnimation(anim: String): Boolean = hasAnimation(anim.asCachedStringName())

  /**
   * Duplicates the animation [animFrom] to a new animation named [animTo]. Fails if [animTo]
   * already exists, or if [animFrom] does not exist.
   */
  public final fun duplicateAnimation(animFrom: String, animTo: String) =
      duplicateAnimation(animFrom.asCachedStringName(), animTo.asCachedStringName())

  /**
   * Removes the [anim] animation.
   */
  public final fun removeAnimation(anim: String) = removeAnimation(anim.asCachedStringName())

  /**
   * Changes the [anim] animation's name to [newname].
   */
  public final fun renameAnimation(anim: String, newname: String) =
      renameAnimation(anim.asCachedStringName(), newname.asCachedStringName())

  /**
   * Sets the speed for the [anim] animation in frames per second.
   */
  public final fun setAnimationSpeed(anim: String, fps: Double) =
      setAnimationSpeed(anim.asCachedStringName(), fps)

  /**
   * Returns the speed in frames per second for the [anim] animation.
   */
  public final fun getAnimationSpeed(anim: String): Double =
      getAnimationSpeed(anim.asCachedStringName())

  /**
   * If [loop] is `true`, the [anim] animation will loop when it reaches the end, or the start if it
   * is played in reverse.
   */
  public final fun setAnimationLoop(anim: String, loop: Boolean) =
      setAnimationLoop(anim.asCachedStringName(), loop)

  /**
   * Returns `true` if the given animation is configured to loop when it finishes playing.
   * Otherwise, returns `false`.
   */
  public final fun getAnimationLoop(anim: String): Boolean =
      getAnimationLoop(anim.asCachedStringName())

  /**
   * Adds a frame to the [anim] animation. If [atPosition] is `-1`, the frame will be added to the
   * end of the animation. [duration] specifies the relative duration, see [getFrameDuration] for
   * details.
   */
  @JvmOverloads
  public final fun addFrame(
    anim: String,
    texture: Texture2D?,
    duration: Float = 1.0f,
    atPosition: Int = -1,
  ) = addFrame(anim.asCachedStringName(), texture, duration, atPosition)

  /**
   * Sets the [texture] and the [duration] of the frame [idx] in the [anim] animation. [duration]
   * specifies the relative duration, see [getFrameDuration] for details.
   */
  @JvmOverloads
  public final fun setFrame(
    anim: String,
    idx: Int,
    texture: Texture2D?,
    duration: Float = 1.0f,
  ) = setFrame(anim.asCachedStringName(), idx, texture, duration)

  /**
   * Removes the [anim] animation's frame [idx].
   */
  public final fun removeFrame(anim: String, idx: Int) = removeFrame(anim.asCachedStringName(), idx)

  /**
   * Returns the number of frames for the [anim] animation.
   */
  public final fun getFrameCount(anim: String): Int = getFrameCount(anim.asCachedStringName())

  /**
   * Returns the texture of the frame [idx] in the [anim] animation.
   */
  public final fun getFrameTexture(anim: String, idx: Int): Texture2D? =
      getFrameTexture(anim.asCachedStringName(), idx)

  /**
   * Returns a relative duration of the frame [idx] in the [anim] animation (defaults to `1.0`). For
   * example, a frame with a duration of `2.0` is displayed twice as long as a frame with a duration of
   * `1.0`. You can calculate the absolute duration (in seconds) of a frame using the following
   * formula:
   * [codeblock]
   * absolute_duration = relative_duration / (animation_fps * abs(playing_speed))
   * [/codeblock]
   * In this example, `playing_speed` refers to either [AnimatedSprite2D.getPlayingSpeed] or
   * [AnimatedSprite3D.getPlayingSpeed].
   */
  public final fun getFrameDuration(anim: String, idx: Int): Float =
      getFrameDuration(anim.asCachedStringName(), idx)

  /**
   * Removes all frames from the [anim] animation.
   */
  public final fun clear(anim: String) = clear(anim.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val addAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "add_animation", 3304788590)

    internal val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "has_animation", 2619796661)

    internal val duplicateAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "duplicate_animation", 3740211285)

    internal val removeAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "remove_animation", 3304788590)

    internal val renameAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "rename_animation", 3740211285)

    internal val getAnimationNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_animation_names", 1139954409)

    internal val setAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "set_animation_speed", 4135858297)

    internal val getAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_animation_speed", 2349060816)

    internal val setAnimationLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "set_animation_loop", 2524380260)

    internal val getAnimationLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_animation_loop", 2619796661)

    internal val addFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "add_frame", 1351332740)

    internal val setFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "set_frame", 56804795)

    internal val removeFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "remove_frame", 2415702435)

    internal val getFrameCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_frame_count", 2458036349)

    internal val getFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_frame_texture", 2900517879)

    internal val getFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "get_frame_duration", 1129309260)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "clear", 3304788590)

    internal val clearAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteFrames", "clear_all", 3218959716)
  }
}
