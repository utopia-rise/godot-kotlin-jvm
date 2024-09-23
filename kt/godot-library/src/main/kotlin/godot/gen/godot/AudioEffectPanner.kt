// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Determines how much of an audio signal is sent to the left and right buses.
 */
@GodotBaseType
public open class AudioEffectPanner : AudioEffect() {
  /**
   * Pan position. Value can range from -1 (fully left) to 1 (fully right).
   */
  public final inline var pan: Float
    @JvmName("panProperty")
    get() = getPan()
    @JvmName("panProperty")
    set(`value`) {
      setPan(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTPANNER, scriptIndex)
  }

  public final fun setPan(cpanume: Float): Unit {
    TransferContext.writeArguments(DOUBLE to cpanume.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPanPtr, NIL)
  }

  public final fun getPan(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPanPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setPanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPanner", "set_pan", 373806689)

    public val getPanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPanner", "get_pan", 1740695150)
  }
}
