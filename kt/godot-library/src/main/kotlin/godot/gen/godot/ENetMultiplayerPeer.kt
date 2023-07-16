// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ENetMultiplayerPeer : MultiplayerPeer() {
  public val host: ENetConnection?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_GET_HOST,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ENetConnection?)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENETMULTIPLAYERPEER, scriptIndex)
    return true
  }

  public fun createServer(
    port: Int,
    maxClients: Int = 32,
    maxChannels: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), LONG to maxClients.toLong(), LONG to maxChannels.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CREATE_SERVER,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun createClient(
    address: String,
    port: Int,
    channelCount: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
    localPort: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(STRING to address, LONG to port.toLong(), LONG to channelCount.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong(), LONG to localPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CREATE_CLIENT,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun createMesh(uniqueId: Int): GodotError {
    TransferContext.writeArguments(LONG to uniqueId.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_CREATE_MESH,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun addMeshPeer(peerId: Int, host: ENetConnection): GodotError {
    TransferContext.writeArguments(LONG to peerId.toLong(), OBJECT to host)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_ADD_MESH_PEER,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun setBindIp(ip: String): Unit {
    TransferContext.writeArguments(STRING to ip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_SET_BIND_IP,
        NIL)
  }

  public fun getPeer(id: Int): ENetPacketPeer? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETMULTIPLAYERPEER_GET_PEER,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ENetPacketPeer?)
  }

  public companion object
}
