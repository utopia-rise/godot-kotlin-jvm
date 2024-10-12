// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEVEC2PARAMETER_INDEX: Int = 803

/**
 * Translated to `uniform vec2` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeVec2Parameter : VisualShaderNodeParameter() {
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
  public final inline var defaultValue: Vector2
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEVEC2PARAMETER_INDEX, scriptIndex)
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
   * val myCoreType = visualshadernodevec2parameter.defaultValue
   * //Your changes
   * visualshadernodevec2parameter.defaultValue = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun defaultValueMutate(block: Vector2.() -> Unit): Vector2 = defaultValue.apply{
      block(this)
      defaultValue = this
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

  public final fun setDefaultValue(`value`: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to value)
    Internals.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setDefaultValueEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVec2Parameter", "set_default_value_enabled", 2586408642)

    internal val isDefaultValueEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVec2Parameter", "is_default_value_enabled", 36873697)

    internal val setDefaultValuePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVec2Parameter", "set_default_value", 743155724)

    internal val getDefaultValuePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVec2Parameter", "get_default_value", 3341600327)
  }
}
