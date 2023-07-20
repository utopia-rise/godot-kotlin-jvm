#include "string_name_bridge.h"

#include "bridges_utils.h"
#include "constants.h"
#include "gd_kotlin.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(StringNameBridge)

StringNameBridge::StringNameBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper<StringNameBridge>(STRING_NAME_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader) {
    jni::JNativeMethod engine_call_constructor_method {
      const_cast<char*>("engine_call_constructor"),
      const_cast<char*>("()J"),
      (void*) StringNameBridge::engine_call_constructor};
    jni::JNativeMethod engine_call_copy_constructor {
      const_cast<char*>("engine_call_copy_constructor"),
      const_cast<char*>("()J"),
      (void*) StringNameBridge::engine_call_copy_constructor};
    jni::JNativeMethod engine_call_constructor_string {
      const_cast<char*>("engine_call_constructor_string"),
      const_cast<char*>("()J"),
      (void*) StringNameBridge::engine_call_constructor_string};
    jni::JNativeMethod engine_call_operator_string {
      const_cast<char*>("engine_call_operator_string"),
      const_cast<char*>("(J)V"),
      (void*) StringNameBridge::engine_call_operator_string};

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);
    methods.push_back(engine_call_copy_constructor);
    methods.push_back(engine_call_constructor_string);
    methods.push_back(engine_call_operator_string);

    jni::Env env {jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

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
