
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_ABOUT_DIALOG_H
#define GODOT_JVM_ABOUT_DIALOG_H

#include <scene/gui/dialogs.h>
#include <scene/gui/check_box.h>
#include <editor/editor_settings.h>

class AboutDialog : public AcceptDialog {
public:
    AboutDialog();

protected:
    void _notificationv(int p_notification, bool p_reversed) override;

private:
    CheckBox* about_dialog_check_box;

    void on_about_to_show();

    void on_checkbox_toggled(bool is_selected);

    void on_url_clicked(const String& url);
};


#endif //GODOT_JVM_ABOUT_DIALOG_H

#endif //TOOLS_ENABLED