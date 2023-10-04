// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Color] constant to be used within the visual shader graph.
 *
 * Has two output ports representing RGB and alpha channels of [godot.core.Color].
 *
 * Translated to `vec3 rgb` and `float alpha` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeColorConstant : VisualShaderNodeConstant() {
  /**
   * A [godot.core.Color] constant which represents a state of this node.
   */
  @CoreTypeLocalCopy
  public var constant: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORCONSTANT_GET_CONSTANT, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORCONSTANT_SET_CONSTANT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLORCONSTANT, scriptIndex)
    return true
  }

  /**
   * A [godot.core.Color] constant which represents a state of this node.
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
  public open fun constantMutate(block: Color.() -> Unit): Color = constant.apply{
      block(this)
      constant = this
  }


  public companion object
}
