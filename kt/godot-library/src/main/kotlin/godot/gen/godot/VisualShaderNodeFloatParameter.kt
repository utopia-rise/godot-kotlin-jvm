// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Translated to `uniform float` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeFloatParameter : VisualShaderNodeParameter() {
  /**
   * A hint applied to the uniform, which controls the values it can take when set through the
   * Inspector.
   */
  public final inline var hint: Hint
    @JvmName("hintProperty")
    get() = getHint()
    @JvmName("hintProperty")
    set(`value`) {
      setHint(value)
    }

  /**
   * Maximum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public final inline var min: Float
    @JvmName("minProperty")
    get() = getMin()
    @JvmName("minProperty")
    set(`value`) {
      setMin(value)
    }

  /**
   * Minimum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public final inline var max: Float
    @JvmName("maxProperty")
    get() = getMax()
    @JvmName("maxProperty")
    set(`value`) {
      setMax(value)
    }

  /**
   * Step (increment) value for the range hint with step. Used if [hint] is set to
   * [HINT_RANGE_STEP].
   */
  public final inline var step: Float
    @JvmName("stepProperty")
    get() = getStep()
    @JvmName("stepProperty")
    set(`value`) {
      setStep(value)
    }

  /**
   * Enables usage of the [defaultValue].
   */
  public final inline var defaultValueEnabled: Boolean
    @JvmName("defaultValueEnabledProperty")
    get() = isDefaultValueEnabled()
    @JvmName("defaultValueEnabledProperty")
    set(`value`) {
      setDefaultValueEnabled(value)
    }

  /**
   * A default value to be assigned within the shader.
   */
  public final inline var defaultValue: Float
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATPARAMETER, scriptIndex)
  }

  public final fun setHint(hint: Hint): Unit {
    TransferContext.writeArguments(LONG to hint.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setHintPtr, NIL)
  }

  public final fun getHint(): Hint {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHintPtr, LONG)
    return VisualShaderNodeFloatParameter.Hint.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMin(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMinPtr, NIL)
  }

  public final fun getMin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMax(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxPtr, NIL)
  }

  public final fun getMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setStep(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
  }

  public final fun getStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDefaultValueEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultValueEnabledPtr, NIL)
  }

  public final fun isDefaultValueEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDefaultValueEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDefaultValue(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_hint", 3712586466)

    public val getHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_hint", 3042240429)

    public val setMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_min", 373806689)

    public val getMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_min", 1740695150)

    public val setMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_max", 373806689)

    public val getMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_max", 1740695150)

    public val setStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_step", 373806689)

    public val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_step", 1740695150)

    public val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_default_value_enabled", 2586408642)

    public val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "is_default_value_enabled", 36873697)

    public val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "set_default_value", 373806689)

    public val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatParameter", "get_default_value", 1740695150)
  }
}
