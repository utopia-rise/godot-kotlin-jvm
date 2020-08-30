#ifndef GODOT_JVM_KTCLASS_H
#define GODOT_JVM_KTCLASS_H

#include "jni/wrapper.h"
#include <core/reference.h>
#include "java_instance_wrapper.h"
#include "kt_object.h"
#include "kt_method.h"

class KtClass : public JavaInstanceWrapper {
public:
    StringName name;
    StringName super_class;

    Map<StringName, KtMethod*> methods;

    KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtClass();

    KtObject* create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner);

    KtMethod* get_method(const StringName& methodName);

private:
    StringName get_name(jni::Env& env);
    StringName get_super_class(jni::Env& env);
};

#endif //GODOT_JVM_KTCLASS_H
