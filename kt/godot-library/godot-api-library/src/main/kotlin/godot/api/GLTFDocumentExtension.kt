// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import kotlin.Any
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Extends the functionality of the [GLTFDocument] class by allowing you to run arbitrary code at
 * various stages of GLTF import or export.
 * To use, make a new class extending GLTFDocumentExtension, override any methods you need, make an
 * instance of your class, and register it using [GLTFDocument.registerGltfDocumentExtension].
 * **Note:** Like GLTFDocument itself, all GLTFDocumentExtension classes must be stateless in order
 * to function properly. If you need to store data, use the `set_additional_data` and
 * `get_additional_data` methods in [GLTFState] or [GLTFNode].
 */
@GodotBaseType
public open class GLTFDocumentExtension : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(255, scriptIndex)
  }

  /**
   * Part of the import process. This method is run first, before all other parts of the import
   * process.
   * The return value is used to determine if this [GLTFDocumentExtension] instance should be used
   * for importing a given GLTF file. If [OK], the import will use this [GLTFDocumentExtension]
   * instance. If not overridden, [OK] is returned.
   */
  public open fun _importPreflight(state: GLTFState?, extensions: PackedStringArray): Error {
    throw NotImplementedError("_import_preflight is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_importPreflight] and before
   * [_parseNodeExtensions].
   * Returns an array of the GLTF extensions supported by this GLTFDocumentExtension class. This is
   * used to validate if a GLTF file with required extensions can be loaded.
   */
  public open fun _getSupportedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_supported_extensions is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_getSupportedExtensions] and before
   * [_importPostParse].
   * Runs when parsing the node extensions of a GLTFNode. This method can be used to process the
   * extension JSON data into a format that can be used by [_generateSceneNode]. The return value
   * should be a member of the [Error] enum.
   */
  public open fun _parseNodeExtensions(
    state: GLTFState?,
    gltfNode: GLTFNode?,
    extensions: Dictionary<Any?, Any?>,
  ): Error {
    throw NotImplementedError("_parse_node_extensions is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_parseNodeExtensions] and before
   * [_parseTextureJson].
   * Runs when parsing image data from a GLTF file. The data could be sourced from a separate file,
   * a URI, or a buffer, and then is passed as a byte array.
   */
  public open fun _parseImageData(
    state: GLTFState?,
    imageData: PackedByteArray,
    mimeType: String,
    retImage: Image?,
  ): Error {
    throw NotImplementedError("_parse_image_data is not implemented for GLTFDocumentExtension")
  }

  /**
   * Returns the file extension to use for saving image data into, for example, `".png"`. If
   * defined, when this extension is used to handle images, and the images are saved to a separate
   * file, the image bytes will be copied to a file with this extension. If this is set, there should
   * be a [ResourceImporter] class able to import the file. If not defined or empty, Godot will save
   * the image into a PNG file.
   */
  public open fun _getImageFileExtension(): String {
    throw NotImplementedError("_get_image_file_extension is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_parseImageData] and before
   * [_generateSceneNode].
   * Runs when parsing the texture JSON from the GLTF textures array. This can be used to set the
   * source image index to use as the texture.
   */
  public open fun _parseTextureJson(
    state: GLTFState?,
    textureJson: Dictionary<Any?, Any?>,
    retGltfTexture: GLTFTexture?,
  ): Error {
    throw NotImplementedError("_parse_texture_json is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_importPostParse] and before
   * [_importNode].
   * Runs when generating a Godot scene node from a GLTFNode. The returned node will be added to the
   * scene tree. Multiple nodes can be generated in this step if they are added as a child of the
   * returned node.
   * **Note:** The [sceneParent] parameter may be null if this is the single root node.
   */
  public open fun _generateSceneNode(
    state: GLTFState?,
    gltfNode: GLTFNode?,
    sceneParent: Node?,
  ): Node3D? {
    throw NotImplementedError("_generate_scene_node is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_parseNodeExtensions] and before
   * [_generateSceneNode].
   * This method can be used to modify any of the data imported so far after parsing, before
   * generating the nodes and then running the final per-node import step.
   */
  public open fun _importPostParse(state: GLTFState?): Error {
    throw NotImplementedError("_import_post_parse is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run after [_generateSceneNode] and before
   * [_importPost].
   * This method can be used to make modifications to each of the generated Godot scene nodes.
   */
  public open fun _importNode(
    state: GLTFState?,
    gltfNode: GLTFNode?,
    json: Dictionary<Any?, Any?>,
    node: Node?,
  ): Error {
    throw NotImplementedError("_import_node is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the import process. This method is run last, after all other parts of the import
   * process.
   * This method can be used to modify the final Godot scene generated by the import process.
   */
  public open fun _importPost(state: GLTFState?, root: Node?): Error {
    throw NotImplementedError("_import_post is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run first, before all other parts of the export
   * process.
   * The return value is used to determine if this [GLTFDocumentExtension] instance should be used
   * for exporting a given GLTF file. If [OK], the export will use this [GLTFDocumentExtension]
   * instance. If not overridden, [OK] is returned.
   */
  public open fun _exportPreflight(state: GLTFState?, root: Node?): Error {
    throw NotImplementedError("_export_preflight is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run after [_exportPreflight] and before
   * [_exportPreserialize].
   * Runs when converting the data from a Godot scene node. This method can be used to process the
   * Godot scene node data into a format that can be used by [_exportNode].
   */
  public open fun _convertSceneNode(
    state: GLTFState?,
    gltfNode: GLTFNode?,
    sceneNode: Node?,
  ): Unit {
  }

  /**
   * Part of the export process. This method is run after [_convertSceneNode] and before
   * [_getSaveableImageFormats].
   * This method can be used to alter the state before performing serialization. It runs every time
   * when generating a buffer with [GLTFDocument.generateBuffer] or writing to the file system with
   * [GLTFDocument.writeToFilesystem].
   */
  public open fun _exportPreserialize(state: GLTFState?): Error {
    throw NotImplementedError("_export_preserialize is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run after [_convertSceneNode] and before
   * [_exportNode].
   * Returns an array of the image formats that can be saved/exported by this extension. This
   * extension will only be selected as the image exporter if the [GLTFDocument]'s
   * [GLTFDocument.imageFormat] is in this array. If this [GLTFDocumentExtension] is selected as the
   * image exporter, one of the [_saveImageAtPath] or [_serializeImageToBytes] methods will run next,
   * otherwise [_exportNode] will run next. If the format name contains `"Lossy"`, the lossy quality
   * slider will be displayed.
   */
  public open fun _getSaveableImageFormats(): PackedStringArray {
    throw NotImplementedError("_get_saveable_image_formats is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run after [_getSaveableImageFormats] and before
   * [_serializeTextureJson].
   * This method is run when embedding images in the GLTF file. When images are saved separately,
   * [_saveImageAtPath] runs instead. Note that these methods only run when this
   * [GLTFDocumentExtension] is selected as the image exporter.
   * This method must set the image MIME type in the [imageDict] with the `"mimeType"` key. For
   * example, for a PNG image, it would be set to `"image/png"`. The return value must be a
   * [PackedByteArray] containing the image data.
   */
  public open fun _serializeImageToBytes(
    state: GLTFState?,
    image: Image?,
    imageDict: Dictionary<Any?, Any?>,
    imageFormat: String,
    lossyQuality: Float,
  ): PackedByteArray {
    throw NotImplementedError("_serialize_image_to_bytes is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run after [_getSaveableImageFormats] and before
   * [_serializeTextureJson].
   * This method is run when saving images separately from the GLTF file. When images are embedded,
   * [_serializeImageToBytes] runs instead. Note that these methods only run when this
   * [GLTFDocumentExtension] is selected as the image exporter.
   */
  public open fun _saveImageAtPath(
    state: GLTFState?,
    image: Image?,
    filePath: String,
    imageFormat: String,
    lossyQuality: Float,
  ): Error {
    throw NotImplementedError("_save_image_at_path is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run after [_saveImageAtPath] or
   * [_serializeImageToBytes], and before [_exportNode]. Note that this method only runs when this
   * [GLTFDocumentExtension] is selected as the image exporter.
   * This method can be used to set up the extensions for the texture JSON by editing [textureJson].
   * The extension must also be added as used extension with [GLTFState.addUsedExtension], be sure to
   * set `required` to `true` if you are not providing a fallback.
   */
  public open fun _serializeTextureJson(
    state: GLTFState?,
    textureJson: Dictionary<Any?, Any?>,
    gltfTexture: GLTFTexture?,
    imageFormat: String,
  ): Error {
    throw NotImplementedError("_serialize_texture_json is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run after [_getSaveableImageFormats] and before
   * [_exportPost]. If this [GLTFDocumentExtension] is used for exporting images, this runs after
   * [_serializeTextureJson].
   * This method can be used to modify the final JSON of each node. Data should be primarily stored
   * in [gltfNode] prior to serializing the JSON, but the original Godot [node] is also provided if
   * available. The node may be null if not available, such as when exporting GLTF data not generated
   * from a Godot scene.
   */
  public open fun _exportNode(
    state: GLTFState?,
    gltfNode: GLTFNode?,
    json: Dictionary<Any?, Any?>,
    node: Node?,
  ): Error {
    throw NotImplementedError("_export_node is not implemented for GLTFDocumentExtension")
  }

  /**
   * Part of the export process. This method is run last, after all other parts of the export
   * process.
   * This method can be used to modify the final JSON of the generated GLTF file.
   */
  public open fun _exportPost(state: GLTFState?): Error {
    throw NotImplementedError("_export_post is not implemented for GLTFDocumentExtension")
  }

  public companion object

  public object MethodBindings
}
