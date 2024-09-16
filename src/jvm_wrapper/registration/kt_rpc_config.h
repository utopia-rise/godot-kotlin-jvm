#ifndef GODOT_JVM_KT_RPC_CONFIG_H
#define GODOT_JVM_KT_RPC_CONFIG_H

#include "core/variant/dictionary.h"
#include "jni/types.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "scene/main/multiplayer_api.h"

JVM_INSTANCE_WRAPPER(KtRpcConfig, "godot.core.KtRpcConfig") {
    JVM_CLASS(KtRpcConfig)

    // clang-format off
    JNI_INT_METHOD(GET_RPC_MODE_ID)
    JNI_BOOLEAN_METHOD(GET_RPC_CALL_LOCAL)
    JNI_INT_METHOD(GET_RPC_TRANSFER_MODE_ID)
    JNI_INT_METHOD(GET_RPC_CHANNEL)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_RPC_MODE_ID, "getRpcModeId", "()I")
        INIT_JNI_METHOD(GET_RPC_CALL_LOCAL, "getRpcCallLocal", "()Z")
        INIT_JNI_METHOD(GET_RPC_TRANSFER_MODE_ID, "getRpcTransferModeId", "()I")
        INIT_JNI_METHOD(GET_RPC_CHANNEL, "getRpcChannel", "()I")
    )
    // clang-format on

public:
    explicit KtRpcConfig(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtRpcConfig() = default;

    MultiplayerAPI::RPCMode rpc_mode;
    MultiplayerPeer::TransferMode rpc_transfer_mode;
    bool rpc_call_local;
    int rpc_channel;

    Dictionary toRpcConfigDictionary();


};

#endif// GODOT_JVM_KT_RPC_CONFIG_H
