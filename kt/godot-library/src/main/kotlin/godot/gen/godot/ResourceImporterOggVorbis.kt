// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Ogg Vorbis is a lossy audio format, with better audio quality compared to [ResourceImporterMP3]
 * at a given bitrate.
 * In most cases, it's recommended to use Ogg Vorbis over MP3. However, if you're using a MP3 sound
 * source with no higher quality source available, then it's recommended to use the MP3 file directly
 * to avoid double lossy compression.
 * Ogg Vorbis requires more CPU to decode than [ResourceImporterWAV]. If you need to play a lot of
 * simultaneous sounds, it's recommended to use WAV for those sounds instead, especially if targeting
 * low-end devices.
 */
@GodotBaseType
public open class ResourceImporterOggVorbis : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTEROGGVORBIS, scriptIndex)
    return true
  }

  public companion object {
    /**
     * This method loads audio data from a PackedByteArray buffer into an AudioStreamOggVorbis
     * object.
     */
    public fun loadFromBuffer(buffer: PackedByteArray): AudioStreamOggVorbis? {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
      TransferContext.callMethod(0, MethodBindings.loadFromBufferPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamOggVorbis?)
    }

    /**
     * This method loads audio data from a file into an AudioStreamOggVorbis object. The file path
     * is provided as a string.
     */
    public fun loadFromFile(path: String): AudioStreamOggVorbis? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamOggVorbis?)
    }
  }

  internal object MethodBindings {
    public val loadFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceImporterOggVorbis", "load_from_buffer")

    public val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceImporterOggVorbis", "load_from_file")
  }
}
