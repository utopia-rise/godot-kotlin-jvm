// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.XMLParser
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class XMLParser : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_XMLPARSER)

  open fun getAttributeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_ATTRIBUTE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getAttributeName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_ATTRIBUTE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getAttributeValue(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_ATTRIBUTE_VALUE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getCurrentLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_CURRENT_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNamedAttributeValue(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NAMED_ATTRIBUTE_VALUE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNamedAttributeValueSafe(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NAMED_ATTRIBUTE_VALUE_SAFE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodeData(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_DATA, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodeName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodeOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNodeType(): XMLParser.NodeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_TYPE, LONG)
    return XMLParser.NodeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun hasAttribute(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_HAS_ATTRIBUTE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_IS_EMPTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun open(file: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun openBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_OPEN_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun read(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_READ, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun seek(position: Long): GodotError {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_SEEK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun skipSection() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_SKIP_SECTION, NIL)
  }

  enum class NodeType(
    id: Long
  ) {
    NODE_NONE(0),

    NODE_ELEMENT(1),

    NODE_ELEMENT_END(2),

    NODE_TEXT(3),

    NODE_COMMENT(4),

    NODE_CDATA(5),

    NODE_UNKNOWN(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val NODE_CDATA: Long = 5

    final const val NODE_COMMENT: Long = 4

    final const val NODE_ELEMENT: Long = 1

    final const val NODE_ELEMENT_END: Long = 2

    final const val NODE_NONE: Long = 0

    final const val NODE_TEXT: Long = 3

    final const val NODE_UNKNOWN: Long = 6
  }
}
