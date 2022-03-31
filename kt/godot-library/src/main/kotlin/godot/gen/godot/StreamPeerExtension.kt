// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class StreamPeerExtension : StreamPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STREAMPEEREXTENSION)
  }

  /**
   *
   */
  public open fun _getAvailableBytes(): Long {
    throw NotImplementedError("_get_available_bytes is not implemented for StreamPeerExtension")
  }

  public companion object
}
