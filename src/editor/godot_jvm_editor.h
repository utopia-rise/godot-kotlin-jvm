#ifndef GODOT_JVM_GODOT_JVM_EDITOR_H
#define GODOT_JVM_GODOT_JVM_EDITOR_H

#include "ui/about_dialog.h"
#include "ui/task_dialog.h"

#include <classes/accept_dialog.hpp>
#include <classes/editor_plugin.hpp>
#include <classes/editor_settings.hpp>
#include <classes/option_button.hpp>
#include <classes/v_separator.hpp>

namespace godot {
    class GodotJvmEditor : public EditorPlugin {
        GDCLASS(GodotJvmEditor, EditorPlugin)
        friend class BuildManager;

        enum KOTLIN_JVM_MENU_OPTIONS {
            GENERATE_PROJECT,
            ABOUT
        };

        PopupMenu* about_pop_menu;
        AboutDialog* about_dialog;
        TaskDialog* task_dialog;

        AcceptDialog* project_dialog;

        VSeparator* separator;
        Button* tool_bar_gradle_task_button;
        OptionButton* tool_bar_gradle_task_choice;

        GodotJvmEditor();
        ~GodotJvmEditor();

        void on_gradle_task_pressed();
        void on_menu_option_pressed(int option_id);
        void on_generate_project(bool erase_existing);
        void on_filesystem_change();

    protected:
        static void _bind_methods();

    public:
        static GodotJvmEditor* get_instance();
        inline static float editor_scale = 1.0f;
        inline static Ref<EditorSettings> editor_settings;

        GodotJvmEditor(const GodotJvmEditor&) = delete;

        bool _build() override;
        void _notification(int notification);
    };
} // namespace godot
#endif // GODOT_JVM_GODOT_JVM_EDITOR_H
