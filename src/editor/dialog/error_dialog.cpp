
#ifdef TOOLS_ENABLED

#include <editor/editor_settings.h>
#include <scene/gui/texture_rect.h>
#include <scene/gui/rich_text_label.h>
#include <editor/editor_scale.h>
#include "error_dialog.h"

ErrorDialog::ErrorDialog(): AcceptDialog(), error_message_label(memnew(RichTextLabel)) {
    VBoxContainer* about_vbox{memnew(VBoxContainer)};
    add_child(about_vbox);

    HBoxContainer* about_hbox{memnew(HBoxContainer)};
    about_vbox->add_child(about_hbox);

    TextureRect* icon{memnew(TextureRect)};
    icon->set_texture(get_icon("Warning", "EditorIcons"));
    about_hbox->add_child(icon);

    about_hbox->add_child(error_message_label);
    error_message_label->set_custom_minimum_size(Size2{600, 150} * EDSCALE);
    error_message_label->set_v_size_flags(Control::SizeFlags::SIZE_EXPAND_FILL);

    error_message_label->set_scroll_active(false);
    error_message_label->set_use_bbcode(true);
}

void ErrorDialog::show_with_error(const String& error_title, const String& error_message) {
    set_title(error_title);
    error_message_label->set_bbcode(error_message);
    popup_centered_minsize();
}

#endif //TOOLS_ENABLED