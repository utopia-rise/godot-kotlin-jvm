// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.core.Color] operator to be used within the visual shader graph.
 *
 * Applies [operator] to two color inputs.
 */
@GodotBaseType
open class VisualShaderNodeColorOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [enum Operator] for options.
   */
  open var operator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLOROP_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLOROP_SET_OPERATOR, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODECOLOROP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  enum class Operator(
    id: Long
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
    OP_HARD_LIGHT(8);

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
     * Produce a burn effect with the following formula:
     *
     * ```
     * 			result = vec3(1.0) - (vec3(1.0) - a) / b;
     * 			```
     */
    final const val OP_BURN: Long = 6

    /**
     * Produce a darken effect with the following formula:
     *
     * ```
     * 			result = min(a, b);
     * 			```
     */
    final const val OP_DARKEN: Long = 2

    /**
     * Produce a difference effect with the following formula:
     *
     * ```
     * 			result = abs(a - b);
     * 			```
     */
    final const val OP_DIFFERENCE: Long = 1

    /**
     * Produce a dodge effect with the following formula:
     *
     * ```
     * 			result = a / (vec3(1.0) - b);
     * 			```
     */
    final const val OP_DODGE: Long = 5

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
    final const val OP_HARD_LIGHT: Long = 8

    /**
     * Produce a lighten effect with the following formula:
     *
     * ```
     * 			result = max(a, b);
     * 			```
     */
    final const val OP_LIGHTEN: Long = 3

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
    final const val OP_OVERLAY: Long = 4

    /**
     * Produce a screen effect with the following formula:
     *
     * ```
     * 			result = vec3(1.0) - (vec3(1.0) - a) * (vec3(1.0) - b);
     * 			```
     */
    final const val OP_SCREEN: Long = 0

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
    final const val OP_SOFT_LIGHT: Long = 7
  }
}
