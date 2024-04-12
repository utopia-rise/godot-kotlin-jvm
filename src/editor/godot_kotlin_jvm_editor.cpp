#ifdef TOOLS_ENABLED

#include "godot_kotlin_jvm_editor.h"

#include "../logging.h"
#include "editor/build/build_manager.h"
#include "gd_kotlin.h"
#include "godotkotlin_defs.h"

#include <core/config/project_settings.h>
#include <editor/editor_interface.h>
#include <editor/filesystem_dock.h>

void GodotKotlinJvmEditor::on_file_system_dock_file_moved(// NOLINT(readability-convert-member-functions-to-static)
  const String& file,
  const String& new_file
) {
    if (file.ends_with(String(".") + GODOT_JVM_REGISTRATION_FILE_EXTENSION)) {
        LOG_WARNING(
          vformat("You should not move registration files in the godot editor! Use the IDE for that. File moved: %s -> %s", file, new_file)
        );
    }
}

void GodotKotlinJvmEditor::on_file_system_dock_file_removed(// NOLINT(readability-convert-member-functions-to-static)
  const String& file
) {
    if (file.ends_with(String(".") + GODOT_JVM_REGISTRATION_FILE_EXTENSION)) {
        LOG_WARNING(vformat("You should not remove registration files in the godot editor! Use the IDE for that. File removed: %s", file));
    }
}

void GodotKotlinJvmEditor::on_file_system_dock_folder_moved(// NOLINT(readability-convert-member-functions-to-static)
  const String& folder,
  const String& new_folder
) {
    Ref<DirAccess> dir_access {DirAccess::create_for_path(new_folder)};
    String file_path = dir_access->get_next();
    while (!file_path.is_empty()) {
        if (file_path.ends_with(String(".") + GODOT_JVM_REGISTRATION_FILE_EXTENSION)) {
            LOG_WARNING(vformat("You should not move folders with registration files in the godot editor! Use the IDE for that. Folder moved: %s", folder)
            );
            break;
        }
        file_path = dir_access->get_next();
    }
}

void GodotKotlinJvmEditor::on_menu_option_pressed(int menu_option) {
    switch (menu_option) {
        case ABOUT_KOTLIN_JVM:
            about_dialog->popup_centered();
            break;
        default:
            LOG_ERROR("Invalid menu option. Please file a bugreport to "
                      "https://github.com/utopia-rise/godot-kotlin-jvm/issues");
    }
}

void GodotKotlinJvmEditor::on_build_project_pressed() {
    BuildManager::get_instance().build_project_non_blocking();
    build_dialog->popup_centered();
}

void GodotKotlinJvmEditor::_notificationv(int p_notification, bool p_reversed) {
    EditorPlugin::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        _EDITOR_DEF("kotlin_jvm/editor/build_gradle_before_start", true, false);
        _GLOBAL_DEF("kotlin_jvm/editor/gradle_wrapper_dir", "res://", false);
        ProjectSettings::get_singleton()->set_custom_property_info(
          PropertyInfo(Variant::STRING, "kotlin_jvm/editor/gradle_wrapper_dir", PROPERTY_HINT_GLOBAL_DIR, "")
        );

        ClassDB::bind_method(D_METHOD("on_menu_option_pressed", "menu_option"), &GodotKotlinJvmEditor::on_menu_option_pressed);
        ClassDB::bind_method(D_METHOD("on_build_project_pressed"), &GodotKotlinJvmEditor::on_build_project_pressed);
        ClassDB::bind_method(D_METHOD("on_build_check_timeout"), &GodotKotlinJvmEditor::on_build_check_timeout);
        ClassDB::bind_method(D_METHOD("on_file_system_dock_file_moved", "file", "new_file"), &GodotKotlinJvmEditor::on_file_system_dock_file_moved);
        ClassDB::bind_method(D_METHOD("on_file_system_dock_file_removed", "file"), &GodotKotlinJvmEditor::on_file_system_dock_file_removed);
        ClassDB::bind_method(D_METHOD("on_file_system_dock_folder_moved", "folder", "new_folder"), &GodotKotlinJvmEditor::on_file_system_dock_folder_moved);

        Control* editor_base_control = get_editor_interface()->get_base_control();

        build_check_timer->set_autostart(false);
        build_check_timer->set_wait_time(0.2);
        build_check_timer->set_one_shot(false);
        build_check_timer->connect(SNAME("timeout"), callable_mp(this, &GodotKotlinJvmEditor::on_build_check_timeout));
        add_child(build_check_timer);

        add_control_to_bottom_panel(bottom_panel, "Kotlin/JVM");

        PopupMenu* menu_pop_up {memnew(PopupMenu)};
        menu_pop_up->hide();

        // TODO/4.0: Check if still necessary and how to do it, as it now inherits from Window and not CanvasItem.
        // menu_pop_up->set_as_toplevel(true);
        menu_pop_up->connect(SNAME("id_pressed"), callable_mp(this, &GodotKotlinJvmEditor::on_menu_option_pressed));

        add_tool_submenu_item("Kotlin/JVM", menu_pop_up);

        tool_bar_build_button->set_text("Build");
        tool_bar_build_button->set_tooltip_text("Build gradle project");
        tool_bar_build_button->set_focus_mode(Control::FOCUS_NONE);
        tool_bar_build_button->connect(SNAME("pressed"), callable_mp(this, &GodotKotlinJvmEditor::on_build_project_pressed));

        add_control_to_container(CustomControlContainer::CONTAINER_TOOLBAR, tool_bar_build_button);

        editor_base_control->add_child(build_dialog);

        menu_pop_up->add_item("About Godot Kotlin JVM");
        editor_base_control->add_child(about_dialog);
        editor_base_control->add_child(error_dialog);

        FileSystemDock* file_system_dock = get_editor_interface()->get_file_system_dock();
        file_system_dock->connect(SNAME("files_moved"), callable_mp(this, &GodotKotlinJvmEditor::on_file_system_dock_file_moved));
        file_system_dock->connect(SNAME("file_removed"), callable_mp(this, &GodotKotlinJvmEditor::on_file_system_dock_file_removed));
        file_system_dock->connect(SNAME("folder_moved"), callable_mp(this, &GodotKotlinJvmEditor::on_file_system_dock_folder_moved));

    }
}

bool GodotKotlinJvmEditor::build() {
    bool build_gradle_before_start =
      get_editor_interface()->get_editor_settings()->get_setting("kotlin_jvm/editor/build_gradle_before_start");

    if (build_gradle_before_start) {
        bool is_successful = BuildManager::get_instance().build_project_blocking();
        if (!is_successful) { bottom_panel->make_visible(); }
        return is_successful;
    } else {
        return true;
    }
}

GodotKotlinJvmEditor* GodotKotlinJvmEditor::get_instance() {
    static GodotKotlinJvmEditor* instance {memnew(GodotKotlinJvmEditor)};
    return instance;
}

void GodotKotlinJvmEditor::on_build_check_timeout() {// NOLINT(readability-convert-member-functions-to-static)
    BuildManager::get_instance().update_build_state();
    bottom_panel->update_state();
    build_dialog->update_state();
}

GodotKotlinJvmEditor::GodotKotlinJvmEditor() :
  build_check_timer(memnew(Timer)),
  about_dialog(memnew(AboutDialog)),
  error_dialog(memnew(ErrorDialog)),
  build_dialog(memnew(BuildDialog)),
  tool_bar_build_button(memnew(Button)),
  bottom_panel(memnew(BottomPanel)) {
    tool_bar_build_button->set_flat(true);
}

#endif// TOOLS_ENABLED