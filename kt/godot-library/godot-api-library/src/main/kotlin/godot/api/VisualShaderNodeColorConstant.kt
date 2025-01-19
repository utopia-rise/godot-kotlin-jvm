// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Has two output ports representing RGB and alpha channels of [Color].
 * Translated to `vec3 rgb` and `float alpha` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeColorConstant : VisualShaderNodeConstant() {
  /**
   * A [Color] constant which represents a state of this node.
   */
  @CoreTypeLocalCopy
  public final inline var constant: Color
    @JvmName("constantProperty")
    get() = getConstant()
    @JvmName("constantProperty")
    set(`value`) {
      setConstant(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(711, scriptIndex)
  }

  /**
   * A [Color] constant which represents a state of this node.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodecolorconstant.constant
   * //Your changes
   * visualshadernodecolorconstant.constant = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun constantMutate(block: Color.() -> Unit): Color = constant.apply{
      block(this)
      constant = this
  }


  public final fun setConstant(constant: Color): Unit {
    TransferContext.writeArguments(COLOR to constant)
    TransferContext.callMethod(ptr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public companion object

  public object MethodBindings {
    internal val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorConstant", "set_constant", 2920490490)

    internal val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorConstant", "get_constant", 3444240500)
  }
}
