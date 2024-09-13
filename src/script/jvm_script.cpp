#include "jvm_script.h"

#include <scene/main/node.h>

#include "core/os/thread.h"
#include "jvm_instance.h"
#include "jvm_placeholder_instance.h"
#include "language/gdj_language.h"
#include "script/jvm_script_manager.h"
#include "binding/kotlin_binding_manager.h"

Variant JvmScript::_new(const Variant** p_args, int p_arg_count, Callable::CallError& r_error) {
    Object* obj = _object_create(p_args, p_arg_count);
    if (obj) {
        r_error.error = Callable::CallError::CALL_OK;
        return {obj};
    }
    r_error.error = Callable::CallError::CALL_ERROR_INVALID_ARGUMENT;
    return {};
}

Object* JvmScript::_object_create(const Variant** p_args, int p_arg_count) {
    Object* owner {ClassDB::instantiate(kotlin_class->base_godot_class)};

    ScriptInstance* instance {_instance_create<true>(p_args, p_arg_count, owner)};
    owner->set_script_instance(instance);
    if (!instance) {
        memdelete(owner);// no owner, sorry
        return nullptr;
    }

    return owner;
}

bool JvmScript::can_instantiate() const {
#ifdef TOOLS_ENABLED
    if (Engine::get_singleton()->is_editor_hint()) {
        return false;
    } else {
        return is_valid();
    }
#else
    return is_valid();
    ;
#endif
}

bool JvmScript::inherits_script(const Ref<Script>& p_script) const {
    Ref<JvmScript> kotlin_script {p_script};
    if (kotlin_script.is_null()) { return false; }
    if (!is_valid() || !kotlin_script->is_valid()) { return false; }

    KtClass* parent_class {kotlin_script->kotlin_class};
    if (kotlin_class == parent_class) { return true; }

    return kotlin_class->registered_supertypes.find(parent_class->registered_class_name);
}

Ref<Script> JvmScript::get_base_script() const {
    if (!is_valid() || kotlin_class->registered_supertypes.size() == 0) { return {}; }
    StringName parent_name = kotlin_class->registered_supertypes[0];
    return JvmScriptManager::get_instance().get_script_from_name(parent_name);
}

StringName JvmScript::get_instance_base_type() const {
    if (is_valid()) { return kotlin_class->base_godot_class; }
    // not found
    return {};
}

ScriptInstance* JvmScript::instance_create(Object* p_this) {
    return _instance_create<false>(nullptr, 0, p_this);
}

template<bool isCreator>
ScriptInstance* JvmScript::_instance_create(const Variant** p_args, int p_arg_count, Object* p_this) {
    if (isCreator) {
        KotlinBindingManager::set_instance_binding(p_this);
    } else {
        KotlinBindingManager::get_instance_binding(p_this);
    }

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_V_MSG(
      !is_valid(),
      nullptr,
      vformat("Invalid script %s was attempted to be used. Make sure you have properly built your project.", get_path())
    );
    LOG_DEV_VERBOSE(vformat("Try to create %s instance.", kotlin_class->registered_class_name));
#endif

    jni::Env env = jni::Jvm::current_env();
    KtObject* wrapped = kotlin_class->create_instance(env, p_args, p_arg_count, p_this);

#ifdef DEBUG_ENABLED
    if (unlikely(!wrapped)) { return nullptr; }// Error already throw by create_instance()
#endif

    return memnew(JvmInstance(env, p_this, wrapped, this));
}

bool JvmScript::instance_has(const Object* p_this) const {
    return false;
}

bool JvmScript::has_source_code() const {
    return !source.is_empty();
}

String JvmScript::get_source_code() const {
    return source;
}

void JvmScript::set_source_code(const String& p_code) {
    if (source == p_code) { return; }
    source = p_code;
    // TODO : deal with tool mode
}

Error JvmScript::reload(bool p_keep_state) {
    return Error::ERR_UNAVAILABLE;
}

bool JvmScript::has_method(const StringName& p_method) const {
    return is_valid() && kotlin_class->get_method(p_method) != nullptr;
}

MethodInfo JvmScript::get_method_info(const StringName& p_method) const {
    if (is_valid()) {
        if (KtFunction* method {kotlin_class->get_method(p_method)}) { return method->get_member_info(); }
    }
    return {};
}

bool JvmScript::is_tool() const {
    // TODO: When implementing tool classes
    return false;
}

bool JvmScript::is_valid() const {
    return kotlin_class != nullptr;
}

bool JvmScript::is_placeholder_fallback_enabled() const {
    return kotlin_class == nullptr;
}

bool JvmScript::is_abstract() const {
    // TODO/4.2
    return false;
}

