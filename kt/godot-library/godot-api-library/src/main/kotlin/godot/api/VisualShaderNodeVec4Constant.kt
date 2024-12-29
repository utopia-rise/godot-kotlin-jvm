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
import godot.core.Quaternion
import godot.core.VariantParser.NIL
import godot.core.VariantParser.QUATERNION
import godot.getConstantPtr
import godot.setConstantPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_VISUALSHADERNODEVEC4CONSTANT: Int = 806

/**
 * A constant 4D vector, which can be used as an input node.
 */
@GodotBaseType
public open class VisualShaderNodeVec4Constant : VisualShaderNodeConstant() {
  /**
   * A 4D vector (represented as a [Quaternion]) constant which represents the state of this node.
   */
  @CoreTypeLocalCopy
  public final inline var constant: Quaternion
    @JvmName("constantProperty")
    get() = getConstant()
    @JvmName("constantProperty")
    set(`value`) {
      setConstant(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEVEC4CONSTANT, scriptIndex)
  }

  /**
   * A 4D vector (represented as a [Quaternion]) constant which represents the state of this node.
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
   * val myCoreType = visualshadernodevec4constant.constant
   * //Your changes
   * visualshadernodevec4constant.constant = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun constantMutate(block: Quaternion.() -> Unit): Quaternion = constant.apply{
      block(this)
      constant = this
  }


  public final fun setConstant(constant: Quaternion): Unit {
    TransferContext.writeArguments(QUATERNION to constant)
    TransferContext.callMethod(ptr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  public companion object

  public object MethodBindings {
    internal val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Constant", "set_constant", 1727505552)

    internal val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Constant", "get_constant", 1222331677)
  }
}
