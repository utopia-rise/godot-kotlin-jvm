#ifdef TOOLS_ENABLED

#include <core/os/dir_access.h>
#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include <modules/kotlin_jvm/src/path_provider.h>
#include <editor/editor_settings.h>
#include "build_lock_watcher.h"

void BuildLockWatcher::poll_build_lock() {
    while (polling_thread_running) {
        if (!FileAccess::exists(PathProvider::provide_build_lock_file_path())) {
            reload_if_needed();
        }
        Variant poll_delay_variant{_EDITOR_GET("kotlin_jvm/editor/build_lock_watch_interval")};
        float poll_delay{1};
        if (poll_delay_variant.get_type() == Variant::REAL || poll_delay_variant.get_type() == Variant::INT) {
            poll_delay = poll_delay_variant;
        }
        OS::get_singleton()->delay_usec(static_cast<int>(poll_delay * 1000 * 1000));
    }
}

void BuildLockWatcher::reload_if_needed() {
    const String& build_usercode_path{PathProvider::provide_build_usercode_path()};
    const String& currently_loaded_usercode_path{GDKotlin::get_instance().get_currently_loaded_usercode_path()};
    const String& build_lock_dir_path{PathProvider::provide_build_lock_dir_path()};

    if (!FileAccess::exists(ProjectSettings::get_singleton()->globalize_path(build_usercode_path))) {
        // a gradle clean or no build has happened yet. Teardown any initialized usercode
        call_deferred("trigger_teardown_usercode");
        return;
    }

    String new_path;
    if (GDKotlin::get_instance().copy_usercode_jar_if_necessary(new_path)) {
        // if the usercode was copied, init the usercode as the new usercode is newer than the old one
        LOG_INFO("Usercode change detected. Reloading...");
        call_deferred("trigger_re_init_usercode", new_path);
    }
}

void forward_poll_build_lock(void * context) {
    static_cast<BuildLockWatcher *>(context)->poll_build_lock();
}

void BuildLockWatcher::start_polling_thread() {
    polling_thread_running = true;
    build_lock_poll_thread.start(forward_poll_build_lock, this);
}

void BuildLockWatcher::stop_polling() {
    polling_thread_running = false;
    build_lock_poll_thread.wait_to_finish();
}

// ONLY call on main thread!
void BuildLockWatcher::trigger_re_init_usercode(const String& new_path) { // NOLINT(readability-convert-member-functions-to-static)
    GDKotlin::get_instance().teardown_usercode();
    GDKotlin::get_instance().init_usercode(new_path);
}

// ONLY call on main thread!
void BuildLockWatcher::trigger_teardown_usercode() { // NOLINT(readability-convert-member-functions-to-static)
    GDKotlin::get_instance().teardown_usercode();
}

BuildLockWatcher::BuildLockWatcher() {
    ClassDB::bind_method(D_METHOD("trigger_re_init_usercode"), &BuildLockWatcher::trigger_re_init_usercode, Variant::STRING);
    ClassDB::bind_method(D_METHOD("trigger_teardown_usercode"), &BuildLockWatcher::trigger_teardown_usercode);
}

#endif //TOOLS_ENABLED