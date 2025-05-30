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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR4
import godot.core.Vector4
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Translated to `uniform vec4` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeVec4Parameter : VisualShaderNodeParameter() {
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var defaultValue: Vector4
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(828, scriptIndex)
  }

  /**
   * This is a helper function for [defaultValue] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodevec4parameter.defaultValue
   * //Your changes
   * visualshadernodevec4parameter.defaultValue = myCoreType
   * ``````
   *
   * A default value to be assigned within the shader.
   */
  @CoreTypeHelper
  public final fun defaultValueMutate(block: Vector4.() -> Unit): Vector4 = defaultValue.apply {
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

  public final fun setDefaultValue(`value`: Vector4): Unit {
    TransferContext.writeArguments(VECTOR4 to value)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Vector4 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultValuePtr, VECTOR4)
    return (TransferContext.readReturnValue(VECTOR4) as Vector4)
  }

  public companion object

  public object MethodBindings {
    internal val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Parameter", "set_default_value_enabled", 2586408642)

    internal val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Parameter", "is_default_value_enabled", 36873697)

    internal val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Parameter", "set_default_value", 643568085)

    internal val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Parameter", "get_default_value", 2435802345)
  }
}
