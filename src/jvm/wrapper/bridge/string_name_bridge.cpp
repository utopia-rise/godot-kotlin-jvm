#include "string_name_bridge.h"

#include "bridges_utils.h"
#include "jvm/wrapper/memory/transfer_context.h"

using namespace bridges;

uintptr_t StringNameBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(StringName()));
}

uintptr_t StringNameBridge::engine_call_copy_constructor(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(StringName(args[0].operator StringName())));
}

uintptr_t StringNameBridge::engine_call_constructor_string(JNIEnv* p_raw_env, jobject p_instance) {
    jni::Env env {p_raw_env};
    Variant args[1] = {};
    TransferContext::get_instance().read_args(env, args);
    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(StringName(args[0].operator String())));
}

void StringNameBridge::engine_call_operator_string(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    Variant result = from_uint_to_ptr<StringName>(p_raw_ptr)->operator String();
    TransferContext::get_instance().write_return_value(env, result);
}

StringNameBridge::~StringNameBridge() = default;