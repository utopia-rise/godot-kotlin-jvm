#include "kt_class.h"

#include "gd_kotlin.h"
#include "jvm/wrapper/memory/transfer_context.h"

KtClass::KtClass(jni::Env& p_env, jni::JObject p_wrapped) :
  JvmInstanceWrapper(p_env, p_wrapped),
  kt_constructor {nullptr},
  _has_notification() {
    LOCAL_FRAME(4);
    registered_class_name = get_registered_name(p_env);
    fqdn = get_fqdn(p_env);
    compilation_time_relative_registration_file_path = get_compilation_time_relative_registration_file_path(p_env);
    base_godot_class = get_base_godot_class(p_env);
    _has_notification = get_has_notification(p_env);
}

KtClass::~KtClass() {
    delete_members(methods);
    delete_members(properties);
    delete_members(signal_infos);
    delete kt_constructor;
}

KtObject* KtClass::create_instance(jni::Env& env, Object* p_owner) {
#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_V_MSG(
      kt_constructor == nullptr,
      nullptr,
      "Cannot find constructor for class %s", registered_class_name
    );
#endif

    KtObject* jvm_instance {kt_constructor->create_instance(env, p_owner)};
    JVM_DEV_VERBOSE("Instantiated a Jvm script: %s", registered_class_name);

    return jvm_instance;
}

KtFunction* KtClass::get_method(const StringName& methodName) {
    KtFunction** method = methods.getptr(methodName);
    return method ? *method : nullptr;
}

KtProperty* KtClass::get_property(const StringName& p_property_name) {
    KtProperty** property = properties.getptr(p_property_name);
    return property ? *property : nullptr;
}

KtSignalInfo* KtClass::get_signal(const StringName& p_signal_name) {
    KtSignalInfo** signal_info {signal_infos.getptr(p_signal_name)};
    return signal_info ? *signal_info : nullptr;
}

String KtClass::get_registered_name(jni::Env& env) {
    jni::JObject ret = wrapped.call_object_method(env, GET_REGISTERED_NAME);
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

String KtClass::get_fqdn(jni::Env& env) {
    jni::JObject ret = wrapped.call_object_method(env, GET_FQDN);
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

String KtClass::get_compilation_time_relative_registration_file_path(jni::Env& env) {
    jni::JObject ret = wrapped.call_object_method(env, GET_COMPILATION_TIME_RELATIVE_REGISTRATION_FILE_PATH);
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

StringName KtClass::get_base_godot_class(jni::Env& env) {
    jni::JObject ret = wrapped.call_object_method(env, GET_BASE_GODOT_CLASS);
    return {env.from_jstring(jni::JString((jstring) ret.obj))};
}

bool KtClass::get_has_notification(jni::Env& env) {
    return static_cast<bool>(wrapped.call_boolean_method(env, GET_HAS_NOTIFICATION));
}

void KtClass::fetch_registered_supertypes(jni::Env& env) {
    jni::JObjectArray classesArray {wrapped.call_object_method(env, GET_REGISTERED_SUPERTYPES)};
    for (int i = 0; i < classesArray.length(env); i++) {
        StringName parent_name = StringName(env.from_jstring(jni::JString(classesArray.get(env, i))));
        registered_supertypes.append(parent_name);
        JVM_DEV_VERBOSE("%s user type is parent of %s.", parent_name, registered_class_name);
    }
    classesArray.delete_local_ref(env);
}

void KtClass::fetch_methods(jni::Env& env) {
    jni::JObjectArray functionsArray {wrapped.call_object_method(env, GET_FUNCTIONS)};
    for (int i = 0; i < functionsArray.length(env); i++) {
        jni::JObject object = functionsArray.get(env, i);
        auto* ktFunction {new KtFunction(env, object)};
        methods[ktFunction->get_name()] = ktFunction;
        JVM_DEV_VERBOSE("Fetched method %s for class %s", ktFunction->get_name(), registered_class_name);
    }
    functionsArray.delete_local_ref(env);
}

void KtClass::fetch_properties(jni::Env& env) {
    jni::JObjectArray propertiesArray {wrapped.call_object_method(env, GET_PROPERTIES)};
    for (int i = 0; i < propertiesArray.length(env); i++) {
        auto* ktProperty {new KtProperty(env, propertiesArray.get(env, i))};
        properties[ktProperty->get_name()] = ktProperty;
        JVM_DEV_VERBOSE("Fetched property %s for class %s", ktProperty->get_name(), registered_class_name);
    }
    propertiesArray.delete_local_ref(env);
}

void KtClass::fetch_signals(jni::Env& env) {
    jni::JObjectArray signal_info_array {wrapped.call_object_method(env, GET_SIGNAL_INFOS)};
    for (int i = 0; i < signal_info_array.length(env); i++) {
        auto* kt_signal_info {new KtSignalInfo(env, signal_info_array.get(env, i))};
        signal_infos[kt_signal_info->name] = kt_signal_info;
        JVM_DEV_VERBOSE("Fetched signal %s for class %s", kt_signal_info->name, registered_class_name);
    }
    signal_info_array.delete_local_ref(env);
}

void KtClass::fetch_constructor(jni::Env& env) {
    jni::JObject constructor {wrapped.call_object_method(env, GET_CONSTRUCTOR)};
    if (constructor.obj != nullptr) {
        kt_constructor = new KtConstructor(env, constructor);
        JVM_DEV_VERBOSE("Fetched constructor for class %s", registered_class_name);
    }
}

void KtClass::get_method_list(List<MethodInfo>* p_list) {
    get_member_list(p_list, methods);
}

void KtClass::get_property_list(List<PropertyInfo>* p_list) {
    get_member_list(p_list, properties);
}

void KtClass::get_signal_list(List<MethodInfo>* p_list) {
    get_member_list(p_list, signal_infos);
}

const Dictionary KtClass::get_rpc_config() {
    Dictionary rpc_configs {};

    for (const KeyValue<StringName, KtFunction*>& E : methods) {
        rpc_configs[E.key] = E.value->get_rpc_config()->toRpcConfigDictionary();
    }

    return rpc_configs;
}

void KtClass::do_notification(jni::Env& env, KtObject* p_instance, int p_notification, bool p_reversed) {
    if (!_has_notification) { return; }

    Variant notification = p_notification;
    Variant reversed = p_reversed;
    const int arg_size = 2;
    const Variant* args[arg_size] = {&notification, &reversed};

    TransferContext::get_instance().write_args(env, args, arg_size);

    jvalue call_args[1] = {jni::to_jni_arg(p_instance->get_wrapped())};
    wrapped.call_void_method(env, DO_NOTIFICATION, call_args);
}

void KtClass::fetch_members(jni::Env& env) {
    fetch_registered_supertypes(env);
    fetch_methods(env);
    fetch_properties(env);
    fetch_signals(env);
    fetch_constructor(env);
}
