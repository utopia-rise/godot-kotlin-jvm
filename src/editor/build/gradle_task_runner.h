
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILD_MANAGER_H
#define GODOT_JVM_BUILD_MANAGER_H

#include <core/object/worker_thread_pool.h>
#include <core/os/os.h>
#include <core/os/thread.h>

class GradleTaskRunner {
public:
    enum Task {
        BUILD_DEBUG,
        BUILD_RELEASE,
        GENERATE_EMBEDDED_JVM
    };

private:
    Ref<FileAccess> stdio;
    Ref<FileAccess> stderr_io;
    int pid = -1;

    GradleTaskRunner() = default;

    void reset();

public:
    static GradleTaskRunner& get_instance();
    void cleanup();

    GradleTaskRunner(const GradleTaskRunner&) = delete;
    GradleTaskRunner& operator=(const GradleTaskRunner&) = delete;

    Error run_task(int task_id, String& log, bool blocking);
    bool is_task_started();
    bool is_task_terminated();
    void get_task_output(String& log, String& error);
};

#endif // GODOT_JVM_BUILD_MANAGER_H

#endif // TOOLS_ENABLED
