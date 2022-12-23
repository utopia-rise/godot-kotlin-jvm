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

  public val input0Name: String
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input0AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input1Name: String
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input1AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input2Name: String
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input2AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input3Name: String
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input3AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input4Name: String
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input4AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input5Name: String
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input5AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input6Name: String
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input6AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input7Name: String
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input7AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input8Name: String
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input8AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input9Name: String
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input9AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input10Name: String
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input10AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input11Name: String
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input11AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input12Name: String
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input12AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input13Name: String
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input13AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input14Name: String
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input14AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input15Name: String
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input15AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input16Name: String
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input16AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input17Name: String
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input17AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input18Name: String
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input18AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input19Name: String
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input19AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input20Name: String
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input20AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input21Name: String
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input21AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input22Name: String
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input22AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input23Name: String
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input23AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input24Name: String
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input24AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input25Name: String
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input25AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input26Name: String
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input26AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input27Name: String
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input27AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input28Name: String
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input28AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input29Name: String
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input29AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input30Name: String
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input30AutoAdvance: Boolean
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  public val input31Name: String
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_CAPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val input31AutoAdvance: Boolean
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
