// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Pipeline specialization constant (used by [godot.RenderingDevice]).
 *
 * A *specialization constant* is a way to create additional variants of shaders without actually increasing the number of shader versions that are compiled. This allows improving performance by reducing the number of shader versions and reducing `if` branching, while still allowing shaders to be flexible for different use cases.
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineSpecializationConstant : RefCounted() {
  /**
   * The specialization constant's value. Only [bool], [int] and [float] types are valid for specialization constants.
   */
  public var `value`: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_GET_VALUE, ANY)
      return (TransferContext.readReturnValue(ANY, true) as Any?)
    }
    set(`value`) {
      TransferContext.writeArguments(ANY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_SET_VALUE, NIL)
    }

  /**
   * The identifier of the specialization constant. This is a value starting from `0` and that increments for every different specialization constant for a given shader.
   */
  public var constantId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_GET_CONSTANT_ID, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_SET_CONSTANT_ID, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT, scriptIndex)
    return true
  }

  public companion object
}
