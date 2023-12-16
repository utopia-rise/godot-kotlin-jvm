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
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class GLTFDocument : Resource() {
  public var imageFormat: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getImageFormatPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setImageFormatPtr, NIL)
    }

  public var lossyQuality: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLossyQualityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLossyQualityPtr, NIL)
    }

  public var rootNodeMode: RootNodeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootNodeModePtr, LONG)
      return GLTFDocument.RootNodeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootNodeModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFDOCUMENT, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun appendFromFile(
    path: String,
    state: GLTFState,
    flags: Long = 0,
    basePath: String = "",
  ): GodotError {
    TransferContext.writeArguments(STRING to path, OBJECT to state, LONG to flags, STRING to basePath)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun appendFromBuffer(
    bytes: PackedByteArray,
    basePath: String,
    state: GLTFState,
    flags: Long = 0,
  ): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, STRING to basePath, OBJECT to state, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromBufferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun appendFromScene(
    node: Node,
    state: GLTFState,
    flags: Long = 0,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to node, OBJECT to state, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromScenePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun generateScene(
    state: GLTFState,
    bakeFps: Float = 30.0f,
    trimming: Boolean = false,
    removeImmutableTracks: Boolean = true,
  ): Node? {
    TransferContext.writeArguments(OBJECT to state, DOUBLE to bakeFps.toDouble(), BOOL to trimming, BOOL to removeImmutableTracks)
    TransferContext.callMethod(rawPtr, MethodBindings.generateScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun generateBuffer(state: GLTFState): PackedByteArray {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, MethodBindings.generateBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun writeToFilesystem(state: GLTFState, path: String): GodotError {
    TransferContext.writeArguments(OBJECT to state, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.writeToFilesystemPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class RootNodeMode(
    id: Long,
  ) {
    ROOT_NODE_MODE_SINGLE_ROOT(0),
    ROOT_NODE_MODE_KEEP_ROOT(1),
    ROOT_NODE_MODE_MULTI_ROOT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmOverloads
    public fun registerGltfDocumentExtension(extension: GLTFDocumentExtension,
        firstPriority: Boolean = false): Unit {
      TransferContext.writeArguments(OBJECT to extension, BOOL to firstPriority)
      TransferContext.callMethod(0, MethodBindings.registerGltfDocumentExtensionPtr, NIL)
    }

    public fun unregisterGltfDocumentExtension(extension: GLTFDocumentExtension): Unit {
      TransferContext.writeArguments(OBJECT to extension)
      TransferContext.callMethod(0, MethodBindings.unregisterGltfDocumentExtensionPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val appendFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_file")

    public val appendFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_buffer")

    public val appendFromScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "append_from_scene")

    public val generateScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "generate_scene")

    public val generateBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "generate_buffer")

    public val writeToFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "write_to_filesystem")

    public val setImageFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_image_format")

    public val getImageFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_image_format")

    public val setLossyQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_lossy_quality")

    public val getLossyQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_lossy_quality")

    public val setRootNodeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "set_root_node_mode")

    public val getRootNodeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "get_root_node_mode")

    public val registerGltfDocumentExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "register_gltf_document_extension")

    public val unregisterGltfDocumentExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFDocument", "unregister_gltf_document_extension")
  }
}
