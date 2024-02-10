//
// Created by cedric on 09.02.24.
//

#include "file_watcher.h"

#include "core/os/os.h"
#include "logging.h"

FileWatcher::FileWatcher(const String& file_path, FileWatcher::FileChangedCallback callback): monitored_file(file_path){
    file_changed_callback = callback;
}

FileWatcher::~FileWatcher() = default;

void FileWatcher::start() {
    thread.start(check_file_for_changes, this);
}

void FileWatcher::stop() {
    thread.wait_to_finish();
}

void FileWatcher::check_file_for_changes(void* user_data) {
    OS::get_singleton()->delay_usec(10000000); //delay for 10 second
    LOG_INFO("Initializing file watch");
    FileWatcher* file_watcher = static_cast<FileWatcher*>(user_data);

    while (file_watcher && !file_watcher->finish_signal) {
        LOG_INFO("Checking file");
        Error err;
        Ref<FileAccess> file_access {FileAccess::open(file_watcher->monitored_file, FileAccess::READ, &err)};

        if (err == OK && file_access->file_exists(file_watcher->monitored_file)) {
            String new_md5_hash {file_access->get_md5(file_watcher->monitored_file)};

            if (new_md5_hash != file_watcher->last_md5_hash) {
                LOG_INFO("File changed, triggering reload");
                file_watcher->last_md5_hash = new_md5_hash;
                file_watcher->file_changed_callback();
            } else {
                LOG_INFO("File not changed");
            }
        } else {
            LOG_INFO("File not present or error");
            file_watcher->last_md5_hash = "";
        }

        OS::get_singleton()->delay_usec(1000000); //delay for 1 second
    }
}