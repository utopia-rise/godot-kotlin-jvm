// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.PackedByteArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides a low-level interface for creating parsers for
 * [url=https://en.wikipedia.org/wiki/XML]XML[/url] files. This class can serve as base to make custom
 * XML parsers.
 *
 * To parse XML, you must open a file with the [open] method or a buffer with the [openBuffer]
 * method. Then, the [read] method must be called to parse the next nodes. Most of the methods take
 * into consideration the currently parsed node.
 *
 * Here is an example of using [XMLParser] to parse an SVG file (which is based on XML), printing
 * each element and its attributes as a dictionary:
 *
 * ```gdscript
 * //gdscript
 * var parser = XMLParser.new()
 * parser.open("path/to/file.svg")
 * while parser.read() != ERR_FILE_EOF:
 *     if parser.get_node_type() == XMLParser.NODE_ELEMENT:
 *         var node_name = parser.get_node_name()
 *         var attributes_dict = {}
 *         for idx in range(parser.get_attribute_count()):
 *             attributes_dict[parser.get_attribute_name(idx)] = parser.get_attribute_value(idx)
 *         print("The ", node_name, " element has the following attributes: ", attributes_dict)
 * ```
 *
 * ```csharp
 * //csharp
 * var parser = new XmlParser();
 * parser.Open("path/to/file.svg");
 * while (parser.Read() != Error.FileEof)
 * {
 *     if (parser.GetNodeType() == XmlParser.NodeType.Element)
 *     {
 *         var nodeName = parser.GetNodeName();
 *         var attributesDict = new Godot.Collections.Dictionary();
 *         for (int idx = 0; idx < parser.GetAttributeCount(); idx++)
 *         {
 *             attributesDict[parser.GetAttributeName(idx)] = parser.GetAttributeValue(idx);
 *         }
 *         GD.Print($"The {nodeName} element has the following attributes: {attributesDict}");
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class XMLParser : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(858, scriptIndex)
  }

  /**
   * Parses the next node in the file. This method returns an error code.
   */
  public final fun read(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.readPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the type of the current node. Compare with [NodeType] constants.
   */
  public final fun getNodeType(): NodeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodeTypePtr, LONG)
    return XMLParser.NodeType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the name of a node. This method will raise an error if the currently parsed node is a
   * text node.
   *
   * **Note:** The content of a [NODE_CDATA] node and the comment string of a [NODE_COMMENT] node
   * are also considered names.
   */
  public final fun getNodeName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the contents of a text node. This method will raise an error if the current parsed node
   * is of any other type.
   */
  public final fun getNodeData(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodeDataPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the byte offset of the currently parsed node since the beginning of the file or buffer.
   * This is usually equivalent to the number of characters before the read position.
   */
  public final fun getNodeOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodeOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of attributes in the currently parsed element.
   *
   * **Note:** If this method is used while the currently parsed node is not [NODE_ELEMENT] or
   * [NODE_ELEMENT_END], this count will not be updated and will still reflect the last element.
   */
  public final fun getAttributeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttributeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of an attribute of the currently parsed element, specified by the [idx] index.
   */
  public final fun getAttributeName(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAttributeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of an attribute of the currently parsed element, specified by the [idx]
   * index.
   */
  public final fun getAttributeValue(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAttributeValuePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the currently parsed element has an attribute with the [name].
   */
  public final fun hasAttribute(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.hasAttributePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the value of an attribute of the currently parsed element, specified by its [name].
   * This method will raise an error if the element has no such attribute.
   */
  public final fun getNamedAttributeValue(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.getNamedAttributeValuePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of an attribute of the currently parsed element, specified by its [name].
   * This method will return an empty string if the element has no such attribute.
   */
  public final fun getNamedAttributeValueSafe(name: String): String {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.getNamedAttributeValueSafePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the currently parsed element is empty, e.g. `<element />`.
   */
  public final fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current line in the parsed file, counting from 0.
   */
  public final fun getCurrentLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Skips the current section. If the currently parsed node contains more inner nodes, they will be
   * ignored and the cursor will go to the closing of the current element.
   */
  public final fun skipSection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.skipSectionPtr, NIL)
  }

  /**
   * Moves the buffer cursor to a certain offset (since the beginning) and reads the next node
   * there. This method returns an error code.
   */
  public final fun seek(position: Long): Error {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(ptr, MethodBindings.seekPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Opens an XML [file] for parsing. This method returns an error code.
   */
  public final fun `open`(`file`: String): Error {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(ptr, MethodBindings.openPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Opens an XML raw [buffer] for parsing. This method returns an error code.
   */
  public final fun openBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.openBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class NodeType(
    id: Long,
  ) {
    /**
     * There's no node (no file or buffer opened).
     */
    NONE(0),
    /**
     * An element node type, also known as a tag, e.g. `<title>`.
     */
    ELEMENT(1),
    /**
     * An end of element node type, e.g. `</title>`.
     */
    ELEMENT_END(2),
    /**
     * A text node type, i.e. text that is not inside an element. This includes whitespace.
     */
    TEXT(3),
    /**
     * A comment node type, e.g. `<!--A comment-->`.
     */
    COMMENT(4),
    /**
     * A node type for CDATA (Character Data) sections, e.g. `<![CDATA[CDATA section]]>`.
     */
    CDATA(5),
    /**
     * An unknown node type.
     */
    UNKNOWN(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): NodeType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val readPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "read", 166280745)

    internal val getNodeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_node_type", 2984359541)

    internal val getNodeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_node_name", 201670096)

    internal val getNodeDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_node_data", 201670096)

    internal val getNodeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_node_offset", 3905245786)

    internal val getAttributeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_count", 3905245786)

    internal val getAttributeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_name", 844755477)

    internal val getAttributeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_attribute_value", 844755477)

    internal val hasAttributePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "has_attribute", 3927539163)

    internal val getNamedAttributeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_named_attribute_value", 3135753539)

    internal val getNamedAttributeValueSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_named_attribute_value_safe", 3135753539)

    internal val isEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "is_empty", 36873697)

    internal val getCurrentLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "get_current_line", 3905245786)

    internal val skipSectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "skip_section", 3218959716)

    internal val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "seek", 844576869)

    internal val openPtr: VoidPtr = TypeManager.getMethodBindPtr("XMLParser", "open", 166001499)

    internal val openBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XMLParser", "open_buffer", 680677267)
  }
}
