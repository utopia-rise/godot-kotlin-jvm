#include "register_types.h"

#include "core/class_db.h"
#include "src/kotlin_language.h"
#include "src/kotlin_script.h"

void register_jvm_types() {
    ClassDB::register_class<KotlinScript>();
    ScriptServer::register_language(&KotlinLanguage::instance());
}

void unregister_jvm_types() {
    ScriptServer::unregister_language(&KotlinLanguage::instance());
}
