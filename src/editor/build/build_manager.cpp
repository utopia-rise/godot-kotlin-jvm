
#ifdef TOOLS_ENABLED

#include "build_manager.h"

#include "../godot_kotlin_jvm_editor.h"

#include <core/config/project_settings.h>
#include <editor/editor_node.h>

void background_trigger_build(void* p_userdata) {
    BuildManager::get_instance().build_blocking();
}

BuildManager::BuildManager() : build_mutex(), build_thread(), build_finished(false), last_build_exit_code(0) {}

bool BuildManager::build_project_blocking() {
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) { return true; }

    clear_log();

    EditorNode::progress_add_task("build_godot_kotlin_jvm", "Building with gradle...", 2);
    EditorNode::progress_task_step("build_godot_kotlin_jvm", "Building gradle project", 1);

    Error result = build_blocking();

    EditorNode::progress_task_step("build_godot_kotlin_jvm", "Done", 2);// dummy to not start at 0% or 100%
    EditorNode::progress_end_task("build_godot_kotlin_jvm");

    GodotKotlinJvmEditor::get_instance()->on_build_check_timeout();// manually call what timer would call to update ui
    return result == Error::OK && last_build_successful();
}

void BuildManager::build_project_non_blocking() {
    if (!build_thread.is_started()) {
        clear_log();
        GodotKotlinJvmEditor::get_instance()->build_check_timer->start();
        build_thread.start(background_trigger_build, nullptr);
    }
}

bool BuildManager::can_build_project() {
    build_mutex.lock();
    bool result = build_finished;
    build_mutex.unlock();
    return result;
}

// convenience function for better readability in some places
bool BuildManager::is_build_finished() {
    return can_build_project();
}

void BuildManager::update_build_state() {
    if (!build_thread.is_started()) {
        GodotKotlinJvmEditor::get_instance()->build_check_timer->stop();
        return;
    }

    build_mutex.lock();
    if (build_finished) { build_thread.wait_to_finish(); }
    build_mutex.unlock();
}

String BuildManager::get_log() {
    build_mutex.lock();
    String result = build_log;
    build_mutex.unlock();
    return result;
}

void BuildManager::clear_log() {
    build_mutex.lock();
    build_log.clear();
    build_mutex.unlock();
}

Error BuildManager::build_blocking() {
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) {
        return Error::OK;
    }
    clear_log();
    build_mutex.lock();
    build_finished = false;
    build_mutex.unlock();

    List<String> args {};
    args.push_back("build");

#if defined _WIN32 || defined _WIN64
    String gradle_wrapper {"gradlew.bat"};
#else
    String gradle_wrapper {"gradlew"};
#endif

    String gradle_wrapper_path {ProjectSettings::get_singleton()->globalize_path(ProjectSettings::get_singleton()->get_setting("kotlin_jvm/editor/gradle_wrapper_dir"
    ))};

    if (!gradle_wrapper_path.ends_with("/")) { gradle_wrapper_path = gradle_wrapper_path + "/"; }

    String gradle_command {gradle_wrapper_path + gradle_wrapper};

    int exit_code;
    Error result = OS::get_singleton()->execute(gradle_command, args, &build_log, &exit_code, true, &build_mutex, false);

    build_mutex.lock();
    last_build_exit_code = exit_code;
    build_finished = true;
    build_mutex.unlock();

    return result;
}

bool BuildManager::last_build_successful() const {
    build_mutex.lock();
    bool result = last_build_exit_code == 0;
    build_mutex.unlock();
    return result;
}

BuildManager& BuildManager::get_instance() {
    static BuildManager instance;
    return instance;
}

#endif// TOOLS_ENABLED
