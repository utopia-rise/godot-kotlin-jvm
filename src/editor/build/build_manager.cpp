
#include <core/variant_parser.h>
#include <editor/editor_node.h>
#include "../godot_kotlin_jvm_editor.h"
#include "build_manager.h"
#include "build_output.h"

BuildOutput BuildManager::editor_build_callback() {
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) {
        return BuildOutput{};
    }

    return build_project_blocking();
}

BuildOutput BuildManager::build_project_blocking() {
    if (!FileAccess::create(FileAccess::AccessType::ACCESS_RESOURCES)->file_exists("build.gradle.kts")) {
        return BuildOutput{};
    }

    EditorNode::progress_add_task("build_godot_kotlin_jvm", "Building with gradle...", 2);
    EditorNode::progress_task_step("build_godot_kotlin_jvm", "Building gradle project", 1);
    BuildOutput build_output = build();
    EditorNode::progress_task_step("build_godot_kotlin_jvm", "Done", 2); //dummy to not start at 100%
    EditorNode::progress_end_task("build_godot_kotlin_jvm");

    if (build_output.result != Error::OK) {
        show_build_error_dialog();
        return build_output;
    }

    return build_output;
}

void BuildManager::show_build_error_dialog() {
    GodotKotlinJvmEditor::get_instance()->show_error_dialog("An error occurred during building.\nConsult the error output in the bottom panel", "Build error");
    GodotKotlinJvmEditor::get_instance()->bottom_panel.show_build_tab();
}

BuildOutput BuildManager::build() {
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
    return BuildOutput {result, vformat("%s%s\n%s", gradleCommand, args_string, output)};
}
