
#ifdef TOOLS_ENABLED

#include <editor/editor_scale.h>
#include <modules/kotlin_jvm/src/editor/build/build_manager.h>
#include "bottom_panel.h"
#include "modules/kotlin_jvm/src/editor/godot_kotlin_jvm_editor.h"

BottomPanel::BottomPanel() :
        build_button(memnew(Button)),
        log_scroll_container(memnew(ScrollContainer)),
        log_label(memnew(Label)) {

    ClassDB::bind_method(D_METHOD("on_build_button_pressed"), &BottomPanel::on_build_button_pressed);
    ClassDB::bind_method(D_METHOD("on_clear_log_button_pressed"), &BottomPanel::on_clear_log_button_pressed);

    set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
    set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);
    set_anchors_and_margins_preset(LayoutPreset::PRESET_WIDE);

    TabContainer* panel_tabs{memnew(TabContainer)};
    panel_tabs->set_name(TTR("Build"));
    add_child(panel_tabs);
    panel_tabs->set_tab_align(TabContainer::ALIGN_LEFT);
    panel_tabs->set_custom_minimum_size(Size2{0, 288} * EDSCALE);
    panel_tabs->set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    add_builds_tab(panel_tabs);
}

void BottomPanel::add_builds_tab(TabContainer* panel_tabs) {
    VBoxContainer* build_tab{memnew(VBoxContainer)};
    panel_tabs->add_child(build_tab);
    build_tab->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    //toolbar
    HBoxContainer* toolbar_hbox{memnew(HBoxContainer)};
    build_tab->add_child(toolbar_hbox);
    toolbar_hbox->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    //toolbar - build button
    toolbar_hbox->add_child(build_button);
    build_button->set_text(TTR("Build Project"));
    build_button->set_focus_mode(FocusMode::FOCUS_NONE);
    build_button->connect("pressed", this, "on_build_button_pressed");

    toolbar_hbox->add_spacer();

    //toolbar - clear log button
    Button* clear_log_button{memnew(Button)};
    toolbar_hbox->add_child(clear_log_button);
    clear_log_button->set_text(TTR("Clear Output"));
    clear_log_button->set_focus_mode(FocusMode::FOCUS_NONE);
    clear_log_button->connect("pressed", this, "on_clear_log_button_pressed");

    //build output label
    build_tab->add_child(log_scroll_container);
    log_scroll_container->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
    log_scroll_container->set_v_size_flags(SizeFlags::SIZE_EXPAND_FILL);

    log_scroll_container->add_child(log_label);
    log_label->set_h_size_flags(SizeFlags::SIZE_EXPAND_FILL);
}

void BottomPanel::on_build_button_pressed() { // NOLINT(readability-convert-member-functions-to-static)
    BuildManager::get_instance().build_project_non_blocking();
}

void BottomPanel::on_clear_log_button_pressed() {
    log_label->set_text("");
    BuildManager::get_instance().clear_log();
}

void BottomPanel::update_log_output() {
    //set at beginning because once at bottom it should stay at the bottom. even if new input is added
    log_scroll_container->set_v_scroll(static_cast<int>(log_scroll_container->get_v_scrollbar()->get_max()));
    log_label->set_text(BuildManager::get_instance().get_log());
}

void BottomPanel::make_visible() {
    update_log_output();
    GodotKotlinJvmEditor::get_instance()->make_bottom_panel_item_visible(this);
}

void BottomPanel::update_state() {
    if (BuildManager::get_instance().can_build_project()) {
        build_button->set_disabled(false);
    } else {
        build_button->set_disabled(true);
        update_log_output();
    }
}

#endif //TOOLS_ENABLED