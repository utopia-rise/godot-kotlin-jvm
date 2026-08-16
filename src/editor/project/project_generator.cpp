#ifdef TOOLS_ENABLED

#include "project_generator.h"

#include "editor/strings.h"
#include "version.h"

#include <core/config/project_settings.h>
#include <core/io/dir_access.h>
#include <core/io/file_access.h>

constexpr const int permissions = FileAccess::UnixPermissionFlags::UNIX_READ_OTHER | FileAccess::UnixPermissionFlags::UNIX_WRITE_OTHER
                                  | FileAccess::UnixPermissionFlags::UNIX_READ_GROUP | FileAccess::UnixPermissionFlags::UNIX_WRITE_GROUP
                                  | FileAccess::UnixPermissionFlags::UNIX_READ_OWNER | FileAccess::UnixPermissionFlags::UNIX_WRITE_OWNER
                                  | FileAccess::UnixPermissionFlags::UNIX_EXECUTE_OWNER;

void remove_optional_block(String& content, const String& name) {
    const String begin_marker = "// BEGIN_OPTIONAL_" + name;
    const String end_marker = "// END_OPTIONAL_" + name;
    const int begin = content.find(begin_marker);
    const int end = content.find(end_marker, begin);

    if (begin != -1 && end != -1) {
        content = content.left(begin) + content.substr(end + end_marker.length());
    }
}

void ProjectGenerator::generate_jvm_files(bool erase_existing) {
    JVM_LOG_INFO("Generating JVM project files...");

    String root = String("res://");
    Ref<DirAccess> root_directory = DirAccess::open(root);
    CoreBind::Marshalls* marshall = memnew(CoreBind::Marshalls);

    for (int i = 0; i < number_of_files; ++i) {
        String file_location = String(file_names[i]);
        String directory_path = file_location.get_base_dir();

        if (!erase_existing && FileAccess::exists(file_location)) { continue; }

        if (!DirAccess::exists(root.path_join(file_location))) { root_directory->make_dir_recursive(directory_path); }

        {
            // Its own scope so the FileAccess is automatically closed.
            Error err;
            Ref<FileAccess> file = FileAccess::open(file_location, FileAccess::WRITE, &err);
            if (err != OK) {
                JVM_LOG_WARNING("Cannot save template file '" + file_location + "'.");
            } else if (file_is_binary[i]) {
                PackedByteArray file_content = marshall->base64_to_raw(file_contents[i]);
                file->store_buffer(file_content);
            } else {
                String file_content = marshall->base64_to_utf8(file_contents[i])
                                        .replace(VERSION_TEMPLATE, GODOT_KOTLIN_VERSION)
                                        .replace(PROJECT_NAME_TEMPLATE, GLOBAL_GET("application/config/name"))
                                        .replace("GODOT_LANGUAGES", "GodotLanguage.KOTLIN, GodotLanguage.JAVA, GodotLanguage.SCALA");
                remove_optional_block(file_content, "ANDROID");
                remove_optional_block(file_content, "GRAAL");
                file->store_string(file_content);
            }
        }
#if UNIX_ENABLED
        FileAccess::set_unix_permissions(file_location, permissions);
#endif

    }
    memdelete(marshall);
    JVM_LOG_INFO("JVM project files generated.");
}

#endif// TOOLS_ENABLED
