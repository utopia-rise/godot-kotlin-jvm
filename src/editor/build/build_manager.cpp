
#ifdef TOOLS_ENABLED

#include "build_manager.h"

#include "../godot_kotlin_jvm_editor.h"
#include "editor/strings.h"
#include "logging.h"

#include <core/config/project_settings.h>
#include <editor/editor_node.h>

Mutex build_mutex {};

Error BuildManager::build_project() {
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) {
        return Error::OK;
    }

    List<String> args {};
    args.push_back("build");

#if defined _WIN32 || defined _WIN64
    String gradle_wrapper {"gradlew.bat"};
#else
    String gradle_wrapper {"gradlew"};
#endif

    String gradle_wrapper_path {ProjectSettings::get_singleton()->globalize_path(GLOBAL_GET(gradle_dir))};

    if (!gradle_wrapper_path.ends_with("/")) { gradle_wrapper_path = gradle_wrapper_path + "/"; }

    String gradle_command {gradle_wrapper_path + gradle_wrapper};

    int exit_code;
    Error result = OS::get_singleton()->execute(gradle_command, args, &build_log, &exit_code, true, &build_mutex, false);
    last_build_exit_code = exit_code;

    return result;
}

bool BuildManager::build_project_blocking() {
    JVM_ERR_FAIL_COND_V_MSG(!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts"), false, missing_gradle_project);

    Error result = build_project();

    // When in blocking mode, only make the window appears when it fails
    if (!last_build_successful()) { GodotKotlinJvmEditor::get_instance()->update_build_dialog(build_log); }

    return result == Error::OK && last_build_successful();
}

void BuildManager::build_task(void* p_userdata) {
    GodotKotlinJvmEditor::get_instance()->update_build_dialog(start_build);

    BuildManager::get_instance().build_project();

    BuildManager::get_instance().taskId = WorkerThreadPool::INVALID_TASK_ID;
    GodotKotlinJvmEditor::get_instance()->update_build_dialog(BuildManager::get_instance().build_log);
}

void BuildManager::build_project_non_blocking() {
    if (taskId != WorkerThreadPool::INVALID_TASK_ID) { return; }
    JVM_ERR_FAIL_COND_MSG(!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts"), missing_gradle_project);

    taskId = WorkerThreadPool::get_singleton()->add_native_task(build_task, nullptr);
}

bool BuildManager::can_build_project() {
    return taskId == WorkerThreadPool::INVALID_TASK_ID;
}

bool BuildManager::last_build_successful() const {
    bool result = last_build_exit_code == 0;
    return result;
}

BuildManager& BuildManager::get_instance() {
    static BuildManager instance;
    return instance;
}

#endif// TOOLS_ENABLED
