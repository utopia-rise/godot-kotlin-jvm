#include "jvm_script.h"

#include "api/language/gdj_language.h"
#include "api/script/jvm_script_manager.h"
#include "classes/engine.hpp"
#include "jvm_instance.h"
#include "jvm_placeholder_instance.h"

using namespace godot;

Variant JvmScript::_new() {
    Object* obj = _object_create();
    if (obj) {
        return Variant(obj);
    }

    JVM_ERR_FAIL_V_MSG({}, vformat("Cannot instantiate JVM script %s", kotlin_class->registered_class_name));
}

Object* JvmScript::_object_create() {
    Object* owner {ClassDB::instantiate(kotlin_class->base_godot_class)};

    JvmInstance* instance {_instance_create<true>(owner)};
    owner->set_script_instance(instance);
    if (!instance) {
        memdelete(owner);// no owner, sorry
        return nullptr;
    }

    return owner;
}

bool JvmScript::_can_instantiate() const {
#ifdef TOOLS_ENABLED
    if (Engine::get_singleton()->is_editor_hint()) {
        return false;
    } else {
        return _is_valid();
    }
#else
    return is_valid();
    ;
#endif
}

bool JvmScript::_inherits_script(const Ref<Script>& p_script) const {
    Ref<JvmScript> kotlin_script {p_script};
    if (kotlin_script.is_null()) { return false; }
    if (!_is_valid() || !kotlin_script->_is_valid()) { return false; }

    KtClass* parent_class {kotlin_script->kotlin_class};
    if (kotlin_class == parent_class) { return true; }

    return kotlin_class->registered_supertypes.find(parent_class->registered_class_name);
}

Ref<Script> JvmScript::_get_base_script() const {
    if (!_is_valid() || kotlin_class->registered_supertypes.size() == 0) { return {}; }
    StringName parent_name = kotlin_class->registered_supertypes[0];
    return JvmScriptManager::get_instance()->get_script_from_name(parent_name);
}

StringName JvmScript::get_instance_base_type() const {
    if (is_valid()) { return kotlin_class->base_godot_class; }
    // not found
    return {};
}

ScriptInstance* JvmScript::instance_create(Object* p_this) {
    return _instance_create<false>(p_this);
}

template<bool isCreator>
ScriptInstance* JvmScript::_instance_create(Object* p_this) {
    if (isCreator) {
        KotlinBindingManager::set_instance_binding(p_this);
    } else {
        KotlinBindingManager::get_instance_binding(p_this);
    }

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_V_MSG(!is_valid(), nullptr, "Invalid script %s was attempted to be used. Make sure you have properly built your project.", get_path());
    JVM_DEV_VERBOSE("Try to create %s instance.", kotlin_class->registered_class_name);
#endif

    jni::Env env = jni::Jvm::current_env();
    KtObject* wrapped = kotlin_class->create_instance(env, p_this);

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
        if (KtFunction * method {kotlin_class->get_method(p_method)}) { return method->get_member_info(); }
    }
    return {};
}

bool JvmScript::is_tool() const {
    // TODO: When implementing tool classes
    return false;
}

bool JvmScript::_is_valid() const {
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

void JvmScript::get_constants(HashMap<StringName, Variant> *p_constants) {}

void JvmScript::get_members(HashSet<StringName> *p_members){
#ifdef TOOLS_ENABLED
    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);
    if (p_members) {
        for (const PropertyInfo &E : exported_properties) {
            p_members->insert(E.name);
        }
    }
#endif // TOOLS_ENABLED
}

// Variant is of type Dictionary
const Variant JvmScript::get_rpc_config() const {
    if (is_valid()) { kotlin_class->get_rpc_config(); }
    return Dictionary();
}

#ifdef TOOLS_ENABLED

void JvmScript::get_script_exported_property_list(List<PropertyInfo>* p_list) const {
    List<PropertyInfo> all_properties;
    get_script_property_list(&all_properties);

    p_list->push_back(get_class_category());
    for (const PropertyInfo& property_info : all_properties) {
        if (property_info.usage & PropertyUsageFlags::PROPERTY_USAGE_EDITOR) { p_list->push_back(property_info); }
    }
}

