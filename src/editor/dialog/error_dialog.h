#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_ERROR_DIALOG_H
#define GODOT_JVM_ERROR_DIALOG_H

#include <scene/gui/dialogs.h>
#include <scene/gui/rich_text_label.h>

class ErrorDialog : public AcceptDialog {
public:
    ErrorDialog();

    void show_with_error(const String& error_title, const String& error_message);
    void show_with_errors(const String& dialog_title, const Vector<Pair<String, String>>& errors);

private:
    RichTextLabel* error_message_label;
};

#endif// GODOT_JVM_ERROR_DIALOG_H
#endif// TOOLS_ENABLED