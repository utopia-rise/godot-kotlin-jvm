// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 *
 */
@GodotBaseType
public open class VisualShaderNodeScalarUniform : VisualShaderNodeUniform() {
  /**
   * A default value to be assigned within the shader.
   */
  public open var defaultValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_GET_DEFAULT_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_SET_DEFAULT_VALUE, NIL)
    }

  /**
   * Enables usage of the [defaultValue].
   */
  public open var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_GET_DEFAULT_VALUE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_SET_DEFAULT_VALUE_ENABLED, NIL)
    }

  /**
   * A hint applied to the uniform, which controls the values it can take when set through the inspector.
   */
  public open var hint: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_GET_HINT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_SET_HINT, NIL)
    }

  /**
   * Minimum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public open var max: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_GET_MAX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_SET_MAX, NIL)
    }

  /**
   * Maximum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public open var min: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_GET_MIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_SET_MIN, NIL)
    }

  /**
   * Step (increment) value for the range hint with step. Used if [hint] is set to [HINT_RANGE_STEP].
   */
  public open var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_GET_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARUNIFORM_SET_STEP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODESCALARUNIFORM)
  }

  public enum class Hint(
    id: Long
  ) {
    /**
     * No hint used.
     */
    HINT_NONE(0),
    /**
     * A range hint for scalar value, which limits possible input values between [min] and [max]. Translated to `hint_range(min, max)` in shader code.
     */
    HINT_RANGE(1),
    /**
     * A range hint for scalar value with step, which limits possible input values between [min] and [max], with a step (increment) of [step]). Translated to `hint_range(min, max, step)` in shader code.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Represents the size of the [enum Hint] enum.
     */
    public final const val HINT_MAX: Long = 3

    /**
     * No hint used.
     */
    public final const val HINT_NONE: Long = 0

    /**
     * A range hint for scalar value, which limits possible input values between [min] and [max]. Translated to `hint_range(min, max)` in shader code.
     */
    public final const val HINT_RANGE: Long = 1

    /**
     * A range hint for scalar value with step, which limits possible input values between [min] and [max], with a step (increment) of [step]). Translated to `hint_range(min, max, step)` in shader code.
     */
    public final const val HINT_RANGE_STEP: Long = 2
  }
}
