#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H


#include <core/object.h>
#include "java_instance_wrapper.h"
#include "kt_property.h"

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
    int parameterCount;
    KtFunctionInfo* methodInfo;

    String generateMethodSignature();

public:
    KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunction();

    StringName get_name() const;
    int getParameterCount() const;

    MethodInfo get_member_info();
    KtFunctionInfo* get_kt_function_info();

    Variant invoke(jni::JObject instance, const Variant** p_args);
};


#endif //GODOT_JVM_KT_FUNCTION_H
