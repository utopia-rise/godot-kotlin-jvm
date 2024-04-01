#include "node_path_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    NodePathBridge,
    INIT_NATIVE_METHOD("engine_call_constructor", "()J", NodePathBridge::engine_call_constructor)
    INIT_NATIVE_METHOD("engine_call_constructor_string", "()J", NodePathBridge::engine_call_constructor_string)
    INIT_NATIVE_METHOD("engine_call_constructor_node_path", "()J", NodePathBridge::engine_call_constructor_node_path)
    INIT_NATIVE_METHOD("engine_call_path", "(J)V", NodePathBridge::engine_call_path)
    INIT_NATIVE_METHOD("engine_call_getAsPropertyPath", "(J)V", NodePathBridge::engine_call_getAsPropertyPath)
    INIT_NATIVE_METHOD("engine_call_getName", "(J)V", NodePathBridge::engine_call_getName)
    INIT_NATIVE_METHOD("engine_call_getNameCount", "(J)V", NodePathBridge::engine_call_getNameCount)
    INIT_NATIVE_METHOD("engine_call_getSubname", "(J)V", NodePathBridge::engine_call_getSubname)
    INIT_NATIVE_METHOD("engine_call_getSubnameCount", "(J)V", NodePathBridge::engine_call_getSubnameCount)
    INIT_NATIVE_METHOD("engine_call_isAbsolute", "(J)V", NodePathBridge::engine_call_isAbsolute)
    INIT_NATIVE_METHOD("engine_call_hash", "(J)V",  NodePathBridge::engine_call_hash)
    INIT_NATIVE_METHOD("engine_call_isEmpty", "(J)V", NodePathBridge::engine_call_isEmpty)
    INIT_NATIVE_METHOD("engine_call_getConcatenatedSubnames", "(J)V", NodePathBridge::engine_call_getConcatenatedSubnames)
    INIT_NATIVE_METHOD("engine_call_getConcatenatedNames", "(J)V", NodePathBridge::engine_call_getConcatenatedNames)
    INIT_NATIVE_METHOD("engine_call_equals", "(J)V", NodePathBridge::engine_call_equals)
  )

// clang-format on

NodePathBridge::NodePathBridge(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

uintptr_t NodePathBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(NodePath));
}

uintptr_t NodePathBridge::engine_call_constructor_string(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(NodePath(args[0].operator String())));
}

uintptr_t NodePathBridge::engine_call_constructor_node_path(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(NodePath(args[0].operator NodePath())));
}

void NodePathBridge::engine_call_path(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->operator String()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getAsPropertyPath(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_as_property_path()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getName(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_name(args[0].operator signed int())};
    transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getNameCount(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_name_count()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getSubname(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_subname(args[0].operator signed int())};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getSubnameCount(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_subname_count()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_isAbsolute(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->is_absolute()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->hash()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_isEmpty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->is_empty()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getConcatenatedNames(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_concatenated_names()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getConcatenatedSubnames(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant variant {from_uint_to_ptr<NodePath>(p_raw_ptr)->get_concatenated_subnames()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant {*from_uint_to_ptr<NodePath>(p_raw_ptr) == args[0].operator NodePath()};
    transfer_context->write_return_value(env, variant);
}
