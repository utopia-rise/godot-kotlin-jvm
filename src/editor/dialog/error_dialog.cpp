
#ifdef TOOLS_ENABLED

#include "error_dialog.h"

#include <editor/themes/editor_scale.h>
#include <editor/editor_settings.h>
#include <scene/gui/rich_text_label.h>
#include <scene/gui/texture_rect.h>

ErrorDialog::ErrorDialog() : AcceptDialog(), error_message_label(memnew(RichTextLabel)) {
    VBoxContainer* about_vbox {memnew(VBoxContainer)};
    add_child(about_vbox);

    HBoxContainer* about_hbox {memnew(HBoxContainer)};
    about_vbox->add_child(about_hbox);

    TextureRect* icon {memnew(TextureRect)};
    icon->set_texture(get_theme_icon("Warning", "EditorIcons"));
    about_hbox->add_child(icon);

    about_hbox->add_child(error_message_label);
    error_message_label->set_custom_minimum_size(Size2 {600, 300} * EDSCALE);
    error_message_label->set_v_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);

    error_message_label->set_scroll_active(true);
    error_message_label->set_use_bbcode(true);
}

void ErrorDialog::show_with_error(const String& error_title, const String& error_message) {
    set_title(error_title);
    error_message_label->set_text(error_message);
    popup_centered();
}

void ErrorDialog::show_with_errors(const String& dialog_title, const Vector<Pair<String, String>>& errors) {
    set_title(dialog_title);
    String error_message {};

    for (int i = 0; i < errors.size(); i++) {
        Pair<String, String> error = errors[i];

        if (i != 0) { error_message += String {"\n\n"}; }

        error_message += String {"[u]"} + error.first + String {"[/u]"};
        error_message += String {"\n"};
        error_message += error.second;
    }

    error_message_label->set_text(error_message);
    popup_centered();
}

#endif// TOOLS_ENABLED