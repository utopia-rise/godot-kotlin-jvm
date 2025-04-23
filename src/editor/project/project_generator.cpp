#include "project_generator.h"

#include "editor/strings.h"
#include "version.h"

#include <core/config/project_settings.hpp>
#include <core/io/dir_access.hpp>

constexpr const int permissions = FileAccess::UnixPermissionFlags::UNIX_READ_OTHER | FileAccess::UnixPermissionFlags::UNIX_WRITE_OTHER
                                | FileAccess::UnixPermissionFlags::UNIX_READ_GROUP | FileAccess::UnixPermissionFlags::UNIX_WRITE_GROUP
                                | FileAccess::UnixPermissionFlags::UNIX_READ_OWNER | FileAccess::UnixPermissionFlags::UNIX_WRITE_OWNER
                                | FileAccess::UnixPermissionFlags::UNIX_EXECUTE_OWNER;

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
                                        .replace(PROJECT_NAME_TEMPLATE, GLOBAL_GET("application/config/name"));
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