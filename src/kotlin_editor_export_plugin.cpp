#include "kotlin_editor_export_plugin.h"
#include "core/os/file_access.h"
#include "logging.h"

void KotlinEditorExportPlugin::_export_begin(const Set<String>& p_features, bool p_debug, const String& p_path,
                                             int p_flags) {
    // Add mandatory jars to pck
    String main_jar{"res://build/libs/main.jar"};
    String bootstrap_jar{"res://build/libs/godot-bootstrap.jar"};
    add_file(main_jar, FileAccess::get_file_as_array(main_jar), false);
    add_file(bootstrap_jar, FileAccess::get_file_as_array(bootstrap_jar), false);

    // Copy JRE for desktop platforms
#if defined _WIN32 || defined _WIN64 || defined __linux__ || defined __APPLE__
    const Vector<String>& path_split = p_path.split("/");
    String export_dir{p_path.replace(path_split[path_split.size() - 1], "")};
    Error error;
    DirAccess* dir_access{DirAccess::open(export_dir, &error)};
    if (error == OK) {
        if (dir_access->copy_dir(
                ProjectSettings::get_singleton()->globalize_path("res://jre"),
                vformat("%s/jre", dir_access->get_current_dir())
        ) != OK) {
            LOG_ERROR("Cannot copy jre folder to export folder, please make sure you created a jre in project "
                      "root folder using jlink.")
        }
    } else {
        LOG_ERROR(vformat("Cannot copy JRE folder to %s, error is %s", p_path, error))
    }
#endif
}
