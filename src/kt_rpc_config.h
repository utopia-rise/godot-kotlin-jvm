#ifndef GODOT_JVM_KT_RPC_CONFIG_H
#define GODOT_JVM_KT_RPC_CONFIG_H


#include "modules/kotlin_jvm/src/jni/types.h"
#include "core/variant/dictionary.h"
#include "scene/main/multiplayer_api.h"
#include "java_instance_wrapper.h"

struct KtRpcConfig : public JavaInstanceWrapper<KtRpcConfig> {
    KtRpcConfig(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtRpcConfig() = default;

    MultiplayerAPI::RPCMode rpc_mode;
    MultiplayerPeer::TransferMode rpc_transfer_mode;
    bool rpc_call_local;
    int rpc_channel;

    Dictionary toRpcConfigDictionary();

DECLARE_JNI_METHODS(
    JNI_METHOD(GET_RPC_MODE_ID, "getRpcModeId", "()I")
    JNI_METHOD(GET_RPC_CALL_LOCAL, "getRpcCallLocal", "()Z")
    JNI_METHOD(GET_RPC_TRANSFER_MODE_ID, "getRpcTransferModeId", "()I")
    JNI_METHOD(GET_RPC_CHANNEL, "getRpcChannel", "()I")
)
};


#endif //GODOT_JVM_KT_RPC_CONFIG_H
