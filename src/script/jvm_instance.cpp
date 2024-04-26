#include "jvm_instance.h"

#include "jvm_wrapper/memory/transfer_context.h"

JvmInstance::JvmInstance(jni::Env& p_env, Object* p_owner, KtObject* p_kt_object, JvmScript* p_script) :
  owner(p_owner),
  kt_object(p_kt_object),
  kt_class(p_script->kotlin_class),
  script(p_script),
  delete_flag(true) {
    kt_object->swap_to_weak_unsafe(p_env);
}

JvmInstance::~JvmInstance() {
    jni::Env env {jni::Jvm::current_env()};
    if (delete_flag) { TransferContext::get_instance().remove_script_instance(env, owner->get_instance_id()); }
    memdelete(kt_object);
}

Object* JvmInstance::get_owner() {
    return owner;
}

bool JvmInstance::set(const StringName& p_name, const Variant& p_value) {
    jni::LocalFrame localFrame(1000);
    jni::Env env {jni::Jvm::current_env()};

    if (KtProperty* ktProperty {kt_class->get_property(p_name)}) {
        ktProperty->call_set(env, kt_object, p_value);
        return true;
    }

    if (KtFunction* function {kt_class->get_method(SNAME("_set"))}) {
        Variant ret;
        const int arg_count = 2;
        Variant name = p_name;
        const Variant* args[arg_count] {&name, &p_value};
        function->invoke(env, kt_object, args, arg_count, ret);
        return true;
    }

    return false;
}

bool JvmInstance::get(const StringName& p_name, Variant& r_ret) const {
    jni::LocalFrame localFrame(1000);
    jni::Env env {jni::Jvm::current_env()};

    KtProperty* ktProperty {kt_class->get_property(p_name)};
    if (ktProperty) {
        ktProperty->call_get(env, kt_object, r_ret);
        return true;
    }

    KtSignalInfo* kt_signal {kt_class->get_signal(p_name)};
    if (kt_signal) {
        r_ret = Signal(owner, p_name);
        return true;
    }

    if (KtFunction* function {kt_class->get_method(SNAME("_get"))}) {
        const int arg_count = 1;
        Variant name = p_name;
        const Variant* args[arg_count] = {&name};
        function->invoke(env, kt_object, args, arg_count, r_ret);
        return true;
    }

    return false;
}

#ifdef TOOLS_ENABLED
bool JvmInstance::get_or_default(const StringName& p_name, Variant& r_ret) const {
    jni::LocalFrame localFrame(1000);
    jni::Env env {jni::Jvm::current_env()};

    KtProperty* ktProperty {kt_class->get_property(p_name)};
    if (ktProperty) {
        ktProperty->safe_call_get(env, kt_object, r_ret);
        return true;
    } else {
        return false;
    }
}
#endif

void JvmInstance::get_property_list(List<PropertyInfo>* p_properties) const {
    kt_class->get_property_list(p_properties);
    jni::Env env {jni::Jvm::current_env()};

    if (KtFunction* function {kt_class->get_method(SNAME("_get_property_list"))}) {
        Variant ret_var;
        function->invoke(env, kt_object, {}, 0, ret_var);
        Array ret_array = ret_var;
        for (int i = 0; i < ret_array.size(); ++i) {
            p_properties->push_back(PropertyInfo::from_dict(ret_array.get(i)));
        }
    }
}

Variant::Type JvmInstance::get_property_type(const StringName& p_name, bool* r_is_valid) const {
    return Variant::VECTOR3;
}

void JvmInstance::get_property_state(List<Pair<StringName, Variant>>& state) {
    ScriptInstance::get_property_state(state);
}

void JvmInstance::get_method_list(List<MethodInfo>* p_list) const {
    kt_class->get_method_list(p_list);
}

bool JvmInstance::has_method(const StringName& p_method) const {
    return kt_class->get_method(p_method) != nullptr;
}

Variant JvmInstance::callp(const StringName& p_method, const Variant** p_args, int p_argcount, Callable::CallError& r_error) {
    jni::Env env {jni::Jvm::current_env()};

    KtFunction* function {kt_class->get_method(p_method)};
    Variant ret_var;
    if (function) {
        function->invoke(env, kt_object, p_args, p_argcount, ret_var);
    } else {
        r_error.error = Callable::CallError::CALL_ERROR_INVALID_METHOD;
    }
    return ret_var;
}

void JvmInstance::notification(int p_notification, bool p_reversed) {
    if (p_notification == Object::NOTIFICATION_PREDELETE) { delete_flag = false; }

    jni::Env env {jni::Jvm::current_env()};
    kt_class->do_notification(env, kt_object, p_notification, p_reversed);
}

void JvmInstance::validate_property(PropertyInfo& p_property) const {
    jni::Env env {jni::Jvm::current_env()};

    if (KtFunction* function {kt_class->get_method(SNAME("_validate_property"))}) {
        Variant ret_var;
        Variant property_arg = (Dictionary) p_property;
        const int arg_count {1};
        const Variant* args[arg_count] = {&property_arg};
        function->invoke(env, kt_object, args, arg_count, ret_var);
        p_property = PropertyInfo::from_dict(property_arg);
    }
}

String JvmInstance::to_string(bool* r_valid) {
    return ScriptInstance::to_string(r_valid);
}

void JvmInstance::refcount_incremented() {}

bool JvmInstance::refcount_decremented() {
    return true;
}

Ref<Script> JvmInstance::get_script() const {
    return script;
}

bool JvmInstance::is_placeholder() const {
    return ScriptInstance::is_placeholder();
}

void JvmInstance::property_set_fallback(const StringName& p_name, const Variant& p_value, bool* r_valid) {
    ScriptInstance::property_set_fallback(p_name, p_value, r_valid);
}

Variant JvmInstance::property_get_fallback(const StringName& p_name, bool* r_valid) {
    return ScriptInstance::property_get_fallback(p_name, r_valid);
}

const Variant JvmInstance::get_rpc_config() const {
    return kt_class->get_rpc_config();
}

ScriptLanguage* JvmInstance::get_language() {
    return script->get_language();
}

bool JvmInstance::property_can_revert(const StringName& p_name) const {
    jni::Env env {jni::Jvm::current_env()};

    if (KtFunction* function {kt_class->get_method(SNAME("_property_can_revert"))}) {
        const int arg_count = 1;
        Variant ret;
        Variant name = p_name;
        const Variant* args[arg_count] = {&name};
        function->invoke(env, kt_object, args, arg_count, ret);
        return ret.operator bool();
    }

    return false;
}

bool JvmInstance::property_get_revert(const StringName& p_name, Variant& r_ret) const {
    jni::Env env {jni::Jvm::current_env()};

    if (KtFunction* function {kt_class->get_method(SNAME("_property_get_revert"))}) {
        const int arg_count = 1;
        Variant name = p_name;
        const Variant* args[arg_count] = {&name};
        function->invoke(env, kt_object, args, arg_count, r_ret);
        return true;
    }

    return false;
}
