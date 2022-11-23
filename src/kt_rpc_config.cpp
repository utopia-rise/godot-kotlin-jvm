#include "kt_rpc_config.h"

JNI_INIT_STATICS_FOR_CLASS(KtRpcConfig)

KtRpcConfig::KtRpcConfig(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtRpcConfig", p_wrapped, p_class_loader) {
    jni::Env env { jni::Jvm::current_env() };

    jni::MethodId getRPCModeIdMethod{get_method_id(env, jni_methods.GET_RPC_MODE_ID)};
    rpc_mode = static_cast<MultiplayerAPI::RPCMode>(wrapped.call_int_method(env, getRPCModeIdMethod));
    jni::MethodId getRPCCallLocalMethod{get_method_id(env, jni_methods.GET_RPC_CALL_LOCAL)};
    rpc_call_local = wrapped.call_boolean_method(env, getRPCCallLocalMethod);
    jni::MethodId getRPCTransferModeIdMethod{get_method_id(env, jni_methods.GET_RPC_TRANSFER_MODE_ID)};
    rpc_transfer_mode = static_cast<MultiplayerPeer::TransferMode>(wrapped.call_int_method(env, getRPCTransferModeIdMethod));
    jni::MethodId getRPCChannelMethod{get_method_id(env, jni_methods.GET_RPC_CHANNEL)};
    rpc_channel = wrapped.call_int_method(env, getRPCChannelMethod);
}

Dictionary KtRpcConfig::toRpcConfigDictionary() {
    Dictionary rpc_config{};

    // for key's to set, take a look at SceneRPCInterface::_parse_rpc_config and/or GDScriptParser::rpc_annotation
    rpc_config["rpc_mode"] = rpc_mode;
    rpc_config["transfer_mode"] = rpc_transfer_mode;
    rpc_config["call_local"] = rpc_call_local;
    rpc_config["channel"] = rpc_channel;

    return rpc_config;
}
