// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class AudioEffectInstance : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTINSTANCE)
  }

  /**
   *
   */
  public open fun _processSilence(): Boolean {
    throw NotImplementedError("_process_silence·is·not·implemented·for·AudioEffectInstance")
  }

  public companion object
}
