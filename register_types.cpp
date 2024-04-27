#ifdef TOOLS_ENABLED
#include "kotlin_editor_export_plugin.h"
#include "src/editor/godot_kotlin_jvm_editor.h"

#include <editor/editor_node.h>
#include <editor/export/editor_export.h>
#endif

#include "gd_kotlin.h"
#include "language/gdj_language.h"
#include "language/java_language.h"
#include "language/jvm_language.h"
#include "language/kotlin_language.h"
#include "register_types.h"
#include "resource_format/jvm_resource_format_loader.h"
#include "resource_format/jvm_resource_format_saver.h"
#include "script/jvm_script.h"
#include "script/language/gdj_script.h"
#include "script/language/java_script.h"
#include "script/language/kotlin_script.h"

Ref<JvmResourceFormatLoader> resource_format_loader;
Ref<JvmResourceFormatSaver> resource_format_saver;

#ifdef TOOLS_ENABLED
static void export_plugin_init() {
    Ref<KotlinEditorExportPlugin> export_plugin;
    export_plugin.instantiate();
    EditorExport::get_singleton()->add_export_plugin(export_plugin);
}

static EditorPlugin* godot_kotlin_jvm_editor_plugin_creator_func() {
    return GodotKotlinJvmEditor::get_instance();
}
#endif

void initialize_kotlin_jvm_module(ModuleInitializationLevel p_level) {
#ifdef TOOLS_ENABLED
    if (Engine::get_singleton()->is_project_manager_hint()) { return; }
#endif

    if (p_level == MODULE_INITIALIZATION_LEVEL_SERVERS) {
        GDREGISTER_ABSTRACT_CLASS(JvmScript);
        GDREGISTER_CLASS(GdjScript);
        GDREGISTER_CLASS(KotlinScript);
        GDREGISTER_CLASS(JavaScript);

        ScriptServer::register_language(GdjLanguage::get_instance());
        ScriptServer::register_language(KotlinLanguage::get_instance());
        ScriptServer::register_language(JavaLanguage::get_instance());

        resource_format_loader.instantiate();
        ResourceLoader::add_resource_format_loader(resource_format_loader);
        resource_format_saver.instantiate();
        ResourceSaver::add_resource_format_saver(resource_format_saver);
    }

#ifdef TOOLS_ENABLED
    if (p_level == MODULE_INITIALIZATION_LEVEL_EDITOR) {
        EditorNode::add_init_callback(export_plugin_init);
        EditorPlugins::add_create_func(godot_kotlin_jvm_editor_plugin_creator_func);
    }
#endif
}

void uninitialize_kotlin_jvm_module(ModuleInitializationLevel p_level) {
#ifdef TOOLS_ENABLED
    if (Engine::get_singleton()->is_project_manager_hint()) { return; }
#endif

    if (p_level != MODULE_INITIALIZATION_LEVEL_SERVERS) { return; }

    ResourceLoader::remove_resource_format_loader((resource_format_loader));
    ResourceSaver::remove_resource_format_saver(resource_format_saver);
    resource_format_loader.unref();
    resource_format_saver.unref();

    JavaLanguage* java_language {JavaLanguage::get_instance()};
    ScriptServer::unregister_language(java_language);
    memdelete(java_language);

    KotlinLanguage* kotlin_language {KotlinLanguage::get_instance()};
    ScriptServer::unregister_language(kotlin_language);
    memdelete(kotlin_language);

    JvmLanguage* jvm_language {GdjLanguage::get_instance()};
    ScriptServer::unregister_language(jvm_language);
    memdelete(jvm_language);

    GDKotlin::get_instance().finalize_down_to(GDKotlin::State::NOT_STARTED);
}
