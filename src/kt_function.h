#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H


#include <core/object.h>
#include "kt_property.h"
#include "kt_object.h"
#include "java_instance_wrapper.h"

struct KtFunctionInfo : public JavaInstanceWrapper<KtFunctionInfo> {
    KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunctionInfo();

    String name;
    List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;

    MethodInfo to_method_info() const;

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
        JNI_METHOD(GET_RETURN_VAL, "getReturnVal", "()Lgodot/core/KtPropertyInfo;")
)
};

class KtFunction : public JavaInstanceWrapper<KtFunction> {
private:
    int parameter_count;
    KtFunctionInfo* method_info;


public:
    KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunction();

    StringName get_name() const;
    int get_parameter_count() const;

    MethodInfo get_member_info();
    KtFunctionInfo* get_kt_function_info();

    Variant invoke(const KtObject* instance, const Variant** p_args, int args_count);

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_FUNCTION_INFO, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")
        JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
        JNI_METHOD(INVOKE, "invoke", "(Lgodot/core/KtObject;)Z")
)
};


#endif //GODOT_JVM_KT_FUNCTION_H
