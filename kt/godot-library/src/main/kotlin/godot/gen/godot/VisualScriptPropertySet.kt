// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptPropertySet : VisualScriptNode() {
  public open var setMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_SET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_SET_MODE, NIL)
    }

  public open var baseType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_BASE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_BASE_TYPE, NIL)
    }

  public open var baseScript: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_BASE_SCRIPT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_BASE_SCRIPT, NIL)
    }

  public open var basicType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_BASIC_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_BASIC_TYPE, NIL)
    }

  public open var nodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_NODE_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_NODE_PATH, NIL)
    }

  public open var `property`: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_PROPERTY, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_PROPERTY, NIL)
    }

  public open var index: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_INDEX,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_INDEX,
          NIL)
    }

  public open var assignOp: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_GET_ASSIGN_OP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPROPERTYSET_SET_ASSIGN_OP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTPROPERTYSET)
  }

  public enum class AssignOp(
    id: Long
  ) {
    ASSIGN_OP_NONE(0),
    ASSIGN_OP_ADD(1),
    ASSIGN_OP_SUB(2),
    ASSIGN_OP_MUL(3),
    ASSIGN_OP_DIV(4),
    ASSIGN_OP_MOD(5),
    ASSIGN_OP_SHIFT_LEFT(6),
    ASSIGN_OP_SHIFT_RIGHT(7),
    ASSIGN_OP_BIT_AND(8),
    ASSIGN_OP_BIT_OR(9),
    ASSIGN_OP_BIT_XOR(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CallMode(
    id: Long
  ) {
    CALL_MODE_SELF(0),
    CALL_MODE_NODE_PATH(1),
    CALL_MODE_INSTANCE(2),
    CALL_MODE_BASIC_TYPE(3),
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
