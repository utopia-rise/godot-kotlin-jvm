// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_XMLPARSER_INDEX: Int = 835

/**
 * Provides a low-level interface for creating parsers for
 * [url=https://en.wikipedia.org/wiki/XML]XML[/url] files. This class can serve as base to make custom
 * XML parsers.
 * To parse XML, you must open a file with the [open] method or a buffer with the [openBuffer]
 * method. Then, the [read] method must be called to parse the next nodes. Most of the methods take
 * into consideration the currently parsed node.
 * Here is an example of using [XMLParser] to parse an SVG file (which is based on XML), printing
 * each element and its attributes as a dictionary:
 *
 * gdscript:
 * ```gdscript
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
 * csharp:
 * ```csharp
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
    Internals.callConstructor(this, ENGINE_CLASS_XMLPARSER_INDEX, scriptIndex)
  }

  /**
   * Parses the next node in the file. This method returns an error code.
   */
  public final fun read(): Error {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.readPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the type of the current node. Compare with [NodeType] constants.
   */
  public final fun getNodeType(): NodeType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodeTypePtr, LONG)
    return XMLParser.NodeType.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the name of a node. This method will raise an error if the currently parsed node is a
   * text node.
   * **Note:** The content of a [NODE_CDATA] node and the comment string of a [NODE_COMMENT] node
   * are also considered names.
   */
  public final fun getNodeName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the contents of a text node. This method will raise an error if the current parsed node
   * is of any other type.
   */
  public final fun getNodeData(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodeDataPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the byte offset of the currently parsed node since the beginning of the file or buffer.
   * This is usually equivalent to the number of characters before the read position.
   */
  public final fun getNodeOffset(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodeOffsetPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of attributes in the currently parsed element.
   * **Note:** If this method is used while the currently parsed node is not [NODE_ELEMENT] or
   * [NODE_ELEMENT_END], this count will not be updated and will still reflect the last element.
   */
  public final fun getAttributeCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttributeCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of an attribute of the currently parsed element, specified by the [idx] index.
   */
  public final fun getAttributeName(idx: Int): String {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAttributeNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of an attribute of the currently parsed element, specified by the [idx]
   * index.
   */
  public final fun getAttributeValue(idx: Int): String {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAttributeValuePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the currently parsed element has an attribute with the [name].
   */
  public final fun hasAttribute(name: String): Boolean {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.hasAttributePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the value of an attribute of the currently parsed element, specified by its [name].
   * This method will raise an error if the element has no such attribute.
   */
  public final fun getNamedAttributeValue(name: String): String {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.getNamedAttributeValuePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of an attribute of the currently parsed element, specified by its [name].
   * This method will return an empty string if the element has no such attribute.
   */
  public final fun getNamedAttributeValueSafe(name: String): String {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.getNamedAttributeValueSafePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the currently parsed element is empty, e.g. `<element />`.
   */
  public final fun isEmpty(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current line in the parsed file, counting from 0.
   */
  public final fun getCurrentLine(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Skips the current section. If the currently parsed node contains more inner nodes, they will be
   * ignored and the cursor will go to the closing of the current element.
   */
  public final fun skipSection(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.skipSectionPtr, NIL)
  }

  /**
   * Moves the buffer cursor to a certain offset (since the beginning) and reads the next node
   * there. This method returns an error code.
   */
  public final fun seek(position: Long): Error {
    Internals.writeArguments(LONG to position)
    Internals.callMethod(rawPtr, MethodBindings.seekPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Opens an XML [file] for parsing. This method returns an error code.
   */
  public final fun `open`(`file`: String): Error {
    Internals.writeArguments(STRING to file)
    Internals.callMethod(rawPtr, MethodBindings.openPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Opens an XML raw [buffer] for parsing. This method returns an error code.
   */
  public final fun openBuffer(buffer: PackedByteArray): Error {
    Internals.writeArguments(PACKED_BYTE_ARRAY to buffer)
    Internals.callMethod(rawPtr, MethodBindings.openBufferPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class NodeType(
    id: Long,
  ) {
    /**
     * There's no node (no file or buffer opened).
     */
    NODE_NONE(0),
    /**
     * An element node type, also known as a tag, e.g. `<title>`.
     */
    NODE_ELEMENT(1),
    /**
     * An end of element node type, e.g. `</title>`.
     */
    NODE_ELEMENT_END(2),
    /**
     * A text node type, i.e. text that is not inside an element. This includes whitespace.
     */
    NODE_TEXT(3),
    /**
     * A comment node type, e.g. `<!--A comment-->`.
     */
    NODE_COMMENT(4),
    /**
     * A node type for CDATA (Character Data) sections, e.g. `<![CDATA[CDATA section]]>`.
     */
    NODE_CDATA(5),
    /**
     * An unknown node type.
     */
    NODE_UNKNOWN(6),
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

  internal object MethodBindings {
    public val readPtr: VoidPtr = Internals.getMethodBindPtr("XMLParser", "read", 166280745)

    public val getNodeTypePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_node_type", 2984359541)

    public val getNodeNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_node_name", 201670096)

    public val getNodeDataPtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_node_data", 201670096)

    public val getNodeOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_node_offset", 3905245786)

    public val getAttributeCountPtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_attribute_count", 3905245786)

    public val getAttributeNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_attribute_name", 844755477)

    public val getAttributeValuePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_attribute_value", 844755477)

    public val hasAttributePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "has_attribute", 3927539163)

    public val getNamedAttributeValuePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_named_attribute_value", 3135753539)

    public val getNamedAttributeValueSafePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_named_attribute_value_safe", 3135753539)

    public val isEmptyPtr: VoidPtr = Internals.getMethodBindPtr("XMLParser", "is_empty", 36873697)

    public val getCurrentLinePtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "get_current_line", 3905245786)

    public val skipSectionPtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "skip_section", 3218959716)

    public val seekPtr: VoidPtr = Internals.getMethodBindPtr("XMLParser", "seek", 844576869)

    public val openPtr: VoidPtr = Internals.getMethodBindPtr("XMLParser", "open", 166001499)

    public val openBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("XMLParser", "open_buffer", 680677267)
  }
}
