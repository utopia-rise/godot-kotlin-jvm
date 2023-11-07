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
 * Has only one output port and no inputs.
 * Translated to [code skip-lint]bool[/code] in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeBooleanConstant : VisualShaderNodeConstant() {
  /**
   * A boolean constant which represents a state of this node.
   */
  public var constant: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEBOOLEANCONSTANT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanConstant", "set_constant")

    public val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanConstant", "get_constant")
  }
}
