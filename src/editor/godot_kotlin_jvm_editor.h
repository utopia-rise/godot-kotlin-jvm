
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
#define GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H


#include <editor/editor_plugin.h>
#include <modules/kotlin_jvm/src/editor/build/build_lock_watcher.h>
#include "dialog/error_dialog.h"
#include "dialog/about_dialog.h"
#include "dialog/build_dialog.h"
#include "menu_option.h"
#include "panel/bottom_panel.h"

class GodotKotlinJvmEditor : public EditorPlugin {
public:
    static GodotKotlinJvmEditor* get_instance();

    GodotKotlinJvmEditor(const GodotKotlinJvmEditor&) = delete;

    GodotKotlinJvmEditor& operator=(const GodotKotlinJvmEditor&) = delete;

    Timer* build_check_timer;

    void on_build_check_timeout();

protected:
    void _notificationv(int p_notification, bool p_reversed) override;

    bool build() override;

private:
    GodotKotlinJvmEditor();
    AboutDialog* about_dialog;
    ErrorDialog* error_dialog;
    BuildDialog* build_dialog;
    ToolButton* tool_bar_build_button;
    BottomPanel* bottom_panel;
    BuildLockWatcher* build_lock_watcher;

    void on_build_project_pressed();

    void on_menu_option_pressed(int menu_option);

    void on_file_system_dock_file_moved(const String& file, const String& new_file);

    void on_file_system_dock_file_removed(const String& file);

    void on_file_system_dock_folder_moved(const String& folder, const String& new_folder);
};


#endif //GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H

#endif //TOOLS_ENABLED
