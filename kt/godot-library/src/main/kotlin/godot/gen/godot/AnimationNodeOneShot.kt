// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.AnimationNodeOneShot
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Plays an animation once in [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. This node will execute a sub-animation and return once it finishes. Blend times for fading in and out can be customized, as well as filters.
 */
@GodotBaseType
open class AnimationNodeOneShot : AnimationNode() {
  /**
   * If `true`, the sub-animation will restart automatically after finishing.
   */
  open var autorestart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART, NIL)
    }

  /**
   * The delay after which the automatic restart is triggered, in seconds.
   */
  open var autorestartDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART_DELAY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART_DELAY, NIL)
    }

  /**
   * If [autorestart] is `true`, a random additional delay (in seconds) between 0 and this value will be added to [autorestartDelay].
   */
  open var autorestartRandomDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART_RANDOM_DELAY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART_RANDOM_DELAY, NIL)
    }

  /**
   *
   */
  open var fadeinTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_FADEIN_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_FADEIN_TIME, NIL)
    }

  /**
   *
   */
  open var fadeoutTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_FADEOUT_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_FADEOUT_TIME, NIL)
    }

  /**
   *
   */
  open var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_SYNC,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_SYNC,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODEONESHOT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   *
   */
  open fun getMixMode(): AnimationNodeOneShot.MixMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_MIX_MODE,
        LONG)
    return AnimationNodeOneShot.MixMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  open fun setMixMode(mode: Long) {
    TransferContext.writeArguments(LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_MIX_MODE,
        NIL)
  }

  enum class MixMode(
    id: Long
  ) {
    /**
     *
     */
    MIX_MODE_BLEND(0),

    /**
     *
     */
    MIX_MODE_ADD(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     *
     */
    final const val MIX_MODE_ADD: Long = 1

    /**
     *
     */
    final const val MIX_MODE_BLEND: Long = 0
  }
}
