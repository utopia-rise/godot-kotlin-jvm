#ifdef TOOLS_ENABLED

#include <core/os/dir_access.h>
#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include <modules/kotlin_jvm/src/path_provider.h>
#include <editor/editor_settings.h>
#include "build_lock_watcher.h"

void BuildLockWatcher::poll_build_lock(void* p_userdata) {
    jni::Jvm::attach();
    while (BuildLockWatcher::get_instance().polling_thread_running) {
        if (!FileAccess::exists(PathProvider::provide_build_lock_file_path())) {
            reload_if_needed();
        }
        Variant poll_delay_variant = _EDITOR_GET("kotlin_jvm/editor/build_lock_watch_interval");
        float poll_delay = 1;
        if (poll_delay_variant.get_type() == Variant::REAL || poll_delay_variant.get_type() == Variant::INT) {
            poll_delay = poll_delay_variant;
        }
        OS::get_singleton()->delay_usec(static_cast<int>(poll_delay * 1000 * 1000));
    }
    jni::Jvm::detach();
}

void BuildLockWatcher::reload_if_needed() {
    String build_usercode_path{PathProvider::provide_build_usercode_path()};
    String runtime_usercode_path{PathProvider::provide_runtime_usercode_path()};
    String build_lock_dir_path{PathProvider::provide_build_lock_dir_path()};

    if (!FileAccess::exists(ProjectSettings::get_singleton()->globalize_path(build_usercode_path))) {
        // a gradle clean or no build has happened yet. Teardown any initialized usercode
        GDKotlin::get_instance().teardown_usercode();

        // if the runtime usercode exists, delete it as it's now outdated as no build equivalent is present
        if (FileAccess::exists(runtime_usercode_path)) {
            DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
            build_lock_dir->remove(runtime_usercode_path);
            memdelete(build_lock_dir);
        }

        return;
    }

    if (GDKotlin::get_instance().copy_usercode_jar_if_necessary()) {
        // if the usercode was copied, init the usercode as the new usercode is newer than the old one
        LOG_INFO("Usercode change detected. Reloading...")
        GDKotlin::get_instance().init_usercode();
    }
}

BuildLockWatcher& BuildLockWatcher::get_instance() {
    static BuildLockWatcher instance;
    return instance;
}

void BuildLockWatcher::start_polling_thread() {
    polling_thread_running = true;
    build_lock_poll_thread.start(poll_build_lock, nullptr);
}

void BuildLockWatcher::stop_polling() {
    polling_thread_running = false;
    build_lock_poll_thread.wait_to_finish();
}

BuildLockWatcher::BuildLockWatcher() = default;

#endif //TOOLS_ENABLED