// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODETRANSFORMPARAMETER_INDEX: Int = 791

/**
 * Translated to `uniform mat4` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeTransformParameter : VisualShaderNodeParameter() {
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
  public final inline var defaultValue: Transform3D
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODETRANSFORMPARAMETER_INDEX,
        scriptIndex)
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
   * val myCoreType = visualshadernodetransformparameter.defaultValue
   * //Your changes
   * visualshadernodetransformparameter.defaultValue = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun defaultValueMutate(block: Transform3D.() -> Unit): Transform3D =
      defaultValue.apply{
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

  public final fun setDefaultValue(`value`: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to value)
    Internals.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public companion object

  public object MethodBindings {
    internal val setDefaultValueEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformParameter", "set_default_value_enabled", 2586408642)

    internal val isDefaultValueEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformParameter", "is_default_value_enabled", 36873697)

    internal val setDefaultValuePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformParameter", "set_default_value", 2952846383)

    internal val getDefaultValuePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformParameter", "get_default_value", 3229777777)
  }
}
