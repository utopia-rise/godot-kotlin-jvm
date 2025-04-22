
#ifdef TOOLS_ENABLED

#include "build_dialog.h"

#include "editor/build/build_manager.h"
#include "logging.h"

#include <editor/themes/editor_scale.h>

BuildDialog::BuildDialog() : scroll_container(memnew(ScrollContainer)), log_label(memnew(Label)) {
    set_title("Godot Kotlin/JVM Gradle build");
}

void BuildDialog::set_scrollbar_at_bottom() {
    scroll_container->set_v_scroll(static_cast<int>(scroll_container->get_v_scroll_bar()->get_max()));
}

void BuildDialog::make_appear() {
    log_label->set_text("");
    popup_centered();
}

void BuildDialog::update_state(String log) {
    if (log.is_empty()) { return; }
    log_label->set_text(log_label->get_text() + log);

    StringName signal = SNAME("draw");
    Callable callback = callable_mp(this, &BuildDialog::set_scrollbar_at_bottom);

    if (!scroll_container->is_connected(signal, callback)) {
        scroll_container->connect(signal, callback, CONNECT_ONE_SHOT);
    }
}

void BuildDialog::_notification(int notification) {
    if (notification != NOTIFICATION_ENTER_TREE) { return; }
    scroll_container->set_custom_minimum_size(Size2 {600, 400} * EDSCALE);
    add_child(scroll_container);

    log_label->set_h_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    scroll_container->add_child(log_label);
}

#endif // TOOLS_ENABLED