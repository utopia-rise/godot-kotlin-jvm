// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Playback component of [AudioStreamInteractive]. Contains functions to change the currently played
 * clip.
 */
@GodotBaseType
public open class AudioStreamPlaybackInteractive internal constructor() : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKINTERACTIVE, scriptIndex)
  }

  /**
   * Switch to a clip (by name).
   */
  public fun switchToClipByName(clipName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to clipName)
    TransferContext.callMethod(rawPtr, MethodBindings.switchToClipByNamePtr, NIL)
  }

  /**
   * Switch to a clip (by index).
   */
  public fun switchToClip(clipIndex: Int): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.switchToClipPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val switchToClipByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackInteractive", "switch_to_clip_by_name", 3304788590)

    public val switchToClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackInteractive", "switch_to_clip", 1286410249)
  }
}
