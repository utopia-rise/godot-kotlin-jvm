#include "kotlin_editor_export_plugin.h"
#include "core/os/file_access.h"

void KotlinEditorExportPlugin::_export_begin(const Set<String>& p_features, bool p_debug, const String& p_path,
                                             int p_flags) {
    String main_jar{"res://build/libs/main.jar"};
    String bootstrap_jar{"res://build/libs/godot-bootstrap.jar"};
    add_file(main_jar, FileAccess::get_file_as_array(main_jar), false);
    add_file(bootstrap_jar, FileAccess::get_file_as_array(bootstrap_jar), false);
}
