#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILDLOCKWATCHER_H
#define GODOT_JVM_BUILDLOCKWATCHER_H


#include <scene/main/node.h>

class BuildLockWatcher {
public:
    static BuildLockWatcher& get_instance();
    BuildLockWatcher(const BuildLockWatcher&) = delete;
    BuildLockWatcher& operator=(const BuildLockWatcher&) = delete;
    void start_polling_thread();

    void stop_polling();
private:
    BuildLockWatcher() = default;
    bool polling_thread_running = false;
    Thread build_lock_poll_thread;

    static void reload_if_needed();
    static void poll_build_lock(__attribute__((unused)) void* p_userdata);
};


#endif //GODOT_JVM_BUILDLOCKWATCHER_H

#endif //TOOLS_ENABLED
