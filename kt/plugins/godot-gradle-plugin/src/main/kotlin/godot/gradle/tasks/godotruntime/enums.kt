package godot.gradle.tasks.godotruntime

/**
 * Contains data for each supported operation systems.
 * ONLY operating systems that we are going to develop from!
 * */
enum class OS(val editorDownloadName: String, val editorBinaryName:String) {
    LINUX("godot-kotlin-jvm_editor_x11_.zip","godot.x11.opt.tools.64"),
    MAC("godot-kotlin-jvm_editor_osx_.zip","godot.osx.opt.tools.64"),
    WINDOWS("godot-kotlin-jvm_editor_windows_.zip","godot.windows.opt.tools.64.exe")
}
