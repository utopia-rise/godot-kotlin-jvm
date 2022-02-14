// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
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
public open class AnimationNodeTransition : AnimationNode() {
  /**
   * The number of available input ports for this node.
   */
  public open var inputCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_COUNT, NIL)
    }

  /**
   * Cross-fading time (in seconds) between each animation connected to the inputs.
   */
  public open var xfadeTime: Double
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

  public open val input0_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_0_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input0_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_0_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input1_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_1_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input1_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_1_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input2_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_2_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input2_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_2_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input3_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_3_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input3_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_3_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input4_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_4_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input4_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_4_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input5_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_5_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input5_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_5_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input6_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_6_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input6_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_6_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input7_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_7_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input7_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_7_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input8_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_8_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input8_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_8_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input9_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_9_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input9_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_9_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input10_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_10_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input10_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_10_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input11_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_11_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input11_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_11_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input12_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_12_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input12_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_12_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input13_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_13_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input13_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_13_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input14_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_14_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input14_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_14_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input15_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_15_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input15_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_15_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input16_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_16_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input16_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_16_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input17_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_17_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input17_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_17_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input18_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_18_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input18_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_18_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input19_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_19_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input19_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_19_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input20_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_20_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input20_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_20_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input21_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_21_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input21_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_21_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input22_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_22_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input22_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_22_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input23_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_23_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input23_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_23_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input24_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_24_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input24_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_24_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input25_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_25_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input25_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_25_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input26_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_26_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input26_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_26_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input27_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_27_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input27_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_27_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input28_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_28_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input28_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_28_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input29_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_29_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input29_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_29_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input30_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_30_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input30_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_30_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public open val input31_name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_31_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val input31_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_31_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODETRANSITION)
  }

  /**
   *
   */
  public open fun setInputAsAutoAdvance(input: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_AS_AUTO_ADVANCE, NIL)
  }

  /**
   *
   */
  public open fun setInputCaption(input: Long, caption: String): Unit {
    TransferContext.writeArguments(LONG to input, STRING to caption)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_CAPTION, NIL)
  }

  public companion object
}
