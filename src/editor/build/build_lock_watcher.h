#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILDLOCKWATCHER_H
#define GODOT_JVM_BUILDLOCKWATCHER_H


#include <scene/main/node.h>

class BuildLockWatcher: public Node {
public:
    BuildLockWatcher();
    void start_polling_thread();
    void stop_polling();
    void poll_build_lock();

protected:


private:
    bool polling_thread_running = false;
    Thread build_lock_poll_thread;

    void reload_if_needed();
    void trigger_re_init_usercode(const String& new_path);
    void trigger_teardown_usercode();
};


#endif //GODOT_JVM_BUILDLOCKWATCHER_H

#endif //TOOLS_ENABLED
