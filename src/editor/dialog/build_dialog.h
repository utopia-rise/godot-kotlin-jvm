
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BUILD_DIALOG_H
#define GODOT_JVM_BUILD_DIALOG_H


#include <scene/gui/dialogs.h>
#include <scene/gui/scroll_container.h>

class BuildDialog : public AcceptDialog {
public:
    BuildDialog();

    void update_state();

private:
    ScrollContainer* scroll_container;
    Label* log_label;

    void cancel_build();

    void on_build_dialog_hide();
};


#endif //GODOT_JVM_BUILD_DIALOG_H

#endif //TOOLS_ENABLED