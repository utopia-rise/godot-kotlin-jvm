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
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
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
    createNativeObject(122, scriptIndex)
  }

  /**
   * Switch to a clip (by name).
   */
  public final fun switchToClipByName(clipName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to clipName)
    TransferContext.callMethod(ptr, MethodBindings.switchToClipByNamePtr, NIL)
  }

  /**
   * Switch to a clip (by index).
   */
  public final fun switchToClip(clipIndex: Int): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.switchToClipPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val switchToClipByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackInteractive", "switch_to_clip_by_name", 3304788590)

    internal val switchToClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackInteractive", "switch_to_clip", 1286410249)
  }
}
