#include "gd_kotlin_configuration.h"
#include "long_string_queue.h"

#include <core/io/json.h>

String GdKotlinConfiguration::to_json() {
    Dictionary result;

    String vm_type_value;
    switch (vm_type) {
        case jni::Jvm::Type::HOTSPOT:
            vm_type_value = hotspot_string_identifier;
            break;
        case jni::Jvm::Type::GRAAL:
            vm_type_value = graal_string_identifier;
            break;
        case jni::Jvm::Type::ART:
            vm_type_value = art_string_identifier;
            break;
    }

    result[vm_type_identifier] = vm_type_value;
    result[max_string_size_identifier] = max_string_size;

    return JSON::print(result);
}

GdKotlinConfiguration GdKotlinConfiguration::from_json(const String& json_string) {
    Variant result;
    String err_string;
    int err_line;

    Error error{JSON::parse(json_string, result, err_string, err_line)};

    if (error != OK || result.get_type() != Variant::DICTIONARY) {
        LOG_ERROR("Error parsing Godot Kotlin configuration ! Falling back to default configuration")
        return GdKotlinConfiguration();
    }

#ifdef __ANDROID__
    vm_type = jni::Jvm::ART;
#else
    const Dictionary& dictionary{result.operator Dictionary()};
    jni::Jvm::Type vm_type;
    const String& vm{dictionary[vm_type_identifier]};
    if (vm == hotspot_string_identifier) {
        vm_type = jni::Jvm::HOTSPOT;
    }
    else if (vm == graal_string_identifier) {
        vm_type = jni::Jvm::GRAAL;
    }
    else {
        LOG_WARNING("Wrong JVM type in config, fallback to hotspot !")
        vm_type = jni::Jvm::HOTSPOT;
    }
#endif
    int max_string_size{LongStringQueue::max_string_size};
    Variant max_string_size_variant{dictionary[max_string_size_identifier]};
    if (max_string_size_variant.get_type() == Variant::INT) {
        max_string_size = max_string_size_variant;
    }

    return GdKotlinConfiguration(vm_type, max_string_size);
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

GdKotlinConfiguration::GdKotlinConfiguration() : vm_type(jni::Jvm::HOTSPOT), max_string_size(LongStringQueue::max_string_size) {

}

GdKotlinConfiguration::GdKotlinConfiguration(jni::Jvm::Type p_vm_type, int p_max_string_size)
        : vm_type(p_vm_type), max_string_size(p_max_string_size) {

}