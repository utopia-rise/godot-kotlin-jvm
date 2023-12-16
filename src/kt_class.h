#ifndef GODOT_JVM_KTCLASS_H
#define GODOT_JVM_KTCLASS_H

#include "java_instance_wrapper.h"
#include "jni/wrapper.h"
#include "kt_constructor.h"
#include "kt_function.h"
#include "kt_object.h"
#include "kt_signal_info.h"
#include "constraints.h"

#include <core/object/ref_counted.h>

const int MAX_CONSTRUCTOR_SIZE = MAX_CONSTRUCTOR_ARG_COUNT + 1;

class KtClass : public JavaInstanceWrapper {
public:
    StringName registered_class_name;
    StringName relative_source_path;
    StringName compilation_time_relative_registration_file_path;
    Vector<StringName> registered_supertypes;
    StringName base_godot_class;

    KtClass(jni::JObject p_wrapped);

    ~KtClass();

    KtObject* create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner);

    KtFunction* get_method(const StringName& methodName);

    KtProperty* get_property(const StringName& p_property_name);

    KtSignalInfo* get_signal(const StringName& p_signal_name);

    void get_method_list(List<MethodInfo>* p_list);

    void get_property_list(List<PropertyInfo>* p_list);

    void get_signal_list(List<MethodInfo>* p_list);

    void fetch_members();

    const Dictionary get_rpc_config();

    void do_notification(KtObject* p_instance, int p_notification, bool p_reversed);

private:
    HashMap<StringName, KtFunction*> methods;
    HashMap<StringName, KtProperty*> properties;
    HashMap<StringName, KtSignalInfo*> signal_infos;
    KtConstructor* constructors[MAX_CONSTRUCTOR_SIZE];
    bool _has_notification;

    String get_registered_name(jni::Env& env);

    String get_relative_source_path(jni::Env& env);

    String get_compilation_time_relative_registration_file_path(jni::Env& env);

    StringName get_base_godot_class(jni::Env& env);

    bool get_has_notification(jni::Env& env);

    void fetch_registered_supertypes(jni::Env& env);

    void fetch_methods(jni::Env& env);

    void fetch_properties(jni::Env& env);

    void fetch_signals(jni::Env& env);

    void fetch_constructors(jni::Env& env);

    template<typename F, typename T>
    void get_member_list(List<F>* p_list, HashMap<StringName, T*>& members) {
        for (const KeyValue<StringName, T*>& E : members) {
            p_list->push_back(E.value->get_member_info());
        }
    }

    template<class T>
    void delete_members(HashMap<StringName, T*>& members) {
        for (const KeyValue<StringName, T*>& E : members) {
            delete E.value;
        }
        members.clear();
    }

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(GET_REGISTERED_NAME, "getRegisteredName", "()Ljava/lang/String;")
            JNI_METHOD(GET_RELATIVE_SOURCE_PATH, "getRelativeSourcePath", "()Ljava/lang/String;")
            JNI_METHOD(GET_COMPILATION_TIME_RELATIVE_REGISTRATION_FILE_PATH, "getCompilationTimeRelativeRegistrationFilePath", "()Ljava/lang/String;")
            JNI_METHOD(GET_REGISTERED_SUPERTYPES, "getRegisteredSupertypes", "()[Ljava/lang/String;")
            JNI_METHOD(GET_BASE_GODOT_CLASS, "getBaseGodotClass", "()Ljava/lang/String;")
            JNI_METHOD(GET_FUNCTIONS, "getFunctions", "()[Lgodot/core/KtFunction;")
            JNI_METHOD(GET_PROPERTIES, "getProperties", "()[Lgodot/core/KtProperty;")
            JNI_METHOD(GET_SIGNAL_INFOS, "getSignalInfos", "()[Lgodot/core/KtSignalInfo;")
            JNI_METHOD(GET_CONSTRUCTORS, "getConstructors", "()[Lgodot/core/KtConstructor;")
            JNI_METHOD(GET_HAS_NOTIFICATION, "getHasNotification", "()Z")
            JNI_METHOD(DO_NOTIFICATION, "doNotification", "(Lgodot/core/KtObject;)V")
    )
    // clang-format on
};

#endif// GODOT_JVM_KTCLASS_H
