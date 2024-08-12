// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A [VisualShaderNodeParameter] of type unsigned [int]. Offers additional customization for range
 * of accepted values.
 */
@GodotBaseType
public open class VisualShaderNodeUIntParameter : VisualShaderNodeParameter() {
  /**
   * If `true`, the node will have a custom default value.
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
   * Default value of this parameter, which will be used if not set externally.
   * [defaultValueEnabled] must be enabled; defaults to `0` otherwise.
   */
  public var defaultValue: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultValuePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultValuePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEUINTPARAMETER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntParameter", "set_default_value_enabled")

    public val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntParameter", "is_default_value_enabled")

    public val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntParameter", "set_default_value")

    public val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntParameter", "get_default_value")
  }
}
