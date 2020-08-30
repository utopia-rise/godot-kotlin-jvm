#ifndef GODOT_JVM_KTCLASS_H
#define GODOT_JVM_KTCLASS_H

#include "jni/wrapper.h"
#include <core/reference.h>
#include "java_instance_wrapper.h"
#include "kt_object.h"
#include "kt_function.h"

class KtClass : public JavaInstanceWrapper {
public:
    StringName name;
    StringName super_class;

    KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtClass();

    KtObject* create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner);
    KtFunction* get_method(const StringName& methodName);
    KtClass* get_parent_class() const;
    KtClass* get_native_base() const;

    const Vector<KtFunction*> get_method_list();

private:
    Map<StringName, KtFunction*> methods;
    Vector<KtFunction*> method_list;

    StringName get_name(jni::Env& env);
    StringName get_super_class(jni::Env& env);

    void fetch_methods(jni::Env& env);
};

#endif //GODOT_JVM_KTCLASS_H
