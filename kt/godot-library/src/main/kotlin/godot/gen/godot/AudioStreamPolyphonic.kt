// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * AudioStream that lets the user play custom streams at any time from code, simultaneously using a
 * single player.
 * Playback control is done via the [AudioStreamPlaybackPolyphonic] instance set inside the player,
 * which can be obtained via [AudioStreamPlayer.getStreamPlayback],
 * [AudioStreamPlayer2D.getStreamPlayback] or [AudioStreamPlayer3D.getStreamPlayback] methods.
 * Obtaining the playback instance is only valid after the `stream` property is set as an
 * [AudioStreamPolyphonic] in those players.
 */
@GodotBaseType
public open class AudioStreamPolyphonic : AudioStream() {
  /**
   * Maximum amount of simultaneous streams that can be played.
   */
  public final inline var polyphony: Int
    @JvmName("polyphonyProperty")
    get() = getPolyphony()
    @JvmName("polyphonyProperty")
    set(`value`) {
      setPolyphony(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPOLYPHONIC, scriptIndex)
  }

  public final fun setPolyphony(voices: Int): Unit {
    TransferContext.writeArguments(LONG to voices.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPolyphonyPtr, NIL)
  }

  public final fun getPolyphony(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolyphonyPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPolyphonic", "set_polyphony", 1286410249)

    public val getPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPolyphonic", "get_polyphony", 3905245786)
  }
}
