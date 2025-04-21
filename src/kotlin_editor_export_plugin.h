#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H
#define GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H

#include "jni/jvm.h"

#include <core/io/dir_access.h>
#include <editor/export/editor_export_platform.h>
#include <editor/export/editor_export_plugin.h>

class KotlinEditorExportPlugin : public EditorExportPlugin {
public:
    void _export_begin(const HashSet<String>& p_features, bool p_debug, const String& p_path, int p_flags) override;
    String get_name() const override;

    // Source files editions
    void _export_file(const String &p_path, const String &p_type, const HashSet<String> &p_features) override;


private:
    void _generate_export_configuration_file(jni::JvmType vm_type);
    void _add_exclude_filter_preset();
};

#endif// GODOT_JVM_KOTLINEDITOREXPORTPLUGIN_H

#endif
