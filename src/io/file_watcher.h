//
// Created by cedric on 09.02.24.
//

#ifndef GODOT_JVM_FILE_WATCHER_H
#define GODOT_JVM_FILE_WATCHER_H

#include "core/os/thread.h"
#include "core/string/ustring.h"

class FileWatcher {
public:
    typedef void (*FileChangedCallback)();

    FileWatcher(const String& file_path, FileChangedCallback callback);
    ~FileWatcher();

    void start();
    void stop();

private:
    Thread thread;
    String monitored_file;
    String last_md5_hash;
    FileChangedCallback file_changed_callback;
    bool stop_signal = false;

    static void check_file_for_changes(void* user_data);
};

#endif// GODOT_JVM_FILE_WATCHER_H