Vector<DocData::ClassDoc> JvmScript::get_documentation() const {
    // TODO: Add ability to register documentation to Godot
    return {};
}

String JvmScript::get_class_icon_path() const {
    // TODO: Add ability to register an icon to Godot
    return {};
}

StringName JvmScript::get_doc_class_name() const {
    String class_name = get_global_name();
    if (class_name.is_empty()) {
        return get_path().get_file();
    }
    return class_name;
}

PlaceHolderScriptInstance* JvmScript::placeholder_instance_create(Object* p_this) {
    PlaceHolderScriptInstance* placeholder {memnew(JvmPlaceHolderInstance(GdjLanguage::get_instance(), Ref<Script>(this), p_this))};

    update_script_exports();// Update in case this method is called between the (re)loading and the delayed update_script_exports().

    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);
    placeholder->update(exported_properties, exported_members_default_value_cache);
    placeholders.insert(placeholder);
    return placeholder;
}

uint64_t JvmScript::get_last_time_source_modified() {
    return last_time_source_modified;
}

void JvmScript::set_last_time_source_modified(uint64_t p_time) {
    last_time_source_modified = p_time;

    for (PlaceHolderScriptInstance* placeholder : placeholders) {
        if (Node* node = cast_to<Node>(placeholder->get_owner())) { node->update_configuration_warnings(); }
    }
}

