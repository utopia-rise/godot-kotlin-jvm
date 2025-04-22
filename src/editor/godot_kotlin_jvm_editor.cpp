#ifdef TOOLS_ENABLED

#include "godot_kotlin_jvm_editor.h"

#include "editor/build/build_manager.h"
#include "lifecycle/paths.h"
#include "project/project_generator.h"
#include "strings.h"

#include <core/config/project_settings.h>
#include <editor/editor_interface.h>
#include <editor/filesystem_dock.h>
#include <gd_kotlin.h>

void GodotKotlinJvmEditor::on_menu_option_pressed(int option_id) {
    switch (option_id) {
        case GENERATE_PROJECT:
            project_dialog->popup_centered();
            break;
        case ABOUT:
            about_dialog->popup_centered();
            break;
    }
}

void GodotKotlinJvmEditor::on_generate_project(bool erase_existing) {
    ProjectGenerator::generate_jvm_files(erase_existing);
    get_editor_interface()->get_resource_file_system()->scan();
    project_dialog->hide();
}

void GodotKotlinJvmEditor::on_gradle_task_pressed() {
    if (GradleTaskManager::get_instance().is_task_started()) { return; }
    task_dialog->make_appear();
    String log;
    GradleTaskManager::get_instance().run_task(GradleTaskManager::Task::BUILD_DEBUG, log, false);
    JVM_LOG_INFO(log);
}

void GodotKotlinJvmEditor::on_filesystem_change() {
    if (GDKotlin::get_instance().state == GDKotlin::State::JVM_SCRIPTS_INITIALIZED) { return; }

    // We check for changes in the file system in case the main.jar has been added (not reloaded, just was not present when the editor started)
    if (GDKotlin::get_instance().state == GDKotlin::State::JVM_STARTED) {
        String bootstrap {String(RES_DIRECTORY).path_join(BOOTSTRAP_FILE)};
        if (FileAccess::exists(bootstrap)) {
            GDKotlin::get_instance().initialize_up_to(GDKotlin::State::JVM_SCRIPTS_INITIALIZED);
        }
    }
}

bool GodotKotlinJvmEditor::build() {
    bool build_gradle_before_start = EDITOR_GET(build_before_start);

    if (build_gradle_before_start) {
        String log;
        Error error = GradleTaskManager::get_instance().run_task(GradleTaskManager::Task::BUILD_DEBUG, log, true);
        JVM_LOG_INFO(log);

        if(error != OK){
            task_dialog->make_appear();
            task_dialog->update_state(log);
            return false;
        }

        return true;
    } else {
        return true;
    }
}

GodotKotlinJvmEditor* GodotKotlinJvmEditor::get_instance() {
    static GodotKotlinJvmEditor* instance {memnew(GodotKotlinJvmEditor)};
    return instance;
}


void GodotKotlinJvmEditor::_notification(int notification) {
    Control* editor_base_control = get_editor_interface()->get_base_control();

    switch (notification) {
        case NOTIFICATION_ENTER_TREE:
            _EDITOR_DEF(build_before_start, false);
            _EDITOR_DEF(show_info_on_start, true);
            _GLOBAL_DEF(gradle_dir, "res://");
            ProjectSettings::get_singleton()->set_custom_property_info(
              PropertyInfo(Variant::STRING, gradle_dir, PROPERTY_HINT_GLOBAL_DIR, "")
            );

            project_dialog->set_title("JVM project generation");
            project_dialog->set_text(generate_project);

            project_dialog->get_ok_button()->set_text(generate_missing);
            project_dialog->get_ok_button()->connect(
              "pressed",
              callable_mp(this, &GodotKotlinJvmEditor::on_generate_project).bind(false)
            );
            project_dialog->add_button(generate_all)
              ->connect("pressed", callable_mp(this, &GodotKotlinJvmEditor::on_generate_project).bind(true));
            project_dialog->add_cancel_button(generate_nothing);

            about_pop_menu->hide();
            about_pop_menu->connect(SNAME("id_pressed"), callable_mp(this, &GodotKotlinJvmEditor::on_menu_option_pressed));
            about_pop_menu->add_item("Generate JVM project", GENERATE_PROJECT);
            about_pop_menu->add_item("About Godot Kotlin JVM", ABOUT);
            add_tool_submenu_item("Kotlin/JVM", about_pop_menu);

            tool_bar_build_button->set_flat(true);
            tool_bar_build_button->set_text("Build");
            tool_bar_build_button->set_tooltip_text("Build gradle project");
            tool_bar_build_button->set_focus_mode(Control::FOCUS_NONE);
            tool_bar_build_button->connect(SNAME("pressed"), callable_mp(this, &GodotKotlinJvmEditor::on_gradle_task_pressed));
            add_control_to_container(CustomControlContainer::CONTAINER_TOOLBAR, tool_bar_build_button);

            editor_base_control->add_child(task_dialog);
            editor_base_control->add_child(about_dialog);
            editor_base_control->add_child(project_dialog);

            get_editor_interface()->get_resource_file_system()->connect(
              SNAME("filesystem_changed"),
              callable_mp(this, &GodotKotlinJvmEditor::on_filesystem_change)
            );
            set_process(true);
            break;

        case NOTIFICATION_PROCESS:
            if (GradleTaskManager::get_instance().is_task_started()) {
                String log;
                String error;
                GradleTaskManager::get_instance().get_task_output(log, error);
                task_dialog->update_state(log + error);

                if(!log.is_empty()){
                    print_line(log); // Use regular Godot print to avoid spamming the JVM prefix for every line of the output.
                }
                if(!error.is_empty()){
                    JVM_ERR_FAIL_MSG(error);
                }

                if (GradleTaskManager::get_instance().is_task_terminated()) {
                    JVM_LOG_INFO("Gradle Task terminated");
                    get_editor_interface()->get_resource_file_system()->scan_changes();
                }
            }
            break;

        case NOTIFICATION_EXIT_TREE:
            editor_base_control->remove_child(task_dialog);
            editor_base_control->remove_child(about_dialog);
            editor_base_control->remove_child(project_dialog);
            remove_tool_menu_item("Kotlin/JVM");
            remove_control_from_container(CustomControlContainer::CONTAINER_TOOLBAR, tool_bar_build_button);
            break;
    }
}

GodotKotlinJvmEditor::GodotKotlinJvmEditor() :
  about_pop_menu(memnew(PopupMenu)),
  about_dialog(memnew(AboutDialog)),
  task_dialog(memnew(BuildDialog)),
  project_dialog(memnew(AcceptDialog)),
  tool_bar_build_button(memnew(Button)) {}

GodotKotlinJvmEditor::~GodotKotlinJvmEditor() {
    GradleTaskManager::get_instance().cleanup();
    memdelete(about_dialog);
    memdelete(task_dialog);
    memdelete(project_dialog);
    memdelete(tool_bar_build_button);
}

#endif // TOOLS_ENABLED