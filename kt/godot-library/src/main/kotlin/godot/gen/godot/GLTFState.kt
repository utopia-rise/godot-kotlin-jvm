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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_JSON, DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_JSON, NIL)
    }

  public var majorVersion: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_MAJOR_VERSION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_MAJOR_VERSION, NIL)
    }

  public var minorVersion: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_MINOR_VERSION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_MINOR_VERSION, NIL)
    }

  public var glbData: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_GLB_DATA,
          PACKED_BYTE_ARRAY)
      return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_GLB_DATA, NIL)
    }

  public var useNamedSkinBinds: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_USE_NAMED_SKIN_BINDS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_USE_NAMED_SKIN_BINDS, NIL)
    }

  public var nodes: VariantArray<GLTFNode>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_NODES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFNode>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_NODES, NIL)
    }

  public var buffers: VariantArray<PackedByteArray>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_BUFFERS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedByteArray>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_BUFFERS, NIL)
    }

  public var bufferViews: VariantArray<GLTFBufferView>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_BUFFER_VIEWS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFBufferView>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_BUFFER_VIEWS, NIL)
    }

  public var accessors: VariantArray<GLTFAccessor>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_ACCESSORS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFAccessor>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_ACCESSORS, NIL)
    }

  public var meshes: VariantArray<GLTFMesh>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_MESHES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFMesh>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_MESHES, NIL)
    }

  public var materials: VariantArray<Material>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_MATERIALS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Material>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_MATERIALS, NIL)
    }

  public var sceneName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_SCENE_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_SCENE_NAME, NIL)
    }

  public var basePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_BASE_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_BASE_PATH, NIL)
    }

  public var rootNodes: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_ROOT_NODES,
          PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_ROOT_NODES, NIL)
    }

  public var textures: VariantArray<GLTFTexture>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_TEXTURES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFTexture>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_TEXTURES, NIL)
    }

  public var textureSamplers: VariantArray<GLTFTextureSampler>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_TEXTURE_SAMPLERS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFTextureSampler>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_TEXTURE_SAMPLERS,
          NIL)
    }

  public var images: VariantArray<Texture2D>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_IMAGES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Texture2D>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_IMAGES, NIL)
    }

  public var skins: VariantArray<GLTFSkin>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_SKINS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFSkin>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_SKINS, NIL)
    }

  public var cameras: VariantArray<GLTFCamera>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_CAMERAS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFCamera>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_CAMERAS, NIL)
    }

  public var lights: VariantArray<GLTFLight>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_LIGHTS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFLight>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_LIGHTS, NIL)
    }

  public var uniqueNames: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_UNIQUE_NAMES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_UNIQUE_NAMES, NIL)
    }

  public var uniqueAnimationNames: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_UNIQUE_ANIMATION_NAMES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_UNIQUE_ANIMATION_NAMES, NIL)
    }

  public var skeletons: VariantArray<GLTFSkeleton>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_SKELETONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFSkeleton>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_SKELETONS, NIL)
    }

  public var skeletonToNode: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_SKELETON_TO_NODE,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_SKELETON_TO_NODE,
          NIL)
    }

  public var createAnimations: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_CREATE_ANIMATIONS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_CREATE_ANIMATIONS,
          NIL)
    }

  public var animations: VariantArray<GLTFAnimation>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_ANIMATIONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<GLTFAnimation>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_ANIMATIONS, NIL)
    }

  public var handleBinaryImage: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_HANDLE_BINARY_IMAGE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_HANDLE_BINARY_IMAGE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFSTATE, scriptIndex)
    return true
  }

  public fun addUsedExtension(extensionName: String, required: Boolean): Unit {
    TransferContext.writeArguments(STRING to extensionName, BOOL to required)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_ADD_USED_EXTENSION, NIL)
  }

  public fun getAnimationPlayersCount(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_ANIMATION_PLAYERS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getAnimationPlayer(idx: Long): AnimationPlayer? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_ANIMATION_PLAYER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationPlayer?
  }

  public fun getSceneNode(idx: Long): Node? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_SCENE_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  public fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_GET_ADDITIONAL_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun setAdditionalData(extensionName: StringName, additionalData: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSTATE_SET_ADDITIONAL_DATA, NIL)
  }

  public companion object {
    public final const val HANDLE_BINARY_DISCARD_TEXTURES: Long = 0

    public final const val HANDLE_BINARY_EXTRACT_TEXTURES: Long = 1

    public final const val HANDLE_BINARY_EMBED_AS_BASISU: Long = 2

    public final const val HANDLE_BINARY_EMBED_AS_UNCOMPRESSED: Long = 3
  }
}
