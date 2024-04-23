#ifndef GODOT_JVM_JVM_PLACEHOLDER_INSTANCE_H
#define GODOT_JVM_JVM_PLACEHOLDER_INSTANCE_H

#include <core/object/script_language.h>

class JvmPlaceHolderInstance : public PlaceHolderScriptInstance {
public:
    JvmPlaceHolderInstance(ScriptLanguage *p_language, Ref<Script> p_script, Object *p_owner);

    bool has_method(const StringName &p_method) const override;
    Variant callp(const StringName &p_method, const Variant **p_args, int p_argcount, Callable::CallError &r_error) override;

};

#endif// GODOT_JVM_JVM_PLACEHOLDER_INSTANCE_H
