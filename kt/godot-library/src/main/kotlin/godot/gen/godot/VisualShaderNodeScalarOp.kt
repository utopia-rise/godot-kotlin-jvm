// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class VisualShaderNodeScalarOp : VisualShaderNode() {
  /**
   *
   */
  public open var `operator`: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALAROP_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALAROP_SET_OPERATOR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODESCALAROP)
  }

  public enum class Operator(
    id: Long
  ) {
    /**
     *
     */
    OP_ADD(0),
    /**
     *
     */
    OP_SUB(1),
    /**
     *
     */
    OP_MUL(2),
    /**
     *
     */
    OP_DIV(3),
    /**
     *
     */
    OP_MOD(4),
    /**
     *
     */
    OP_POW(5),
    /**
     *
     */
    OP_MAX(6),
    /**
     *
     */
    OP_MIN(7),
    /**
     *
     */
    OP_ATAN2(8),
    /**
     *
     */
    OP_STEP(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     *
     */
    public final const val OP_ADD: Long = 0

    /**
     *
     */
    public final const val OP_ATAN2: Long = 8

    /**
     *
     */
    public final const val OP_DIV: Long = 3

    /**
     *
     */
    public final const val OP_MAX: Long = 6

    /**
     *
     */
    public final const val OP_MIN: Long = 7

    /**
     *
     */
    public final const val OP_MOD: Long = 4

    /**
     *
     */
    public final const val OP_MUL: Long = 2

    /**
     *
     */
    public final const val OP_POW: Long = 5

    /**
     *
     */
    public final const val OP_STEP: Long = 9

    /**
     *
     */
    public final const val OP_SUB: Long = 1
  }
}
