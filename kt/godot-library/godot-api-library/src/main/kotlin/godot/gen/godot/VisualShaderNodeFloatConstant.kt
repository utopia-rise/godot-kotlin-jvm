// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEFLOATCONSTANT_INDEX: Int = 729

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEFLOATCONSTANT_INDEX, scriptIndex)
  }

  public final fun setConstant(constant: Float): Unit {
    Internals.writeArguments(DOUBLE to constant.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFloatConstant", "set_constant", 373806689)

    internal val getConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFloatConstant", "get_constant", 1740695150)
  }
}
