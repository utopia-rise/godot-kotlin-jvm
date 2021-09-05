#ifdef TOOLS_ENABLED

#include <editor/editor_settings.h>
#include <core/os/os.h>
#include <core/os/dir_access.h>
#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include <modules/kotlin_jvm/src/path_provider.h>
#include "build_lock_watcher.h"

void BuildLockWatcher::_notificationv(int p_notification, bool p_reversed) {
    Node::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        timer->set_autostart(true);
        timer->set_wait_time(0.5);
        timer->set_one_shot(false);
        timer->set_wait_time(_EDITOR_GET("kotlin_jvm/editor/build_lock_watch_interval"));
        timer->connect("timeout", this, "reloadIfNeeded");
        add_child(timer);
    }
}

void BuildLockWatcher::reloadIfNeeded() { // NOLINT(readability-convert-member-functions-to-static)
    String build_usercode_path = PathProvider::provide_build_usercode_path();
    String runtime_usercode_path = PathProvider::provide_runtime_usercode_path();
    String build_lock_dir_path = PathProvider::provide_build_lock_dir_path();

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

    //TODO: find more efficient way. Atm with this, we calculate 2 md5 hashes every 0.5 seconds which is far from ideal
    if (PathProvider::copy_usercode_jar_if_necessary()) {
        // if the usercode was copied, init the usercode as the new usercode is newer than the old one
        LOG_INFO("Usercode change detected. Reloading...")
        GDKotlin::get_instance().init_usercode();
    }
}

BuildLockWatcher::BuildLockWatcher() : timer(memnew(Timer)) {
    ClassDB::bind_method(
            D_METHOD("reloadIfNeeded"),
            &BuildLockWatcher::reloadIfNeeded
    );
}

#endif //TOOLS_ENABLED