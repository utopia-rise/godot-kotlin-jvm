#ifndef GODOT_JVM_JAVA_CLASS_WRAPPER_H
#define GODOT_JVM_JAVA_CLASS_WRAPPER_H
#include "jni/wrapper.h"
#include "core/ustring.h"
#include "core/hash_map.h"


class JavaInstanceWrapper {
private:
    jni::JClass jni_class;
    bool should_refresh;

    void load_jni_class(jni::Env& env);
protected:
    String java_class_name;
    jni::JObject wrapped;
    jni::JObject class_loader;

    JavaInstanceWrapper(const char* p_class_name, jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~JavaInstanceWrapper();

    jni::JClass& get_class(jni::Env& env);
    jni::MethodId get_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature);
    jni::MethodId get_static_method_id(jni::Env& env, jni::JavaMethodSignature& method_signature);

public:
    void jni_refresh();

};


#endif //GODOT_JVM_JAVA_CLASS_WRAPPER_H
