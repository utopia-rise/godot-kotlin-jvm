#include "kotlin_script.h"

#include "core/os/thread.h"
#include "gd_kotlin.h"
#include "godotkotlin_defs.h"
#include "kotlin_instance.h"
#include "language/jvm_language.h"
#include "language/kotlin_language.h"
#include "logging.h"

bool KotlinScript::can_instantiate() const {
#ifdef TOOLS_ENABLED
    if (Engine::get_singleton()->is_editor_hint()) {
        return false;
    } else {
        return true;
    }
#else
    return true;
#endif
}

bool KotlinScript::inherits_script(const Ref<Script>& p_script) const {
    Ref<KotlinScript> kotlin_script {p_script};
    if (kotlin_script.is_null()) { return false; }
    if (!is_valid() || !kotlin_script->is_valid()) { return false; }

    KtClass* parent_class {kotlin_script->kotlin_class};
    if (kotlin_class == parent_class) { return true; }

    return kotlin_class->registered_supertypes.find(parent_class->registered_class_name);
}

Ref<Script> KotlinScript::get_base_script() const {
    if (!is_valid() || kotlin_class->registered_supertypes.size() == 0) { return {}; }
    StringName parent_name = kotlin_class->registered_supertypes[0];
    return TypeManager::get_instance().get_user_script_from_name(parent_name);
}

StringName KotlinScript::get_global_name() const {
    //Path based scripts don't have names.
    if (mode != NAME) {
        return "";
    }
    if (is_valid()) {
        return kotlin_class->registered_class_name;
    }
    // Scripts are either (valid and loaded from .jar) or (placeholders and loaded from .gdj)
    // Even in the case of an invalid file, we can then use its path to find the right name.
    String path = get_path();
    return get_script_file_name(path);
}

StringName KotlinScript::get_instance_base_type() const {
    if (is_valid()) { return kotlin_class->base_godot_class; }
    // not found
    return {};
}

ScriptInstance* KotlinScript::instance_create(Object* p_this) {
    return _instance_create<false>(nullptr, 0, p_this);
}

template<bool isCreator>
ScriptInstance* KotlinScript::_instance_create(const Variant** p_args, int p_argcount, Object* p_this) {
    if (isCreator) {
        KotlinBindingManager::set_instance_binding(p_this);
    } else {
        KotlinBindingManager::get_instance_binding(p_this);
    }

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(
      !is_valid(),
      vformat("Invalid script %s was attempted to be used. Make sure you have properly built your project.", get_path())
    );
    LOG_VERBOSE(vformat("Try to create %s instance.", kotlin_class->registered_class_name));
#endif

    jni::Env env = jni::Jvm::current_env();
    KtObject* wrapped = kotlin_class->create_instance(env, p_args, p_argcount, p_this);
    return memnew(KotlinInstance(p_this, wrapped, this));
}

bool KotlinScript::instance_has(const Object* p_this) const {
    return false;
}

bool KotlinScript::has_source_code() const {
    return !source.is_empty();
}

String KotlinScript::get_source_code() const {
    return source;
}

void KotlinScript::set_source_code(const String& p_code) {
    if (source == p_code) { return; }
    source = p_code;
    // TODO : deal with tool mode
}

Error KotlinScript::reload(bool p_keep_state) {
    return Error::ERR_UNAVAILABLE;
}

bool KotlinScript::has_method(const StringName& p_method) const {
    return is_valid() && kotlin_class->get_method(p_method) != nullptr;
}

MethodInfo KotlinScript::get_method_info(const StringName& p_method) const {
    if (is_valid()) {
        if (KtFunction * method {kotlin_class->get_method(p_method)}) { return method->get_member_info(); }
    }
    return MethodInfo();
}

bool KotlinScript::is_tool() const {
    // TODO: When implementing tool classes
    return false;
}

bool KotlinScript::is_valid() const {
    return kotlin_class != nullptr;
}

bool KotlinScript::is_placeholder_fallback_enabled() const {
    return kotlin_class == nullptr;
}

bool KotlinScript::is_abstract() const {
    // TODO/4.2
    return false;
}

ScriptLanguage* KotlinScript::get_language() const {
    switch(mode){
        case NAME:
            return JvmLanguage::get_instance();
        default:
            return KotlinLanguage::get_instance();
    }
}

bool KotlinScript::has_script_signal(const StringName& p_signal) const {
    return is_valid() && kotlin_class->get_signal(p_signal) != nullptr;
}

void KotlinScript::get_script_signal_list(List<MethodInfo>* r_signals) const {
    if (is_valid()) { kotlin_class->get_signal_list(r_signals); }
}

