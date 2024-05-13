#ifdef TOOLS_ENABLED

#include "kotlin_editor_export_plugin.h"

#include "gd_kotlin.h"
#include "language/names.h"
#include "lifecycle/jvm_user_configuration.h"
#include "lifecycle/paths.h"

#include <core/config/project_settings.h>

static constexpr const char* graal_feature {"export-graal-native-image"};
static constexpr const char* all_jvm_feature {"export-all-jvm"};
static constexpr const char* ios_jdk_version {"21"};

void KotlinEditorExportPlugin::_export_begin(const HashSet<String>& p_features, bool p_debug, const String& p_path, int p_flags) {
    LOG_INFO("Beginning Godot-Jvm specific exports.");

    // Add mandatory jars to pck
    Vector<String> files_to_add;

    bool is_windows_export {p_features.has("windows")};
    bool is_linux_export {p_features.has("linux")};
    bool is_osx_export {p_features.has("macos")};
    bool is_desktop_export {is_windows_export || is_linux_export || is_osx_export};
    bool is_android_export {p_features.has("android")};
    bool is_ios_export {p_features.has("ios")};

    if (is_desktop_export) {
        bool export_all {p_features.has(all_jvm_feature)};
        bool export_graal {p_features.has(graal_feature) || export_all};
        bool export_jvm {!p_features.has(graal_feature) || export_all};

        if (export_jvm) {
            files_to_add.push_back(String(BUILD_DIRECTORY).path_join(DESKTOP_BOOTSTRAP_FILE));
            files_to_add.push_back(String(BUILD_DIRECTORY).path_join(DESKTOP_USER_CODE_FILE));

            if (is_osx_export) {
                bool is_arm64 {p_features.has("arm64")};
                bool is_x64 {p_features.has("x86_64")};

                if (!is_arm64 && !is_x64) {
                    add_macos_plugin_file(String(RES_DIRECTORY).path_join(EMBEDDED_JRE_DIRECTORY));
                } else {
                    if (is_arm64) { add_macos_plugin_file(String(RES_DIRECTORY).path_join(EMBEDDED_JRE_ARM_DIRECTORY)); }
                    if (is_x64) { add_macos_plugin_file(String(RES_DIRECTORY).path_join(EMBEDDED_JRE_AMD_DIRECTORY)); }
                }
            } else {
                String jre_dir {String(RES_DIRECTORY).path_join(EMBEDDED_JRE_AMD_DIRECTORY)};
                String target_dir {ProjectSettings::get_singleton()->globalize_path(RES_DIRECTORY).path_join(p_path).get_base_dir().path_join(EMBEDDED_JRE_AMD_DIRECTORY)};
                Error error;
                Ref<DirAccess> dir_access {DirAccess::open(jre_dir, &error)};
                if (error != OK) {
                    LOG_ERROR(vformat("Cannot open directory %s", jre_dir));
                }
                if (dir_access->copy_dir(jre_dir, target_dir) != OK) {
                    LOG_ERROR(vformat("Cannot copy %s folder to export folder, please make sure you created a JRE directory at the root of your project using jlink.", EMBEDDED_JRE_AMD_DIRECTORY)
                    );
                }
            }

        } else if (export_graal) {
            if (is_windows_export) {
                files_to_add.push_back(String(BUILD_DIRECTORY) + WINDOWS_GRAAL_NATIVE_IMAGE_FILE);
            } else if (is_linux_export) {
                files_to_add.push_back(String(BUILD_DIRECTORY) + LINUX_GRAAL_NATIVE_IMAGE_FILE);
            } else if (is_osx_export) {
                files_to_add.push_back(String(BUILD_DIRECTORY) + MACOS_GRAAL_NATIVE_IMAGE_FILE);
            }
        }

        if (export_all) {
            _generate_export_configuration_file(GDKotlin::get_instance().get_configuration().vm_type);
        } else if (export_jvm) {
            _generate_export_configuration_file(jni::JvmType::JVM);
        } else if (export_graal) {
            _generate_export_configuration_file(jni::JvmType::GRAAL_NATIVE_IMAGE);
        }

    } else if (is_android_export) {
        files_to_add.push_back(String(BUILD_DIRECTORY).path_join(ANDROID_BOOTSTRAP_FILE));
        files_to_add.push_back(String(BUILD_DIRECTORY).path_join(ANDROID_USER_CODE_FILE));
        _generate_export_configuration_file(jni::JvmType::ART);
    } else if (is_ios_export) {
        String base_ios_build_dir {String(BUILD_DIRECTORY).path_join("ios") };
        String base_ios_jdk_dir {base_ios_build_dir.path_join("ios-jdk").path_join(ios_jdk_version)};

        _generate_export_configuration_file(jni::JvmType::GRAAL_NATIVE_IMAGE);

        add_ios_project_static_lib(
          ProjectSettings::get_singleton()->globalize_path(base_ios_jdk_dir.path_join("libjava-release.a"))
        );
        add_ios_project_static_lib(
          ProjectSettings::get_singleton()->globalize_path(base_ios_jdk_dir.path_join("libjvm-release.a"))
        );
        add_ios_project_static_lib(
          ProjectSettings::get_singleton()->globalize_path(base_ios_build_dir.path_join(IOS_GRAAL_NATIVE_IMAGE_FILE))
        );
    } else {
        LOG_ERROR("Godot Kotlin/JVM doesn't handle this platform");
    }

    for (const String& file_to_add : files_to_add) {
        if (!FileAccess::exists(file_to_add)) {
            LOG_ERROR(vformat("File can't be found, it won't be exported: %s", file_to_add));
        }
        add_file(file_to_add, FileAccess::get_file_as_bytes(file_to_add), false);
        LOG_INFO(vformat("Exporting %s", file_to_add));
    }

    LOG_INFO("Finished Godot-Jvm specific exports.");
}

void KotlinEditorExportPlugin::_generate_export_configuration_file(jni::JvmType vm_type) {
    JvmUserConfiguration configuration = GDKotlin::get_instance().get_configuration();// Copy
    configuration.vm_type = vm_type;// We only need to change the vm type

    const char32_t* json_string {JvmUserConfiguration::export_configuration_to_json(configuration).get_data()};
    Vector<uint8_t> json_bytes;
    for (int i = 0; json_string[i] != '\0'; ++i) {
        json_bytes.push_back(json_string[i]);
    }

    // we manually add the configuration file to the exclude filter to prevent it from being added multiple times
    // this could happen if a user adds json files globally with the include filter `*.json` for example
    // it also seems that json files are added by default now, which also triggers this issue
    get_export_preset()->set_exclude_filter(get_export_preset()->get_exclude_filter() + "," + JVM_CONFIGURATION_PATH);

    add_file(JVM_CONFIGURATION_PATH, json_bytes, false);
}

String KotlinEditorExportPlugin::get_name() const {
    return "Godot Kotlin/Jvm";
}

void KotlinEditorExportPlugin::_export_file(const String& p_path, const String& p_type, const HashSet<String>& p_features) {
    String ext = p_path.get_extension();
    if (ext == GODOT_JVM_REGISTRATION_FILE_EXTENSION || ext == GODOT_KOTLIN_SCRIPT_EXTENSION || ext == GODOT_JAVA_SCRIPT_EXTENSION) {
        // We replace the original script with another with the same path and name but empty content.
        // The remap boolean ensures that the original file is not kept for the export.
        add_file(p_path, Vector<uint8_t>(), true);
    }
}

#endif