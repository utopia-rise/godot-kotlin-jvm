#ifndef GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
#define GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H

#include "dialog/about_dialog.h"
#include "dialog/build_dialog.h"
#include "scene/gui/option_button.h"
#include "scene/gui/separator.h"

#include <editor/plugins/editor_plugin.h>

class GodotKotlinJvmEditor : public EditorPlugin {
    GDCLASS(GodotKotlinJvmEditor, EditorPlugin)
    friend class GradleTaskRunner;

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

    GodotKotlinJvmEditor();
    ~GodotKotlinJvmEditor();

    void on_gradle_task_pressed();
    void on_menu_option_pressed(int option_id);
    void on_generate_project(bool erase_existing);
    void on_filesystem_change();

protected:
    bool build() override;

public:
    static GodotKotlinJvmEditor* get_instance();

    GodotKotlinJvmEditor(const GodotKotlinJvmEditor&) = delete;
    void _notification(int notification);
};

#endif // GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
