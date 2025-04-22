
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILD_DIALOG_H
#define GODOT_JVM_BUILD_DIALOG_H

#include <scene/gui/dialogs.h>
#include <scene/gui/scroll_container.h>

class BuildDialog : public AcceptDialog {
    GDCLASS(BuildDialog, AcceptDialog)

    ScrollContainer* scroll_container;
    Label* log_label;

public:
    BuildDialog();

    void set_scrollbar_at_bottom();
    void make_appear();
    void update_state(String log);
    void _notification(int notification);
};

#endif// GODOT_JVM_BUILD_DIALOG_H

#endif// TOOLS_ENABLED