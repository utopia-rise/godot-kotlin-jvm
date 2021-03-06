// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

/**
 * Computes a [godot.core.Transform] function within the visual shader graph.
 *
 * Computes an inverse or transpose function on the provided [godot.core.Transform].
 */
@GodotBaseType
open class VisualShaderNodeTransformFunc : VisualShaderNode() {
  /**
   * The function to be computed. See [enum Function] for options.
   */
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMFUNC_SET_FUNCTION, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMFUNC)

  enum class Function(
    id: Long
  ) {
    /**
     * Perform the inverse operation on the [godot.core.Transform] matrix.
     */
    FUNC_INVERSE(0),

    /**
     * Perform the transpose operation on the [godot.core.Transform] matrix.
     */
    FUNC_TRANSPOSE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Perform the inverse operation on the [godot.core.Transform] matrix.
     */
    final const val FUNC_INVERSE: Long = 0

    /**
     * Perform the transpose operation on the [godot.core.Transform] matrix.
     */
    final const val FUNC_TRANSPOSE: Long = 1
  }
}
