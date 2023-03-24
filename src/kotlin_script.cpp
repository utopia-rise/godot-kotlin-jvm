#include "kotlin_script.h"

#include "gd_kotlin.h"
#include "kotlin_instance.h"
#include "kotlin_language.h"
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
    Ref<KotlinScript> script {p_script};
    if (script.is_null()) { return false; }

    KtClass* inheritor_class {get_kotlin_class()};
    KtClass* parent_class {script->get_kotlin_class()};
    if (inheritor_class == nullptr || parent_class == nullptr) { return false; }

    if (inheritor_class == parent_class) { return true; }

    return parent_class->is_assignable_from(inheritor_class);
}

Ref<Script> KotlinScript::get_base_script() const {
    return Ref<Script>();
}

StringName KotlinScript::get_global_name() const {
    if (KtClass* kt_class {get_kotlin_class()}) {
        return kt_class->registered_class_name;
    }
    return StringName();
}

StringName KotlinScript::get_instance_base_type() const {
    if (KtClass * kt_class {get_kotlin_class()}) { return kt_class->base_godot_class; }
    // not found
    return StringName();
}

ScriptInstance* KotlinScript::instance_create(Object* p_this) {
    return _instance_create(nullptr, 0, p_this);
}

ScriptInstance* KotlinScript::_instance_create(const Variant** p_args, int p_argcount, Object* p_this) {
    KtClass* kt_class {get_kotlin_class()};
#ifdef DEBUG_ENABLED
    LOG_VERBOSE(vformat("Try to create %s instance.", kt_class->resource_path));
#endif
    jni::Env env = jni::Jvm::current_env();
    KtObject* wrapped = kt_class->create_instance(env, p_args, p_argcount, p_this);
    return memnew(KotlinInstance(wrapped, p_this, kt_class, this));
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
    return ERR_UNAVAILABLE;
}

bool KotlinScript::has_method(const StringName& p_method) const {
    KtClass* kt_class {get_kotlin_class()};
    return kt_class != nullptr && kt_class->get_method(p_method) != nullptr;
}

MethodInfo KotlinScript::get_method_info(const StringName& p_method) const {
    if (KtClass * kt_class {get_kotlin_class()}) {
        if (KtFunction * method {kt_class->get_method(p_method)}) { return method->get_member_info(); }
    }
    return MethodInfo();
}

bool KotlinScript::is_tool() const {
    return false;
}

bool KotlinScript::is_valid() const {
    return false;
}

ScriptLanguage* KotlinScript::get_language() const {
    return KotlinLanguage::get_instance();
}

bool KotlinScript::has_script_signal(const StringName& p_signal) const {
    KtClass* kt_class {get_kotlin_class()};
    return kt_class != nullptr && kt_class->get_signal(p_signal) != nullptr;
}

void KotlinScript::get_script_signal_list(List<MethodInfo>* r_signals) const {
    if (KtClass * kt_class {get_kotlin_class()}) { kt_class->get_signal_list(r_signals); }
}

bool KotlinScript::get_property_default_value(const StringName& p_property, Variant& r_value) const {
#ifdef TOOLS_ENABLED
    HashMap<StringName, Variant>::ConstIterator it { exported_members_default_value_cache.find(p_property) };
    if (it) {
        r_value = it->value;
        return true;
    }
#endif

    return false;
}

void KotlinScript::get_script_method_list(List<MethodInfo>* p_list) const {
    KtClass* kt_class {get_kotlin_class()};
    if (kt_class) { kt_class->get_method_list(p_list); }
}

void KotlinScript::get_script_property_list(List<PropertyInfo>* p_list) const {
    KtClass* kt_class {get_kotlin_class()};
    if (kt_class) { kt_class->get_property_list(p_list); }
}

KtClass* KotlinScript::get_kotlin_class() const {
#ifdef TOOLS_ENABLED
    return GDKotlin::get_instance().find_class(get_path());
#else
    return kotlin_class;
#endif
}

