// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class GLTFDocumentExtension : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFDOCUMENTEXTENSION, scriptIndex)
    return true
  }

  public open fun _getSupportedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_supported_extensions is not implemented for GLTFDocumentExtension")
  }

  public open fun _importPreflight(state: GLTFState): Long {
    throw NotImplementedError("_import_preflight is not implemented for GLTFDocumentExtension")
  }

  public open fun _importPostParse(state: GLTFState): Long {
    throw NotImplementedError("_import_post_parse is not implemented for GLTFDocumentExtension")
  }

  public open fun _importNode(
    state: GLTFState,
    gltfNode: GLTFNode,
    json: Dictionary<Any?, Any?>,
    node: Node
  ): Long {
    throw NotImplementedError("_import_node is not implemented for GLTFDocumentExtension")
  }

  public open fun _importPost(state: GLTFState, root: Node): Long {
    throw NotImplementedError("_import_post is not implemented for GLTFDocumentExtension")
  }

  public open fun _exportPreflight(root: Node): Long {
    throw NotImplementedError("_export_preflight is not implemented for GLTFDocumentExtension")
  }

  public open fun _exportNode(
    state: GLTFState,
    gltfNode: GLTFNode,
    json: Dictionary<Any?, Any?>,
    node: Node
  ): Long {
    throw NotImplementedError("_export_node is not implemented for GLTFDocumentExtension")
  }

  public open fun _exportPost(state: GLTFState): Long {
    throw NotImplementedError("_export_post is not implemented for GLTFDocumentExtension")
  }

  public companion object
}
