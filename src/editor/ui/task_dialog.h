#ifndef GODOT_JVM_TASK_DIALOG_H
#define GODOT_JVM_TASK_DIALOG_H

#include <classes/accept_dialog.hpp>
#include <classes/label.hpp>
#include <classes/progress_bar.hpp>
#include <classes/scroll_container.hpp>
#include <classes/v_box_container.hpp>

namespace godot {
    class TaskDialog : public AcceptDialog {
        GDCLASS(TaskDialog, AcceptDialog)

        ScrollContainer* scroll_container;
        Label* log_label;
        ProgressBar* progress_bar;
        VBoxContainer* vertical_container;

    public:
        TaskDialog();

        void set_scrollbar_at_bottom();
        void make_appear();
        void update_state(String log);
        void stop();
        void _notification(int notification);

    protected:
        static void _bind_methods();
    };
} // namespace godot
#endif // GODOT_JVM_TASK_DIALOG_H