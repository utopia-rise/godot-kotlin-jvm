// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Transform3D] constant for use within the visual shader graph.
 *
 * A constant [godot.Transform3D], which can be used as an input node.
 */
@GodotBaseType
public open class VisualShaderNodeTransformConstant : VisualShaderNodeConstant() {
  /**
   * A [godot.Transform3D] constant which represents the state of this node.
   */
  @CoreTypeLocalCopy
  public var constant: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT_GET_CONSTANT, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT_SET_CONSTANT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT, scriptIndex)
    return true
  }

  /**
   * A [godot.Transform3D] constant which represents the state of this node.
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
   * val myCoreType = visualshadernodetransformconstant.constant
   * //Your changes
   * visualshadernodetransformconstant.constant = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun constantMutate(block: Transform3D.() -> Unit): Transform3D = constant.apply{
      block(this)
      constant = this
  }


  public companion object
}
