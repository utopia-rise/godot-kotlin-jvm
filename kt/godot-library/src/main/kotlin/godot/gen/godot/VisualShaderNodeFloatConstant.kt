// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Translated to [code skip-lint]float[/code] in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeFloatConstant : VisualShaderNodeConstant() {
  /**
   * A floating-point constant which represents a state of this node.
   */
  public final inline var constant: Float
    @JvmName("constantProperty")
    get() = getConstant()
    @JvmName("constantProperty")
    set(`value`) {
      setConstant(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATCONSTANT, scriptIndex)
  }

  public final fun setConstant(constant: Float): Unit {
    TransferContext.writeArguments(DOUBLE to constant.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatConstant", "set_constant", 373806689)

    public val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatConstant", "get_constant", 1740695150)
  }
}
