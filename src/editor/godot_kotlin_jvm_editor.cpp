
#include "godot_kotlin_jvm_editor.h"
#include "../logging.h"
#include <editor/filesystem_dock.h>
#include <modules/kotlin_jvm/src/editor/build/build_manager.h>
#include <editor/editor_scale.h>
#include <scene/gui/control.h>
#include <core/os/os.h>

void GodotKotlinJvmEditor::file_system_dock_file_moved(const String& file, const String& new_file) {
    if (file.ends_with(".kt")) {
        LOG_WARNING(vformat("You should not move kotlin source files in the godot editor! Use the IDE for that. File moved: %s -> %s", file, new_file));
    }
}

void GodotKotlinJvmEditor::file_system_dock_file_removed(const String& file) {
    if (file.ends_with(".kt")) {
        LOG_WARNING(vformat("You should not remove kotlin source files in the godot editor! Use the IDE for that. File removed: %s", file));
    }
}

void GodotKotlinJvmEditor::file_system_dock_folder_moved(const String& folder, const String& new_folder) {
    DirAccess* dir_access = DirAccess::create_for_path(new_folder);
    String file_path = dir_access->get_next();
    while (!file_path.empty()) {
        if (file_path.ends_with(".kt")) {
            LOG_WARNING(vformat("You should not move folders with kotlin source files in the godot editor! Use the IDE for that. Folder moved: %s", folder));
            break;
        }
    }
}

void GodotKotlinJvmEditor::show_about_dialog() {
    bool show_on_start = editor_settings.ptr()->get_setting("kotlinjvm/editor/show_info_on_start");
    about_dialog_check_box->set_pressed(show_on_start);
    about_dialog->popup_centered_minsize();
}

void GodotKotlinJvmEditor::toggle_about_dialog_on_start(bool enabled) {
    bool show_on_start = editor_settings.ptr()->get_setting("kotlinjvm/editor/show_info_on_start");
    if (show_on_start != enabled) {
        editor_settings.ptr()->set_setting("kotlinjvm/editor/show_info_on_start", enabled);
    }
}

void GodotKotlinJvmEditor::menu_option_pressed(int menu_option) {
    switch (menu_option) {
        case ABOUT_KOTLIN_JVM:
            show_about_dialog();
            break;
        default:
            LOG_ERROR("Invalid menu option. Please file a bugreport to https://github.com/utopia-rise/godot-kotlin-jvm/issues")
    }
}

void GodotKotlinJvmEditor::build_project_pressed() {
    build_dialog_log->set_text("");
    BuildManager::build_project_non_blocking();
    build_dialog->popup_centered_minsize();
}

void GodotKotlinJvmEditor::_notificationv(int p_notification, bool p_reversed) {
    EditorPlugin::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        bool show_info_dialog = editor_settings.ptr()->get_setting("kotlinjvm/editor/show_info_on_start");
        if (show_info_dialog) {
            about_dialog->set_exclusive(true);
            show_about_dialog();
            about_dialog->set_exclusive(false);
        }
        // Once shown a first time, it can be seen again via the Kotlin JVM menu - it doesn't have to be exclusive from that time on.

        FileSystemDock* file_system_dock = get_editor_interface()->get_file_system_dock();
        file_system_dock->connect("files_moved", this, "file_system_dock_file_moved");
        file_system_dock->connect("file_removed", this, "file_system_dock_file_removed");
        file_system_dock->connect("folder_moved", this, "file_system_dock_folder_moved");
    }
}

void GodotKotlinJvmEditor::show_error_dialog(const String& message, const String& title) {
    error_dialog->set_title(title);
    error_dialog->set_text(message);
    error_dialog->popup_centered_minsize();
}

bool GodotKotlinJvmEditor::build() {
    BuildOutput build_output = BuildManager::build_project_blocking();
    bottom_panel->update_log_output();
    return build_output.result == Error::OK;
}

static GodotKotlinJvmEditor* instance = nullptr;
GodotKotlinJvmEditor* GodotKotlinJvmEditor::get_instance() {
    if (instance == nullptr) {
        instance = memnew(GodotKotlinJvmEditor());
    }
    return instance;
}

