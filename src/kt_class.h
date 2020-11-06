#ifndef GODOT_JVM_KTCLASS_H
#define GODOT_JVM_KTCLASS_H

#include "jni/wrapper.h"
#include <core/reference.h>
#include "kt_object.h"
#include "kt_function.h"
#include "kt_signal_info.h"
#include "java_instance_wrapper.h"

class KtClass : public JavaInstanceWrapper<KtClass> {
private:
    struct JNIMethods {
        jni::JavaMethodSignature NEW{"new", "(JJI)Lgodot/core/KtObject;"};
        jni::JavaMethodSignature GET_NAME{"getName", "()Ljava/lang/String;"};
        jni::JavaMethodSignature GET_SUPER_CLASS{"getSuperClass", "()Ljava/lang/String;"};
        jni::JavaMethodSignature GET_FUNCTIONS{"getFunctions", "()[Lgodot/core/KtFunction;"};
        jni::JavaMethodSignature GET_PROPERTIES{"getProperties", "()[Lgodot/core/KtProperty;"};
        jni::JavaMethodSignature GET_SIGNAL_INFOS{"getSignalInfos", "()[Lgodot/core/KtSignalInfo;"};

    };
    static JNIMethods jni_methods;

public:
    StringName name;
    StringName super_class;

    KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader);

    ~KtClass();

    KtObject* create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner);

    KtFunction* get_method(const StringName& methodName);

    KtProperty* get_property(const StringName& p_property_name);

    KtSignalInfo* get_signal(const StringName& p_signal_name);

    void get_method_list(List<MethodInfo>* p_list);

    void get_property_list(List<PropertyInfo>* p_list);

    void get_signal_list(List<MethodInfo>* p_list);

private:
    HashMap<StringName, KtFunction*> methods;
    HashMap<StringName, KtProperty*> properties;
    HashMap<StringName, KtSignalInfo*> signal_infos;

    StringName get_name(jni::Env& env);

    StringName get_super_class(jni::Env& env);

    void fetch_methods(jni::Env& env);

    void fetch_properties(jni::Env& env);

    void fetch_signals(jni::Env& env);

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
};

#endif //GODOT_JVM_KTCLASS_H
