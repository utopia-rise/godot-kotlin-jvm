
#ifndef GODOT_JVM_BUILD_MANAGER_H
#define GODOT_JVM_BUILD_MANAGER_H

#include <core/error_list.h>
#include <core/os/os.h>

class BuildManager {
public:
    static bool build_project_blocking();
    static void build_project_non_blocking();
    static bool can_build_project();
    static bool build_finished();
    static void update_build_state();
    static void cancel_build();
    static String& get_log();
    static void clear_log();

private:
    static void pull_log();
};


#endif //GODOT_JVM_BUILD_MANAGER_H
