// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A visual shader node for shader parameter (uniform) of type [int].
 *
 * A [godot.VisualShaderNodeParameter] of type [int]. Offers additional customization for range of accepted values.
 */
@GodotBaseType
public open class VisualShaderNodeIntParameter : VisualShaderNodeParameter() {
  /**
   * Range hint of this node. Use it to customize valid parameter range.
   */
  public var hint: Hint
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_GET_HINT, LONG)
      return VisualShaderNodeIntParameter.Hint.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_SET_HINT, NIL)
    }

  /**
   * The minimum value this parameter can take. [hint] must be either [HINT_RANGE] or [HINT_RANGE_STEP] for this to take effect.
   */
  public var min: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_GET_MIN, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_SET_MIN, NIL)
    }

  /**
   * The maximum value this parameter can take. [hint] must be either [HINT_RANGE] or [HINT_RANGE_STEP] for this to take effect.
   */
  public var max: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_GET_MAX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_SET_MAX, NIL)
    }

  /**
   * The step between parameter's values. Forces the parameter to be a multiple of the given value. [hint] must be [HINT_RANGE_STEP] for this to take effect.
   */
  public var step: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_GET_STEP, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_SET_STEP, NIL)
    }

  /**
   * If `true`, the node will have a custom default value.
   */
  public var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_IS_DEFAULT_VALUE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_SET_DEFAULT_VALUE_ENABLED, NIL)
    }

  /**
   * Default value of this parameter, which will be used if not set externally. [defaultValueEnabled] must be enabled; defaults to `0` otherwise.
   */
  public var defaultValue: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_GET_DEFAULT_VALUE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTPARAMETER_SET_DEFAULT_VALUE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINTPARAMETER, scriptIndex)
    return true
  }

  public enum class Hint(
    id: Long,
  ) {
    /**
     * The parameter will not constrain its value.
     */
    HINT_NONE(0),
    /**
     * The parameter's value must be within the specified [min]/[max] range.
     */
    HINT_RANGE(1),
    /**
     * The parameter's value must be within the specified range, with the given [step] between values.
     */
    HINT_RANGE_STEP(2),
    /**
     * Represents the size of the [enum Hint] enum.
     */
    HINT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
