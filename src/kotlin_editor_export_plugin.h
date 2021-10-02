#ifdef TOOLS_ENABLED
#ifndef GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#define GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H


#include <editor/editor_export.h>
#include "jni/jvm.h"

class KotlinEditorExportPlugin : public EditorExportPlugin {
    GDCLASS(KotlinEditorExportPlugin, EditorExportPlugin)

public:
    void _export_begin(const Set<String> &p_features, bool p_debug, const String &p_path, int p_flags) override;

private:
    void _generate_export_configuration_file(jni::Jvm::Type vm_type);
    static void _copy_jre_to(const char* jre_folder, DirAccess* dir_access);
    static Vector<String> _list_files_in_folder(const String& folder);
};


#endif //GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#endif
