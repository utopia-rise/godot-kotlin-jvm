#ifdef TOOLS_ENABLED

#include "kotlin_editor_export_plugin.h"

#include "api/language/names.h"
#include "api/script/jvm_script_manager.h"
#include "godot_jvm.h"
#include "lifecycle/jvm_user_configuration.h"
#include "lifecycle/paths.h"

#include <core/config/project_settings.hpp>

static constexpr const char* graal_feature {"export-graal-native-image"};
static constexpr const char* all_jvm_feature {"export-all-jvm"};
static constexpr const char* ios_jdk_version {"21"};

void KotlinEditorExportPlugin::_export_begin(const HashSet<String>& p_features, bool p_debug, const String& p_path, int p_flags) {
    JVM_LOG_INFO("Beginning Godot-Jvm specific exports.");

    // Add mandatory jars to pck
    Vector<String> files_to_add;

    bool is_windows_export {p_features.has("windows")};
    bool is_linux_export {p_features.has("linux")};
    bool is_macos_export {p_features.has("macos")};
    bool is_desktop_export {is_windows_export || is_linux_export || is_macos_export};
    bool is_android_export {p_features.has("android")};
    bool is_ios_export {p_features.has("ios")};

    bool is_universal {p_features.has("universal")};
    bool is_arm64 {p_features.has("arm64") || is_universal};
    bool is_x64 {p_features.has("x86_64") || is_universal};

    bool export_all {p_features.has(all_jvm_feature)};
    bool export_graal {p_features.has(graal_feature) || export_all};
    bool export_jvm {!p_features.has(graal_feature) || export_all};

    if (is_desktop_export) {
        if (export_jvm) {
            // add embedded jre
            if (is_macos_export) {
                // on macos the embedded jre needs to be added as a plugin file
                if (is_arm64) {
                    String jre_path {String(RES_DIRECTORY).path_join(MACOS_EMBEDDED_JRE_ARM_DIRECTORY)};
                    if (!DirAccess::exists(jre_path)) {
                        JVM_ERR_FAIL_MSG("JRE does not exist at %s! make sure you've created an embedded JRE using jlink!", jre_path);
                    }
                    add_macos_plugin_file(jre_path);
                }
                if (is_x64) {
                    String jre_path {String(RES_DIRECTORY).path_join(MACOS_EMBEDDED_JRE_AMD_DIRECTORY)};
                    if (!DirAccess::exists(jre_path)) {
                        JVM_ERR_FAIL_MSG("JRE does not exist at %s! make sure you've created an embedded JRE using jlink!", jre_path);
                    }
                    add_macos_plugin_file(jre_path);
                }

                if (!is_arm64 && !is_x64) {
                    JVM_ERR_FAIL_MSG("This desktop architecture is not supported for export. Only arm64 and x86_64 are "
                                     "supported by Godot Kotlin/JVM!");
                }
            } else if (is_linux_export || is_windows_export) {
                // on windows and linux the embedded jre can be added as a normal export dir
                String jre_dir {RES_DIRECTORY};
                String target_dir {p_path.get_base_dir()};

                if (is_arm64) {
                    if (is_linux_export) {
                        jre_dir = jre_dir.path_join(LINUX_EMBEDDED_JRE_ARM_DIRECTORY);
                        target_dir = target_dir.path_join(LINUX_EMBEDDED_JRE_ARM_DIRECTORY);
                    }
                    if (is_windows_export) {
                        jre_dir = jre_dir.path_join(WINDOWS_EMBEDDED_JRE_ARM_DIRECTORY);
                        target_dir = target_dir.path_join(WINDOWS_EMBEDDED_JRE_ARM_DIRECTORY);
                    }
                }
                if (is_x64) {
                    if (is_linux_export) {
                        jre_dir = jre_dir.path_join(LINUX_EMBEDDED_JRE_AMD_DIRECTORY);
                        target_dir = target_dir.path_join(LINUX_EMBEDDED_JRE_AMD_DIRECTORY);
                    }
                    if (is_windows_export) {
                        jre_dir = jre_dir.path_join(WINDOWS_EMBEDDED_JRE_AMD_DIRECTORY);
                        target_dir = target_dir.path_join(WINDOWS_EMBEDDED_JRE_AMD_DIRECTORY);
                    }
                }
                if (!is_arm64 && !is_x64) {
                    JVM_ERR_FAIL_MSG("This desktop architecture is not supported for export. Only arm64 and x86_64 are "
                                     "supported by Godot Kotlin/JVM!");
                }
                if (jre_dir.is_empty() || target_dir.is_empty()) {
                    JVM_ERR_FAIL_MSG("Could not find a jre directory for the current export configuration");
                }

                // copy the jre to res
                Error error;
                Ref<DirAccess> dir_access {DirAccess::open(jre_dir, &error)};
                if (error != OK) { JVM_ERR_FAIL_MSG("Cannot open directory %s", jre_dir); }
                if (dir_access->copy_dir(jre_dir, target_dir) != OK) {
                    JVM_ERR_FAIL_MSG(
                      "Cannot copy %s folder to export folder, please make sure you created a JRE directory at the "
                      "root of your project using jlink for the platform you want to export.",
                      jre_dir
                    );
                }
            } else {
                JVM_ERR_FAIL_MSG("Current desktop export target platform is not supported by Godot Kotlin/JVM! Only "
                                 "supported desktop targets are linux, macos and windows");
            }
        }

        // graal native image (usercode.(so, dll, dylib))
        if (export_graal) {
            if (is_windows_export) {
                files_to_add.push_back(String(RES_DIRECTORY).path_join(WINDOWS_GRAAL_NATIVE_IMAGE_FILE));
            } else if (is_linux_export) {
                files_to_add.push_back(String(RES_DIRECTORY).path_join(LINUX_GRAAL_NATIVE_IMAGE_FILE));
            } else if (is_macos_export) {
                files_to_add.push_back(String(RES_DIRECTORY).path_join(MACOS_GRAAL_NATIVE_IMAGE_FILE));
            } else {
                JVM_ERR_FAIL_MSG("Export target platform is not supported for graalvm export");
            }
        }

        // add Godot Kotlin/JVM configuration file based on export targets
        if (export_all) {
            _generate_export_configuration_file(GodotJvm::get_instance().get_configuration().vm_type);
        } else if (export_jvm) {
            _generate_export_configuration_file(jni::JvmType::JVM);
        } else if (export_graal) {
            _generate_export_configuration_file(jni::JvmType::GRAAL_NATIVE_IMAGE);
        }
    } else if (is_android_export) {
        _generate_export_configuration_file(jni::JvmType::ART);
    } else if (is_ios_export) {
        String base_ios_build_dir {String(RES_DIRECTORY).path_join(JVM_DIRECTORY).path_join("ios")};
        String base_ios_jdk_dir {base_ios_build_dir.path_join("ios-jdk").path_join(ios_jdk_version)};

        _generate_export_configuration_file(jni::JvmType::GRAAL_NATIVE_IMAGE);

        add_apple_embedded_platform_project_static_lib(
          ProjectSettings::get_singleton()->globalize_path(base_ios_jdk_dir.path_join("libjava-release.a"))
        );
        add_apple_embedded_platform_project_static_lib(
          ProjectSettings::get_singleton()->globalize_path(base_ios_jdk_dir.path_join("libjvm-release.a"))
        );
        add_apple_embedded_platform_project_static_lib(ProjectSettings::get_singleton()->globalize_path(base_ios_build_dir.path_join(IOS_GRAAL_NATIVE_IMAGE_FILE)));
    } else {
        JVM_ERR_FAIL_MSG("Godot Kotlin/JVM doesn't handle this platform");
    }

    for (const String& file_to_add : files_to_add) {
        if (!FileAccess::exists(file_to_add)) {
            JVM_ERR_FAIL_MSG("File can't be found, it won't be exported: %s", file_to_add);
        }
        add_file(file_to_add, FileAccess::get_file_as_bytes(file_to_add), false);
        JVM_LOG_INFO("Exporting %s", file_to_add);
    }

    _add_exclude_filter_preset();

    JVM_LOG_INFO("Finished Godot-Jvm specific exports.");
}

