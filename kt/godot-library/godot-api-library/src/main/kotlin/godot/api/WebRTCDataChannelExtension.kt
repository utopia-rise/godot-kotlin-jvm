// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Error
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public abstract class WebRTCDataChannelExtension : WebRTCDataChannel() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(859, scriptIndex)
  }

  public abstract fun _getAvailablePacketCount(): Int

  public abstract fun _getMaxPacketSize(): Int

  public abstract fun _poll(): Error

  public abstract fun _close(): Unit

  public abstract fun _setWriteMode(pWriteMode: WebRTCDataChannel.WriteMode): Unit

  public abstract fun _getWriteMode(): WebRTCDataChannel.WriteMode

  public abstract fun _wasStringPacket(): Boolean

  public abstract fun _getReadyState(): WebRTCDataChannel.ChannelState

  public abstract fun _getLabel(): String

  public abstract fun _isOrdered(): Boolean

  public abstract fun _getId(): Int

  public abstract fun _getMaxPacketLifeTime(): Int

  public abstract fun _getMaxRetransmits(): Int

  public abstract fun _getProtocol(): String

  public abstract fun _isNegotiated(): Boolean

  public abstract fun _getBufferedAmount(): Int

  public companion object

  public object MethodBindings
}
