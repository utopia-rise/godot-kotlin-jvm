// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A generic animation transition node for [godot.AnimationTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Simple state machine for cases which don't require a more advanced [godot.AnimationNodeStateMachine]. Animations can be connected to the inputs and transition times can be specified.
 */
@GodotBaseType
public open class AnimationNodeTransition : AnimationNodeSync() {
  /**
   * The number of enabled input ports for this node.
   */
  public var enabledInputs: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_ENABLED_INPUTS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_ENABLED_INPUTS, NIL)
    }

  /**
   * Cross-fading time (in seconds) between each animation connected to the inputs.
   */
  public var xfadeTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_XFADE_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_XFADE_TIME, NIL)
    }

  /**
   *
   */
  public var xfadeCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_XFADE_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_XFADE_CURVE, NIL)
    }

  /**
   * If `true`, the destination animation is played back from the beginning when switched.
   */
  public var fromStart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_FROM_START, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_FROM_START, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODETRANSITION, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun setInputAsAutoAdvance(input: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_AS_AUTO_ADVANCE, NIL)
  }

  /**
   *
   */
  public fun isInputSetAsAutoAdvance(input: Long): Boolean {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun setInputCaption(input: Long, caption: String): Unit {
    TransferContext.writeArguments(LONG to input, STRING to caption)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_CAPTION, NIL)
  }

  /**
   *
   */
  public fun getInputCaption(input: Long): String {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
