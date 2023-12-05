// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class AudioEffectInstance : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTINSTANCE, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _processSilence(): Boolean {
    throw NotImplementedError("_process_silence is not implemented for AudioEffectInstance")
  }

  public companion object

  internal object MethodBindings {
    public val _processPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectInstance", "_process")

    public val _processSilencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectInstance", "_process_silence")
  }
}
