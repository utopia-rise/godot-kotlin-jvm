#include <core/print_string.h>
#include <core/variant.h>
#include "java_instance_wrapper.h"
#include "core/string_builder.h"

HashMap<StringName, JavaInstanceWrapper::ClassCache> JavaInstanceWrapper::CLASS_CACHE = HashMap<StringName, ClassCache>();

JavaInstanceWrapper::JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped,
                                         jni::JObject p_class_loader) : java_class_name(p_class_name) {
    auto env = jni::Jvm::current_env();
    wrapped = p_wrapped.new_global_ref<jni::JObject>(env);
    class_loader = p_class_loader.new_global_ref<jni::JObject>(env);
}

JavaInstanceWrapper::~JavaInstanceWrapper() {
    auto env = jni::Jvm::current_env();
    wrapped.delete_global_ref(env);
    class_loader.delete_global_ref(env);
}

jni::JClass& JavaInstanceWrapper::get_class(jni::Env& env) {
    return get_class_cache(env).cls;
}

jni::MethodId JavaInstanceWrapper::get_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature) const {
    if (!method_signature.method_id) {
        method_signature.init(env, get_class_cache(env).cls);
    }
    return method_signature.method_id;
}

jni::MethodId JavaInstanceWrapper::get_static_method_id(jni::Env& env, const char* p_name, const char* p_signature) {
    ClassCache& class_cache = get_class_cache(env);
    char key[100];
    strcpy_s(key, p_name);
    strcat_s(key, p_signature);
    if (!class_cache.static_method_ids.has(key)) {
        class_cache.static_method_ids[key] = class_cache.cls.get_method_id(env, p_name, p_signature);
    }
    return class_cache.static_method_ids[key];
}

JavaInstanceWrapper::ClassCache& JavaInstanceWrapper::get_class_cache(jni::Env& env) const{
    if (!CLASS_CACHE.has(java_class_name)) {
        ClassCache class_cache;
        class_cache.cls = env.load_class(java_class_name.utf8().get_data(), class_loader)
                .new_global_ref<jni::JClass>(env);
        CLASS_CACHE[java_class_name] = class_cache;
    }

    return CLASS_CACHE[java_class_name];
}
