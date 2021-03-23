
#ifndef GODOT_JVM_BOTTOM_PANEL_H
#define GODOT_JVM_BOTTOM_PANEL_H


#include <scene/gui/box_container.h>
#include <editor/editor_plugin.h>
#include <scene/gui/tab_container.h>
#include "build/build_output.h"

class BottomPanel: public VBoxContainer {
private:
    EditorInterface* editor_interface = nullptr;
    Label* log_label;

    void add_builds_tab(TabContainer *pContainer);


public:
    void show_build_tab();
    void _notificationv(int p_notification, bool p_reversed) override;
    void on_build_button_pressed();
    void on_clear_log_button_pressed();
    void update_log_output(const BuildOutput& build_output);
};


#endif //GODOT_JVM_BOTTOM_PANEL_H
