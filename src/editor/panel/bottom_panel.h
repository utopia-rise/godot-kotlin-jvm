
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_BOTTOM_PANEL_H
#define GODOT_JVM_BOTTOM_PANEL_H

#include <editor/editor_plugin.h>
#include <scene/gui/box_container.h>
#include <scene/gui/scroll_container.h>
#include <scene/gui/tab_container.h>

class BottomPanel : public VBoxContainer {
public:
    BottomPanel();

    void make_visible();

    void update_state();

private:
    ScrollContainer* log_scroll_container;
    Label* log_label;
    Button* build_button;

    void add_builds_tab(TabContainer* pContainer);

    void on_build_button_pressed();

    void on_clear_log_button_pressed();

    void update_log_output();
};

#endif// GODOT_JVM_BOTTOM_PANEL_H

#endif// TOOLS_ENABLED