// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.VariantParser.NIL
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField

@GodotBaseType
public open class AudioStreamPlaybackResampled : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(92, scriptIndex)
  }

  public open fun _getStreamSamplingRate(): Float {
    throw NotImplementedError("_getStreamSamplingRate is not implemented for AudioStreamPlaybackResampled")
  }

  public final fun beginResample(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.beginResamplePtr, NIL)
  }

  public companion object {
    @JvmField
    public val beginResampleName: MethodStringName0<AudioStreamPlaybackResampled, Unit> =
        MethodStringName0<AudioStreamPlaybackResampled, Unit>("begin_resample")
  }

  public object MethodBindings {
    internal val beginResamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackResampled", "begin_resample", 3218959716)
  }
}
