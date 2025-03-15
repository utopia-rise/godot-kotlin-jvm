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
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * GLTFDocument supports reading data from a glTF file, buffer, or Godot scene. This data can then
 * be written to the filesystem, buffer, or used to create a Godot scene.
 * All of the data in a glTF scene is stored in the [GLTFState] class. GLTFDocument processes state
 * objects, but does not contain any scene data itself. GLTFDocument has member variables to store
 * export configuration settings such as the image format, but is otherwise stateless. Multiple scenes
 * can be processed with the same settings using the same GLTFDocument object and different [GLTFState]
 * objects.
 * GLTFDocument can be extended with arbitrary functionality by extending the
 * [GLTFDocumentExtension] class and registering it with GLTFDocument via
 * [registerGltfDocumentExtension]. This allows for custom data to be imported and exported.
 */
@GodotBaseType
public open class GLTFDocument : Resource() {
  /**
   * The user-friendly name of the export image format. This is used when exporting the glTF file,
   * including writing to a file and writing to a byte array.
   * By default, Godot allows the following options: "None", "PNG", "JPEG", "Lossless WebP", and
   * "Lossy WebP". Support for more image formats can be added in [GLTFDocumentExtension] classes.
   */
  public final inline var imageFormat: String
    @JvmName("imageFormatProperty")
    get() = getImageFormat()
    @JvmName("imageFormatProperty")
    set(`value`) {
      setImageFormat(value)
    }

  /**
   * If [imageFormat] is a lossy image format, this determines the lossy quality of the image. On a
   * range of `0.0` to `1.0`, where `0.0` is the lowest quality and `1.0` is the highest quality. A
   * lossy quality of `1.0` is not the same as lossless.
   */
  public final inline var lossyQuality: Float
    @JvmName("lossyQualityProperty")
    get() = getLossyQuality()
    @JvmName("lossyQualityProperty")
    set(`value`) {
      setLossyQuality(value)
    }

  /**
   * How to process the root node during export. See [RootNodeMode] for details. The default and
   * recommended value is [ROOT_NODE_MODE_SINGLE_ROOT].
   * **Note:** Regardless of how the glTF file is exported, when importing, the root node type and
   * name can be overridden in the scene import settings tab.
   */
  public final inline var rootNodeMode: RootNodeMode
    @JvmName("rootNodeModeProperty")
    get() = getRootNodeMode()
    @JvmName("rootNodeModeProperty")
    set(`value`) {
      setRootNodeMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(228, scriptIndex)
  }

  public final fun setImageFormat(imageFormat: String): Unit {
    TransferContext.writeArguments(STRING to imageFormat)
    TransferContext.callMethod(ptr, MethodBindings.setImageFormatPtr, NIL)
  }

