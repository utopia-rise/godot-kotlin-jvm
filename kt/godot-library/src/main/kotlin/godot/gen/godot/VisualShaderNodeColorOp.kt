// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.core.Color] operator to be used within the visual shader graph.
 *
 * Applies [operator] to two color inputs.
 */
@GodotBaseType
public open class VisualShaderNodeColorOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [enum Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLOROP_GET_OPERATOR, LONG)
      return VisualShaderNodeColorOp.Operator.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLOROP_SET_OPERATOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLOROP, scriptIndex)
    return true
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Produce a screen effect with the following formula:
     *
     * ```
     * 			result = vec3(1.0) - (vec3(1.0) - a) * (vec3(1.0) - b);
     * 			```
     */
    OP_SCREEN(0),
    /**
     * Produce a difference effect with the following formula:
     *
     * ```
     * 			result = abs(a - b);
     * 			```
     */
    OP_DIFFERENCE(1),
    /**
     * Produce a darken effect with the following formula:
     *
     * ```
     * 			result = min(a, b);
     * 			```
     */
    OP_DARKEN(2),
    /**
     * Produce a lighten effect with the following formula:
     *
     * ```
     * 			result = max(a, b);
     * 			```
     */
    OP_LIGHTEN(3),
    /**
     * Produce an overlay effect with the following formula:
     *
     * ```
     * 			for (int i = 0; i < 3; i++) {
     * 			    float base = a*;
     * 			    float blend = b*;
     * 			    if (base < 0.5) {
     * 			        result* = 2.0 * base * blend;
     * 			    } else {
     * 			        result* = 1.0 - 2.0 * (1.0 - blend) * (1.0 - base);
     * 			    }
     * 			}
     * 			```
     */
    OP_OVERLAY(4),
    /**
     * Produce a dodge effect with the following formula:
     *
     * ```
     * 			result = a / (vec3(1.0) - b);
     * 			```
     */
    OP_DODGE(5),
    /**
     * Produce a burn effect with the following formula:
     *
     * ```
     * 			result = vec3(1.0) - (vec3(1.0) - a) / b;
     * 			```
     */
    OP_BURN(6),
    /**
     * Produce a soft light effect with the following formula:
     *
     * ```
     * 			for (int i = 0; i < 3; i++) {
     * 			    float base = a*;
     * 			    float blend = b*;
     * 			    if (base < 0.5) {
     * 			        result* = base * (blend + 0.5);
     * 			    } else {
     * 			        result* = 1.0 - (1.0 - base) * (1.0 - (blend - 0.5));
     * 			    }
     * 			}
     * 			```
     */
    OP_SOFT_LIGHT(7),
    /**
     * Produce a hard light effect with the following formula:
     *
     * ```
     * 			for (int i = 0; i < 3; i++) {
     * 			    float base = a*;
     * 			    float blend = b*;
     * 			    if (base < 0.5) {
     * 			        result* = base * (2.0 * blend);
     * 			    } else {
     * 			        result* = 1.0 - (1.0 - base) * (1.0 - 2.0 * (blend - 0.5));
     * 			    }
     * 			}
     * 			```
     */
    OP_HARD_LIGHT(8),
    /**
     * Represents the size of the [enum Operator] enum.
     */
    OP_MAX(9),
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
