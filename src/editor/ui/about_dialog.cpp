#include "about_dialog.h"

#include "editor/godot_kotlin_jvm_editor.h"
#include "editor/strings.h"

#include <editor/editor_interface.h>
#include <editor/themes/editor_scale.h>
#include <scene/gui/rich_text_label.h>
#include <scene/gui/texture_rect.h>
#include <editor/settings/editor_settings.hpp>

AboutDialog::AboutDialog() {
    set_title("About Godot Kotlin JVM");
}

void AboutDialog::on_checkbox_toggled(bool is_selected) {
    GodotKotlinJvmEditor::get_instance()->get_editor_interface()->get_editor_settings()->set_setting(show_info_on_start, is_selected);
}

void AboutDialog::on_url_clicked(const String& url) {
    OS::get_singleton()->shell_open(url);
}

void AboutDialog::_notification(int notification) {
    if (notification != NOTIFICATION_ENTER_TREE) { return; }

    // Main VBoxContainer (icon + label on top, checkbox at bottom)
    VBoxContainer* about_vbox {memnew(VBoxContainer)};
    add_child(about_vbox);

    RichTextLabel* about_label {memnew(RichTextLabel)};
    about_label->set_custom_minimum_size(Size2 {600, 150} * EDSCALE);
    about_label->set_v_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    about_label->set_text(about_text);
    about_label->set_scroll_active(false);
    about_label->set_use_bbcode(true);
    about_label->connect(SNAME("meta_clicked"), callable_mp(this, &AboutDialog::on_url_clicked));
    about_vbox->add_child(about_label);

    CheckBox* about_dialog_check_box {memnew(CheckBox)};
    about_dialog_check_box->set_text("Show this info when starting the editor");
    about_dialog_check_box->set_h_size_flags(Control::SizeFlags::SIZE_SHRINK_CENTER);
    about_dialog_check_box->connect(SNAME("toggled"), callable_mp(this, &AboutDialog::on_checkbox_toggled));

    bool show_on_start = EDITOR_GET(show_info_on_start);
    about_dialog_check_box->set_pressed(show_on_start);

    about_vbox->add_child(about_dialog_check_box);

    if (show_on_start) {
        // Once shown a first time, it can be seen again via the Kotlin JVM menu - it doesn't have to be exclusive from that time on.
        set_exclusive(true);
        popup_centered();
        set_exclusive(false);
    }
}