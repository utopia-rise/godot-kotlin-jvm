#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
#define GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H

#include "dialog/about_dialog.h"
#include "dialog/build_dialog.h"

#include <editor/plugins/editor_plugin.h>

class GodotKotlinJvmEditor : public EditorPlugin {
    GDCLASS(GodotKotlinJvmEditor, EditorPlugin)
    friend class BuildManager;

    enum KOTLIN_JVM_MENU_OPTIONS{
        GENERATE_PROJECT,
        ABOUT
    };

    PopupMenu* about_pop_menu;
    AboutDialog* about_dialog;
    BuildDialog* build_dialog;
    AcceptDialog* project_dialog;
    Button* tool_bar_build_button;

    GodotKotlinJvmEditor();
    ~GodotKotlinJvmEditor();

    void on_build_project_pressed();
    void on_menu_option_pressed(int option_id);
    void on_generate_project(bool erase_existing);
    void on_build_finished();
    void on_filesystem_change();

protected:
    bool build() override;

public:
    static GodotKotlinJvmEditor* get_instance();

    GodotKotlinJvmEditor(const GodotKotlinJvmEditor&) = delete;

    void _notification(int notification);
    void update_build_dialog(String log);

};

#endif// GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H

#endif// TOOLS_ENABLED