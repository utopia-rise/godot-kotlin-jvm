// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Translated to [code skip-lint]int[/code] in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeIntConstant : VisualShaderNodeConstant() {
  /**
   * An integer constant which represents a state of this node.
   */
  public var constant: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINTCONSTANT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntConstant", "set_constant")

    public val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntConstant", "get_constant")
  }
}
