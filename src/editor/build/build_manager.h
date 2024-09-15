
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILD_MANAGER_H
#define GODOT_JVM_BUILD_MANAGER_H

#include <core/os/os.h>
#include <core/os/thread.h>
#include <core/object/worker_thread_pool.h>

class BuildManager {
    WorkerThreadPool::TaskID taskId = WorkerThreadPool::INVALID_TASK_ID;

    String build_log;
    int last_build_exit_code;

    BuildManager() = default;
    Error build_project();

    static void build_task(void* p_userdata);

public:
    static BuildManager& get_instance();

    BuildManager(const BuildManager&) = delete;
    BuildManager& operator=(const BuildManager&) = delete;

    bool build_project_blocking();
    void build_project_non_blocking();

    bool last_build_successful() const;
};

#endif// GODOT_JVM_BUILD_MANAGER_H

#endif// TOOLS_ENABLED
