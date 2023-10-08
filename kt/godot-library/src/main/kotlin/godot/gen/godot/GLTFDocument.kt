// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class GLTFDocument : Resource() {
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_APPEND_FROM_FILE, LONG)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_APPEND_FROM_BUFFER,
        LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun appendFromScene(
    node: Node,
    state: GLTFState,
    flags: Long = 0,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to node, OBJECT to state, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_APPEND_FROM_SCENE,
        LONG)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_GENERATE_SCENE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public fun generateBuffer(state: GLTFState): PackedByteArray {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_GENERATE_BUFFER,
        PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public fun writeToFilesystem(state: GLTFState, path: String): GodotError {
    TransferContext.writeArguments(OBJECT to state, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_WRITE_TO_FILESYSTEM,
        LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object {
    @JvmOverloads
    public fun registerGltfDocumentExtension(extension: GLTFDocumentExtension,
        firstPriority: Boolean = false): Unit {
      TransferContext.writeArguments(OBJECT to extension, BOOL to firstPriority)
      TransferContext.callMethod(0,
          ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_REGISTER_GLTF_DOCUMENT_EXTENSION, NIL)
    }

    public fun unregisterGltfDocumentExtension(extension: GLTFDocumentExtension): Unit {
      TransferContext.writeArguments(OBJECT to extension)
      TransferContext.callMethod(0,
          ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_UNREGISTER_GLTF_DOCUMENT_EXTENSION, NIL)
    }
  }
}
