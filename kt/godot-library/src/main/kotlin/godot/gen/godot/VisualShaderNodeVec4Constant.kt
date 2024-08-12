// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Quaternion
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.QUATERNION
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A constant 4D vector, which can be used as an input node.
 */
@GodotBaseType
public open class VisualShaderNodeVec4Constant : VisualShaderNodeConstant() {
  /**
   * A 4D vector (represented as a [Quaternion]) constant which represents the state of this node.
   */
  @CoreTypeLocalCopy
  public var constant: Quaternion
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConstantPtr, QUATERNION)
      return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
    }
    set(`value`) {
      TransferContext.writeArguments(QUATERNION to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVEC4CONSTANT, scriptIndex)
    return true
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
  public open fun constantMutate(block: Quaternion.() -> Unit): Quaternion = constant.apply{
      block(this)
      constant = this
  }


  public companion object

  internal object MethodBindings {
    public val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Constant", "set_constant")

    public val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec4Constant", "get_constant")
  }
}
