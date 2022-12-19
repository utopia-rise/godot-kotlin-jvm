// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class StreamPeerExtension : StreamPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEEREXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _getAvailableBytes(): Long {
    throw NotImplementedError("_get_available_bytes is not implemented for StreamPeerExtension")
  }

  public companion object
}
