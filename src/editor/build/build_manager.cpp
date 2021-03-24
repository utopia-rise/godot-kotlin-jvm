
#include <core/variant_parser.h>
#include <editor/editor_node.h>

#ifdef __linux__
#include <wait.h>
#elif __APPLE__
#include <TargetConditionals.h>
    #if TARGET_OS_MAC
        TODO()
    #endif
#elif defined _WIN32 || defined _WIN64
    TODO()
#endif

#include "../godot_kotlin_jvm_editor.h"
#include "build_manager.h"

static OS::ProcessID build_process_pid;
static String build_log{};

bool BuildManager::build_project_blocking() {
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) {
        return true;
    }

    EditorNode::progress_add_task("build_godot_kotlin_jvm", "Building with gradle...", 2);
    EditorNode::progress_task_step("build_godot_kotlin_jvm", "Building gradle project", 1);

    List<String> args{};
    String gradleCommand{ ProjectSettings::get_singleton()->globalize_path("res://gradlew") };
    if (OS::get_singleton()->get_name() == "Windows") {
        gradleCommand = String{ ProjectSettings::get_singleton()->globalize_path("res://gradlew.bat") };
    }
    args.push_back("build");
    String output;
    Error result = OS::get_singleton()->execute(
            gradleCommand,
            args,
            true,
            nullptr,
            &output
    );

    String args_string{};
    for (int i = 0; i < args.size(); i++) {
        args_string += vformat(" %s", args[i]);
    }

    EditorNode::progress_task_step("build_godot_kotlin_jvm", "Done", 2); //dummy to not start at 100%
    EditorNode::progress_end_task("build_godot_kotlin_jvm");

    return result == Error::OK;
}

void BuildManager::build_project_non_blocking() {
    GodotKotlinJvmEditor::get_instance()->build_check_timer->start();
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) {
        return;
    }
    List<String> args{};
    String gradle_command{ProjectSettings::get_singleton()->globalize_path("res://gradlew") };
    if (OS::get_singleton()->get_name() == "Windows") {
        gradle_command = String{ProjectSettings::get_singleton()->globalize_path("res://gradlew.bat") };
    }
    String build_dir = ProjectSettings::get_singleton()->globalize_path("res://build");
    DirAccess::create(DirAccess::ACCESS_RESOURCES)->make_dir_recursive(build_dir);

    // the same on windows and unix:
    args.push_back("-c");
    args.push_back(vformat("%s build > %s/build_output.txt 2>&1", gradle_command, build_dir));

    OS::get_singleton()->execute(
            "bash",
            args,
            false,
            &build_process_pid
    );
}

bool BuildManager::can_build_project() {
    return build_process_pid == 0;
}

// convenience function for better readability in some places
bool BuildManager::build_finished() {
    return can_build_project();
}

void BuildManager::update_build_state() {
    if (build_process_pid == 0) {
        GodotKotlinJvmEditor::get_instance()->build_check_timer->stop();
        return;
    }

#ifdef __linux__
    int ret = ::kill(build_process_pid, 0); //see: https://linux.die.net/man/2/kill
    if (!ret) {
        //avoid zombie process
        int st;
        ::waitpid(build_process_pid, &st, WNOHANG); //WNOHANG -> does not wait which is desired as we check frequently
    }
    bool process_running = ret != -1;
#elif __APPLE__
    #include <TargetConditionals.h>
    #if TARGET_OS_MAC
        TODO()
    #endif
#elif defined _WIN32 || defined _WIN64
    TODO()
#endif

//    String pidCheck{ "ps" };
//    if (OS::get_singleton()->get_name() == "Windows") {
//        //something like this on windows: OpenProcess(  PROCESS_QUERY_INFORMATION | PROCESS_VM_READ, FALSE, processID );
//        //or
//        //tasklist /FI "PID eq 1234"
//        pidCheck = String{ "tasklist" };
//    }
//    List<String> args{};
//    args.push_back(vformat("%s", build_process_pid));
//    if (OS::get_singleton()->execute(pidCheck, args, true) != Error::OK) {
//        build_process_pid = 0;
//    }

    if (!process_running) {
        build_process_pid = 0;
    }
    pull_log();
}

void BuildManager::cancel_build() {
    if (build_process_pid != 0) {
        OS::get_singleton()->kill(build_process_pid);
    }
}

String& BuildManager::get_log() {
    return build_log;
}

void BuildManager::clear_log() {
    DirAccess::create(DirAccess::ACCESS_RESOURCES)->remove(ProjectSettings::get_singleton()->globalize_path("res://build/build_output.txt"));
    build_log.clear();
}

void BuildManager::pull_log() {
    FileAccess* file_access = FileAccess::open(ProjectSettings::get_singleton()->globalize_path("res://build/build_output.txt"), FileAccess::ModeFlags::READ);
    if (file_access) {
        build_log = file_access->get_as_utf8_string();
        file_access->close();
    } else {
        build_log.clear();
    }
}
