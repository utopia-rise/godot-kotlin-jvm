#include "java_instance_wrapper.h"
#include "core/string_builder.h"

Map<String, JavaInstanceWrapper::ClassCache> JavaInstanceWrapper::CLASS_CACHE = Map<String, ClassCache>();

JavaInstanceWrapper::JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped,
                                         jni::JObject p_class_loader) : class_name(p_class_name) {
    auto& env = jni::Jvm::currentEnv();
    wrapped = p_wrapped.newGlobalRef(env);
    class_loader = p_class_loader.newGlobalRef(env);
}

JavaInstanceWrapper::~JavaInstanceWrapper() {
    auto& env = jni::Jvm::currentEnv();
    wrapped.deleteGlobalRef(env);
    class_loader.deleteGlobalRef(env);
}

jni::JClass& JavaInstanceWrapper::get_class(jni::Env& env) {
    return get_class_cache(env).cls;
}

jni::MethodId JavaInstanceWrapper::get_method_id(jni::Env& env, const char* p_name, const char* p_signature) {
    auto& class_cache = get_class_cache(env);
    auto key = StringBuilder()
            .append(p_name)
            .append(p_signature)
            .as_string();
    if (!class_cache.method_ids.has(key)) {
        class_cache.method_ids[key] = class_cache.cls.getMethodId(env, p_name, p_signature);
    }
    return class_cache.method_ids[key];
}

jni::MethodId JavaInstanceWrapper::get_static_method_id(jni::Env& env, const char* p_name, const char* p_signature) {
    auto& class_cache = get_class_cache(env);
    auto key = StringBuilder()
            .append(p_name)
            .append(p_signature)
            .as_string();
    if (!class_cache.static_method_ids.has(key)) {
        class_cache.static_method_ids[key] = class_cache.cls.getMethodId(env, p_name, p_signature);
    }
    return class_cache.static_method_ids[key];
}

JavaInstanceWrapper::ClassCache& JavaInstanceWrapper::get_class_cache(jni::Env& env) {
    if (!CLASS_CACHE.has(class_name)) {
        ClassCache class_cache;
        class_cache.cls = env.load_class(reinterpret_cast<const char*>(class_name.c_str()), class_loader);
        CLASS_CACHE[class_name] = class_cache;
    }

    return CLASS_CACHE[class_name];
}
