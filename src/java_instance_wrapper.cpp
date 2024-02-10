#include "java_instance_wrapper.h"

JavaInstanceWrapper::JavaInstanceWrapper(jni::JObject p_wrapped) : is_weak(false) {
    // When created, it's a strong reference by default
    jni::Env env {jni::Jvm::current_env()};
    wrapped = p_wrapped.new_global_ref<jni::JObject>(env);
    p_wrapped.delete_local_ref(env);
}

JavaInstanceWrapper::~JavaInstanceWrapper() {
    jni::Env env {jni::Jvm::current_env()};
//    wrapped.delete_ref(env);
//    //TODO: ask tristan if it relly is relevant which what ref this is or if we can just delete it no matter what ref it is
    if (is_weak) {
        wrapped.delete_weak_ref(env);
    } else {
        wrapped.delete_global_ref(env);
    }
}

bool JavaInstanceWrapper::is_ref_weak() const {
    return is_weak;
}

void JavaInstanceWrapper::swap_to_strong_unsafe() {
    // Assume the reference is currently weak
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject new_ref = wrapped.new_global_ref<jni::JObject>(env);
    wrapped.delete_weak_ref(env);
    wrapped = new_ref;
    is_weak = false;
}

void JavaInstanceWrapper::swap_to_weak_unsafe() {
    // Assume the reference is currently strong
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject new_ref = wrapped.new_weak_ref<jni::JObject>(env);
    wrapped.delete_global_ref(env);
    wrapped = new_ref;
    is_weak = true;
}