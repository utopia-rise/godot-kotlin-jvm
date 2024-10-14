// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Translated to `uniform vec4` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeColorParameter : VisualShaderNodeParameter() {
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
  @CoreTypeLocalCopy
  public final inline var defaultValue: Color
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLORPARAMETER, scriptIndex)
  }

  /**
   * A default value to be assigned within the shader.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodecolorparameter.defaultValue
   * //Your changes
   * visualshadernodecolorparameter.defaultValue = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun defaultValueMutate(block: Color.() -> Unit): Color = defaultValue.apply{
      block(this)
      defaultValue = this
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

  public final fun setDefaultValue(`value`: Color): Unit {
    TransferContext.writeArguments(COLOR to value)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultValuePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public companion object

  internal object MethodBindings {
    public val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorParameter", "set_default_value_enabled", 2586408642)

    public val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorParameter", "is_default_value_enabled", 36873697)

    public val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorParameter", "set_default_value", 2920490490)

    public val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorParameter", "get_default_value", 3444240500)
  }
}
