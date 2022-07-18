// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays an animation once in [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. This node will execute a sub-animation and return once it finishes. Blend times for fading in and out can be customized, as well as filters.
 */
@GodotBaseType
public open class AnimationNodeOneShot : AnimationNode() {
  /**
   *
   */
  public var mixMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_MIX_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_MIX_MODE,
          NIL.ordinal)
    }

  /**
   *
   */
  public var fadeinTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_FADEIN_TIME,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_FADEIN_TIME,
          NIL.ordinal)
    }

  /**
   *
   */
  public var fadeoutTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_FADEOUT_TIME,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_FADEOUT_TIME,
          NIL.ordinal)
    }

  /**
   * If `true`, the sub-animation will restart automatically after finishing.
   */
  public var autorestart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_HAS_AUTORESTART,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART,
          NIL.ordinal)
    }

  /**
   * The delay after which the automatic restart is triggered, in seconds.
   */
  public var autorestartDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART_DELAY, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART_DELAY, NIL.ordinal)
    }

  /**
   * If [autorestart] is `true`, a random additional delay (in seconds) between 0 and this value will be added to [autorestartDelay].
   */
  public var autorestartRandomDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_GET_AUTORESTART_RANDOM_DELAY,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_AUTORESTART_RANDOM_DELAY, NIL.ordinal)
    }

  public var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_IS_USING_SYNC,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEONESHOT_SET_USE_SYNC,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEONESHOT)
  }

  public enum class MixMode(
    id: Long
  ) {
    /**
     *
     */
    MIX_MODE_BLEND(0),
    /**
     *
     */
    MIX_MODE_ADD(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
