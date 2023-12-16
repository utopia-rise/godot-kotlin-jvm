// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFDocumentExtension : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFDOCUMENTEXTENSION, scriptIndex)
    return true
  }

  public open fun _importPreflight(state: GLTFState, extensions: PackedStringArray): GodotError {
    throw NotImplementedError("_import_preflight is not implemented for GLTFDocumentExtension")
  }

  public open fun _getSupportedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_supported_extensions is not implemented for GLTFDocumentExtension")
  }

  public open fun _parseNodeExtensions(
    state: GLTFState,
    gltfNode: GLTFNode,
    extensions: Dictionary<Any?, Any?>,
  ): GodotError {
    throw NotImplementedError("_parse_node_extensions is not implemented for GLTFDocumentExtension")
  }

  public open fun _parseImageData(
    state: GLTFState,
    imageData: PackedByteArray,
    mimeType: String,
    retImage: Image,
  ): GodotError {
    throw NotImplementedError("_parse_image_data is not implemented for GLTFDocumentExtension")
  }

  public open fun _getImageFileExtension(): String {
    throw NotImplementedError("_get_image_file_extension is not implemented for GLTFDocumentExtension")
  }

  public open fun _parseTextureJson(
    state: GLTFState,
    textureJson: Dictionary<Any?, Any?>,
    retGltfTexture: GLTFTexture,
  ): GodotError {
    throw NotImplementedError("_parse_texture_json is not implemented for GLTFDocumentExtension")
  }

  public open fun _generateSceneNode(
    state: GLTFState,
    gltfNode: GLTFNode,
    sceneParent: Node,
  ): Node3D? {
    throw NotImplementedError("_generate_scene_node is not implemented for GLTFDocumentExtension")
  }

  public open fun _importPostParse(state: GLTFState): GodotError {
    throw NotImplementedError("_import_post_parse is not implemented for GLTFDocumentExtension")
  }

  public open fun _importNode(
    state: GLTFState,
    gltfNode: GLTFNode,
    json: Dictionary<Any?, Any?>,
    node: Node,
  ): GodotError {
    throw NotImplementedError("_import_node is not implemented for GLTFDocumentExtension")
  }

  public open fun _importPost(state: GLTFState, root: Node): GodotError {
    throw NotImplementedError("_import_post is not implemented for GLTFDocumentExtension")
  }

  public open fun _exportPreflight(state: GLTFState, root: Node): GodotError {
    throw NotImplementedError("_export_preflight is not implemented for GLTFDocumentExtension")
  }

  public open fun _convertSceneNode(
    state: GLTFState,
    gltfNode: GLTFNode,
    sceneNode: Node,
  ): Unit {
  }

  public open fun _exportPreserialize(state: GLTFState): GodotError {
    throw NotImplementedError("_export_preserialize is not implemented for GLTFDocumentExtension")
  }

  public open fun _getSaveableImageFormats(): PackedStringArray {
    throw NotImplementedError("_get_saveable_image_formats is not implemented for GLTFDocumentExtension")
  }

  public open fun _serializeImageToBytes(
    state: GLTFState,
    image: Image,
    imageDict: Dictionary<Any?, Any?>,
    imageFormat: String,
    lossyQuality: Float,
  ): PackedByteArray {
    throw NotImplementedError("_serialize_image_to_bytes is not implemented for GLTFDocumentExtension")
  }

  public open fun _saveImageAtPath(
    state: GLTFState,
    image: Image,
    filePath: String,
    imageFormat: String,
    lossyQuality: Float,
  ): GodotError {
    throw NotImplementedError("_save_image_at_path is not implemented for GLTFDocumentExtension")
  }

  public open fun _serializeTextureJson(
    state: GLTFState,
    textureJson: Dictionary<Any?, Any?>,
    gltfTexture: GLTFTexture,
    imageFormat: String,
  ): GodotError {
    throw NotImplementedError("_serialize_texture_json is not implemented for GLTFDocumentExtension")
  }

  public open fun _exportNode(
    state: GLTFState,
    gltfNode: GLTFNode,
    json: Dictionary<Any?, Any?>,
    node: Node,
  ): GodotError {
    throw NotImplementedError("_export_node is not implemented for GLTFDocumentExtension")
  }

  public open fun _exportPost(state: GLTFState): GodotError {
    throw NotImplementedError("_export_post is not implemented for GLTFDocumentExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _importPreflightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_import_preflight")

    public val _getSupportedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_get_supported_extensions")

    public val _parseNodeExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_parse_node_extensions")

    public val _parseImageDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_parse_image_data")

    public val _getImageFileExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_get_image_file_extension")

    public val _parseTextureJsonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_parse_texture_json")

    public val _generateSceneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_generate_scene_node")

    public val _importPostParsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_import_post_parse")

    public val _importNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_import_node")

    public val _importPostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_import_post")

    public val _exportPreflightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_export_preflight")

    public val _convertSceneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_convert_scene_node")

    public val _exportPreserializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_export_preserialize")

    public val _getSaveableImageFormatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_get_saveable_image_formats")

    public val _serializeImageToBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_serialize_image_to_bytes")

    public val _saveImageAtPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_save_image_at_path")

    public val _serializeTextureJsonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_serialize_texture_json")

    public val _exportNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_export_node")

    public val _exportPostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocumentExtension", "_export_post")
  }
}
