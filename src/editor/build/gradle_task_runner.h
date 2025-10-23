#ifndef GODOT_JVM_GRADLE_TASK_RUNNER_H
#define GODOT_JVM_GRADLE_TASK_RUNNER_H

#include <classes/file_access.hpp>
#include <classes/os.hpp>
#include <classes/thread.hpp>
#include <classes/worker_thread_pool.hpp>

namespace godot {
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

} // namespace godot
#endif // GODOT_JVM_GRADLE_TASK_RUNNER_H