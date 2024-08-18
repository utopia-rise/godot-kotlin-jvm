// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Translated to `uniform float` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeFloatParameter : VisualShaderNodeParameter() {
  /**
   * A hint applied to the uniform, which controls the values it can take when set through the
   * Inspector.
   */
  public var hint: Hint
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHintPtr, LONG)
      return VisualShaderNodeFloatParameter.Hint.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHintPtr, NIL)
    }

  /**
   * Maximum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public var min: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinPtr, NIL)
    }

  /**
   * Minimum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public var max: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPtr, NIL)
    }

  /**
   * Step (increment) value for the range hint with step. Used if [hint] is set to
   * [HINT_RANGE_STEP].
   */
  public var step: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
    }

  /**
   * Enables usage of the [defaultValue].
   */
  public var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDefaultValueEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultValueEnabledPtr, NIL)
    }

  /**
   * A default value to be assigned within the shader.
   */
  public var defaultValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATPARAMETER, scriptIndex)
    return true
  }

  public enum class Hint(
    id: Long,
  ) {
    /**
     * No hint used.
     */
    HINT_NONE(0),
    /**
     * A range hint for scalar value, which limits possible input values between [min] and [max].
     * Translated to `hint_range(min, max)` in shader code.
     */
    HINT_RANGE(1),
    /**
     * A range hint for scalar value with step, which limits possible input values between [min] and
     * [max], with a step (increment) of [step]). Translated to `hint_range(min, max, step)` in shader
     * code.
     */
    HINT_RANGE_STEP(2),
    /**
     * Represents the size of the [Hint] enum.
     */
    HINT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Hint = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_hint")

    public val getHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_hint")

    public val setMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_min")

    public val getMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_min")

    public val setMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_max")

    public val getMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_max")

    public val setStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_step")

    public val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_step")

    public val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_default_value_enabled")

    public val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "is_default_value_enabled")

    public val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_default_value")

    public val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_default_value")
  }
}
