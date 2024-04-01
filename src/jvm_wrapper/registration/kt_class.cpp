#include "kt_class.h"

#include "jni/class_loader.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "gd_kotlin.h"

KtClass::KtClass(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped),
  constructors {},
  _has_notification() {
    jni::Env env {jni::Jvm::current_env()};
    LOCAL_FRAME(4);
    registered_class_name = get_registered_name(env);
    relative_source_path = get_relative_source_path(env);
    compilation_time_relative_registration_file_path = get_compilation_time_relative_registration_file_path(env);
    base_godot_class = get_base_godot_class(env);
    _has_notification = get_has_notification(env);
}

KtClass::~KtClass() {
    delete_members(methods);
    delete_members(properties);
    delete_members(signal_infos);
    for (auto& constructor : constructors) {
        delete constructor;
    }
}

KtObject* KtClass::create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner) {
#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(
      p_arg_count > MAX_CONSTRUCTOR_SIZE,
      vformat("Cannot call constructor with %s, max arg count is %s", p_arg_count, MAX_CONSTRUCTOR_SIZE)
    );
#endif

    KtConstructor* constructor {constructors[p_arg_count]};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(constructor == nullptr, vformat("Cannot find constructor with %s parameters for class %s", p_arg_count, registered_class_name));
#endif

    KtObject* jvm_instance {constructor->create_instance(p_args, p_owner)};

#ifdef DEV_ENABLED
    LOG_VERBOSE(vformat("Instantiated an object with resource path %s", registered_class_name));
#endif

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
    jni::JObject ret = CALL_JVM_METHOD(env, GET_REGISTERED_NAME);
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

String KtClass::get_relative_source_path(jni::Env& env) {
    jni::JObject ret = CALL_JVM_METHOD(env, GET_RELATIVE_SOURCE_PATH);
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

String KtClass::get_compilation_time_relative_registration_file_path(jni::Env& env) {
    jni::JObject ret = CALL_JVM_METHOD(env, GET_COMPILATION_TIME_RELATIVE_REGISTRATION_FILE_PATH);
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

StringName KtClass::get_base_godot_class(jni::Env& env) {
    jni::JObject ret = CALL_JVM_METHOD(env, GET_BASE_GODOT_CLASS);
    return {env.from_jstring(jni::JString((jstring) ret.obj))};
}

bool KtClass::get_has_notification(jni::Env& env) {
    return static_cast<bool>(wrapped.call_boolean_method(env, GET_HAS_NOTIFICATION));
}

void KtClass::fetch_registered_supertypes(jni::Env& env) {
    jni::JObjectArray classesArray = CALL_JVM_METHOD(env, GET_REGISTERED_SUPERTYPES);
    for (int i = 0; i < classesArray.length(env); i++) {
        StringName parent_name = StringName(env.from_jstring(jni::JString(classesArray.get(env, i))));
        registered_supertypes.append(parent_name);
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("%s user type is parent of %s.", parent_name, registered_class_name));
#endif
    }
    classesArray.delete_local_ref(env);
}

void KtClass::fetch_methods(jni::Env& env) {
    jni::JObjectArray functionsArray = CALL_JVM_METHOD(env, GET_FUNCTIONS);
    for (int i = 0; i < functionsArray.length(env); i++) {
        jni::JObject object = functionsArray.get(env, i);
        auto* ktFunction {new KtFunction(object)};
        methods[ktFunction->get_name()] = ktFunction;
#ifdef DEV_ENABLED
        LOG_VERBOSE(vformat("Fetched method %s for class %s", ktFunction->get_name(), registered_class_name));
#endif
    }
    functionsArray.delete_local_ref(env);
}

void KtClass::fetch_properties(jni::Env& env) {
    jni::JObjectArray propertiesArray = CALL_JVM_METHOD(env, GET_PROPERTIES);
    for (int i = 0; i < propertiesArray.length(env); i++) {
        auto* ktProperty {new KtProperty(propertiesArray.get(env, i))};
        properties[ktProperty->get_name()] = ktProperty;
#ifdef DEV_ENABLED
        LOG_VERBOSE(vformat("Fetched property %s for class %s", ktProperty->get_name(), registered_class_name));
#endif
    }
    propertiesArray.delete_local_ref(env);
}

void KtClass::fetch_signals(jni::Env& env) {
    jni::JObjectArray signal_info_array = CALL_JVM_METHOD(env, GET_SIGNAL_INFOS);
    for (int i = 0; i < signal_info_array.length(env); i++) {
        auto* kt_signal_info {new KtSignalInfo(signal_info_array.get(env, i))};
        signal_infos[kt_signal_info->name] = kt_signal_info;
#ifdef DEV_ENABLED
        LOG_VERBOSE(vformat("Fetched signal %s for class %s", kt_signal_info->name, registered_class_name));
#endif
    }
    signal_info_array.delete_local_ref(env);
}

void KtClass::fetch_constructors(jni::Env& env) {
    jni::JObjectArray constructors_array = CALL_JVM_METHOD(env, GET_CONSTRUCTORS);
    for (int i = 0; i < constructors_array.length(env); i++) {
        const jni::JObject& constructor {constructors_array.get(env, i)};
        KtConstructor* kt_constructor {nullptr};
        if (constructor.obj != nullptr) {
            kt_constructor = new KtConstructor(constructor);
#ifdef DEV_ENABLED
            LOG_VERBOSE(vformat("Fetched constructor with %s parameters for class %s", i, registered_class_name));
#endif
        }
        constructors[i] = kt_constructor;
    }
    constructors_array.delete_local_ref(env);
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

void KtClass::do_notification(KtObject* p_instance, int p_notification, bool p_reversed) {
    if (!_has_notification) {
        return;
    }

    jni::Env env { jni::Jvm::current_env() };
    Variant notification = p_notification;
    Variant reversed = p_reversed;
    const int arg_size = 2;
    const Variant* args[arg_size] = {&notification, &reversed};
    TransferContext* transfer_context {GDKotlin::get_instance().transfer_context};
    transfer_context->write_args(env, args, arg_size);

    jvalue call_args[1] = {jni::to_jni_arg(p_instance->get_wrapped())};
    CALL_JVM_METHOD_WITH_ARG(env, DO_NOTIFICATION, call_args);
}

void KtClass::fetch_members() {
    jni::Env env {jni::Jvm::current_env()};
    fetch_registered_supertypes(env);
    fetch_methods(env);
    fetch_properties(env);
    fetch_signals(env);
    fetch_constructors(env);
}
