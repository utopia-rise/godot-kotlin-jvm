#include "kt_rpc_config.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    KtRpcConfig,
    INIT_JNI_METHOD(GET_RPC_MODE_ID)
    INIT_JNI_METHOD(GET_RPC_CALL_LOCAL)
    INIT_JNI_METHOD(GET_RPC_TRANSFER_MODE_ID)
    INIT_JNI_METHOD(GET_RPC_CHANNEL)
)

// clang-format on

KtRpcConfig::KtRpcConfig(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};

    jni::MethodId getRPCModeIdMethod {jni_methods.GET_RPC_MODE_ID.method_id};
    rpc_mode = static_cast<MultiplayerAPI::RPCMode>(wrapped.call_int_method(env, getRPCModeIdMethod));
    jni::MethodId getRPCCallLocalMethod {jni_methods.GET_RPC_CALL_LOCAL.method_id};
    rpc_call_local = wrapped.call_boolean_method(env, getRPCCallLocalMethod);
    jni::MethodId getRPCTransferModeIdMethod {jni_methods.GET_RPC_TRANSFER_MODE_ID.method_id};
    rpc_transfer_mode = static_cast<MultiplayerPeer::TransferMode>(wrapped.call_int_method(env, getRPCTransferModeIdMethod));
    jni::MethodId getRPCChannelMethod {jni_methods.GET_RPC_CHANNEL.method_id};
    rpc_channel = wrapped.call_int_method(env, getRPCChannelMethod);
}

Dictionary KtRpcConfig::toRpcConfigDictionary() {
    Dictionary rpc_config {};

    // for key's to set, take a look at SceneRPCInterface::_parse_rpc_config and/or GDScriptParser::rpc_annotation
    rpc_config["rpc_mode"] = rpc_mode;
    rpc_config["transfer_mode"] = rpc_transfer_mode;
    rpc_config["call_local"] = rpc_call_local;
    rpc_config["channel"] = rpc_channel;

    return rpc_config;
}
