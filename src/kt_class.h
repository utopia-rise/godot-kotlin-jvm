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
    HashMap<StringName, KtFunction*> methods;
    HashMap<StringName, KtProperty*> properties;

    StringName get_name(jni::Env& env);
    StringName get_super_class(jni::Env& env);

    void fetch_methods(jni::Env& env);
    void fetch_properties(jni::Env& env);

    template <typename F, typename T>
    void get_member_list(List<F>* p_list, HashMap<StringName, T*>& members) {
        List<StringName> keys;
        members.get_key_list(&keys);

        for (auto i = 0; i < keys.size(); i++) {
            p_list->push_back(members.get(keys[i])->get_member_info());
        }
    }

    template <class T>
    void delete_members(HashMap<StringName, T*>& members) {
        List<StringName> keys;
        members.get_key_list(&keys);

        for (auto i = 0; i < keys.size(); i++) {
            delete members.get(keys[i]);
        }

        members.clear();
    }
};

#endif //GODOT_JVM_KTCLASS_H
