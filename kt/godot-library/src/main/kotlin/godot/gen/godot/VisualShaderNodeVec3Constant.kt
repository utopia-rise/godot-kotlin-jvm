// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Vector3] constant to be used within the visual shader graph.
 *
 * A constant [godot.core.Vector3], which can be used as an input node.
 */
@GodotBaseType
public open class VisualShaderNodeVec3Constant : VisualShaderNodeConstant() {
  /**
   * A [godot.core.Vector3] constant which represents the state of this node.
   */
  public var constant: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC3CONSTANT_GET_CONSTANT, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC3CONSTANT_SET_CONSTANT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVEC3CONSTANT)
  }

  public companion object
}
