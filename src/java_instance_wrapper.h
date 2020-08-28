#ifndef GODOT_JVM_JAVA_CLASS_WRAPPER_H
#define GODOT_JVM_JAVA_CLASS_WRAPPER_H
#include "jni/wrapper.h"
#include "core/ustring.h"
#include "core/map.h"


class JavaInstanceWrapper {
private:
    struct ClassCache {
        jni::JClass cls;
        Map<String, jni::MethodId> method_ids;
        Map<String, jni::MethodId> static_method_ids;
    };

    static Map<String, ClassCache> CLASS_CACHE;

    ClassCache& get_class_cache(jni::Env& env) const;
protected:
    String class_name;
    jni::JObject wrapped;
    jni::JObject class_loader;

    JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~JavaInstanceWrapper();

    jni::JClass& get_class(jni::Env& env);
    jni::MethodId get_method_id(jni::Env& env, const char* p_name, const char* p_signature) const;
    jni::MethodId get_static_method_id(jni::Env& env, const char* p_name, const char* p_signature);
};


#endif //GODOT_JVM_JAVA_CLASS_WRAPPER_H
