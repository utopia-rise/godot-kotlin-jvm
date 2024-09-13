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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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

/**
 * GLTFDocument supports reading data from a glTF file, buffer, or Godot scene. This data can then
 * be written to the filesystem, buffer, or used to create a Godot scene.
 * All of the data in a GLTF scene is stored in the [GLTFState] class. GLTFDocument processes state
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
   * The user-friendly name of the export image format. This is used when exporting the GLTF file,
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
    callConstructor(ENGINECLASS_GLTFDOCUMENT, scriptIndex)
  }

  public final fun setImageFormat(imageFormat: String): Unit {
    TransferContext.writeArguments(STRING to imageFormat)
    TransferContext.callMethod(rawPtr, MethodBindings.setImageFormatPtr, NIL)
  }

  public final fun getImageFormat(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getImageFormatPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setLossyQuality(lossyQuality: Float): Unit {
    TransferContext.writeArguments(DOUBLE to lossyQuality.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setLossyQualityPtr, NIL)
  }

  public final fun getLossyQuality(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLossyQualityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRootNodeMode(rootNodeMode: RootNodeMode): Unit {
    TransferContext.writeArguments(LONG to rootNodeMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setRootNodeModePtr, NIL)
  }

  public final fun getRootNodeMode(): RootNodeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootNodeModePtr, LONG)
    return GLTFDocument.RootNodeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Takes a path to a GLTF file and imports the data at that file path to the given [GLTFState]
   * object through the [state] parameter.
   * **Note:** The [basePath] tells [appendFromFile] where to find dependencies and can be empty.
   */
  @JvmOverloads
  public final fun appendFromFile(
    path: String,
    state: GLTFState?,
    flags: Long = 0,
    basePath: String = "",
  ): GodotError {
    TransferContext.writeArguments(STRING to path, OBJECT to state, LONG to flags, STRING to basePath)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Takes a [PackedByteArray] defining a GLTF and imports the data to the given [GLTFState] object
   * through the [state] parameter.
   * **Note:** The [basePath] tells [appendFromBuffer] where to find dependencies and can be empty.
   */
  @JvmOverloads
  public final fun appendFromBuffer(
    bytes: PackedByteArray,
    basePath: String,
    state: GLTFState?,
    flags: Long = 0,
  ): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, STRING to basePath, OBJECT to state, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
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
  ): GodotError {
    TransferContext.writeArguments(OBJECT to node, OBJECT to state, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromScenePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
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
    TransferContext.callMethod(rawPtr, MethodBindings.generateScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Takes a [GLTFState] object through the [state] parameter and returns a GLTF [PackedByteArray].
   */
  public final fun generateBuffer(state: GLTFState?): PackedByteArray {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, MethodBindings.generateBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Takes a [GLTFState] object through the [state] parameter and writes a glTF file to the
   * filesystem.
   * **Note:** The extension of the glTF file determines if it is a .glb binary file or a .gltf text
   * file.
   */
  public final fun writeToFilesystem(state: GLTFState?, path: String): GodotError {
    TransferContext.writeArguments(OBJECT to state, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.writeToFilesystemPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
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
     * Registers the given [GLTFDocumentExtension] instance with GLTFDocument. If [firstPriority] is
     * true, this extension will be run first. Otherwise, it will be run last.
     * **Note:** Like GLTFDocument itself, all GLTFDocumentExtension classes must be stateless in
     * order to function properly. If you need to store data, use the `set_additional_data` and
     * `get_additional_data` methods in [GLTFState] or [GLTFNode].
     */
    @JvmOverloads
    public final fun registerGltfDocumentExtension(extension: GLTFDocumentExtension?,
        firstPriority: Boolean = false): Unit {
      TransferContext.writeArguments(OBJECT to extension, BOOL to firstPriority)
      TransferContext.callMethod(0, MethodBindings.registerGltfDocumentExtensionPtr, NIL)
    }

    /**
     * Unregisters the given [GLTFDocumentExtension] instance.
     */
    public final fun unregisterGltfDocumentExtension(extension: GLTFDocumentExtension?): Unit {
      TransferContext.writeArguments(OBJECT to extension)
      TransferContext.callMethod(0, MethodBindings.unregisterGltfDocumentExtensionPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val setImageFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_image_format", 83702148)

    public val getImageFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_image_format", 201670096)

    public val setLossyQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_lossy_quality", 373806689)

    public val getLossyQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_lossy_quality", 1740695150)

    public val setRootNodeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_root_node_mode", 463633402)

    public val getRootNodeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_root_node_mode", 948057992)

    public val appendFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_file", 866380864)

    public val appendFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_buffer", 1616081266)

    public val appendFromScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_scene", 1622574258)

    public val generateScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "generate_scene", 596118388)

    public val generateBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "generate_buffer", 741783455)

    public val writeToFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "write_to_filesystem", 1784551478)

    public val registerGltfDocumentExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "register_gltf_document_extension", 3752678331)

    public val unregisterGltfDocumentExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "unregister_gltf_document_extension", 2684415758)
  }
}
