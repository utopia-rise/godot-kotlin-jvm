#ifdef TOOLS_ENABLED
#ifndef GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#define GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H


#include <editor/editor_export.h>
#include "jni/jvm.h"

class KotlinEditorExportPlugin : public EditorExportPlugin {
    GDCLASS(KotlinEditorExportPlugin, EditorExportPlugin)

public:
    void _export_begin(const HashSet<String> &p_features, bool p_debug, const String &p_path, int p_flags) override;

private:
    void _generate_export_configuration_file(jni::Jvm::Type vm_type);

};


#endif //GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#endif