  public final fun getImageFormat(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getImageFormatPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setLossyQuality(lossyQuality: Float): Unit {
    TransferContext.writeArguments(DOUBLE to lossyQuality.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLossyQualityPtr, NIL)
  }

  public final fun getLossyQuality(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLossyQualityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRootNodeMode(rootNodeMode: RootNodeMode): Unit {
    TransferContext.writeArguments(LONG to rootNodeMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setRootNodeModePtr, NIL)
  }

  public final fun getRootNodeMode(): RootNodeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootNodeModePtr, LONG)
    return GLTFDocument.RootNodeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Takes a path to a glTF file and imports the data at that file path to the given [GLTFState]
   * object through the [state] parameter.
   * **Note:** The [basePath] tells [appendFromFile] where to find dependencies and can be empty.
   */
  @JvmOverloads
  public final fun appendFromFile(
    path: String,
    state: GLTFState?,
    flags: Long = 0,
    basePath: String = "",
  ): Error {
    TransferContext.writeArguments(STRING to path, OBJECT to state, LONG to flags, STRING to basePath)
    TransferContext.callMethod(ptr, MethodBindings.appendFromFilePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Takes a [PackedByteArray] defining a glTF and imports the data to the given [GLTFState] object
   * through the [state] parameter.
   * **Note:** The [basePath] tells [appendFromBuffer] where to find dependencies and can be empty.
   */
  @JvmOverloads
  public final fun appendFromBuffer(
    bytes: PackedByteArray,
    basePath: String,
    state: GLTFState?,
    flags: Long = 0,
  ): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, STRING to basePath, OBJECT to state, LONG to flags)
    TransferContext.callMethod(ptr, MethodBindings.appendFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Takes a Godot Engine scene node and exports it and its descendants to the given [GLTFState]
   * object through the [state] parameter.
   */
  @JvmOverloads
  public final fun appendFromScene(
    node: Node?,
    state: GLTFState?,
    flags: Long = 0,
  ): Error {
    TransferContext.writeArguments(OBJECT to node, OBJECT to state, LONG to flags)
    TransferContext.callMethod(ptr, MethodBindings.appendFromScenePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Takes a [GLTFState] object through the [state] parameter and returns a Godot Engine scene node.
   * The [bakeFps] parameter overrides the bake_fps in [state].
   */
  @JvmOverloads
  public final fun generateScene(
    state: GLTFState?,
    bakeFps: Float = 30.0f,
    trimming: Boolean = false,
    removeImmutableTracks: Boolean = true,
  ): Node? {
    TransferContext.writeArguments(OBJECT to state, DOUBLE to bakeFps.toDouble(), BOOL to trimming, BOOL to removeImmutableTracks)
    TransferContext.callMethod(ptr, MethodBindings.generateScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Takes a [GLTFState] object through the [state] parameter and returns a glTF [PackedByteArray].
   */
  public final fun generateBuffer(state: GLTFState?): PackedByteArray {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(ptr, MethodBindings.generateBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Takes a [GLTFState] object through the [state] parameter and writes a glTF file to the
   * filesystem.
   * **Note:** The extension of the glTF file determines if it is a .glb binary file or a .gltf text
   * file.
   */
  public final fun writeToFilesystem(state: GLTFState?, path: String): Error {
    TransferContext.writeArguments(OBJECT to state, STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.writeToFilesystemPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class RootNodeMode(
    id: Long,
  ) {
    /**
     * Treat the Godot scene's root node as the root node of the glTF file, and mark it as the
     * single root node via the `GODOT_single_root` glTF extension. This will be parsed the same as
     * [ROOT_NODE_MODE_KEEP_ROOT] if the implementation does not support `GODOT_single_root`.
     */
    ROOT_NODE_MODE_SINGLE_ROOT(0),
    /**
     * Treat the Godot scene's root node as the root node of the glTF file, but do not mark it as
     * anything special. An extra root node will be generated when importing into Godot. This uses only
     * vanilla glTF features. This is equivalent to the behavior in Godot 4.1 and earlier.
     */
    ROOT_NODE_MODE_KEEP_ROOT(1),
    /**
     * Treat the Godot scene's root node as the name of the glTF scene, and add all of its children
     * as root nodes of the glTF file. This uses only vanilla glTF features. This avoids an extra root
     * node, but only the name of the Godot scene's root node will be preserved, as it will not be
     * saved as a node.
     */
    ROOT_NODE_MODE_MULTI_ROOT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RootNodeMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Determines a mapping between the given glTF Object Model [jsonPointer] and the corresponding
     * Godot node path(s) in the generated Godot scene. The details of this mapping are returned in a
     * [GLTFObjectModelProperty] object. Additional mappings can be supplied via the
     * [GLTFDocumentExtension.ExportObjectModelProperty] callback method.
     */
    @JvmStatic
    public final fun importObjectModelProperty(state: GLTFState?, jsonPointer: String):
        GLTFObjectModelProperty? {
      TransferContext.writeArguments(OBJECT to state, STRING to jsonPointer)
      TransferContext.callMethod(0, MethodBindings.importObjectModelPropertyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFObjectModelProperty?)
    }

    /**
     * Determines a mapping between the given Godot [nodePath] and the corresponding glTF Object
     * Model JSON pointer(s) in the generated glTF file. The details of this mapping are returned in a
     * [GLTFObjectModelProperty] object. Additional mappings can be supplied via the
     * [GLTFDocumentExtension.ImportObjectModelProperty] callback method.
     */
    @JvmStatic
    public final fun exportObjectModelProperty(
      state: GLTFState?,
      nodePath: NodePath,
      godotNode: Node?,
      gltfNodeIndex: Int,
    ): GLTFObjectModelProperty? {
      TransferContext.writeArguments(OBJECT to state, NODE_PATH to nodePath, OBJECT to godotNode, LONG to gltfNodeIndex.toLong())
      TransferContext.callMethod(0, MethodBindings.exportObjectModelPropertyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFObjectModelProperty?)
    }

    /**
     * Registers the given [GLTFDocumentExtension] instance with GLTFDocument. If [firstPriority] is
     * `true`, this extension will be run first. Otherwise, it will be run last.
     * **Note:** Like GLTFDocument itself, all GLTFDocumentExtension classes must be stateless in
     * order to function properly. If you need to store data, use the `set_additional_data` and
     * `get_additional_data` methods in [GLTFState] or [GLTFNode].
     */
    @JvmOverloads
    @JvmStatic
    public final fun registerGltfDocumentExtension(extension: GLTFDocumentExtension?,
        firstPriority: Boolean = false): Unit {
      TransferContext.writeArguments(OBJECT to extension, BOOL to firstPriority)
      TransferContext.callMethod(0, MethodBindings.registerGltfDocumentExtensionPtr, NIL)
    }

    /**
     * Unregisters the given [GLTFDocumentExtension] instance.
     */
    @JvmStatic
    public final fun unregisterGltfDocumentExtension(extension: GLTFDocumentExtension?): Unit {
      TransferContext.writeArguments(OBJECT to extension)
      TransferContext.callMethod(0, MethodBindings.unregisterGltfDocumentExtensionPtr, NIL)
    }

    /**
     * Returns a list of all support glTF extensions, including extensions supported directly by the
     * engine, and extensions supported by user plugins registering [GLTFDocumentExtension] classes.
     * **Note:** If this method is run before a GLTFDocumentExtension is registered, its extensions
     * won't be included in the list. Be sure to only run this method after all extensions are
     * registered. If you run this when the engine starts, consider waiting a frame before calling this
     * method to ensure all extensions are registered.
     */
    @JvmStatic
    public final fun getSupportedGltfExtensions(): PackedStringArray {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getSupportedGltfExtensionsPtr,
          PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
    }
  }

  public object MethodBindings {
    internal val setImageFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_image_format", 83702148)

    internal val getImageFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_image_format", 201670096)

    internal val setLossyQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_lossy_quality", 373806689)

    internal val getLossyQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_lossy_quality", 1740695150)

    internal val setRootNodeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_root_node_mode", 463633402)

    internal val getRootNodeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_root_node_mode", 948057992)

    internal val appendFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_file", 866380864)

    internal val appendFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_buffer", 1616081266)

    internal val appendFromScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_scene", 1622574258)

    internal val generateScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "generate_scene", 596118388)

    internal val generateBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "generate_buffer", 741783455)

    internal val writeToFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "write_to_filesystem", 1784551478)

    internal val importObjectModelPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "import_object_model_property", 1206708632)

    internal val exportObjectModelPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "export_object_model_property", 314209806)

    internal val registerGltfDocumentExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "register_gltf_document_extension", 3752678331)

    internal val unregisterGltfDocumentExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "unregister_gltf_document_extension", 2684415758)

    internal val getSupportedGltfExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_supported_gltf_extensions", 2981934095)
  }
}
