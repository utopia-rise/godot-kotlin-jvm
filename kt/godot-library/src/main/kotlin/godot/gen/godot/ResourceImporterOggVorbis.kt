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

@GodotBaseType
public open class ResourceImporterOggVorbis : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTEROGGVORBIS, scriptIndex)
    return true
  }

  public companion object {
    public fun loadFromBuffer(buffer: PackedByteArray): AudioStreamOggVorbis? {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
      TransferContext.callMethod(0, MethodBindings.loadFromBufferPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamOggVorbis?)
    }

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
