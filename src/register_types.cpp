#ifdef TOOLS_ENABLED
#include "editor/godot_jvm_editor.h"
#include "kotlin_editor_export_plugin.h"

#include <classes/editor_node.hpp>
#include <classes/export/editor_export.hpp>
#endif

#include "api/language/gdj_language.h"
#include "api/language/java_language.h"
#include "api/language/jvm_language.h"
#include "api/language/kotlin_language.h"
#include "api/language/scala_language.h"
#include "api/resource_format/java_archive_resource_format_loader.h"
#include "api/resource_format/jvm_resource_format_loader.h"
#include "api/resource_format/jvm_resource_format_saver.h"
#include "api/script/jvm_script.h"
#include "api/script/jvm_script_manager.h"
#include "api/script/language/gdj_script.h"
#include "api/script/language/java_script.h"
#include "api/script/language/kotlin_script.h"
#include "api/script/language/scala_script.h"
#include "godot_jvm.h"
#include "register_types.h"

#include <classes/engine.hpp>
#include <classes/resource_format_loader.hpp.hpp>

Ref<JvmResourceFormatLoader> resource_format_loader;
Ref<JvmResourceFormatSaver> resource_format_saver;
Ref<JavaArchiveFormatLoader> java_archive_format_loader;

#ifdef TOOLS_ENABLED
static void export_plugin_init() {
    Ref<KotlinEditorExportPlugin> export_plugin;
    export_plugin.instantiate();
    EditorExport::get_singleton()->add_export_plugin(export_plugin);
}

static EditorPlugin* godot_kotlin_jvm_editor_plugin_creator_func() {
    return GodotJvmEditor::get_instance();
}
#endif

void initialize_godot_jvm_library(ModuleInitializationLevel p_level) {
#ifdef TOOLS_ENABLED
    if (Engine::get_singleton()->is_project_manager_hint()) { return; }
#endif

    if (p_level == MODULE_INITIALIZATION_LEVEL_SERVERS) {
        GDREGISTER_ABSTRACT_CLASS(JvmScript);
        GDREGISTER_CLASS(GdjScript);
        GDREGISTER_CLASS(KotlinScript);
        GDREGISTER_CLASS(JavaScript);
        GDREGISTER_CLASS(ScalaScript);

        ScriptServer::register_language(GdjLanguage::get_instance());
        ScriptServer::register_language(KotlinLanguage::get_instance());
        ScriptServer::register_language(JavaLanguage::get_instance());
        ScriptServer::register_language(ScalaLanguage::get_instance());

        resource_format_loader.instantiate();
        ResourceLoader::add_resource_format_loader(resource_format_loader);
        resource_format_saver.instantiate();
        ResourceSaver::add_resource_format_saver(resource_format_saver);

        java_archive_format_loader.instantiate();
        ResourceLoader::add_resource_format_loader(java_archive_format_loader);
    }

#ifdef TOOLS_ENABLED
    if (p_level == MODULE_INITIALIZATION_LEVEL_EDITOR) {
        EditorNode::add_init_callback(export_plugin_init);
        EditorPlugins::add_create_func(godot_kotlin_jvm_editor_plugin_creator_func);
    }
#endif
}

void uninitialize_godot_jvm_library(ModuleInitializationLevel p_level) {

    if (p_level != MODULE_INITIALIZATION_LEVEL_SCENE) { return; }

    ResourceLoader::remove_resource_format_loader((java_archive_format_loader));
    ResourceLoader::remove_resource_format_loader((resource_format_loader));
    ResourceSaver::remove_resource_format_saver(resource_format_saver);
    java_archive_format_loader.unref();
    resource_format_loader.unref();
    resource_format_saver.unref();

    JavaLanguage* java_language {JavaLanguage::get_instance()};
    ScriptServer::unregister_language(java_language);
    memdelete(java_language);

    KotlinLanguage* kotlin_language {KotlinLanguage::get_instance()};
    ScriptServer::unregister_language(kotlin_language);
    memdelete(kotlin_language);

    ScalaLanguage* scala_language {ScalaLanguage::get_instance()};
    ScriptServer::unregister_language(scala_language);
    memdelete(scala_language);

    JvmLanguage* jvm_language {GdjLanguage::get_instance()};
    ScriptServer::unregister_language(jvm_language);
    memdelete(jvm_language);

    JvmScriptManager::finalize();
}


GDExtensionBool GDE_EXPORT
godot_jvm_library_init(GDExtensionInterfaceGetProcAddress p_get_proc_address, GDExtensionClassLibraryPtr p_library, GDExtensionInitialization *r_initialization) {
    GDExtensionBinding::InitObject init_obj(p_get_proc_address, p_library, r_initialization);

    init_obj.register_initializer(initialize_godot_jvm_library);
    init_obj.register_terminator(uninitialize_godot_jvm_library);
    init_obj.set_minimum_library_initialization_level(MODULE_INITIALIZATION_LEVEL_SERVERS);

    return init_obj.init();
}