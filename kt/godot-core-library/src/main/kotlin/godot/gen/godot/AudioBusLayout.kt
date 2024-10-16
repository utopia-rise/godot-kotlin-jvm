// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Stores position, muting, solo, bypass, effects, effect position, volume, and the connections
 * between buses. See [AudioServer] for usage.
 */
@GodotBaseType
public open class AudioBusLayout : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_AUDIOBUSLAYOUT, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