bool JvmScript::has_script_signal(const StringName& p_signal) const {
    return is_valid() && kotlin_class->get_signal(p_signal) != nullptr;
}

void JvmScript::get_script_signal_list(List<MethodInfo>* r_signals) const {
    if (is_valid()) { kotlin_class->get_signal_list(r_signals); }
}

bool JvmScript::get_property_default_value(const StringName& p_property, Variant& r_value) const {
#ifdef TOOLS_ENABLED
    HashMap<StringName, Variant>::ConstIterator it {exported_members_default_value_cache.find(p_property)};
    if (it) {
        r_value = it->value;
        return true;
    }
#endif

    return false;
}

void JvmScript::get_script_method_list(List<MethodInfo>* p_list) const {
    if (is_valid()) { kotlin_class->get_method_list(p_list); }
}

void JvmScript::get_script_property_list(List<PropertyInfo>* p_list) const {
    if (is_valid()) { kotlin_class->get_property_list(p_list); }
}

void JvmScript::get_script_exported_property_list(List<PropertyInfo>* p_list) const {
    List<PropertyInfo> all_properties;
    get_script_property_list(&all_properties);

    for (const PropertyInfo& property_info : all_properties) {
        if (property_info.usage & PropertyUsageFlags::PROPERTY_USAGE_EDITOR) { p_list->push_back(property_info); }
    }
}

// Variant is of type Dictionary
const Variant JvmScript::get_rpc_config() const {
    if (is_valid()) { kotlin_class->get_rpc_config(); }
    return Dictionary();
}

#ifdef TOOLS_ENABLED
Vector<DocData::ClassDoc> JvmScript::get_documentation() const {
    // TODO/4.2
    return {};
}

PropertyInfo JvmScript::get_class_category() const {
    // TODO/4.2
    return {};
}

String JvmScript::get_class_icon_path() const {
    // TODO/4.2
    return {};
}

PlaceHolderScriptInstance* JvmScript::placeholder_instance_create(Object* p_this) {
    PlaceHolderScriptInstance* placeholder {memnew(JvmPlaceHolderInstance(GdjLanguage::get_instance(), Ref<Script>(this), p_this))};

    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);
    placeholder->update(exported_properties, exported_members_default_value_cache);

    placeholders.insert(placeholder);
    return placeholder;
}

void JvmScript::update_script() {
    exported_members_default_value_cache.clear();
    if (!is_valid()) { return; }

    Object* tmp_object = _object_create({}, 0);
    JvmInstance* kotlin_script_instance {reinterpret_cast<JvmInstance*>(tmp_object->get_script_instance())};

    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);

    for (auto& exported_property : exported_properties) {
        Variant default_value;
        const String& property_name {exported_property.name};

        if(exported_property.type != Variant::OBJECT) {
            LOG_DEV_VERBOSE(vformat("Get default value for %s property from %s:",exported_property.name, kotlin_class->registered_class_name));
            kotlin_script_instance->get_or_default(property_name, default_value);
            LOG_DEV_VERBOSE(vformat("    %s",default_value.stringify()));
        }
        exported_members_default_value_cache[property_name] = default_value;
    }

    for (PlaceHolderScriptInstance* placeholder : placeholders) {
        placeholder->update(exported_properties, exported_members_default_value_cache);
        if (Node* node = cast_to<Node>(placeholder->get_owner())) { node->update_configuration_warnings(); }
    }

    jni::Env env = jni::Jvm::current_env();
    MemoryManager::get_instance().direct_object_deletion(env, tmp_object);
}

void JvmScript::_placeholder_erased(PlaceHolderScriptInstance* p_placeholder) {
    placeholders.erase(p_placeholder);
}
#endif

JvmScript::JvmScript() : kotlin_class(nullptr) {}

JvmScript::~JvmScript() {
#ifdef TOOLS_ENABLED
    exported_members_default_value_cache.clear();
#endif
    kotlin_class = nullptr;
}

StringName PathScript::get_global_name() const {
    return {};
}

NamedScript::~NamedScript() {
    // The named script is the one that should delete the KtClass as its existence is guaranteed unlike its path based twin.
    delete kotlin_class;
}

StringName NamedScript::get_global_name() const {
    if (is_valid()) { return kotlin_class->registered_class_name; }
    // Scripts are either (valid and loaded from .jar) or (placeholders and loaded from path scripts)
    // Even in the case of an invalid file, we can then use its path to find the right name.
    String path = get_path();
    return get_script_file_name(path);
}

void JvmScript::_bind_methods() {
    ClassDB::bind_vararg_method(METHOD_FLAGS_DEFAULT, "new", &JvmScript::_new, MethodInfo("new"));
}