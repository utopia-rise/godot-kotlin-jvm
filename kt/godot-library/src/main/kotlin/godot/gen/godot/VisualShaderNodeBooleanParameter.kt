// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Translated to `uniform bool` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeBooleanParameter : VisualShaderNodeParameter() {
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
  public var defaultValue: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEBOOLEANPARAMETER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanParameter", "set_default_value_enabled")

    public val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanParameter", "is_default_value_enabled")

    public val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanParameter", "set_default_value")

    public val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanParameter", "get_default_value")
  }
}
