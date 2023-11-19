// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides a low-level interface for creating parsers for XML files.
 *
 * Low-level class for creating parsers for [XML](https://en.wikipedia.org/wiki/XML) files.
 *
 * Provides a low-level interface for creating parsers for [XML](https://en.wikipedia.org/wiki/XML) files. This class can serve as base to make custom XML parsers.
 */
@GodotBaseType
public open class XMLParser : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XMLPARSER, scriptIndex)
    return true
  }

  /**
   * Reads the next node of the file. This returns an error code.
   */
  public fun read(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.readPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets the type of the current node. Compare with [enum NodeType] constants.
   */
  public fun getNodeType(): NodeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeTypePtr, LONG)
    return XMLParser.NodeType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets the name of the current element node. This will raise an error if the current node type is neither [NODE_ELEMENT] nor [NODE_ELEMENT_END].
   */
  public fun getNodeName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets the contents of a text node. This will raise an error in any other type of node.
   */
  public fun getNodeData(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeDataPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets the byte offset of the current node since the beginning of the file or buffer.
   */
  public fun getNodeOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Gets the number of attributes in the current element.
   */
  public fun getAttributeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAttributeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets the name of the attribute specified by the [idx] index.
   */
  public fun getAttributeName(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAttributeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets the value of the attribute specified by the [idx] index.
   */
  public fun getAttributeValue(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAttributeValuePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Check whether the current element has a certain attribute.
   */
  public fun hasAttribute(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAttributePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Gets the value of a certain attribute of the current element by [name]. This will raise an error if the element has no such attribute.
   */
  public fun getNamedAttributeValue(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNamedAttributeValuePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets the value of a certain attribute of the current element by [name]. This will return an empty [godot.String] if the attribute is not found.
   */
  public fun getNamedAttributeValueSafe(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNamedAttributeValueSafePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Check whether the current element is empty (this only works for completely empty tags, e.g. `<element \>`).
   */
  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Gets the current line in the parsed file, counting from 0.
   */
  public fun getCurrentLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Skips the current section. If the node contains other elements, they will be ignored and the cursor will go to the closing of the current element.
   */
  public fun skipSection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skipSectionPtr, NIL)
  }

  /**
   * Moves the buffer cursor to a certain offset (since the beginning) and read the next node there. This returns an error code.
   */
  public fun seek(position: Long): GodotError {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Opens an XML [file] for parsing. This returns an error code.
   */
  public fun `open`(`file`: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, MethodBindings.openPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Opens an XML raw [buffer] for parsing. This returns an error code.
   */
  public fun openBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.openBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class NodeType(
    id: Long,
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
    NODE_UNKNOWN(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val readPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "read")

    public val getNodeTypePtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "get_node_type")

    public val getNodeNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "get_node_name")

    public val getNodeDataPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "get_node_data")

    public val getNodeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_node_offset")

    public val getAttributeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_count")

    public val getAttributeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_name")

    public val getAttributeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_value")

    public val hasAttributePtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "has_attribute")

    public val getNamedAttributeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_named_attribute_value")

    public val getNamedAttributeValueSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_named_attribute_value_safe")

    public val isEmptyPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "is_empty")

    public val getCurrentLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_current_line")

    public val skipSectionPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "skip_section")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "seek")

    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "open")

    public val openBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "open_buffer")
  }
}
