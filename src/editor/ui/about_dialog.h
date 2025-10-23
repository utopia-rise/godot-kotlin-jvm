#ifndef GODOT_JVM_ABOUT_DIALOG_H
#define GODOT_JVM_ABOUT_DIALOG_H

#include <classes/accept_dialog.hpp>

namespace godot {
    class AboutDialog : public AcceptDialog {
        GDCLASS(AboutDialog, AcceptDialog)

        void on_checkbox_toggled(bool is_selected);
        void on_url_clicked(const String& url);

    public:
        AboutDialog();
        ~AboutDialog() = default;

        void _notification(int notification);

    protected:
        static void _bind_methods();
    };
} // namespace godot
#endif // GODOT_JVM_ABOUT_DIALOG_H