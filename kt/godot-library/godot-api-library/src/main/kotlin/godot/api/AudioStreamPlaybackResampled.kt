// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class AudioStreamPlaybackResampled : AudioStreamPlayback() {
  override fun new(scriptIndex: Int) {
    createNativeObject(92, scriptIndex)
  }

  public open fun _getStreamSamplingRate(): Float {
    throw NotImplementedError("_getStreamSamplingRate is not implemented for AudioStreamPlaybackResampled")
  }

  public final fun beginResample() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.beginResamplePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val beginResamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackResampled", "begin_resample", 3_218_959_716)
  }
}
