#include "register_types.h"

#include "core/class_db.h"
#include "src/kotlin_language.h"
#include "src/kotlin_script.h"
#include "src/kt_resource_format_loader.h"
#include "src/kt_resource_format_saver.h"

Ref<KtResourceFormatLoader> resource_format_loader;
Ref<KtResourceFormatSaver> resource_format_saver;

void register_jvm_types() {
    ClassDB::register_class<KotlinScript>();
    ScriptServer::register_language(&KotlinLanguage::get_instance());
    resource_format_loader.instance();
    ResourceLoader::add_resource_format_loader(resource_format_loader);
    resource_format_saver.instance();
    ResourceSaver::add_resource_format_saver(resource_format_saver);
}

void unregister_jvm_types() {
    ScriptServer::unregister_language(&KotlinLanguage::get_instance());
    ResourceLoader::remove_resource_format_loader((resource_format_loader));
    ResourceSaver::remove_resource_format_saver(resource_format_saver);
}
