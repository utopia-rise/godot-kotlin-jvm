#ifndef GODOT_JVM_CONSTANT_H
#define GODOT_JVM_CONSTANT_H

constexpr const char* gradle_dir = "kotlin_jvm/gradle/gradle_wrapper_dir";
constexpr const char* build_before_start = "kotlin_jvm/editor/build_gradle_before_start";
constexpr const char* show_info_on_start = "kotlin_jvm/editor/show_info_on_start";

constexpr const char* start_build = "Building JVM project...";

constexpr const char* about_text =
  "Godot Kotlin JVM is a community project and is in no way related to Godot or Jetbrains.\n\n"
  "The project is in alpha stage and, while already usable, it is not meant for use in "
  "production.\n"
  "Future updates might still include breaking changes.\n\n"
  "If you encounter any bugs or problems, please report them on our "
  "[url=https://github.com/utopia-rise/godot-kotlin-jvm/issues]issue tracker[/url]";

#endif// GODOT_JVM_CONSTANT_H
