// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
   * The names used for the enum select in the editor. [hint] must be [HINT_ENUM] for this to take
   * effect.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var enumNames: PackedStringArray
    @JvmName("enumNamesProperty")
    get() = getEnumNames()
    @JvmName("enumNamesProperty")
    set(`value`) {
      setEnumNames(value)
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
    createNativeObject(780, scriptIndex)
  }

  /**
   * This is a helper function for [enumNames] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodeintparameter.enumNames
   * //Your changes
   * visualshadernodeintparameter.enumNames = myCoreType
   * ``````
   *
   * The names used for the enum select in the editor. [hint] must be [HINT_ENUM] for this to take
   * effect.
   */
  @CoreTypeHelper
  public final fun enumNamesMutate(block: PackedStringArray.() -> Unit): PackedStringArray =
      enumNames.apply {
     block(this)
     enumNames = this
  }

  /**
   * This is a helper function for [enumNames] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The names used for the enum select in the editor. [hint] must be [HINT_ENUM] for this to take
   * effect.
   */
  @CoreTypeHelper
  public final fun enumNamesMutateEach(block: (index: Int, `value`: String) -> Unit):
      PackedStringArray = enumNames.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     enumNames = this
  }

  public final fun setHint(hint: Hint): Unit {
    TransferContext.writeArguments(LONG to hint.value)
    TransferContext.callMethod(ptr, MethodBindings.setHintPtr, NIL)
  }

  public final fun getHint(): Hint {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHintPtr, LONG)
    return Hint.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMin(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMinPtr, NIL)
  }

  public final fun getMin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMax(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxPtr, NIL)
  }

  public final fun getMax(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStep(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStepPtr, NIL)
  }

  public final fun getStep(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStepPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setEnumNames(names: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to names)
    TransferContext.callMethod(ptr, MethodBindings.setEnumNamesPtr, NIL)
  }

  public final fun getEnumNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnumNamesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setDefaultValueEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultValueEnabledPtr, NIL)
  }

  public final fun isDefaultValueEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDefaultValueEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDefaultValue(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultValuePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public enum class Hint(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The parameter will not constrain its value.
     */
    NONE(0),
    /**
     * The parameter's value must be within the specified [min]/[max] range.
     */
    RANGE(1),
    /**
     * The parameter's value must be within the specified range, with the given [step] between
     * values.
     */
    RANGE_STEP(2),
    /**
     * The parameter uses an enum to associate preset values to names in the editor.
     */
    ENUM(3),
    /**
     * Represents the size of the [Hint] enum.
     */
    MAX(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Hint = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_hint", 2540512075)

    internal val getHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "get_hint", 4250814924)

    internal val setMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_min", 1286410249)

    internal val getMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "get_min", 3905245786)

    internal val setMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_max", 1286410249)

    internal val getMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "get_max", 3905245786)

    internal val setStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_step", 1286410249)

    internal val getStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "get_step", 3905245786)

    internal val setEnumNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_enum_names", 4015028928)

    internal val getEnumNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "get_enum_names", 1139954409)

    internal val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_default_value_enabled", 2586408642)

    internal val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "is_default_value_enabled", 36873697)

    internal val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "set_default_value", 1286410249)

    internal val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntParameter", "get_default_value", 3905245786)
  }
}
