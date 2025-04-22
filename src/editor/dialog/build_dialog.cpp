
#ifdef TOOLS_ENABLED

#include "build_dialog.h"

#include "editor/build/gradle_task_runner.h"
#include "logging.h"

#include <editor/themes/editor_scale.h>

TaskDialog::TaskDialog() :
  scroll_container(memnew(ScrollContainer)),
  log_label(memnew(Label)),
  progress_bar(memnew(ProgressBar)),
  vertical_container(memnew(VBoxContainer)) {
    set_title("Gradle Task Runner");
}

void TaskDialog::set_scrollbar_at_bottom() {
    scroll_container->set_v_scroll(static_cast<int>(scroll_container->get_v_scroll_bar()->get_max()));
}

void TaskDialog::make_appear() {
    log_label->set_text("");
    set_transient(true);
    set_exclusive(true);
    progress_bar->show();
    popup_centered();
}

void TaskDialog::update_state(String log) {
    if (log.is_empty()) { return; }
    log_label->set_text(log_label->get_text() + log);

    StringName signal = SNAME("draw");
    Callable callback = callable_mp(this, &TaskDialog::set_scrollbar_at_bottom);

    if (!scroll_container->is_connected(signal, callback)) {
        scroll_container->connect(signal, callback, CONNECT_ONE_SHOT);
    }
}

void TaskDialog::stop() {
    progress_bar->hide();
    set_exclusive(false);
}

void TaskDialog::_notification(int notification) {
    if (notification != NOTIFICATION_ENTER_TREE) { return; }
    scroll_container->set_custom_minimum_size(Size2 {600, 400} * EDSCALE);
    vertical_container->add_child(scroll_container);

    log_label->set_h_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    scroll_container->add_child(log_label);

    progress_bar->set_editor_preview_indeterminate(true);
    progress_bar->set_indeterminate(true);
    vertical_container->add_child(progress_bar);

    add_child(vertical_container);
}

#endif // TOOLS_ENABLED