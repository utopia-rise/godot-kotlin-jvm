#ifdef TOOLS_ENABLED
#ifndef GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#define GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H


#include <editor/editor_export.h>

class KotlinEditorExportPlugin : public EditorExportPlugin {
    GDCLASS(KotlinEditorExportPlugin, EditorExportPlugin)

public:
    void _export_begin(const Set<String> &p_features, bool p_debug, const String &p_path, int p_flags) override;

};


#endif //GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#endif
