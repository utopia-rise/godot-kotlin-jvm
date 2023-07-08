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
import kotlin.Any
import kotlin.Boolean
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
}
