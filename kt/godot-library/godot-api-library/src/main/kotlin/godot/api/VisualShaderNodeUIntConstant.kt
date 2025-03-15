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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(817, scriptIndex)
  }

  public final fun setConstant(constant: Int): Unit {
    TransferContext.writeArguments(LONG to constant.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntConstant", "set_constant", 1286410249)

    internal val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntConstant", "get_constant", 3905245786)
  }
}
