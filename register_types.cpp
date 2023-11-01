#ifdef TOOLS_ENABLED
#include "kotlin_editor_export_plugin.h"
#include "src/editor/godot_kotlin_jvm_editor.h"
#include <editor/editor_node.h>
#include <editor/export/editor_export.h>
#endif

#include "register_types.h"
#include "resource_format/gdj_resource_format_loader.h"
#include "resource_format/kt_resource_format_saver.h"
#include "src/kotlin_language.h"
#include "src/kotlin_script.h"

Ref<GdjResourceFormatLoader> resource_format_loader;
Ref<KtResourceFormatSaver> resource_format_saver;

#ifdef TOOLS_ENABLED
static void editor_init() {
    Ref<KotlinEditorExportPlugin> export_plugin;
    export_plugin.instantiate();
    EditorExport::get_singleton()->add_export_plugin(export_plugin);
}

static EditorPlugin* godot_kotlin_jvm_editor_plugin_creator_func() {
    return GodotKotlinJvmEditor::get_instance();
}
#endif

void initialize_kotlin_jvm_module(ModuleInitializationLevel p_level) {
    if (p_level == MODULE_INITIALIZATION_LEVEL_SCENE) {
        GDREGISTER_CLASS(KotlinScript);
        ScriptServer::register_language(KotlinLanguage::get_instance());
        resource_format_loader.instantiate();
        ResourceLoader::add_resource_format_loader(resource_format_loader);
        resource_format_saver.instantiate();
        ResourceSaver::add_resource_format_saver(resource_format_saver);
    }

#ifdef TOOLS_ENABLED
    if (p_level == MODULE_INITIALIZATION_LEVEL_EDITOR) {
        EditorNode::add_init_callback(editor_init);
        //EditorPlugins::add_create_func(godot_kotlin_jvm_editor_plugin_creator_func);
    }
#endif
}

void uninitialize_kotlin_jvm_module(ModuleInitializationLevel p_level) {
    if (p_level != MODULE_INITIALIZATION_LEVEL_SERVERS) { return; }

    KotlinLanguage* kotlin_language {KotlinLanguage::get_instance()};
    ScriptServer::unregister_language(kotlin_language);
    memdelete(kotlin_language);

    ResourceLoader::remove_resource_format_loader((resource_format_loader));
    ResourceSaver::remove_resource_format_saver(resource_format_saver);
    resource_format_loader.unref();
    resource_format_saver.unref();
}
