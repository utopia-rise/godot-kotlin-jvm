#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILDLOCKWATCHER_H
#define GODOT_JVM_BUILDLOCKWATCHER_H


#include <scene/main/node.h>
#include <scene/main/timer.h>

class BuildLockWatcher : public Node {
public:
    BuildLockWatcher();
    void _notificationv(int p_notification, bool p_reversed) override;

private:
    Timer* timer;

    void reload_if_needed();
};


#endif //GODOT_JVM_BUILDLOCKWATCHER_H

#endif //TOOLS_ENABLED
