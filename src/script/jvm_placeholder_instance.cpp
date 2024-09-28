#ifdef TOOLS_ENABLED

#include "jvm_placeholder_instance.h"

#include "jvm_script_manager.h"

JvmPlaceHolderInstance::JvmPlaceHolderInstance(ScriptLanguage* p_language, Ref<Script> p_script, Object* p_owner) :
  PlaceHolderScriptInstance(p_language, p_script, p_owner) {}

bool JvmPlaceHolderInstance::has_method(const StringName& p_method) const {
    if (p_method == SNAME("_get_configuration_warnings")) { return true; }
    return PlaceHolderScriptInstance::has_method(p_method);
}

Variant JvmPlaceHolderInstance::callp(const StringName& p_method, const Variant** p_args, int p_argcount, Callable::CallError& r_error) {
    if (p_method == SNAME("_get_configuration_warnings")) {
        Ref<JvmScript> script_ref = get_script();
        if (!script_ref.is_valid()) {
            PackedStringArray packed {};
            packed.append("This script can't be found in your JVM project. Don't forget to build it and use a valid "
                          "gdj/kt/java file.");
            return packed;
        } else if (script_ref->get_last_time_source_modified() > static_cast<uint64_t>(JvmScriptManager::get_instance()->get_last_reload())) {
            PackedStringArray packed {};
            packed.append("This script has been modified since the last time you built your project.");
            return packed;
        }
    }
    return PlaceHolderScriptInstance::callp(p_method, p_args, p_argcount, r_error);
}

#endif
