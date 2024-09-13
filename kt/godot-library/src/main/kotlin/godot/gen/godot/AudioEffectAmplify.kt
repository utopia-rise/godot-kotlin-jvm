// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Increases or decreases the volume being routed through the audio bus.
 */
@GodotBaseType
public open class AudioEffectAmplify : AudioEffect() {
  /**
   * Amount of amplification in decibels. Positive values make the sound louder, negative values
   * make it quieter. Value can range from -80 to 24.
   */
  public final inline var volumeDb: Float
    @JvmName("volumeDbProperty")
    get() = getVolumeDb()
    @JvmName("volumeDbProperty")
    set(`value`) {
      setVolumeDb(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTAMPLIFY, scriptIndex)
  }

  public final fun setVolumeDb(volume: Float): Unit {
    TransferContext.writeArguments(DOUBLE to volume.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVolumeDbPtr, NIL)
  }

  public final fun getVolumeDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVolumeDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectAmplify", "set_volume_db", 373806689)

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectAmplify", "get_volume_db", 1740695150)
  }
}
