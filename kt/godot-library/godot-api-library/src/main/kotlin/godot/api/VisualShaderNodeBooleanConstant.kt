// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.getConstantPtr
import godot.setConstantPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_VISUALSHADERNODEBOOLEANCONSTANT: Int = 708

/**
 * Has only one output port and no inputs.
 * Translated to [code skip-lint]bool[/code] in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeBooleanConstant : VisualShaderNodeConstant() {
  /**
   * A boolean constant which represents a state of this node.
   */
  public final inline var constant: Boolean
    @JvmName("constantProperty")
    get() = getConstant()
    @JvmName("constantProperty")
    set(`value`) {
      setConstant(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEBOOLEANCONSTANT, scriptIndex)
  }

  public final fun setConstant(constant: Boolean): Unit {
    TransferContext.writeArguments(BOOL to constant)
    TransferContext.callMethod(ptr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanConstant", "set_constant", 2586408642)

    internal val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBooleanConstant", "get_constant", 36873697)
  }
}
