// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEBOOLEANCONSTANT_INDEX: Int = 708

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEBOOLEANCONSTANT_INDEX, scriptIndex)
  }

  public final fun setConstant(constant: Boolean): Unit {
    Internals.writeArguments(BOOL to constant)
    Internals.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeBooleanConstant", "set_constant", 2586408642)

    public val getConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeBooleanConstant", "get_constant", 36873697)
  }
}