void JvmScript::update_script_exports() {
    if (!export_dirty_flag) { return; }

    exported_members_default_value_cache.clear();
    if (!is_valid()) { return; }

    Object* tmp_object = _object_create();
    JvmInstance* kotlin_script_instance {reinterpret_cast<JvmInstance*>(tmp_object->get_script_instance())};

    List<PropertyInfo> exported_properties;
    get_script_exported_property_list(&exported_properties);

    for (auto& exported_property : exported_properties) {
        Variant default_value;
        const String& property_name {exported_property.name};

        if (exported_property.type != Variant::OBJECT) {
            kotlin_script_instance->get_or_default(property_name, default_value);
            JVM_DEV_VERBOSE(
              "Get default value for %s property from %s: %s",
              exported_property.name,
              kotlin_class->registered_class_name,
              default_value.stringify()
            );
        }
        exported_members_default_value_cache[property_name] = default_value;
    }

    for (PlaceHolderScriptInstance* placeholder : placeholders) {
        placeholder->update(exported_properties, exported_members_default_value_cache);
    }

    jni::Env env = jni::Jvm::current_env();
    MemoryManager::get_instance().direct_object_deletion(env, tmp_object);
    export_dirty_flag = false;
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

StringName SourceScript::parse_source_to_fqdn(const String& p_path, String& r_source, Error* r_error) {
    String source;
    *r_error = JvmResourceFormatLoader::read_all_file_utf8(p_path, source);
    r_source = source;

#ifdef TOOLS_ENABLED
    static String package_keyword { PACKAGE_KEYWORD };
    static int package_keyword_size { package_keyword.size() };

    int initial_start_index = 0;
    while (skip_comments(source, p_path, initial_start_index) || skip_spaces_and_newlines(source, initial_start_index)) {}

    int package_keyword_index { source.find(package_keyword, initial_start_index) };

    String package_name;
    if (package_keyword_index != -1) {
        int package_start_index = package_keyword_index + package_keyword_size - 1;

        while (skip_comments(source, p_path, package_start_index) || skip_spaces_and_newlines(source, package_start_index)) {}

        char32_t next_character = source[package_start_index];
        int package_end_index = package_start_index;
        while (package_end_index < source.size() && !is_package_end(next_character)) {
            next_character = source[++package_end_index];
        }

        package_name = source.substr(package_start_index, package_end_index - package_start_index);
    }

    static String register_class_annotation { REGISTER_CLASS_ANNOTATION };
    static int register_class_annotation_size { register_class_annotation.size() };
    int register_class_search_start = package_keyword_index == -1 ? 0 : package_keyword_index;

    while (skip_comments(source, p_path, register_class_search_start) || skip_spaces_and_newlines(source, register_class_search_start)) {}

    int register_class_index { source.find(register_class_annotation, register_class_search_start) };

    if (register_class_index == -1) {
        return StringName();
    }

    int class_search_start_index = register_class_index + register_class_annotation_size - 1;

    while (skip_comments(source, p_path, class_search_start_index) || skip_spaces_and_newlines(source, class_search_start_index)) {}

    char32_t next_character = source[class_search_start_index];
    if (next_character == U'(') {
        next_character = source[++class_search_start_index];

        while (class_search_start_index < source.size() && next_character != U')') {
            next_character = source[++class_search_start_index];
        }

        while (class_search_start_index < source.size() && next_character == U')') {
            ++class_search_start_index;
            while (skip_comments(source, p_path, class_search_start_index) || skip_spaces_and_newlines(source, class_search_start_index)) {}
            next_character = source[class_search_start_index];
        }
    }

    while (skip_comments(source, p_path, class_search_start_index) || skip_spaces_and_newlines(source, class_search_start_index)) {}

    static String class_keyword { CLASS_KEYWORD };
    static int class_keyword_size { class_keyword.size() };
    int class_keyword_index { source.find(class_keyword, class_search_start_index) };

    if (class_keyword_index == -1) {
        JVM_LOG_WARNING(vformat("Cannot find class declaration in %s", p_path));
        return StringName();
    }

    int class_start_index = class_keyword_index + class_keyword_size - 1;

    while (skip_comments(source, p_path, class_start_index) || skip_spaces_and_newlines(source, class_start_index)) {}

    next_character = source[class_start_index];
    int class_end_index = class_start_index;
    while (class_end_index < source.size() && !is_class_name_end(next_character)) {
        next_character = source[++class_end_index];
    }

    String class_name { source.substr(class_start_index, class_end_index - class_start_index) };

    if (package_name.is_empty()) {
        return class_name;
    }

    return vformat("%s.%s", package_name, class_name);
#else
    return source;
#endif
}

StringName SourceScript::get_functional_name() const {
    return _functional_name;
}


StringName SourceScript::get_global_name() const {
    return {};
}
//
bool SourceScript::is_whitespace_or_linebreak(char32_t character) {
    return is_whitespace(character) || is_linebreak(character);
}

bool SourceScript::is_package_end(char32_t character) {
    return is_whitespace_or_linebreak(character) || character == U';' || character == U'/';
}

bool SourceScript::is_class_name_end(char32_t character) {
    return is_whitespace_or_linebreak(character) ||
        character == U':' ||
        character == U'{' ||
        character == U'<' ||
        character == U'[' ||
        character == U'(' ||
        character == U'/';
}

bool SourceScript::skip_spaces_and_newlines(const String& source, int& start_index) {
    int initial_index = start_index;
    char32_t next_character = source[start_index];

    while (start_index < source.size() && is_whitespace_or_linebreak(next_character)) {
        next_character = source[++start_index];
    }

    return start_index != initial_index;
}

bool SourceScript::skip_comments(const String& source, const String& p_path, int& start_index) {
    char32_t next_character = source[start_index];

    if (next_character != U'/') {
        return false;
    }

    bool isLineComment = false;
    bool isMultilineComment = false;
    if (start_index < source.size() - 1) {
        next_character = source[++start_index];

        isLineComment = next_character == U'/';
        isMultilineComment = next_character == U'*';
    }

    if (!isLineComment && !isMultilineComment) {
        JVM_LOG_WARNING(vformat("Cannot parse %s, found unexpected '/' character", p_path));
    }

    if (isLineComment) {
        while (start_index < source.size() && !is_linebreak(next_character)) {
            next_character = source[++start_index];
        }
    }

    if (isMultilineComment) {
        while (start_index < source.size()) {
            bool isCommentEnd = next_character == U'*';
            next_character = source[++start_index];

            if (start_index == source.size()) {
                JVM_LOG_WARNING(vformat("Cannot parse %s, found unclosed multiline comment", p_path));
            }

            isCommentEnd = isCommentEnd && next_character == U'/';

            if (isCommentEnd) {
                ++start_index;
                break;
            }
        }
    }

    return true;
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
    ClassDB::bind_method(D_METHOD("new"), &JvmScript::_new);
}
