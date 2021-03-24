
#ifndef GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
#define GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H


#include <editor/editor_plugin.h>
#include "dialog/about_dialog.h"
#include "dialog/build_dialog.h"
#include "menu_option.h"
#include "panel/bottom_panel.h"

class GodotKotlinJvmEditor : public EditorPlugin {

public:
    static GodotKotlinJvmEditor* get_instance();
    Timer* build_check_timer;

protected:
    void _notificationv(int p_notification, bool p_reversed) override;
    bool build() override;

    void menu_option_pressed(int menu_option);

    void file_system_dock_file_moved(const String& file, const String& new_file);
    void file_system_dock_file_removed(const String& file);
    void file_system_dock_folder_moved(const String& folder, const String& new_folder);

private:
    AboutDialog* about_dialog;
    BuildDialog* build_dialog;
    ToolButton *tool_bar_build_button;
    BottomPanel* bottom_panel;

    void on_build_project_pressed();
    void on_build_check_timeout();
};


#endif //GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
