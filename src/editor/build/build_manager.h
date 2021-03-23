
#ifndef GODOT_JVM_BUILD_MANAGER_H
#define GODOT_JVM_BUILD_MANAGER_H

#include <core/error_list.h>
#include <core/os/os.h>
#include "build_output.h"

class BuildManager {
public:
    static BuildOutput build_project_blocking();
    static void build_project_non_blocking();
    static bool can_build_project();
    static void update_build_state();
    static void cancel_build();

private:
    static void show_build_error_dialog();
    static BuildOutput build();
};


#endif //GODOT_JVM_BUILD_MANAGER_H
