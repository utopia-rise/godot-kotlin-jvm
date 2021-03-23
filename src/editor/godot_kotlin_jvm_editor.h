
#ifndef GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
#define GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H


#include <editor/editor_plugin.h>
#include "menu_option.h"
#include "bottom_panel.h"

class GodotKotlinJvmEditor : public EditorPlugin {
private:
    GodotKotlinJvmEditor();

    Ref<EditorSettings> editor_settings;
    AcceptDialog* error_dialog;
    AcceptDialog* about_dialog;
    CheckBox* about_dialog_check_box;
    ToolButton *tool_bar_build_button;

    void show_about_dialog();
    void build_project_pressed();

public:
    Timer* build_check_timer;
    BottomPanel* bottom_panel;
    ScrollContainer *build_dialog_scroll_container;
    Label *build_dialog_log;
    void _notificationv(int p_notification, bool p_reversed) override;
    void show_error_dialog(const String& message, const String& title = "Error");
    bool build() override;
    static GodotKotlinJvmEditor* get_instance();

    void toggle_about_dialog_on_start(bool enabled);
    void menu_option_pressed(int menu_option);
    void file_system_dock_file_moved(const String& file, const String& new_file);
    void file_system_dock_file_removed(const String& file);
    void file_system_dock_folder_moved(const String& folder, const String& new_folder);
    void on_about_issue_tracker_url_clicked(const String& meta);
    void on_build_check();
    void cancel_build();

    void on_build_dialog_hide();

    AcceptDialog* build_dialog;
};


#endif //GODOT_JVM_GODOT_KOTLIN_JVM_EDITOR_H
