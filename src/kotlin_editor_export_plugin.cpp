#ifdef TOOLS_ENABLED

#include <modules/kotlin_jvm/src/jni/jvm.h>
#include "kotlin_editor_export_plugin.h"
#include "core/os/file_access.h"
#include "gd_kotlin.h"
#include "path_provider.h"

static constexpr const char* all_jvm_feature{"export-all-jvm"};

void KotlinEditorExportPlugin::_export_begin(
        const Set<String>& p_features,
        bool p_debug,
        const String& p_path,
        int p_flags
) {
    LOG_INFO("Beginning Godot-Jvm specific exports.");

    // Add mandatory jars to pck
    Vector<String> files_to_add;

    bool is_graal_only{false};
    bool is_android_export{p_features.has("Android")};
    if (is_android_export) {
        files_to_add.push_back(
                vformat(
                        "res://build/libs/%s",
                        PathProvider::usercode_name + PathProvider::get_usercode_extension_for_vm_type(jni::Jvm::ART)
                )
        );
        _generate_export_configuration_file(jni::Jvm::ART);
    } else {
        String graal_usercode_lib;
        if (p_features.has("Windows")) {
            graal_usercode_lib = String{PathProvider::usercode_name} + PathProvider::dynamic_library_extension_win;
        } else if (p_features.has("OSX")) {
            graal_usercode_lib = String{PathProvider::usercode_name} + PathProvider::dynamic_library_extension_osx;
        } else if (p_features.has("X11")) {
            graal_usercode_lib = String{PathProvider::usercode_name} + PathProvider::dynamic_library_extension_linux;
        }
        if (p_features.has(all_jvm_feature)) {
            files_to_add.push_back(
                    vformat(
                            "res://build/libs/%s",
                            String{PathProvider::usercode_name} + PathProvider::jar_extension
                    )
            );
            files_to_add.push_back(vformat("res://build/libs/%s", graal_usercode_lib));
            _generate_export_configuration_file(GDKotlin::get_instance().get_configuration().get_vm_type());
        } else {
            GdKotlinConfiguration configuration{GdKotlinConfiguration::load_gd_kotlin_configuration_from_json()};
            jni::Jvm::Type jvm_type{configuration.get_vm_type()};
            files_to_add.push_back(
                    vformat(
                            "res://build/libs/%s",
                            String{PathProvider::usercode_name} +
                            PathProvider::get_usercode_extension_for_vm_type(jvm_type)
                    )
            );
            _generate_export_configuration_file(jvm_type);
            is_graal_only = jvm_type == jni::Jvm::Type::GRAAL_NATIVE_IMAGE;
        }
    }

    for (int i = 0; i < files_to_add.size(); ++i) {
        const String& file_to_add{files_to_add[i]};
        if (!FileAccess::exists(file_to_add)) {
            LOG_ERROR(vformat("Tried to export file %s, but it's non existent", file_to_add));
        }
        add_file(file_to_add, FileAccess::get_file_as_array(file_to_add), false);
        LOG_INFO(vformat("Exporting %s", file_to_add));
    }

    // Copy JRE for desktop platforms
    if (!is_android_export && !is_graal_only) {
        const Vector<String>& path_split = p_path.split("/");
        String export_dir{p_path.replace(path_split[path_split.size() - 1], "")};
        Error error;
        DirAccess* dir_access{DirAccess::open(export_dir, &error)};
        if (error == OK) {
            if (dir_access->copy_dir(
                    ProjectSettings::get_singleton()->globalize_path("res://jre"),
                    vformat("%s/jre", dir_access->get_current_dir())
            ) != OK) {
                LOG_ERROR("Cannot copy jre folder to export folder, please make sure you created a jre in project "
                          "root folder using jlink.");
            }
        } else {
            LOG_ERROR(vformat("Cannot copy JRE folder to %s, error is %s", p_path, error));
        }
        memdelete(dir_access);
    }

    LOG_INFO("Finished Godot-Jvm specific exports.");
}

void KotlinEditorExportPlugin::_generate_export_configuration_file(jni::Jvm::Type vm_type) {
    GdKotlinConfiguration configuration{GdKotlinConfiguration::load_gd_kotlin_configuration_from_json()};
    configuration.set_vm_type(vm_type);
    String json{configuration.to_json()};
    Vector<uint8_t> json_bytes;
    for (int i = 0; json[i] != '\0'; ++i) {
        json_bytes.push_back(json[i]);
    }
    add_file(GdKotlinConfiguration::gd_kotlin_configuration_path, json_bytes, false);
}

#endif
