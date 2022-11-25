#ifndef GODOT_JVM_KTCLASS_H
#define GODOT_JVM_KTCLASS_H

#include "jni/wrapper.h"
#include <core/reference.h>
#include "kt_object.h"
#include "kt_function.h"
#include "kt_signal_info.h"
#include "java_instance_wrapper.h"
#include "kt_constructor.h"

// Change also in Constructors.kt when changing it.
const int CONSTRUCTOR_MAX_ARGS_SIZE = 5;
const int MAX_CONSTRUCTOR_SIZE = CONSTRUCTOR_MAX_ARGS_SIZE + 1;

class KtClass : public JavaInstanceWrapper<KtClass> {

public:
    StringName name;
    String registered_class_name;
    StringName super_class;
    StringName base_godot_class;

    KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader);

    ~KtClass();

    KtObject* create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner);

    KtFunction* get_method(const StringName& methodName);

    KtProperty* get_property(const StringName& p_property_name);

    KtSignalInfo* get_signal(const StringName& p_signal_name);

    void get_method_list(List<MethodInfo>* p_list);

    void get_property_list(List<PropertyInfo>* p_list);

    void get_signal_list(List<MethodInfo>* p_list);

    void fetch_members();

    bool is_assignable_from(KtClass* p_class) const;

private:
    HashMap<StringName, KtFunction*> methods;
    HashMap<StringName, KtProperty*> properties;
    HashMap<StringName, KtSignalInfo*> signal_infos;
    KtConstructor* constructors[MAX_CONSTRUCTOR_SIZE];

#if TOOLS_ENABLED
    LocalVector<KtProperty*> property_list;
#endif

    StringName get_name(jni::Env& env);

    String get_registered_name(jni::Env& env);

    StringName get_super_class(jni::Env& env);

    StringName get_base_godot_class(jni::Env& env);

    void fetch_methods(jni::Env& env);

    void fetch_properties(jni::Env& env);

    void fetch_signals(jni::Env& env);

    void fetch_constructors(jni::Env& env);

    template<typename F, typename T>
    void get_member_list(List<F>* p_list, HashMap<StringName, T*>& members) {
        List<StringName> keys;
        members.get_key_list(&keys);

        for (auto i = 0; i < keys.size(); i++) {
            p_list->push_back(members.get(keys[i])->get_member_info());
        }
    }

    template<class T>
    void delete_members(HashMap<StringName, T*>& members) {
        List<StringName> keys;
        members.get_key_list(&keys);

        for (auto i = 0; i < keys.size(); i++) {
            delete members.get(keys[i]);
        }

        members.clear();
    }

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        JNI_METHOD(GET_REGISTERED_NAME, "getRegisteredName", "()Ljava/lang/String;")
        JNI_METHOD(GET_SUPER_CLASS, "getSuperClass", "()Ljava/lang/String;")
        JNI_METHOD(GET_BASE_GODOT_CLASS, "getBaseGodotClass", "()Ljava/lang/String;")
        JNI_METHOD(GET_FUNCTIONS, "getFunctions", "()[Lgodot/core/KtFunction;")
        JNI_METHOD(GET_PROPERTIES, "getProperties", "()[Lgodot/core/KtProperty;")
        JNI_METHOD(GET_SIGNAL_INFOS, "getSignalInfos", "()[Lgodot/core/KtSignalInfo;")
        JNI_METHOD(GET_CONSTRUCTORS, "getConstructors", "()[Lgodot/core/KtConstructor;")
)
};

#endif //GODOT_JVM_KTCLASS_H
