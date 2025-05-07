#ifndef GODOT_JVM_GDJ_SCRIPT_H
#define GODOT_JVM_GDJ_SCRIPT_H

#include "api/script/jvm_script.h"

namespace godot {
class GdjScript : public NamedScript {
    GDCLASS(GdjScript, NamedScript);

    public:
        GdjScript() = default;
        ~GdjScript() override = default;

        ScriptLanguage* _get_language() const override;

    protected:
        static void _bind_methods();
    };
}
#endif// GODOT_JVM_GDJ_SCRIPT_H
