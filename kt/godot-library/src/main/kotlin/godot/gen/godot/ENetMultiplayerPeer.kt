// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ENetMultiplayerPeer : MultiplayerPeer() {
  public val host: ENetConnection?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHostPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ENetConnection?)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENETMULTIPLAYERPEER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun createServer(
    port: Int,
    maxClients: Int = 32,
    maxChannels: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), LONG to maxClients.toLong(), LONG to maxChannels.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createServerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun createClient(
    address: String,
    port: Int,
    channelCount: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
    localPort: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(STRING to address, LONG to port.toLong(), LONG to channelCount.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong(), LONG to localPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createClientPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun createMesh(uniqueId: Int): GodotError {
    TransferContext.writeArguments(LONG to uniqueId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createMeshPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun addMeshPeer(peerId: Int, host: ENetConnection): GodotError {
    TransferContext.writeArguments(LONG to peerId.toLong(), OBJECT to host)
    TransferContext.callMethod(rawPtr, MethodBindings.addMeshPeerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setBindIp(ip: String): Unit {
    TransferContext.writeArguments(STRING to ip)
    TransferContext.callMethod(rawPtr, MethodBindings.setBindIpPtr, NIL)
  }

  public fun getPeer(id: Int): ENetPacketPeer? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPeerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ENetPacketPeer?)
  }

  public companion object

  internal object MethodBindings {
    public val createServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "create_server")

    public val createClientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "create_client")

    public val createMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "create_mesh")

    public val addMeshPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "add_mesh_peer")

    public val setBindIpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "set_bind_ip")

    public val getHostPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "get_host")

    public val getPeerPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetMultiplayerPeer", "get_peer")
  }
}
