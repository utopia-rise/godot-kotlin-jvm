#ifndef GODOT_JVM_KOTLIN_SCRIPT_H
#define GODOT_JVM_KOTLIN_SCRIPT_H

#include "script/jvm_script.h"

class KotlinScript : public PathScript {
    GDCLASS(KotlinScript, JvmScript);

public:
    KotlinScript() = default;
    ~KotlinScript() override = default;

    ScriptLanguage* get_language() const override;
    void set_path(const String& p_path, bool p_take_over) override;

protected:
    static void _bind_methods();
};

#endif// GODOT_JVM_KOTLIN_SCRIPT_H
