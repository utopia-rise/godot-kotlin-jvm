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
  public open fun _getData(
    rBuffer: `uint8_t*`,
    rBytes: Long,
    rReceived: `int32_t*`
  ): Long {
    throw NotImplementedError("_get_data is not implemented for StreamPeerExtension")
  }

  /**
   *
   */
  public open fun _getPartialData(
    rBuffer: `uint8_t*`,
    rBytes: Long,
    rReceived: `int32_t*`
  ): Long {
    throw NotImplementedError("_get_partial_data is not implemented for StreamPeerExtension")
  }

  /**
   *
   */
  public open fun _putData(
    pData: `const uint8_t*`,
    pBytes: Long,
    rSent: `int32_t*`
  ): Long {
    throw NotImplementedError("_put_data is not implemented for StreamPeerExtension")
  }

  /**
   *
   */
  public open fun _putPartialData(
    pData: `const uint8_t*`,
    pBytes: Long,
    rSent: `int32_t*`
  ): Long {
    throw NotImplementedError("_put_partial_data is not implemented for StreamPeerExtension")
  }

  /**
   *
   */
  public open fun _getAvailableBytes(): Long {
    throw NotImplementedError("_get_available_bytes is not implemented for StreamPeerExtension")
  }

  public companion object
}
