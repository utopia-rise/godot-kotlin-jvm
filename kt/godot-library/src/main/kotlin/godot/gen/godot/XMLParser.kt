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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Low-level class for creating parsers for [XML](https://en.wikipedia.org/wiki/XML) files.
 *
 * This class can serve as base to make custom XML parsers. Since XML is a very flexible standard, this interface is low-level so it can be applied to any possible schema.
 */
@GodotBaseType
open class XMLParser : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_XMLPARSER, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Gets the amount of attributes in the current element.
   */
  open fun getAttributeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_ATTRIBUTE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the name of the attribute specified by the index in `idx` argument.
   */
  open fun getAttributeName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_ATTRIBUTE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the value of the attribute specified by the index in `idx` argument.
   */
  open fun getAttributeValue(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_ATTRIBUTE_VALUE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the current line in the parsed file (currently not implemented).
   */
  open fun getCurrentLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_CURRENT_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the value of a certain attribute of the current element by name. This will raise an error if the element has no such attribute.
   */
  open fun getNamedAttributeValue(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NAMED_ATTRIBUTE_VALUE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the value of a certain attribute of the current element by name. This will return an empty [godot.String] if the attribute is not found.
   */
  open fun getNamedAttributeValueSafe(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NAMED_ATTRIBUTE_VALUE_SAFE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the contents of a text node. This will raise an error in any other type of node.
   */
  open fun getNodeData(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_DATA, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the name of the current element node. This will raise an error if the current node type is neither [NODE_ELEMENT] nor [NODE_ELEMENT_END].
   */
  open fun getNodeName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the byte offset of the current node since the beginning of the file or buffer.
   */
  open fun getNodeOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the type of the current node. Compare with [enum NodeType] constants.
   */
  open fun getNodeType(): XMLParser.NodeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_GET_NODE_TYPE, LONG)
    return XMLParser.NodeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Check whether the current element has a certain attribute.
   */
  open fun hasAttribute(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_HAS_ATTRIBUTE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Check whether the current element is empty (this only works for completely empty tags, e.g. `<element \>`).
   */
  open fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_IS_EMPTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Opens an XML file for parsing. This returns an error code.
   */
  open fun open(file: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Opens an XML raw buffer for parsing. This returns an error code.
   */
  open fun openBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_OPEN_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Reads the next node of the file. This returns an error code.
   */
  open fun read(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_READ, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Moves the buffer cursor to a certain offset (since the beginning) and read the next node there. This returns an error code.
   */
  open fun seek(position: Long): GodotError {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_SEEK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Skips the current section. If the node contains other elements, they will be ignored and the cursor will go to the closing of the current element.
   */
  open fun skipSection() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XMLPARSER_SKIP_SECTION, NIL)
  }

  enum class NodeType(
    id: Long
  ) {
    /**
     * There's no node (no file or buffer opened).
     */
    NODE_NONE(0),

    /**
     * Element (tag).
     */
    NODE_ELEMENT(1),

    /**
     * End of element.
     */
    NODE_ELEMENT_END(2),

    /**
     * Text node.
     */
    NODE_TEXT(3),

    /**
     * Comment node.
     */
    NODE_COMMENT(4),

    /**
     * CDATA content.
     */
    NODE_CDATA(5),

    /**
     * Unknown node.
     */
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
    /**
     * CDATA content.
     */
    final const val NODE_CDATA: Long = 5

    /**
     * Comment node.
     */
    final const val NODE_COMMENT: Long = 4

    /**
     * Element (tag).
     */
    final const val NODE_ELEMENT: Long = 1

    /**
     * End of element.
     */
    final const val NODE_ELEMENT_END: Long = 2

    /**
     * There's no node (no file or buffer opened).
     */
    final const val NODE_NONE: Long = 0

    /**
     * Text node.
     */
    final const val NODE_TEXT: Long = 3

    /**
     * Unknown node.
     */
    final const val NODE_UNKNOWN: Long = 6
  }
}
