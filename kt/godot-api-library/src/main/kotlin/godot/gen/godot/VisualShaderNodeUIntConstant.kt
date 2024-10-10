// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEUINTCONSTANT_INDEX: Int = 793

/**
 * Translated to `uint` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeUIntConstant : VisualShaderNodeConstant() {
  /**
   * An unsigned integer constant which represents a state of this node.
   */
  public final inline var constant: Int
    @JvmName("constantProperty")
    get() = getConstant()
    @JvmName("constantProperty")
    set(`value`) {
      setConstant(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEUINTCONSTANT_INDEX, scriptIndex)
  }

  public final fun setConstant(constant: Int): Unit {
    Internals.writeArguments(LONG to constant.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeUIntConstant", "set_constant", 1286410249)

    public val getConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeUIntConstant", "get_constant", 3905245786)
  }
}
