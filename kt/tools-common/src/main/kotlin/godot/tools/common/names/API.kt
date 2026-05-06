@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

object API {
    @Suppress("NOTHING_TO_INLINE")
    private inline fun apiName(simpleName: String) = ClassName(godotApiPackage, simpleName)

    @Suppress("NOTHING_TO_INLINE")
    private inline fun annotationName(simpleName: String) = ClassName(godotAnnotationPackage, simpleName)

    fun isFromPackage(fqName: String) = fqName.startsWith(godotApiPackage)

    val `object` = apiName("Object")
    val refCounted = apiName("RefCounted")
    val resource = apiName("Resource")
    val node = apiName("Node")
    val multiplayerApi = apiName("MultiplayerAPI")
    val multiplayerPeer = apiName("MultiplayerPeer")
    val connectFlags = `object`.nestedClass("ConnectFlags")
    val rpcMode = multiplayerApi.nestedClass("RPCMode")
    val transferMode = multiplayerPeer.nestedClass("TransferMode")
    val godotBaseType = annotationName("GodotBaseType")
    val coreTypeHelper = annotationName("CoreTypeHelper")
    val coreTypeLocalCopy = annotationName("CoreTypeLocalCopy")
    val call = `object`.member("call")
    val callRawName = `object`.member("callRawName")
    val callDeferred = `object`.member("callDeferred")
    val callDeferredRawName = `object`.member("callDeferredRawName")
    val callv = `object`.member("callv")
    val callvRawName = `object`.member("callvRawName")
    val connect = `object`.member("connect")
    val connectRawName = `object`.member("connectRawName")
    val disconnect = `object`.member("disconnect")
    val disconnectRawName = `object`.member("disconnectRawName")
    val rpc = node.member("rpc")
    val rpcId = node.member("rpcId")
    val rpcUnreliable = node.member("rpcUnreliable")
    val rpcUnreliableId = node.member("rpcUnreliableId")
    val rpcModeDisabled = rpcMode("DISABLED")
    val transferModeUnreliableOrdered = transferMode("UNRELIABLE_ORDERED")

    val ready = `object`.member("_ready")
    val enterTree = `object`.member("_enterTree")
    val exitTree = `object`.member("_exitTree")
    val process = `object`.member("_process")
    val physicsProcess = `object`.member("_physicsProcess")
    val input = `object`.member("_input")
    val unhandledInput = `object`.member("_unhandledInput")
    val draw = `object`.member("_draw")

    val notificationFunctions = listOf(
        ready,
        enterTree,
        exitTree,
        process,
        physicsProcess,
        input,
        unhandledInput,
        draw,
    )

    val objectCallableFunctions = setOf(
        call,
        callRawName,
        callDeferred,
        callDeferredRawName,
        callv,
        callvRawName,
        connect,
        connectRawName,
        disconnect,
        disconnectRawName,
    )

    val rpcFunctions = setOf(
        rpc,
        rpcId,
        rpcUnreliable,
        rpcUnreliableId,
    )

    fun connectFlag(simpleName: String): MemberName = connectFlags.member(simpleName)

    fun rpcMode(simpleName: String): MemberName = rpcMode.member(simpleName)

    fun transferMode(simpleName: String): MemberName = transferMode.member(simpleName)
}
