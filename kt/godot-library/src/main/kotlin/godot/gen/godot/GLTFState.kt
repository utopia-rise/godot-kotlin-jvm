// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFState : Resource() {
  public var json: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJsonPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJsonPtr, NIL)
    }

  public var majorVersion: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMajorVersionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMajorVersionPtr, NIL)
    }

  public var minorVersion: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinorVersionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinorVersionPtr, NIL)
    }

  public var copyright: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_COPYRIGHT, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_COPYRIGHT, NIL)
    }

  public var glbData: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlbDataPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlbDataPtr, NIL)
    }

  public var useNamedSkinBinds: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseNamedSkinBindsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseNamedSkinBindsPtr, NIL)
    }

  public var nodes: VariantArray<GLTFNode>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNodesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFNode>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNodesPtr, NIL)
    }

  public var buffers: VariantArray<PackedByteArray>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBuffersPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedByteArray>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBuffersPtr, NIL)
    }

  public var bufferViews: VariantArray<GLTFBufferView>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferViewsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFBufferView>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferViewsPtr, NIL)
    }

  public var accessors: VariantArray<GLTFAccessor>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessorsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFAccessor>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessorsPtr, NIL)
    }

  public var meshes: VariantArray<GLTFMesh>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFMesh>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshesPtr, NIL)
    }

  public var materials: VariantArray<Material>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Material>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialsPtr, NIL)
    }

  public var sceneName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSceneNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSceneNamePtr, NIL)
    }

  public var basePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBasePathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBasePathPtr, NIL)
    }

  public var filename: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_FILENAME, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_FILENAME, NIL)
    }

  public var rootNodes: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootNodesPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootNodesPtr, NIL)
    }

  public var textures: VariantArray<GLTFTexture>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFTexture>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturesPtr, NIL)
    }

  public var textureSamplers: VariantArray<GLTFTextureSampler>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureSamplersPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFTextureSampler>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureSamplersPtr, NIL)
    }

  public var images: VariantArray<Texture2D>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getImagesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Texture2D>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setImagesPtr, NIL)
    }

  public var skins: VariantArray<GLTFSkin>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkinsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFSkin>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkinsPtr, NIL)
    }

  public var cameras: VariantArray<GLTFCamera>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCamerasPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFCamera>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCamerasPtr, NIL)
    }

  public var lights: VariantArray<GLTFLight>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFLight>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightsPtr, NIL)
    }

  public var uniqueNames: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUniqueNamesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUniqueNamesPtr, NIL)
    }

  public var uniqueAnimationNames: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUniqueAnimationNamesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUniqueAnimationNamesPtr, NIL)
    }

  public var skeletons: VariantArray<GLTFSkeleton>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFSkeleton>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonsPtr, NIL)
    }

  public var createAnimations: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCreateAnimationsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCreateAnimationsPtr, NIL)
    }

  public var animations: VariantArray<GLTFAnimation>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFAnimation>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationsPtr, NIL)
    }

  public var handleBinaryImage: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHandleBinaryImagePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHandleBinaryImagePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFSTATE, scriptIndex)
    return true
  }

  public fun addUsedExtension(extensionName: String, required: Boolean): Unit {
    TransferContext.writeArguments(STRING to extensionName, BOOL to required)
    TransferContext.callMethod(rawPtr, MethodBindings.addUsedExtensionPtr, NIL)
  }

  public fun getAnimationPlayersCount(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPlayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getAnimationPlayer(idx: Int): AnimationPlayer? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPlayerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationPlayer?)
  }

  public fun getSceneNode(idx: Int): Node? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun getNodeIndex(sceneNode: Node): Int {
    TransferContext.writeArguments(OBJECT to sceneNode)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object {
    public final const val HANDLE_BINARY_DISCARD_TEXTURES: Long = 0

    public final const val HANDLE_BINARY_EXTRACT_TEXTURES: Long = 1

    public final const val HANDLE_BINARY_EMBED_AS_BASISU: Long = 2

    public final const val HANDLE_BINARY_EMBED_AS_UNCOMPRESSED: Long = 3
  }

  internal object MethodBindings {
    public val addUsedExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "add_used_extension")

    public val getJsonPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_json")

    public val setJsonPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_json")

    public val getMajorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_major_version")

    public val setMajorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_major_version")

    public val getMinorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_minor_version")

    public val setMinorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_minor_version")

    public val getGlbDataPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_glb_data")

    public val setGlbDataPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_glb_data")

    public val getUseNamedSkinBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_use_named_skin_binds")

    public val setUseNamedSkinBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_use_named_skin_binds")

    public val getNodesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_nodes")

    public val setNodesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_nodes")

    public val getBuffersPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_buffers")

    public val setBuffersPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_buffers")

    public val getBufferViewsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_buffer_views")

    public val setBufferViewsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_buffer_views")

    public val getAccessorsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_accessors")

    public val setAccessorsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_accessors")

    public val getMeshesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_meshes")

    public val setMeshesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_meshes")

    public val getAnimationPlayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_animation_players_count")

    public val getAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_animation_player")

    public val getMaterialsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_materials")

    public val setMaterialsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_materials")

    public val getSceneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_scene_name")

    public val setSceneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_scene_name")

    public val getBasePathPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_base_path")

    public val setBasePathPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_base_path")

    public val getRootNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_root_nodes")

    public val setRootNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_root_nodes")

    public val getTexturesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_textures")

    public val setTexturesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_textures")

    public val getTextureSamplersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_texture_samplers")

    public val setTextureSamplersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_texture_samplers")

    public val getImagesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_images")

    public val setImagesPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_images")

    public val getSkinsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_skins")

    public val setSkinsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_skins")

    public val getCamerasPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_cameras")

    public val setCamerasPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_cameras")

    public val getLightsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_lights")

    public val setLightsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_lights")

    public val getUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_unique_names")

    public val setUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_unique_names")

    public val getUniqueAnimationNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_unique_animation_names")

    public val setUniqueAnimationNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_unique_animation_names")

    public val getSkeletonsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "get_skeletons")

    public val setSkeletonsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFState", "set_skeletons")

    public val getCreateAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_create_animations")

    public val setCreateAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_create_animations")

    public val getAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_animations")

    public val setAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_animations")

    public val getSceneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_scene_node")

    public val getNodeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_node_index")

    public val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_additional_data")

    public val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_additional_data")

    public val getHandleBinaryImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_handle_binary_image")

    public val setHandleBinaryImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_handle_binary_image")
  }
}
