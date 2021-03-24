
#ifdef TOOLS_ENABLED

#include "build_dialog.h"

#include <editor/editor_scale.h>
#include <modules/kotlin_jvm/src/editor/build/build_manager.h>

BuildDialog::BuildDialog() {
    ClassDB::bind_method(D_METHOD("cancel_build"), &BuildDialog::cancel_build);
    ClassDB::bind_method(D_METHOD("on_build_dialog_hide"), &BuildDialog::on_build_dialog_hide);

    add_cancel("Cancel")->connect("pressed", this, "cancel_build");
    set_title("Building...");
    connect("popup_hide", this, "on_build_dialog_hide");

    scroll_container = memnew(ScrollContainer);
    scroll_container->set_custom_minimum_size(Size2{600, 400} * EDSCALE);
    add_child(scroll_container);

    log_label = memnew(Label);
    log_label->set_h_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    scroll_container->add_child(log_label);
}

void BuildDialog::cancel_build() { // NOLINT(readability-convert-member-functions-to-static)
    BuildManager::cancel_build();
}

void BuildDialog::on_build_dialog_hide() {
    log_label->set_text("");
}

void BuildDialog::update_state() {
    log_label->set_text(BuildManager::get_log());
    scroll_container->set_v_scroll(static_cast<int>(scroll_container->get_v_scrollbar()->get_max()));

    if (BuildManager::is_build_finished() && BuildManager::last_build_successful()) {
        hide();
    }
}

#endif //TOOLS_ENABLED