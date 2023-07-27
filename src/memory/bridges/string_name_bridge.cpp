#include "string_name_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    StringNameBridge,
    INIT_NATIVE_METHOD("engine_call_constructor","()J", StringNameBridge::engine_call_constructor)
    INIT_NATIVE_METHOD("engine_call_copy_constructor","()J", StringNameBridge::engine_call_copy_constructor)
    INIT_NATIVE_METHOD("engine_call_constructor_string", ("()J"), StringNameBridge::engine_call_constructor_string)
    INIT_NATIVE_METHOD("engine_call_operator_string","(J)V", StringNameBridge::engine_call_operator_string)
  )

// clang-format on

StringNameBridge::StringNameBridge(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {}

uintptr_t StringNameBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(memnew(StringName));
}

uintptr_t StringNameBridge::engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(StringName(args[0].operator StringName())));
}

uintptr_t StringNameBridge::engine_call_constructor_string(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    GDKotlin::get_instance().transfer_context->read_args(env, args);
    return reinterpret_cast<uintptr_t>(memnew(StringName(args[0].operator String())));
}

void StringNameBridge::engine_call_operator_string(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result {from_uint_to_ptr<StringName>(p_raw_ptr)->operator String()};
    GDKotlin::get_instance().transfer_context->write_return_value(env, result);
}
