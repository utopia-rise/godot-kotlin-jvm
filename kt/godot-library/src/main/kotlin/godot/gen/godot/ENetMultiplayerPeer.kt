// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ENetMultiplayerPeer : MultiplayerPeer() {
  public var serverRelay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_IS_SERVER_RELAY_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_SET_SERVER_RELAY_ENABLED, NIL)
    }

  public val host: ENetConnection?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_GET_HOST,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ENetConnection?
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENETMULTIPLAYERPEER, scriptIndex)
    return true
  }

  public fun createServer(
    port: Long,
    maxClients: Long = 32,
    maxChannels: Long = 0,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0
  ): GodotError {
    TransferContext.writeArguments(LONG to port, LONG to maxClients, LONG to maxChannels, LONG to inBandwidth, LONG to outBandwidth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CREATE_SERVER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun createClient(
    address: String,
    port: Long,
    channelCount: Long = 0,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0,
    localPort: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to address, LONG to port, LONG to channelCount, LONG to inBandwidth, LONG to outBandwidth, LONG to localPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CREATE_CLIENT,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun createMesh(uniqueId: Long): GodotError {
    TransferContext.writeArguments(LONG to uniqueId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CREATE_MESH,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun addMeshPeer(peerId: Long, host: ENetConnection): GodotError {
    TransferContext.writeArguments(LONG to peerId, OBJECT to host)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_ADD_MESH_PEER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun closeConnection(waitUsec: Long = 100): Unit {
    TransferContext.writeArguments(LONG to waitUsec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CLOSE_CONNECTION, NIL)
  }

  public fun setBindIp(ip: String): Unit {
    TransferContext.writeArguments(STRING to ip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_SET_BIND_IP,
        NIL)
  }

  public fun getPeer(id: Long): ENetPacketPeer? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_GET_PEER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ENetPacketPeer?
  }

  public companion object
}
