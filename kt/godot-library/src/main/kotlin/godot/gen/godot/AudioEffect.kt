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
 * Audio effect for audio.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/527](https://godotengine.org/asset-library/asset/527)
 *
 * Base resource for audio bus. Applies an audio effect on the bus that the resource is applied on.
 */
@GodotBaseType
public open class AudioEffect : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECT, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("_instantiate is not implemented for AudioEffect")
  }

  public companion object

  internal object MethodBindings {
    public val _instantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffect", "_instantiate")
  }
}
