
#ifdef TOOLS_ENABLED

#include "build_manager.h"

#include "../godot_kotlin_jvm_editor.h"
#include "editor/strings.h"
#include "logging.h"

#include <core/config/project_settings.h>
#include <editor/editor_node.h>

Mutex build_mutex {};

String get_build_gradle_path() {
    String gradle_wrapper_path {ProjectSettings::get_singleton()->globalize_path(GLOBAL_GET(gradle_dir))};
    return gradle_wrapper_path.path_join("build.gradle.kts");
}

String get_gradlew_path() {
#if defined _WIN32 || defined _WIN64
    String gradle_wrapper {"gradlew.bat"};
#else
    String gradle_wrapper {"gradlew"};
#endif

    String gradle_wrapper_path {ProjectSettings::get_singleton()->globalize_path(GLOBAL_GET(gradle_dir))};
    return gradle_wrapper_path.path_join(gradle_wrapper);
}

Error BuildManager::build_project() {
    List<String> args {};
    args.push_back("build");

    String gradlew_path = get_gradlew_path();
    JVM_LOG_INFO("Running %s build task...", gradlew_path);

    int exit_code;
    Error result = OS::get_singleton()->execute(gradlew_path, args, &build_log, &exit_code, true, &build_mutex, false);
    return result;
}

bool BuildManager::build_project_blocking() {
    JVM_ERR_FAIL_COND_V_MSG(!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists(get_build_gradle_path()), false, missing_gradle_project);

    build_log.clear();

    if (build_project() != Error::OK) {
        // When in blocking mode, only make the window appears when it fails
        GodotKotlinJvmEditor::get_instance()->update_build_dialog(build_log);
        return false;
    }
    GodotKotlinJvmEditor::get_instance()->on_build_finished();
    return true;
}

void BuildManager::build_task(void* p_userdata) {
    GodotKotlinJvmEditor::get_instance()->update_build_dialog(start_build);

    if (BuildManager::get_instance().build_project() == Error::OK) {
        GodotKotlinJvmEditor::get_instance()->on_build_finished();
    }

    GodotKotlinJvmEditor::get_instance()->update_build_dialog(BuildManager::get_instance().build_log);
    BuildManager::get_instance().taskId = WorkerThreadPool::INVALID_TASK_ID;
}

void BuildManager::build_project_non_blocking() {
    if (taskId != WorkerThreadPool::INVALID_TASK_ID) { return; }
    JVM_ERR_FAIL_COND_MSG(!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists(get_build_gradle_path()), missing_gradle_project);

    build_log.clear();
    taskId = WorkerThreadPool::get_singleton()->add_native_task(build_task, nullptr);
}

BuildManager& BuildManager::get_instance() {
    static BuildManager instance;
    return instance;
}

#endif// TOOLS_ENABLED
