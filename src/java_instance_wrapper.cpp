#include <core/print_string.h>
#include <core/variant.h>
#include "java_instance_wrapper.h"
#include "core/string_builder.h"


JavaInstanceWrapper::JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped,
                                         jni::JObject p_class_loader) : java_class_name(p_class_name),
                                         should_refresh(false) {
    auto env = jni::Jvm::current_env();
    wrapped = p_wrapped.new_global_ref<jni::JObject>(env);
    class_loader = p_class_loader.new_global_ref<jni::JObject>(env);
    load_jni_class(env);
}

JavaInstanceWrapper::~JavaInstanceWrapper() {
    auto env = jni::Jvm::current_env();
    wrapped.delete_global_ref(env);
    class_loader.delete_global_ref(env);
}

jni::JClass& JavaInstanceWrapper::get_class(jni::Env& env) {
    if (should_refresh) {
        load_jni_class(env);
        should_refresh = false;
    }
    return jni_class;
}

jni::MethodId JavaInstanceWrapper::get_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature) {
    if (!method_signature.method_id) {
        method_signature.init(env, get_class(env));
    }
    return method_signature.method_id;
}

jni::MethodId JavaInstanceWrapper::get_static_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature) {
    if (method_signature.method_id) {
        method_signature.init(env, get_class(env));
    }
    return method_signature.method_id;
}

void JavaInstanceWrapper::load_jni_class(jni::Env& env) {
    jni_class = env.load_class(java_class_name.utf8().get_data(), class_loader).new_global_ref<jni::JClass>(env);
}

void JavaInstanceWrapper::jni_refresh() {
    should_refresh = true;
}
