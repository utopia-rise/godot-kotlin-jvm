#ifndef GODOT_JVM_JAVA_SCRIPT_H
#define GODOT_JVM_JAVA_SCRIPT_H

#include "script/jvm_script.h"

class JavaScript : public SourceScript {
    GDCLASS(JavaScript, JvmScript);

public:
    JavaScript() = default;
    ~JavaScript() override = default;

    ScriptLanguage* get_language() const override;
    void set_path(const String& p_path, bool p_take_over) override;

protected:
    static void _bind_methods();
};

#endif// GODOT_JVM_JAVA_SCRIPT_H
