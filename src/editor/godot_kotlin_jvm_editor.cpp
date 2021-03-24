
#include "godot_kotlin_jvm_editor.h"
#include "../logging.h"
#include <editor/filesystem_dock.h>
#include <modules/kotlin_jvm/src/editor/build/build_manager.h>
#include <scene/gui/control.h>

void GodotKotlinJvmEditor::file_system_dock_file_moved(const String& file, const String& new_file) { // NOLINT(readability-convert-member-functions-to-static)
    if (file.ends_with(".kt")) {
        LOG_WARNING(vformat("You should not move kotlin source files in the godot editor! Use the IDE for that. File moved: %s -> %s", file, new_file));
    }
}

void GodotKotlinJvmEditor::file_system_dock_file_removed(const String& file) { // NOLINT(readability-convert-member-functions-to-static)
    if (file.ends_with(".kt")) {
        LOG_WARNING(vformat("You should not remove kotlin source files in the godot editor! Use the IDE for that. File removed: %s", file));
    }
}

void GodotKotlinJvmEditor::file_system_dock_folder_moved(const String& folder, const String& new_folder) { // NOLINT(readability-convert-member-functions-to-static)
    DirAccess* dir_access = DirAccess::create_for_path(new_folder);
    String file_path = dir_access->get_next();
    while (!file_path.empty()) {
        if (file_path.ends_with(".kt")) {
            LOG_WARNING(vformat("You should not move folders with kotlin source files in the godot editor! Use the IDE for that. Folder moved: %s", folder));
            break;
        }
    }
}

void GodotKotlinJvmEditor::menu_option_pressed(int menu_option) {
    switch (menu_option) {
        case ABOUT_KOTLIN_JVM:
            about_dialog->popup_centered_minsize();
            break;
        default:
            LOG_ERROR("Invalid menu option. Please file a bugreport to https://github.com/utopia-rise/godot-kotlin-jvm/issues")
    }
}

void GodotKotlinJvmEditor::on_build_project_pressed() {
    BuildManager::build_project_non_blocking();
    build_dialog->popup_centered_minsize();
}

void GodotKotlinJvmEditor::_notificationv(int p_notification, bool p_reversed) {
    EditorPlugin::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        ClassDB::bind_method(D_METHOD("menu_option_pressed", "menu_option"), &GodotKotlinJvmEditor::menu_option_pressed);
        ClassDB::bind_method(D_METHOD("on_build_project_pressed"), &GodotKotlinJvmEditor::on_build_project_pressed);
        ClassDB::bind_method(D_METHOD("on_build_check_timeout"), &GodotKotlinJvmEditor::on_build_check_timeout);
        ClassDB::bind_method(D_METHOD("file_system_dock_file_moved", "file", "new_file"), &GodotKotlinJvmEditor::file_system_dock_file_moved);
        ClassDB::bind_method(D_METHOD("file_system_dock_file_removed", "file"), &GodotKotlinJvmEditor::file_system_dock_file_removed);
        ClassDB::bind_method(D_METHOD("file_system_dock_folder_moved", "folder", "new_folder"), &GodotKotlinJvmEditor::file_system_dock_folder_moved);

        Control* editor_base_control = get_editor_interface()->get_base_control();

        build_check_timer = memnew(Timer);
        build_check_timer->set_autostart(false);
        build_check_timer->set_wait_time(0.1);
        build_check_timer->set_one_shot(false);
        build_check_timer->connect("timeout", this, "on_build_check_timeout");
        add_child(build_check_timer);

        bottom_panel = memnew(BottomPanel);
        add_control_to_bottom_panel(bottom_panel, "Kotlin/JVM");

        PopupMenu* menu_pop_up = memnew(PopupMenu);
        menu_pop_up->hide();
        menu_pop_up->set_as_toplevel(true);
        menu_pop_up->connect("id_pressed", this, "menu_option_pressed");

        add_tool_submenu_item("Kotlin/JVM", menu_pop_up);

        tool_bar_build_button = memnew(ToolButton);
        tool_bar_build_button->set_text("Build");
        tool_bar_build_button->set_tooltip("Build gradle project");
        tool_bar_build_button->set_focus_mode(Control::FOCUS_NONE);
        tool_bar_build_button->connect("pressed", this, "on_build_project_pressed");

        add_control_to_container(CustomControlContainer::CONTAINER_TOOLBAR, tool_bar_build_button);

        build_dialog = memnew(BuildDialog);
        editor_base_control->add_child(build_dialog);

        about_dialog = memnew(AboutDialog);
        menu_pop_up->add_item("About Godot Kotlin JVM");
        editor_base_control->add_child(about_dialog);

        FileSystemDock* file_system_dock = get_editor_interface()->get_file_system_dock();
        file_system_dock->connect("files_moved", this, "file_system_dock_file_moved");
        file_system_dock->connect("file_removed", this, "file_system_dock_file_removed");
        file_system_dock->connect("folder_moved", this, "file_system_dock_folder_moved");
    }
}

bool GodotKotlinJvmEditor::build() {
    bool is_successful = BuildManager::build_project_blocking();
    if (!is_successful) {
        bottom_panel->show_panel();
    }
    return is_successful;
}

GodotKotlinJvmEditor* GodotKotlinJvmEditor::get_instance() {
    static GodotKotlinJvmEditor* instance{memnew(GodotKotlinJvmEditor)};
    return instance;
}

void GodotKotlinJvmEditor::on_build_check_timeout() { // NOLINT(readability-convert-member-functions-to-static)
    BuildManager::update_build_state();
    bottom_panel->update_state();
    build_dialog->update_state();
}
