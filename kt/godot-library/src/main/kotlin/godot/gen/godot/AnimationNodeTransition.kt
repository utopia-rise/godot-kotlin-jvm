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
public open class AnimationNodeTransition : AnimationNode() {
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
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_CROSS_FADE_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_CROSS_FADE_TIME, NIL)
    }

  public val input0_name: String
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input0_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input1_name: String
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input1_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input2_name: String
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input2_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input3_name: String
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input3_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input4_name: String
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input4_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input5_name: String
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input5_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input6_name: String
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input6_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input7_name: String
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input7_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input8_name: String
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input8_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input9_name: String
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input9_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input10_name: String
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input10_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input11_name: String
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input11_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input12_name: String
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input12_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input13_name: String
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input13_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input14_name: String
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input14_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input15_name: String
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input15_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input16_name: String
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input16_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input17_name: String
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input17_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input18_name: String
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input18_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input19_name: String
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input19_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input20_name: String
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input20_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input21_name: String
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input21_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input22_name: String
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input22_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input23_name: String
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input23_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input24_name: String
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input24_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input25_name: String
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input25_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input26_name: String
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input26_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input27_name: String
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input27_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input28_name: String
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input28_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input29_name: String
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input29_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input30_name: String
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input30_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input31_name: String
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input31_autoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
  public fun setInputCaption(input: Long, caption: String): Unit {
    TransferContext.writeArguments(LONG to input, STRING to caption)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_CAPTION, NIL)
  }

  public companion object
}
