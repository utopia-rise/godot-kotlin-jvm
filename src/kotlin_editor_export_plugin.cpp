#ifdef TOOLS_ENABLED

#include "kotlin_editor_export_plugin.h"

#include "gd_kotlin.h"
#include "jni/jni_constants.h"

#include <core/config/project_settings.h>

static constexpr const char* all_jvm_feature {"export-all-jvm"};
static constexpr const char* configuration_path {"res://godot_kotlin_configuration.json"};

void KotlinEditorExportPlugin::_export_begin(const HashSet<String>& p_features, bool p_debug, const String& p_path, int p_flags) {
    LOG_INFO("Beginning Godot-Jvm specific exports.");

    // Add mandatory jars to pck
    Vector<String> files_to_add;

    bool is_graal_only {false};
    bool is_ios_export {p_features.has("ios")};
    bool is_android_export {p_features.has("Android")};
    bool is_osx_export {p_features.has("OSX")};
    if (is_ios_export) {
        _generate_export_configuration_file(jni::Jvm::GRAAL_NATIVE_IMAGE);
        add_ios_project_static_lib(ProjectSettings::get_singleton()->globalize_path("res://build/libs/ios/usercode.a"));
        return;
    } else if (is_android_export) {
        files_to_add.push_back("res://build/libs/main-dex.jar");
        files_to_add.push_back("res://build/libs/godot-bootstrap-dex.jar");
        _generate_export_configuration_file(jni::Jvm::ART);
    } else {
        String graal_usercode_lib;
        if (p_features.has("Windows")) {
            graal_usercode_lib = "usercode.dll";
        } else if (is_osx_export) {
            graal_usercode_lib = "usercode.dylib";
        } else if (p_features.has("X11")) {
            graal_usercode_lib = "usercode.so";
        }
        if (p_features.has(all_jvm_feature)) {
            files_to_add.push_back("res://build/libs/main.jar");
            files_to_add.push_back("res://build/libs/godot-bootstrap.jar");
            files_to_add.push_back(vformat("res://build/libs/%s", graal_usercode_lib));
            _generate_export_configuration_file(GDKotlin::get_instance().get_configuration().get_vm_type());

        } else {
            if (FileAccess::exists(configuration_path)) {
                Ref<FileAccess> configuration_access_read {FileAccess::open(configuration_path, FileAccess::READ)};
                GdKotlinConfiguration configuration {
                  GdKotlinConfiguration::from_json(configuration_access_read->get_as_utf8_string())};
                jni::Jvm::Type jvm_type {configuration.get_vm_type()};
                switch (jvm_type) {
                    case jni::Jvm::JVM:
                        files_to_add.push_back("res://build/libs/main.jar");
                        files_to_add.push_back("res://build/libs/godot-bootstrap.jar");
                        _generate_export_configuration_file(jni::Jvm::JVM);

                        break;
                    case jni::Jvm::GRAAL_NATIVE_IMAGE:
                        files_to_add.push_back(vformat("res://build/libs/%s", graal_usercode_lib));
                        _generate_export_configuration_file(jni::Jvm::GRAAL_NATIVE_IMAGE);
                        is_graal_only = true;

                        break;
                    default:
                        LOG_ERROR("Unknown VM type, aborting export.");
                        return;
                }
            } else {
                LOG_ERROR(vformat("Cannot find configuration file %s", configuration_path));
            }
        }
    }

    // Copy JRE for desktop platforms
    if (!is_android_export && !is_graal_only) {
        const Vector<String>& path_split = p_path.split("/");
        String export_dir {p_path.replace(path_split[path_split.size() - 1], "")};
        Error error;
        Ref<DirAccess> dir_access {DirAccess::open(export_dir, &error)};
        if (error == OK) {
            if (is_osx_export) {
                bool is_arm64 {p_features.has("arm64")};
                bool is_x64 {p_features.has("x86_64")};

                if (!is_arm64 && !is_x64) {
                    add_macos_plugin_file(vformat("res://%s", jni::JniConstants::CURRENT_RUNTIME_JRE));
                } else {
                    if (is_arm64) { add_macos_plugin_file(vformat("res://%s", jni::JniConstants::JRE_ARM64)); }

                    if (is_x64) { add_macos_plugin_file(vformat("res://%s", jni::JniConstants::JRE_AMD64)); }
                }
            } else {
                _copy_jre_to(jni::JniConstants::JRE_AMD64, dir_access);
            }
        } else {
            LOG_ERROR(vformat("Cannot copy JRE folder to %s, error is %s", p_path, error));
        }
    }

    for (int i = 0; i < files_to_add.size(); ++i) {
        const String& file_to_add {files_to_add[i]};
        add_file(file_to_add, FileAccess::get_file_as_bytes(file_to_add), false);
        LOG_INFO(vformat("Exporting %s", file_to_add));
    }

    LOG_INFO("Finished Godot-Jvm specific exports.");
}

void KotlinEditorExportPlugin::_generate_export_configuration_file(jni::Jvm::Type vm_type) {
    GdKotlinConfiguration configuration;
    configuration.set_vm_type(vm_type);
    configuration.set_max_string_size(GDKotlin::get_instance().get_configuration().get_max_string_size());
    const char32_t* json_string {configuration.to_json().get_data()};
    Vector<uint8_t> json_bytes;
    for (int i = 0; json_string[i] != '\0'; ++i) {
        json_bytes.push_back(json_string[i]);
    }
    add_file(configuration_path, json_bytes, false);
}

void KotlinEditorExportPlugin::_copy_jre_to(const char* jre_folder, Ref<DirAccess> dir_access) {
    if (dir_access->copy_dir(
            ProjectSettings::get_singleton()->globalize_path(vformat("res://%s", jre_folder)),
            vformat("%s/%s", dir_access->get_current_dir(), jre_folder)
    ) != OK) {
        LOG_ERROR(vformat(
          "Cannot copy %s folder to export folder, please make sure you created a %s in project "
          "root folder using jlink.",
          jre_folder,
          jre_folder
        ));
    }
}

#endif