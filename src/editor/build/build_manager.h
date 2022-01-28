
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILD_MANAGER_H
#define GODOT_JVM_BUILD_MANAGER_H

#include <core/os/os.h>
#include <core/os/thread.h>

class BuildManager {
public:
    static BuildManager& get_instance();

    BuildManager(const BuildManager&) = delete;

    BuildManager& operator=(const BuildManager&) = delete;

    bool build_project_blocking();

    void build_project_non_blocking();

    bool can_build_project();

    bool is_build_finished();

    void update_build_state();

    String get_log();

    void clear_log();

    bool last_build_successful() const;

    Error build_blocking();

private:
    BuildManager();

    String build_log;
    Thread build_thread;
    bool build_finished;
    Mutex build_mutex;
    int last_build_exit_code;
};


#endif //GODOT_JVM_BUILD_MANAGER_H

#endif //TOOLS_ENABLED