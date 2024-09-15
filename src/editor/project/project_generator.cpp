#ifdef TOOLS_ENABLED

#include "project_generator.h"

#include "editor/strings.h"
#include "version.h"

#include <core/config/project_settings.h>
#include <core/io/dir_access.h>

void ProjectGenerator::generate_jvm_files(bool erase_existing) {
    String root = String("res://");
    Ref<DirAccess> root_directory = DirAccess::open(root);
    core_bind::Marshalls* marshall = memnew(core_bind::Marshalls);

    for (int i = 0; i < number_of_files; ++i) {
        String file_content = marshall->base64_to_utf8(file_contents[i])
                                .replace(VERSION_TEMPLATE, GODOT_KOTLIN_VERSION)
                                .replace(PROJECT_NAME_TEMPLATE, GLOBAL_GET("application/config/name"));

        String file_location = String(file_names[i]);
        String directory_path = file_location.get_base_dir();

        if (!erase_existing && FileAccess::exists(file_location)) { continue; }

        if (!DirAccess::exists(root.path_join(file_location))) { root_directory->make_dir_recursive(directory_path); }

        Error err;
        Ref<FileAccess> file = FileAccess::open(file_location, FileAccess::WRITE, &err);
        if (err != OK) {
            LOG_WARNING("Cannot save template file '" + file_location + "'.");
        } else {
            file->store_string(file_content);
        }
    }

    memdelete(marshall);
}

#endif// TOOLS_ENABLED