
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_ABOUT_DIALOG_H
#define GODOT_JVM_ABOUT_DIALOG_H

#include <editor/editor_settings.h>
#include <scene/gui/check_box.h>
#include <scene/gui/dialogs.h>

class AboutDialog : public AcceptDialog {
    GDCLASS(AboutDialog, AcceptDialog)

    void on_checkbox_toggled(bool is_selected);
    void on_url_clicked(const String& url);

public:
    AboutDialog();
    ~AboutDialog() = default;

    void _notification(int notification);
};

#endif// GODOT_JVM_ABOUT_DIALOG_H

#endif// TOOLS_ENABLED