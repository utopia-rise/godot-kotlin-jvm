#include "kt_class.h"
#include "gd_kotlin.h"
#include "logging.h"
#include "class_loader.h"

JNI_INIT_STATICS_FOR_CLASS(KtClass)

KtClass::KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader) :
    JavaInstanceWrapper("godot.core.KtClass", p_wrapped, p_class_loader), constructors{} {
    jni::Env env { jni::Jvm::current_env() };
    name = get_name(env);
    registered_class_name = get_registered_name(env);
    super_class = get_super_class(env);
    base_godot_class = get_base_godot_class(env);
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
    )
#endif

    KtConstructor* constructor{constructors[p_arg_count]};

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(
            constructor == nullptr,
            vformat("Cannot find constructor with %s parameters for class %s", p_arg_count, name)
    )
#endif

    KtObject* jvm_instance{constructor->create_instance(p_args, p_owner)};

#ifdef DEBUG_ENABLED
    LOG_VERBOSE(vformat("Instantiated an object of type %s", name))
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

StringName KtClass::get_name(jni::Env& env) {
    jni::MethodId getter { get_method_id(env, jni_methods.GET_NAME) };
    jni::JObject ret { wrapped.call_object_method(env, getter) };
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}

String KtClass::get_registered_name(jni::Env& env) {
    jni::MethodId getter{get_method_id(env, jni_methods.GET_REGISTERED_NAME)};
    jni::JObject ret{wrapped.call_object_method(env, getter)};
    return env.from_jstring(jni::JString((jstring) ret.obj));
}

StringName KtClass::get_super_class(jni::Env& env) {
    jni::MethodId getter { get_method_id(env, jni_methods.GET_SUPER_CLASS) };
    jni::JObject ret { wrapped.call_object_method(env, getter) };
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}

StringName KtClass::get_base_godot_class(jni::Env& env) {
    jni::MethodId getter{get_method_id(env, jni_methods.GET_BASE_GODOT_CLASS)};
    jni::JObject ret{wrapped.call_object_method(env, getter)};
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}

void KtClass::fetch_methods(jni::Env& env) {
    jni::MethodId getFunctionsMethod { get_method_id(env, jni_methods.GET_FUNCTIONS) };
    jni::JObjectArray functionsArray { wrapped.call_object_method(env, getFunctionsMethod) };
    for (int i = 0; i < functionsArray.length(env); i++) {
        auto* ktFunction { new KtFunction(functionsArray.get(env, i), ClassLoader::get_default_loader()) };
        methods[ktFunction->get_name()] = ktFunction;
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Fetched method %s for class %s", ktFunction->get_name(), name))
#endif
    }
}

void KtClass::fetch_properties(jni::Env& env) {
    jni::MethodId getPropertiesMethod { get_method_id(env, jni_methods.GET_PROPERTIES) };
    jni::JObjectArray propertiesArray { wrapped.call_object_method(env, getPropertiesMethod) };
    for (int i = 0; i < propertiesArray.length(env); i++) {
        auto* ktProperty { new KtProperty(propertiesArray.get(env, i), ClassLoader::get_default_loader()) };
        properties[ktProperty->get_name()] = ktProperty;
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Fetched property %s for class %s", ktProperty->get_name(), name))
#endif
    }
}

void KtClass::fetch_signals(jni::Env& env) {
    jni::MethodId get_signal_infos_method{get_method_id(env, jni_methods.GET_SIGNAL_INFOS)};
    jni::JObjectArray signal_info_array{wrapped.call_object_method(env, get_signal_infos_method)};
    for (int i = 0; i < signal_info_array.length(env); i++) {
        auto* kt_signal_info{
            new KtSignalInfo(signal_info_array.get(env, i), ClassLoader::get_default_loader())
        };
        signal_infos[kt_signal_info->name] = kt_signal_info;
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Fetched signal %s for class %s", kt_signal_info->name, name))
#endif
    }
}

void KtClass::fetch_constructors(jni::Env &env) {
    jni::MethodId get_constructors_method{get_method_id(env, jni_methods.GET_CONSTRUCTORS)};
    jni::JObjectArray constructors_array{wrapped.call_object_method(env, get_constructors_method)};
    for (int i = 0; i < constructors_array.length(env); ++i) {
        const jni::JObject& constructor{constructors_array.get(env, i)};
        KtConstructor* kt_constructor{nullptr};
        if (constructor.obj != nullptr) {
            kt_constructor = new KtConstructor(constructor, ClassLoader::get_default_loader());
#ifdef DEBUG_ENABLED
            LOG_VERBOSE(vformat("Fetched constructor with %s parameters for class %s", i, name))
#endif
        }
        constructors[i] = kt_constructor;
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

void KtClass::fetch_members() {
    jni::Env env { jni::Jvm::current_env() };
    fetch_methods(env);
    fetch_properties(env);
    fetch_signals(env);
    fetch_constructors(env);
}
