#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H


#include <core/object.h>
#include "java_instance_wrapper.h"

struct KtFunctionInfo : public MethodInfo, JavaInstanceWrapper {
    KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunctionInfo() = default;
};

class KtFunction : JavaInstanceWrapper {
private:
    StringName name;
    KtFunctionInfo* methodInfo;

public:
    KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunction();

    StringName get_name() const;

    MethodInfo* get_method_info();
};


#endif //GODOT_JVM_KT_FUNCTION_H
