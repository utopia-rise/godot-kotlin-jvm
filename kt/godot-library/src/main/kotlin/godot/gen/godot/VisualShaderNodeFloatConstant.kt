// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A scalar floating-point constant to be used within the visual shader graph.
 *
 * Translated to [code skip-lint]float` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeFloatConstant : VisualShaderNodeConstant() {
  /**
   * A floating-point constant which represents a state of this node.
   */
  public var constant: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATCONSTANT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatConstant", "set_constant")

    public val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatConstant", "get_constant")
  }
}
