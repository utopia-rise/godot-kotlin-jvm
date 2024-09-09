// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class AudioStreamPlaybackResampled : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKRESAMPLED, scriptIndex)
  }

  public open fun _getStreamSamplingRate(): Float {
    throw NotImplementedError("_get_stream_sampling_rate is not implemented for AudioStreamPlaybackResampled")
  }

  public fun beginResample(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginResamplePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val beginResamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackResampled", "begin_resample")
  }
}
