// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A scalar integer constant to be used within the visual shader graph.
 *
 * Translated to `int` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeIntConstant : VisualShaderNodeConstant() {
  /**
   * An integer constant which represents a state of this node.
   */
  public open var constant: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTCONSTANT_GET_CONSTANT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTCONSTANT_SET_CONSTANT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINTCONSTANT)
  }

  public companion object
}
