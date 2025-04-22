
#ifdef TOOLS_ENABLED

#include "../godot_kotlin_jvm_editor.h"
#include "editor/strings.h"
#include "gradle_task_runner.h"
#include "logging.h"

#include <core/config/project_settings.h>

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

Error GradleTaskRunner::run_task(int task_id, String& log, bool blocking) {
    JVM_ERR_FAIL_COND_V_MSG(
      !FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists(get_build_gradle_path()),
      Error::ERR_FILE_NOT_FOUND,
      missing_gradle_project
    );

    List<String> args {};
    switch (task_id) {
        case Task::BUILD_DEBUG:
            args.push_back("build");
            break;
        case Task::BUILD_RELEASE:
            args.push_back("build");
            args.push_back("-Prelease=true");
            break;
        case Task::GENERATE_EMBEDDED_JVM:
            args.push_back("generateEmbeddedJre");
            break;
    }

    String gradlew_path = get_gradlew_path();

    if (blocking) {
        int exit_code;
        Error result = OS::get_singleton()->execute(gradlew_path, args, &log, &exit_code, true, &build_mutex, false);
        return result;
    } else {
        Dictionary info = OS::get_singleton()->execute_with_pipe(gradlew_path, args, /*blocking=*/false);

        if (info.is_empty()) { JVM_ERR_FAIL_V_MSG(Error::ERR_CANT_CREATE, "Failed to start process"); }

        log = vformat("Running %s build task...", gradlew_path);
        stdio = info["stdio"];
        stderr_io = info["stderr"];
        pid = info["pid"];
    }

    return Error::OK;
}

GradleTaskRunner& GradleTaskRunner::get_instance() {
    static GradleTaskRunner instance;
    return instance;
}

bool GradleTaskRunner::is_task_started() {
    return pid > -1;
}

bool GradleTaskRunner::is_task_terminated() {
    bool ret = !OS::get_singleton()->is_process_running(pid);
    if (ret) { reset(); }
    return ret;
}

void GradleTaskRunner::get_task_output(String& log, String& error) {
    if (stdio.is_valid()) {
        // keep reading until no full line is available
        Error err;
        do {
            String line = stdio->get_line();
            err = stdio->get_error();
            if (!line.is_empty()) { log += line + "\n"; }
        } while (err == OK);
    }

    if (stderr_io.is_valid()) {
        // keep reading until no full line is available
        Error err;
        do {
            String line = stderr_io->get_line();
            err = stderr_io->get_error();
            if (!line.is_empty()) { error += line + "\n"; }
        } while (err == OK);
    }
}

void GradleTaskRunner::reset() {
    stdio = {};
    stderr_io = {};
    pid = -1;
}

void GradleTaskRunner::cleanup() {
    reset();
}

#endif // TOOLS_ENABLED
