
#ifndef GODOT_JVM_BUILD_MANAGER_H
#define GODOT_JVM_BUILD_MANAGER_H

#include <core/error_list.h>
#include "build_output.h"

class BuildManager {
public:
    static BuildOutput editor_build_callback();
    static BuildOutput build_project_blocking();

private:
    static void show_build_error_dialog();
    static BuildOutput build();
};


#endif //GODOT_JVM_BUILD_MANAGER_H