bool KotlinScript::get_property_default_value(const StringName& p_property, Variant& r_value) const {
#ifdef TOOLS_ENABLED
    HashMap<StringName, Variant>::ConstIterator it {exported_members_default_value_cache.find(p_property)};
    if (it) {
        r_value = it->value;
        return true;
    }
#endif

    return false;
}

void KotlinScript::get_script_method_list(List<MethodInfo>* p_list) const {
    if (is_valid()) { kotlin_class->get_method_list(p_list); }
}

void KotlinScript::get_script_property_list(List<PropertyInfo>* p_list) const {
    if (is_valid()) { kotlin_class->get_property_list(p_list); }
}

void KotlinScript::get_script_exported_property_list(List<PropertyInfo>* p_list) const {
    List<PropertyInfo> all_properties;
    get_script_property_list(&all_properties);

    for (const PropertyInfo& property_info : all_properties) {
        if (property_info.usage & PropertyUsageFlags::PROPERTY_USAGE_EDITOR) { p_list->push_back(property_info); }
    }
}

Variant KotlinScript::_new(const Variant** p_args, int p_argcount, Callable::CallError& r_error) {
    r_error.error = Callable::CallError::CALL_OK;

#ifdef DEBUG_ENABLED
    JVM_CRASH_COND_MSG(
      !is_valid(),
      vformat("Invalid script %s was attempted to be used. Make sure you have properly built your project.", get_path())
    );
#endif
    Object* owner {ClassDB::instantiate(kotlin_class->base_godot_class)};

    ScriptInstance* instance {_instance_create<true>(p_args, p_argcount, owner)};
    owner->set_script_instance(instance);
    if (!instance) {
        memdelete(owner);// no owner, sorry
        return Variant();
    }

    return Variant(owner);
}

void KotlinScript::set_path(const String& p_path, bool p_take_over) {
    String extension = p_path.get_extension();
    if (extension == GODOT_KOTLIN_SCRIPT_EXTENSION) {
        mode = PATH;
    } else if (extension == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        mode = NAME;
    } else {
        mode = NONE;
    }
    Resource::set_path(p_path, p_take_over);
}

// Variant is of type Dictionary
const Variant KotlinScript::get_rpc_config() const {
    if (is_valid()) { kotlin_class->get_rpc_config(); }
    return Dictionary();
}

#ifdef TOOLS_ENABLED
Vector<DocData::ClassDoc> KotlinScript::get_documentation() const {
    // TODO/4.2
    return {};
}

PropertyInfo KotlinScript::get_class_category() const {
    // TODO/4.2
    return {};
}

String KotlinScript::get_class_icon_path() const {
    // TODO/4.2
    return String();
}

PlaceHolderScriptInstance* KotlinScript::placeholder_instance_create(Object* p_this) {
    PlaceHolderScriptInstance* placeholder {memnew(PlaceHolderScriptInstance(KotlinLanguage::get_instance(), Ref<Script>(this), p_this))};

    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);
    placeholder->update(exported_properties, exported_members_default_value_cache);

    placeholders.insert(placeholder);
    return placeholder;
}

void KotlinScript::update_exports() {
    // TODO: Remove this when multithreading is fixed.
    if (!Thread::is_main_thread()) {
        MessageQueue::get_singleton()->push_callable(callable_mp(this, &KotlinScript::update_exports));
        return;
    }

    exported_members_default_value_cache.clear();
    if (!is_valid()) { return; }

    Callable::CallError call;
    Object* tmp_object {_new({}, 0, call)};
    KotlinInstance* kotlin_script_instance {reinterpret_cast<KotlinInstance*>(tmp_object->get_script_instance())};

    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);

    for (auto& exported_property : exported_properties) {
        Variant default_value;
        const String& property_name {exported_property.name};
        kotlin_script_instance->get_or_default(property_name, default_value);
        exported_members_default_value_cache[property_name] = default_value;
    }

    for (PlaceHolderScriptInstance* placeholder : placeholders) {
        placeholder->update(exported_properties, exported_members_default_value_cache);
    }

    memdelete(tmp_object);
}

void KotlinScript::_placeholder_erased(PlaceHolderScriptInstance* p_placeholder) {
    placeholders.erase(p_placeholder);
}
#endif

void KotlinScript::_bind_methods() {
    ClassDB::bind_vararg_method(METHOD_FLAGS_DEFAULT, "new", &KotlinScript::_new, MethodInfo("new"));
}

KotlinScript::KotlinScript() : kotlin_class(nullptr), mode(NONE) {}

KotlinScript::~KotlinScript() {
#ifdef TOOLS_ENABLED
    exported_members_default_value_cache.clear();
#endif
    if(mode == NAME){
        // The .gdj is the one that should delete the KtClass. Without this condition, it would be deleted 2 times.
        delete kotlin_class;
        kotlin_class = nullptr;
    }
}
