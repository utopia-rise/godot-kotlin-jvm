#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H


#include <core/object.h>
#include "java_instance_wrapper.h"

struct KtPropertyInfo : public JavaInstanceWrapper {
    KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;

    PropertyInfo toPropertyInfo();
};

struct KtFunctionInfo : public JavaInstanceWrapper{
    KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunctionInfo();

    String name;
    List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;

    MethodInfo toMethodInfo() const;
};

class KtFunction : public JavaInstanceWrapper {
private:
    StringName name;
    int parameterCount;
    KtFunctionInfo* methodInfo;

public:
    KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunction();

    StringName get_name() const;
    int getParameterCount() const;

    MethodInfo get_method_info();
};


#endif //GODOT_JVM_KT_FUNCTION_H
