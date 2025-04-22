
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILD_DIALOG_H
#define GODOT_JVM_BUILD_DIALOG_H

#include <scene/gui/dialogs.h>
#include <scene/gui/progress_bar.h>
#include <scene/gui/scroll_container.h>

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
};

#endif // GODOT_JVM_BUILD_DIALOG_H

#endif // TOOLS_ENABLED