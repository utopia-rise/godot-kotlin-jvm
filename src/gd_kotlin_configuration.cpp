#include "gd_kotlin_configuration.h"

#include "jvm_wrapper/memory/long_string_queue.h"

#include <core/config/engine.h>
#include <core/io/json.h>

String GdKotlinConfiguration::to_json() {
    Dictionary result;

    String vm_type_value;
    switch (vm_type) {
        case jni::Jvm::Type::JVM:
            vm_type_value = jvm_string_identifier;
            break;
        case jni::Jvm::Type::GRAAL_NATIVE_IMAGE:
            vm_type_value = graal_native_image_string_identifier;
            break;
        case jni::Jvm::Type::ART:
            vm_type_value = art_string_identifier;
            break;
    }

    result[vm_type_identifier] = vm_type_value;
    result[max_string_size_identifier] = max_string_size;

    return Variant(result).to_json_string();
}

GdKotlinConfiguration GdKotlinConfiguration::from_json(const String& json_string) {
    JSON json;
    Error error {json.parse(json_string)};
    Variant result {json.get_data()};

    if (error != OK || result.get_type() != Variant::DICTIONARY) {
        LOG_ERROR("Error parsing Godot Kotlin configuration ! Falling back to default configuration");
        return GdKotlinConfiguration();
    }

    jni::Jvm::Type vm_type;
    const Dictionary& dictionary {result.operator Dictionary()};
    const String& vm {dictionary[vm_type_identifier]};
    if (vm == jvm_string_identifier) {
        vm_type = jni::Jvm::JVM;
    } else if (vm == graal_native_image_string_identifier) {
        vm_type = jni::Jvm::GRAAL_NATIVE_IMAGE;
    } else if (vm == art_string_identifier) {
        vm_type = jni::Jvm::ART;
    } else {
        LOG_WARNING("Wrong JVM type in config, fallback to classic JVM !");
        vm_type = jni::Jvm::JVM;
    }
    int max_string_size {LongStringQueue::max_string_size};
    Variant max_string_size_variant {dictionary[max_string_size_identifier]};
    if (max_string_size_variant.get_type() == Variant::INT) { max_string_size = max_string_size_variant; }

    return GdKotlinConfiguration(vm_type, max_string_size);
}

GdKotlinConfiguration GdKotlinConfiguration::load_gd_kotlin_configuration_or_default(const String& configuration_path) {
    GdKotlinConfiguration configuration;
    if (FileAccess::exists(configuration_path)) {
        Ref<FileAccess> configuration_access_read {FileAccess::open(configuration_path, FileAccess::READ)};
        configuration = GdKotlinConfiguration::from_json(configuration_access_read->get_as_utf8_string());
    } else {
#ifdef TOOLS_ENABLED
        configuration = GdKotlinConfiguration();
        if (Engine::get_singleton()->is_project_manager_hint()) { return configuration; }
        Ref<FileAccess> file {FileAccess::open(configuration_path, FileAccess::WRITE)};
        file->store_string(configuration.to_json());
#else
        LOG_ERROR(vformat("Cannot find Godot Kotlin configuration file at: %s. Falling back to default configuration.", configuration_path));
        configuration = GdKotlinConfiguration();
#endif
    }

    return configuration;
}

jni::Jvm::Type GdKotlinConfiguration::get_vm_type() const {
    return vm_type;
}

void GdKotlinConfiguration::set_vm_type(jni::Jvm::Type p_type) {
    vm_type = p_type;
}

int GdKotlinConfiguration::get_max_string_size() const {
    return max_string_size;
}

void GdKotlinConfiguration::set_max_string_size(int p_max_string_size) {
    max_string_size = p_max_string_size;
}

GdKotlinConfiguration::GdKotlinConfiguration() :
  vm_type(jni::Jvm::JVM),
  max_string_size(LongStringQueue::max_string_size) {}

GdKotlinConfiguration::GdKotlinConfiguration(jni::Jvm::Type p_vm_type, int p_max_string_size) :
  vm_type(p_vm_type),
  max_string_size(p_max_string_size) {}