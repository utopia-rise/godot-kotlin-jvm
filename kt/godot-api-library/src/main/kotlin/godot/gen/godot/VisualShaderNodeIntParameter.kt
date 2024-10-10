// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEINTPARAMETER_INDEX: Int = 742

/**
 * A [VisualShaderNodeParameter] of type [int]. Offers additional customization for range of
 * accepted values.
 */
@GodotBaseType
public open class VisualShaderNodeIntParameter : VisualShaderNodeParameter() {
  /**
   * Range hint of this node. Use it to customize valid parameter range.
   */
  public final inline var hint: Hint
    @JvmName("hintProperty")
    get() = getHint()
    @JvmName("hintProperty")
    set(`value`) {
      setHint(value)
    }

  /**
   * The minimum value this parameter can take. [hint] must be either [HINT_RANGE] or
   * [HINT_RANGE_STEP] for this to take effect.
   */
  public final inline var min: Int
    @JvmName("minProperty")
    get() = getMin()
    @JvmName("minProperty")
    set(`value`) {
      setMin(value)
    }

  /**
   * The maximum value this parameter can take. [hint] must be either [HINT_RANGE] or
   * [HINT_RANGE_STEP] for this to take effect.
   */
  public final inline var max: Int
    @JvmName("maxProperty")
    get() = getMax()
    @JvmName("maxProperty")
    set(`value`) {
      setMax(value)
    }

  /**
   * The step between parameter's values. Forces the parameter to be a multiple of the given value.
   * [hint] must be [HINT_RANGE_STEP] for this to take effect.
   */
  public final inline var step: Int
    @JvmName("stepProperty")
    get() = getStep()
    @JvmName("stepProperty")
    set(`value`) {
      setStep(value)
    }

  /**
   * If `true`, the node will have a custom default value.
   */
  public final inline var defaultValueEnabled: Boolean
    @JvmName("defaultValueEnabledProperty")
    get() = isDefaultValueEnabled()
    @JvmName("defaultValueEnabledProperty")
    set(`value`) {
      setDefaultValueEnabled(value)
    }

  /**
   * Default value of this parameter, which will be used if not set externally.
   * [defaultValueEnabled] must be enabled; defaults to `0` otherwise.
   */
  public final inline var defaultValue: Int
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEINTPARAMETER_INDEX, scriptIndex)
  }

  public final fun setHint(hint: Hint): Unit {
    Internals.writeArguments(LONG to hint.id)
    Internals.callMethod(rawPtr, MethodBindings.setHintPtr, NIL)
  }

  public final fun getHint(): Hint {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHintPtr, LONG)
    return VisualShaderNodeIntParameter.Hint.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setMin(`value`: Int): Unit {
    Internals.writeArguments(LONG to value.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMinPtr, NIL)
  }

  public final fun getMin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMax(`value`: Int): Unit {
    Internals.writeArguments(LONG to value.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxPtr, NIL)
  }

  public final fun getMax(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStep(`value`: Int): Unit {
    Internals.writeArguments(LONG to value.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
  }

  public final fun getStep(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStepPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDefaultValueEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDefaultValueEnabledPtr, NIL)
  }

  public final fun isDefaultValueEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDefaultValueEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDefaultValue(`value`: Int): Unit {
    Internals.writeArguments(LONG to value.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
     * The parameter's value must be within the specified range, with the given [step] between
     * values.
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
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "set_hint", 2540512075)

    public val getHintPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "get_hint", 4250814924)

    public val setMinPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "set_min", 1286410249)

    public val getMinPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "get_min", 3905245786)

    public val setMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "set_max", 1286410249)

    public val getMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "get_max", 3905245786)

    public val setStepPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "set_step", 1286410249)

    public val getStepPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "get_step", 3905245786)

    public val setDefaultValueEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "set_default_value_enabled", 2586408642)

    public val isDefaultValueEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "is_default_value_enabled", 36873697)

    public val setDefaultValuePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "set_default_value", 1286410249)

    public val getDefaultValuePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntParameter", "get_default_value", 3905245786)
  }
}