Variant KotlinScript::_new(const Variant** p_args, int p_argcount, Callable::CallError& r_error) {
    r_error.error = Callable::CallError::CALL_OK;

    Object* owner {ClassDB::instantiate(get_kotlin_class()->base_godot_class)};

    Ref<Resource> ref;
    auto* r {Object::cast_to<RefCounted>(owner)};
    if (r) { ref = Ref<Resource>(r); }

    ScriptInstance* instance {_instance_create(p_args, p_argcount, owner)};
    owner->set_script_instance(instance);
    if (!instance) {
        if (ref.is_null()) {
            memdelete(owner);// no owner, sorry
        }
        return Variant();
    }

    if (ref.is_valid()) {
        return ref;
    } else {
        return owner;
    }
}

void KotlinScript::set_path(const String& p_path, bool p_take_over) {
    Resource::set_path(p_path, p_take_over);

#ifndef TOOLS_ENABLED
    if (!kotlin_class) { kotlin_class = GDKotlin::get_instance().find_class(p_path); }
#else
    String package {p_path.replace("src/main/kotlin/", "")
                      .trim_prefix("res://")
                      .trim_suffix(get_name() + "." + KotlinLanguage::get_instance()->get_extension())
                      .trim_suffix("/")
                      .replace("/", ".")};

    if (!package.is_empty()) { package = "package " + package + "\n\n"; }

    String source_code = get_source_code().replace("%PACKAGE%", package);
    set_source_code(source_code);
#endif
}

// Variant is of type Dictionary
const Variant KotlinScript::get_rpc_config() const {
    return get_kotlin_class()->get_rpc_config();
}

#ifdef TOOLS_ENABLED
Vector<DocData::ClassDoc> KotlinScript::get_documentation() const {
    // TODO/4.0:
    return {};
}

PropertyInfo KotlinScript::get_class_category() const {
    // TODO/4.0:
    return {};
}
#endif

KotlinScript::KotlinScript() : kotlin_class(nullptr) {}

PlaceHolderScriptInstance* KotlinScript::placeholder_instance_create(Object* p_this) {
#ifdef TOOLS_ENABLED
    PlaceHolderScriptInstance* placeholder {
      memnew(PlaceHolderScriptInstance(KotlinLanguage::get_instance(), Ref<Script>(this), p_this))};
    p_this->set_script_instance(placeholder);
    placeholders.insert(placeholder);
    _update_exports(placeholder);
    return placeholder;
#else
    return nullptr;
#endif
}

void KotlinScript::update_exports() {
#ifdef TOOLS_ENABLED
    for (PlaceHolderScriptInstance* script_instance : placeholders) {
        _update_exports(script_instance);
    }
#endif
}

void KotlinScript::_update_exports(PlaceHolderScriptInstance* placeholder) {
#ifdef TOOLS_ENABLED
    exported_members_default_value_cache.clear();
    if (KtClass * kt_class {get_kotlin_class()}) {
        Object* tmp_object {ClassDB::instantiate(kt_class->base_godot_class)};
        KotlinInstance* script_instance {
          dynamic_cast<KotlinInstance*>(_instance_create({}, 0, tmp_object))};

        List<PropertyInfo> all_properties;
        get_script_property_list(&all_properties);

        List<PropertyInfo> exported_properties;
        for (const PropertyInfo& property_info : all_properties) {
            if (property_info.usage & PropertyUsageFlags::PROPERTY_USAGE_EDITOR) {
                exported_properties.push_back(property_info);
            }
        }

        for (int i = 0; i < exported_properties.size(); ++i) {
            Variant default_value;
            const String& property_name {exported_properties[i].name};
            script_instance->get_or_default(property_name, default_value);
            exported_members_default_value_cache[property_name] = default_value;
        }
        placeholder->update(exported_properties, exported_members_default_value_cache);
        memdelete(tmp_object);
    }
#endif
}

void KotlinScript::_placeholder_erased(PlaceHolderScriptInstance* p_placeholder) {
#ifdef TOOLS_ENABLED
    placeholders.erase(p_placeholder);
#endif
}

void KotlinScript::_bind_methods() {
    ClassDB::bind_vararg_method(METHOD_FLAGS_DEFAULT, "new", &KotlinScript::_new, MethodInfo("new"));
}

KotlinScript::~KotlinScript() {
#ifdef TOOLS_ENABLED
    exported_members_default_value_cache.clear();
#endif
}
