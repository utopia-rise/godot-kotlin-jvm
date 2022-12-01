// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Linearly interpolates between two values within the visual shader graph.
 *
 * Translates to `mix(a, b, weight)` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeMix : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public var opType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEMIX_GET_OP_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEMIX_SET_OP_TYPE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEMIX, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long
  ) {
    /**
     * A floating-point scalar.
     */
    OP_TYPE_SCALAR(0),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(1),
    /**
     * The `a` and `b` ports use a 2D vector type. The `weight` port uses a scalar type.
     */
    OP_TYPE_VECTOR_2D_SCALAR(2),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(3),
    /**
     * The `a` and `b` ports use a 3D vector type. The `weight` port uses a scalar type.
     */
    OP_TYPE_VECTOR_3D_SCALAR(4),
    /**
     * Represents the size of the [enum OpType] enum.
     */
    OP_TYPE_MAX(5),
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
