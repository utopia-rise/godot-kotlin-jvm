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
 * Computes a [godot.Transform3D] function within the visual shader graph.
 *
 * Computes an inverse or transpose function on the provided [godot.Transform3D].
 */
@GodotBaseType
public open class VisualShaderNodeTransformFunc : VisualShaderNode() {
  /**
   * The function to be computed. See [enum Function] for options.
   */
  public open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMFUNC_SET_FUNCTION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMFUNC)
  }

  public enum class Function(
    id: Long
  ) {
    /**
     * Perform the inverse operation on the [godot.Transform3D] matrix.
     */
    FUNC_INVERSE(0),
    /**
     * Perform the transpose operation on the [godot.Transform3D] matrix.
     */
    FUNC_TRANSPOSE(1),
    /**
     * Represents the size of the [enum Function] enum.
     */
    FUNC_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
