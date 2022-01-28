#include <editor/editor_node.h>

#ifdef TOOLS_ENABLED
#include <modules/kotlin_jvm/src/kotlin_editor_export_plugin.h>
#include "src/editor/godot_kotlin_jvm_editor.h"
#endif

#include "register_types.h"

#include "src/kotlin_language.h"
#include "src/kotlin_script.h"
#include "src/kt_resource_format_loader.h"
#include "src/kt_resource_format_saver.h"

Ref<KtResourceFormatLoader> resource_format_loader;
Ref<KtResourceFormatSaver> resource_format_saver;

#ifdef TOOLS_ENABLED
static void editor_init() {
    Ref<KotlinEditorExportPlugin> export_plugin;
    export_plugin.instantiate();
    EditorExport::get_singleton()->add_export_plugin(export_plugin);
}

static EditorPlugin* godot_kotlin_jvm_editor_plugin_creator_func(EditorNode* editor_node) {
    return GodotKotlinJvmEditor::get_instance();
}
#endif

void register_kotlin_jvm_types() {
    ClassDB::register_class<KotlinScript>();
    ScriptServer::register_language(&KotlinLanguage::get_instance());
    resource_format_loader.instantiate();
    ResourceLoader::add_resource_format_loader(resource_format_loader);
    resource_format_saver.instantiate();
    ResourceSaver::add_resource_format_saver(resource_format_saver);

#ifdef TOOLS_ENABLED
    EditorNode::add_init_callback(editor_init);
    EditorPlugins::add_create_func(godot_kotlin_jvm_editor_plugin_creator_func);
#endif
}

void unregister_kotlin_jvm_types() {
    ScriptServer::unregister_language(&KotlinLanguage::get_instance());
    ResourceLoader::remove_resource_format_loader((resource_format_loader));
    ResourceSaver::remove_resource_format_saver(resource_format_saver);
    resource_format_loader.unref();
    resource_format_saver.unref();
}
