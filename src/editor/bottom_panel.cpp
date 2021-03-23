
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


        TabContainer* panel_tabs = memnew(TabContainer);
        add_child(panel_tabs);
        panel_tabs->set_tab_align(TabContainer::ALIGN_LEFT);
        panel_tabs->set_custom_minimum_size(Size2{0, 288} * EDSCALE);
        panel_tabs->set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);
        panel_tabs->add_style_override("panel", base_control->get_stylebox("DebuggerPanel", "EditorStyles"));
        panel_tabs->add_style_override("tab_fg", base_control->get_stylebox("DebuggerTabFG", "EditorStyles"));
        panel_tabs->add_style_override("tab_bg", base_control->get_stylebox("DebuggerTabBG", "EditorStyles"));

        add_builds_tab(panel_tabs);
    }
}

void BottomPanel::add_builds_tab(TabContainer *panel_tabs) {
    VBoxContainer* build_tab = memnew(VBoxContainer);
    build_tab->set_name("Build");
    panel_tabs->add_child(build_tab);
    build_tab->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    //toolbar
    HBoxContainer *toolbar_hbox = memnew(HBoxContainer);
    build_tab->add_child(toolbar_hbox);
    toolbar_hbox->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    //toolbar - build button
    build_button = memnew(Button);
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
    log_scroll_container = memnew(ScrollContainer);
    build_tab->add_child(log_scroll_container);
    log_scroll_container->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
    log_scroll_container->set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    log_label = memnew(Label);
    log_scroll_container->add_child(log_label);
    log_label->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
}

void BottomPanel::on_build_button_pressed() {
    BuildManager::build_project_non_blocking();
}

void BottomPanel::on_clear_log_button_pressed() {
    log_label->set_text("");
    DirAccess::create(DirAccess::ACCESS_RESOURCES)->remove(ProjectSettings::get_singleton()->globalize_path("res://build/build_output.txt"));
}

void BottomPanel::update_log_output() {
    //set at beginning because once at bottom it should stay at the bottom. even if new input is added
    log_scroll_container->set_v_scroll(static_cast<int>(log_scroll_container->get_v_scrollbar()->get_max()));
    GodotKotlinJvmEditor::get_instance()->build_dialog_scroll_container->set_v_scroll(static_cast<int>(GodotKotlinJvmEditor::get_instance()->build_dialog_scroll_container->get_v_scrollbar()->get_max()));

    FileAccess* file_access = FileAccess::open(ProjectSettings::get_singleton()->globalize_path("res://build/build_output.txt"), FileAccess::ModeFlags::READ);
    if (file_access) {
        String log = file_access->get_as_utf8_string();
        log_label->set_text(log);
        GodotKotlinJvmEditor::get_instance()->build_dialog_log->set_text(log);
        file_access->close();
    } else {
        log_label->set_text("");
        GodotKotlinJvmEditor::get_instance()->build_dialog_log->set_text("");
    }
}

void BottomPanel::on_build_check() {
    if (BuildManager::can_build_project()) {
        build_button->set_disabled(false);
    } else {
        build_button->set_disabled(true);
        update_log_output();
    }
}
