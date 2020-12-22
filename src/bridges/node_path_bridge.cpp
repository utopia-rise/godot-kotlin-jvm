#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include "node_path_bridge.h"
#include "constants.h"
#include "bridges_utils.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(NodePathBridge)

NodePathBridge::NodePathBridge(jni::JObject p_wrapped, jni::JObject p_class_loader)
        : JavaInstanceWrapper(NODE_PATH_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method{
        "engine_call_constructor",
        "(Z)J",
        (void*) NodePathBridge::engine_call_constructor
    };
    jni::JNativeMethod engine_call_path_method{
        "engine_call_path",
        "(J)V",
        (void*) NodePathBridge::engine_call_path
    };
    jni::JNativeMethod engine_call_getName_method{
        "engine_call_getName",
        "(J)V",
        (void*) NodePathBridge::engine_call_getName
    };
    jni::JNativeMethod engine_call_getNameCount_method{
        "engine_call_getNameCount",
        "(J)V",
        (void*) NodePathBridge::engine_call_getNameCount
    };
    jni::JNativeMethod engine_call_getProperty_method{
        "engine_call_getProperty",
        "(J)V",
        (void*) NodePathBridge::engine_call_getProperty
    };
    jni::JNativeMethod engine_call_getSubname_method{
        "engine_call_getSubname",
        "(J)V",
        (void*) NodePathBridge::engine_call_getSubname
    };
    jni::JNativeMethod engine_call_getSubnameCount_method{
        "engine_call_getSubnameCount",
        "(J)V",
        (void*) NodePathBridge::engine_call_getSubnameCount
    };
    jni::JNativeMethod engine_call_isAbsolute_method{
        "engine_call_isAbsolute",
        "(J)V",
        (void*) NodePathBridge::engine_call_isAbsolute
    };
    jni::JNativeMethod engine_call_isEmpty_method{
        "engine_call_isEmpty",
        "(J)V",
        (void*) NodePathBridge::engine_call_isEmpty
    };
    jni::JNativeMethod engine_call_getConcatenatedSubnames_method{
        "engine_call_getConcatenatedSubnames",
        "(J)V",
        (void*) NodePathBridge::engine_call_getConcatenatedSubnames
    };
    jni::JNativeMethod engine_call_equals_method{
        "engine_call_equals",
        "(J)V",
        (void*) NodePathBridge::engine_call_equals
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_path_method);
    methods.push_back(engine_call_getName_method);
    methods.push_back(engine_call_getNameCount_method);
    methods.push_back(engine_call_getProperty_method);
    methods.push_back(engine_call_getSubname_method);
    methods.push_back(engine_call_getSubnameCount_method);
    methods.push_back(engine_call_isAbsolute_method);
    methods.push_back(engine_call_isEmpty_method);
    methods.push_back(engine_call_getConcatenatedSubnames_method);
    methods.push_back(engine_call_equals_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t NodePathBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance, jboolean has_param) {
    if (static_cast<bool>(has_param)) {
        jni::Env env{p_raw_env};
        Variant args[1] = {};
        GDKotlin::get_instance().transfer_context->read_args(env, args);
        return reinterpret_cast<uintptr_t>(new NodePath(args[0].operator String()));
    } else {
        return reinterpret_cast<uintptr_t>(new NodePath());
    }
}

void NodePathBridge::engine_call_path(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->operator String()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getName(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->get_name(args[0].operator signed int())};
    transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getNameCount(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->get_name_count()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getProperty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->get_as_property_path().operator String()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getSubname(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->get_subname(args[0].operator signed int())};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getSubnameCount(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->get_subname_count()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_isAbsolute(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->is_absolute()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_isEmpty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->is_empty()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_getConcatenatedSubnames(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant variant{from_uint_to_ptr<NodePath>(p_raw_ptr)->get_concatenated_subnames()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, variant);
}

void NodePathBridge::engine_call_equals(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env{p_raw_env};
    Variant args[1] = {};
    TransferContext* transfer_context{GDKotlin::get_instance().transfer_context};
    transfer_context->read_args(env, args);
    Variant variant{*from_uint_to_ptr<NodePath>(p_raw_ptr) == args[0].operator NodePath()};
    transfer_context->write_return_value(env, variant);
}

