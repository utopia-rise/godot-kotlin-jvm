#ifndef GODOT_JVM_KTCLASS_H
#define GODOT_JVM_KTCLASS_H

#include "constraints.h"
#include "jvm/jni/wrapper.h"
#include "jvm/wrapper/jvm_instance_wrapper.h"
#include "kt_constructor.h"
#include "kt_function.h"
#include "kt_object.h"
#include "kt_signal_info.h"

#include <classes/ref_counted.hpp>
#include <templates/hash_map.hpp>

JVM_INSTANCE_WRAPPER(KtClass, "godot.core.KtClass") {
    JVM_CLASS(KtClass)

    // clang-format off
    JNI_OBJECT_METHOD(GET_REGISTERED_NAME)
    JNI_OBJECT_METHOD(GET_FQDN)
    JNI_OBJECT_METHOD(GET_COMPILATION_TIME_RELATIVE_REGISTRATION_FILE_PATH)
    JNI_OBJECT_METHOD(GET_REGISTERED_SUPERTYPES)
    JNI_OBJECT_METHOD(GET_BASE_GODOT_CLASS)
    JNI_OBJECT_METHOD(GET_FUNCTIONS)
    JNI_OBJECT_METHOD(GET_PROPERTIES)
    JNI_OBJECT_METHOD(GET_SIGNAL_INFOS)
    JNI_OBJECT_METHOD(GET_CONSTRUCTOR)
    JNI_BOOLEAN_METHOD(GET_HAS_NOTIFICATION)
    JNI_VOID_METHOD(DO_NOTIFICATION)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_REGISTERED_NAME, "getRegisteredName", "()Ljava/lang/godot::String;")
        INIT_JNI_METHOD(GET_FQDN, "getFqdn", "()Ljava/lang/godot::String;")
        INIT_JNI_METHOD(GET_COMPILATION_TIME_RELATIVE_REGISTRATION_FILE_PATH, "getCompilationTimeRelativeRegistrationFilePath", "()Ljava/lang/godot::String;")
        INIT_JNI_METHOD(GET_REGISTERED_SUPERTYPES, "getRegisteredSupertypes", "()[Ljava/lang/godot::String;")
        INIT_JNI_METHOD(GET_BASE_GODOT_CLASS, "getBaseGodotClass", "()Ljava/lang/godot::String;")
        INIT_JNI_METHOD(GET_FUNCTIONS, "getFunctions", "()[Lgodot/core/KtFunction;")
        INIT_JNI_METHOD(GET_PROPERTIES, "getProperties", "()[Lgodot/core/KtProperty;")
        INIT_JNI_METHOD(GET_SIGNAL_INFOS, "getSignalInfos", "()[Lgodot/core/KtSignalInfo;")
        INIT_JNI_METHOD(GET_CONSTRUCTOR, "getConstructor", "()Lgodot/core/KtConstructor;")
        INIT_JNI_METHOD(GET_HAS_NOTIFICATION, "getHasNotification", "()Z")
        INIT_JNI_METHOD(DO_NOTIFICATION, "doNotification", "(Lgodot/core/KtObject;)V")
    )

    friend class JvmScript;
    // clang-format on

public:
    godot::StringName registered_class_name;
    godot::StringName fqdn;
    godot::StringName compilation_time_relative_registration_file_path;
    godot::Vector<godot::StringName> registered_supertypes;
    godot::StringName base_godot_class;

    explicit KtClass(jni::Env & p_env, jni::JObject p_wrapped);

    ~KtClass();

    KtObject* create_instance(jni::Env & env, godot::Object * p_owner);

    KtFunction* get_method(const godot::StringName& methodName);

    KtProperty* get_property(const godot::StringName& p_property_name);

    KtSignalInfo* get_signal(const godot::StringName& p_signal_name);

    void get_method_list(godot::List<godot::MethodInfo> * p_list);

    void get_property_list(godot::List<godot::PropertyInfo> * p_list);

    void get_signal_list(godot::List<godot::MethodInfo> * p_list);

    void fetch_members(jni::Env & env);

    const godot::Dictionary get_rpc_config();

    void do_notification(jni::Env & env, KtObject * p_instance, int p_notification, bool p_reversed);

private:
    godot::HashMap<godot::StringName, KtFunction*> methods;
    godot::HashMap<godot::StringName, KtProperty*> properties;
    godot::HashMap<godot::StringName, KtSignalInfo*> signal_infos;
    KtConstructor* kt_constructor;
    bool _has_notification;

    godot::String get_registered_name(jni::Env & env);

    godot::String get_fqdn(jni::Env & env);

    godot::String get_compilation_time_relative_registration_file_path(jni::Env & env);

    godot::StringName get_base_godot_class(jni::Env & env);

    bool get_has_notification(jni::Env & env);

    void fetch_registered_supertypes(jni::Env & env);

    void fetch_methods(jni::Env & env);

    void fetch_properties(jni::Env & env);

    void fetch_signals(jni::Env & env);

    void fetch_constructor(jni::Env & env);

    template<typename F, typename T>
    void get_member_list(godot::List<F> * p_list, godot::HashMap<godot::StringName, T*> & members) {
        for (const godot::KeyValue<godot::StringName, T*>& E : members) {
            p_list->push_back(E.value->get_member_info());
        }
    }

    template<class T>
    void delete_members(godot::HashMap<godot::StringName, T*> & members) {
        for (const godot::KeyValue<godot::StringName, T*>& E : members) {
            delete E.value;
        }
        members.clear();
    }
};

#endif // GODOT_JVM_KTCLASS_H
