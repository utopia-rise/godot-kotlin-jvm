// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Clamps a value within the visual shader graph.
 *
 * Constrains a value to lie between `min` and `max` values.
 */
@GodotBaseType
public open class VisualShaderNodeClamp : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public var opType: VisualShaderNodeClamp.OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECLAMP_GET_OP_TYPE,
          LONG)
      return VisualShaderNodeClamp.OpType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECLAMP_SET_OP_TYPE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECLAMP, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long
  ) {
    /**
     * A floating-point scalar.
     */
    OP_TYPE_FLOAT(0),
    /**
     * An integer scalar.
     */
    OP_TYPE_INT(1),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(2),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(3),
    /**
     * A 4D vector type.
     */
    OP_TYPE_VECTOR_4D(4),
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
