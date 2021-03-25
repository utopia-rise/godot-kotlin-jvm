
#ifdef TOOLS_ENABLED

#include <scene/gui/texture_rect.h>
#include <scene/gui/rich_text_label.h>
#include <scene/gui/check_box.h>
#include <editor/editor_scale.h>
#include <core/os/os.h>
#include <modules/kotlin_jvm/src/editor/godot_kotlin_jvm_editor.h>
#include "about_dialog.h"

AboutDialog::AboutDialog(): about_dialog_check_box(memnew(CheckBox)) {
    _EDITOR_DEF("kotlin_jvm/editor/show_info_on_start", true, false);
    ClassDB::bind_method(D_METHOD("on_about_to_show"), &AboutDialog::on_about_to_show);
    ClassDB::bind_method(D_METHOD("on_checkbox_toggled"), &AboutDialog::on_checkbox_toggled);
    ClassDB::bind_method(D_METHOD("on_url_clicked"), &AboutDialog::on_url_clicked);

    set_title("About Godot Kotlin JVM");

    connect("about_to_show", this, "on_about_to_show");

    // Main VBoxContainer (icon + label on top, checkbox at bottom)
    VBoxContainer* about_vbox{memnew(VBoxContainer)};
    add_child(about_vbox);

    // HBoxContainer for icon + label
    HBoxContainer* about_hbox{memnew(HBoxContainer)};
    about_vbox->add_child(about_hbox);

    TextureRect* about_icon{memnew(TextureRect)};
    about_icon->set_texture(about_icon->get_icon("NodeWarning", "EditorIcons"));
    about_hbox->add_child(about_icon);

    RichTextLabel* about_label{memnew(RichTextLabel)};
    about_hbox->add_child(about_label);
    about_label->set_custom_minimum_size(Size2{600, 150} * EDSCALE);
    about_label->set_v_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);
    about_label->set_bbcode(
            "Godot Kotlin JVM is a community project and is in no way related to Godot or Jetbrains.\n\n"
            "The project is in alpha stage and, while already usable, it is not meant for use in production.\n"
            "Future updates might still include breaking changes.\n\n"
            "If you encounter any bugs or problems, please report them on our [url=https://github.com/utopia-rise/godot-kotlin-jvm/issues]issue tracker[/url]"
    );
    about_label->set_scroll_active(false);
    about_label->set_use_bbcode(true);
    about_label->connect("meta_clicked", this, "on_url_clicked");

    about_vbox->add_child(about_dialog_check_box);
    about_dialog_check_box->set_text("Show this info when starting the editor");
    about_dialog_check_box->connect("toggled", this, "on_checkbox_toggled");
}

void AboutDialog::on_about_to_show() {
    bool show_on_start = GodotKotlinJvmEditor::get_instance()
            ->get_editor_interface()
            ->get_editor_settings()
            ->get_setting("kotlin_jvm/editor/show_info_on_start");

    about_dialog_check_box->set_pressed(show_on_start);
}

void AboutDialog::on_checkbox_toggled(bool is_selected) { // NOLINT(readability-convert-member-functions-to-static)
    bool show_on_start = GodotKotlinJvmEditor::get_instance()
            ->get_editor_interface()
            ->get_editor_settings()
            ->get_setting("kotlin_jvm/editor/show_info_on_start");

    if (show_on_start != is_selected) {
        GodotKotlinJvmEditor::get_instance()
                ->get_editor_interface()
                ->get_editor_settings()
                ->set_setting("kotlin_jvm/editor/show_info_on_start", is_selected);
    }
}

void AboutDialog::on_url_clicked(const String& url) { // NOLINT(readability-convert-member-functions-to-static)
    OS::get_singleton()->shell_open(url);
}

void AboutDialog::_notificationv(int p_notification, bool p_reversed) {
    AcceptDialog::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        bool show_on_start = GodotKotlinJvmEditor::get_instance()
                ->get_editor_interface()
                ->get_editor_settings()
                ->get_setting("kotlin_jvm/editor/show_info_on_start");

        if (show_on_start) {
            // Once shown a first time, it can be seen again via the Kotlin JVM menu - it doesn't have to be exclusive from that time on.
            set_exclusive(true);
            popup_centered_minsize();
            set_exclusive(false);
        }
    }
}

#endif //TOOLS_ENABLED