#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H


#include <core/object.h>
#include "java_instance_wrapper.h"
#include "kt_property.h"
#include "kt_object.h"

struct KtFunctionInfo : public JavaInstanceWrapper {
    KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunctionInfo();

    String name;
    List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;

    MethodInfo to_method_info() const;
};

class KtFunction : public JavaInstanceWrapper {
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

    Variant invoke(const KtObject* instance, const Variant** p_args);
};


#endif //GODOT_JVM_KT_FUNCTION_H