void KotlinEditorExportPlugin::_generate_export_configuration_file(jni::JvmType vm_type) {
    JvmUserConfiguration configuration = GodotJvm::get_instance().get_configuration(); // Copy
    configuration.vm_type = vm_type; // We only need to change the vm type

    const char32_t* json_string {JvmUserConfiguration::export_configuration_to_json(configuration).get_data()};
    Vector<uint8_t> json_bytes;
    for (int i = 0; json_string[i] != '\0'; ++i) {
        json_bytes.push_back(json_string[i]);
    }

    add_file(JVM_CONFIGURATION_PATH, json_bytes, false);
}

void KotlinEditorExportPlugin::_add_exclude_filter_preset() {
    // only add our configuration file to the exclude filter if it is not already present
    if (!get_export_preset()->get_exclude_filter().contains(JVM_CONFIGURATION_PATH)) {
        // we manually add the configuration file to the exclude filter to prevent it from being added multiple times
        // this could happen if a user adds json files globally with the include filter `*.json` for example
        // it also seems that json files are added by default now, which also triggers this issue
        get_export_preset()->set_exclude_filter(get_export_preset()->get_exclude_filter() + "," + JVM_CONFIGURATION_PATH);
    }

    if (const String build_dir = String {BUILD_DIRECTORY}.path_join("*"); !get_export_preset()->get_exclude_filter().contains(build_dir)) {
        // exclude build folder
        get_export_preset()->set_exclude_filter(get_export_preset()->get_exclude_filter() + "," + build_dir);
    }

    if (const String jre_jars = String {"res://"} + JVM_DIRECTORY + "jre-*/**/*.jar"; !get_export_preset()->get_exclude_filter().contains(jre_jars)) {
        // exclude any jars in the embedded jre
        get_export_preset()->set_exclude_filter(get_export_preset()->get_exclude_filter() + "," + jre_jars);
    }
}

String KotlinEditorExportPlugin::get_name() const {
    return "Godot Kotlin/Jvm";
}

void KotlinEditorExportPlugin::_export_file(const String& p_path, const String& p_type, const HashSet<String>& p_features) {
    String ext = p_path.get_extension();
    if (ext == GODOT_KOTLIN_SCRIPT_EXTENSION || ext == GODOT_JAVA_SCRIPT_EXTENSION || ext == GODOT_SCALA_SCRIPT_EXTENSION) {
        // We replace the original script with another with the same path and name but with fqname content.
        // The remap boolean ensures that the original file is not kept for the export.

        String source;
        Error error;
        String fq_name {SourceScript::parse_source_to_fqdn(p_path, source, &error) };

        if (error != OK) {
            JVM_LOG_WARNING(vformat("Failed to parse source %s", p_path));
            return;
        }

        add_file(p_path, fq_name.to_utf8_buffer(), true);

        return;
    }

    if (ext == GODOT_JVM_REGISTRATION_FILE_EXTENSION) {
        // We replace the original script with another with the same path and name but empty content.
        // The remap boolean ensures that the original file is not kept for the export.
        add_file(p_path, Vector<uint8_t>(), true);
    }
}

#endif