GodotKotlinJvmEditor::GodotKotlinJvmEditor() {
    ClassDB::bind_method(D_METHOD("menu_option_pressed", "menu_option"), &GodotKotlinJvmEditor::menu_option_pressed);
    ClassDB::bind_method(D_METHOD("build_project_pressed"), &GodotKotlinJvmEditor::build_project_pressed);
    ClassDB::bind_method(D_METHOD("toggle_about_dialog_on_start", "enabled"), &GodotKotlinJvmEditor::toggle_about_dialog_on_start);
    ClassDB::bind_method(D_METHOD("file_system_dock_file_moved", "file", "new_file"), &GodotKotlinJvmEditor::file_system_dock_file_moved);
    ClassDB::bind_method(D_METHOD("file_system_dock_file_removed", "file"), &GodotKotlinJvmEditor::file_system_dock_file_removed);
    ClassDB::bind_method(D_METHOD("file_system_dock_folder_moved", "folder", "new_folder"), &GodotKotlinJvmEditor::file_system_dock_folder_moved);
    ClassDB::bind_method(D_METHOD("on_about_issue_tracker_url_clicked", "meta"), &GodotKotlinJvmEditor::on_about_issue_tracker_url_clicked);
    ClassDB::bind_method(D_METHOD("on_build_check"), &GodotKotlinJvmEditor::on_build_check);
    ClassDB::bind_method(D_METHOD("cancel_build"), &GodotKotlinJvmEditor::cancel_build);
    ClassDB::bind_method(D_METHOD("on_build_dialog_hide"), &GodotKotlinJvmEditor::on_build_dialog_hide);
    ClassDB::bind_method(D_METHOD("on_build_button_pressed"), &BottomPanel::on_build_button_pressed);
    ClassDB::bind_method(D_METHOD("on_clear_log_button_pressed"), &BottomPanel::on_clear_log_button_pressed);

    _EDITOR_DEF("kotlinjvm/editor/show_info_on_start", true, false);

    EditorInterface* editor_interface = get_editor_interface();
    Control* editor_base_control = editor_interface->get_base_control();
    editor_settings = editor_interface->get_editor_settings();

    build_check_timer = memnew(Timer);
    build_check_timer->set_autostart(false);
    build_check_timer->set_wait_time(0.1);
    build_check_timer->set_one_shot(false);
    editor_base_control->get_root_parent_control()->add_child(build_check_timer);
    build_check_timer->connect("timeout", this, "on_build_check");

    error_dialog = memnew(AcceptDialog);
    editor_base_control->add_child(error_dialog);

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
    tool_bar_build_button->connect("pressed", this, "build_project_pressed");

    add_control_to_container(CustomControlContainer::CONTAINER_TOOLBAR, tool_bar_build_button);

    build_dialog = memnew(AcceptDialog);
    editor_base_control->add_child(build_dialog);
    build_dialog->add_cancel("Cancel")->connect("pressed", this, "cancel_build");
    build_dialog->set_title("Building...");
    build_dialog->connect("popup_hide", this, "on_build_dialog_hide");

    build_dialog_scroll_container = memnew(ScrollContainer);
    build_dialog_scroll_container->set_custom_minimum_size(Size2{600, 150} * EDSCALE);
    build_dialog->add_child(build_dialog_scroll_container);

    build_dialog_log = memnew(Label);
    build_dialog_log->set_h_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    build_dialog_scroll_container->add_child(build_dialog_log);

    about_dialog = memnew(AcceptDialog);
    menu_pop_up->add_item("About Godot Kotlin JVM");
    editor_base_control->add_child(about_dialog);
    about_dialog->set_title("About Godot Kotlin JVM");

    // Main VBoxContainer (icon + label on top, checkbox at bottom)
    VBoxContainer* about_vbox = memnew(VBoxContainer);
    about_dialog->add_child(about_vbox);

    // HBoxContainer for icon + label
    HBoxContainer* about_hbox = memnew(HBoxContainer);
    about_vbox->add_child(about_hbox);

    TextureRect* about_icon = memnew(TextureRect);
    about_icon->set_texture(about_icon->get_icon("NodeWarning", "EditorIcons"));
    about_hbox->add_child(about_icon);

    RichTextLabel* about_label = memnew(RichTextLabel);
    about_hbox->add_child(about_label);
    about_label->set_custom_minimum_size(Size2{600, 150} * EDSCALE);
    about_label->set_v_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    about_label->set_bbcode(
            "Godot Kotlin JVM is a community project and is in no way related to Godot or Jetbrains.\n\n"
            "The project is in alpha stage and, while already usable, it is not meant for use in production.\n"
            "Future updates might still include breaking changes.\n\n"
            "If you encounter any bugs or problems, please report them on our [url=https://github.com/utopia-rise/godot-kotlin-jvm/issues]issue tracker[/url]"
    );
    about_label->set_scroll_active(false);
    about_label->set_use_bbcode(true);
    about_label->connect("meta_clicked", this, "on_about_issue_tracker_url_clicked");

    about_dialog_check_box = memnew(CheckBox);
    about_vbox->add_child(about_dialog_check_box);
    about_dialog_check_box->set_text("Show this info when starting the editor");
    about_dialog_check_box->connect("toggled", this, "toggle_about_dialog_on_start");
}

void GodotKotlinJvmEditor::on_about_issue_tracker_url_clicked(const String& meta) {
    OS::get_singleton()->shell_open(meta);
}

void GodotKotlinJvmEditor::on_build_check() {
    BuildManager::update_build_state();
    bottom_panel->on_build_check();
    if (BuildManager::can_build_project()) {
        build_dialog->hide();
        tool_bar_build_button->set_disabled(false);
    } else {
        tool_bar_build_button->set_disabled(true);
    }
}

void GodotKotlinJvmEditor::cancel_build() {
    build_dialog->hide();
    BuildManager::cancel_build();
}

void GodotKotlinJvmEditor::on_build_dialog_hide() {
    build_dialog_log->set_text("");
}
