
#include <editor/editor_scale.h>
#include <modules/kotlin_jvm/src/editor/build/build_manager.h>
#include "bottom_panel.h"
#include "godot_kotlin_jvm_editor.h"

void BottomPanel::show_build_tab() {
    GodotKotlinJvmEditor::get_instance()->make_bottom_panel_item_visible(this);
}

void BottomPanel::_notificationv(int p_notification, bool p_reversed) {
    VBoxContainer::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        editor_interface = GodotKotlinJvmEditor::get_instance()->get_editor_interface();
        Control *base_control = editor_interface->get_base_control();

        set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
        set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);
        set_anchors_and_margins_preset(LayoutPreset::PRESET_WIDE);


        add_child(&panel_tabs);
        panel_tabs.set_tab_align(TabContainer::ALIGN_LEFT);
        panel_tabs.set_custom_minimum_size(Size2{0, 288} * EDSCALE);
        panel_tabs.set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);
        panel_tabs.add_style_override("panel", base_control->get_stylebox("DebuggerPanel", "EditorStyles"));
        panel_tabs.add_style_override("tab_fg", base_control->get_stylebox("DebuggerTabFG", "EditorStyles"));
        panel_tabs.add_style_override("tab_bg", base_control->get_stylebox("DebuggerTabBG", "EditorStyles"));

        add_builds_tab();
    }
}

void BottomPanel::add_builds_tab() {
    build_tab.set_name("Build");
    panel_tabs.add_child(&build_tab);
    set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    //toolbar
    HBoxContainer *toolbar_hbox = memnew(HBoxContainer);
    build_tab.add_child(toolbar_hbox);
    toolbar_hbox->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    //toolbar - build button
    Button *build_button = memnew(Button);
    toolbar_hbox->add_child(build_button);
    build_button->set_text(TTR("Build Project"));
    build_button->set_focus_mode(FocusMode::FOCUS_NONE);
    build_button->connect("pressed", this, "on_build_button_pressed");

    toolbar_hbox->add_spacer();

    //toolbar - clear log button
    Button *clear_log_button = memnew(Button);
    toolbar_hbox->add_child(clear_log_button);
    clear_log_button->set_text(TTR("Clear Output"));
    clear_log_button->set_focus_mode(FocusMode::FOCUS_NONE);
    clear_log_button->connect("pressed", this, "on_clear_log_button_pressed");

    //build output label
    build_tab.add_child(&log_scroll_container);
    log_scroll_container.set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
    log_scroll_container.set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    log_scroll_container.add_child(&log_label);
    log_label.set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
}

void BottomPanel::on_build_button_pressed() {
    BuildManager::editor_build_callback();
}

void BottomPanel::on_clear_log_button_pressed() {
    log_label.set_text("");
}

void BottomPanel::update_log_output(const BuildOutput &build_output) {
    if (!log_label.get_text().empty()) {
        log_label.set_text(String{vformat("%s\n\n%s", log_label.get_text(), build_output.output)});
    } else {
        log_label.set_text(build_output.output);
    }
}
