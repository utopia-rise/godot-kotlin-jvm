// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_AUDIOSTREAMPLAYBACKRESAMPLED_INDEX: Int = 126

@GodotBaseType
public open class AudioStreamPlaybackResampled : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMPLAYBACKRESAMPLED_INDEX, scriptIndex)
  }

  public open fun _getStreamSamplingRate(): Float {
    throw NotImplementedError("_get_stream_sampling_rate is not implemented for AudioStreamPlaybackResampled")
  }

  public final fun beginResample(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.beginResamplePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val beginResamplePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackResampled", "begin_resample", 3218959716)
  }
}
