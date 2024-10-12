// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_STREAMPEEREXTENSION_INDEX: Int = 621

@GodotBaseType
public open class StreamPeerExtension : StreamPeer() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_STREAMPEEREXTENSION_INDEX, scriptIndex)
  }

  public open fun _getAvailableBytes(): Int {
    throw NotImplementedError("_get_available_bytes is not implemented for StreamPeerExtension")
  }

  public companion object

  public object MethodBindings
}
