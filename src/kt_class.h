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

    void get_method_list(List<MethodInfo>* p_list);
    void get_property_list(List<PropertyInfo>* p_list);

private:
    Map<StringName, KtFunction*> methods;
    Map<StringName, KtProperty*> properties;

    StringName get_name(jni::Env& env);
    StringName get_super_class(jni::Env& env);

    void fetch_methods(jni::Env& env);
    void fetch_properties(jni::Env& env);

    template <typename F, typename T>
    void get_member_list(List<F>* p_list, Map<StringName, T*>& members) {
        typename Map<StringName, T*>::Element* current { members.front() };
        while (current) {
            p_list->push_back(current->value()->get_member_info());
            current = current->next();
        }
    }

    template <class T>
    void delete_members(Map<StringName, T*>& members) {
        typename Map<StringName, T*>::Element* current { members.front() };
        while (current) {
            T* member { current->value() };
            delete member;
            current = current->next();
        }
        members.clear();
    }
};

#endif //GODOT_JVM_KTCLASS_H
