
#ifndef GODOT_JVM_RPC_CONFIG_H
#define GODOT_JVM_RPC_CONFIG_H

#include <scene/main/multiplayer_api.h>

struct RpcConfig {
    MultiplayerAPI::RPCMode rpc_mode;
    MultiplayerPeer::TransferMode rpc_transfer_mode;
    bool rpc_call_local;
    int rpc_channel;
};


#endif //GODOT_JVM_RPC_CONFIG_H
