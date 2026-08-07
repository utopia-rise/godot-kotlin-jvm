#include "jvm_syntax_highlighter.h"

#ifdef TOOLS_ENABLED

#include "language/names.h"

PackedStringArray JvmStandardSyntaxHighlighter::_get_supported_languages() const {
    return {GODOT_JVM_LANGUAGE_NAME, GODOT_KOTLIN_LANGUAGE_NAME, GODOT_JAVA_LANGUAGE_NAME, GODOT_SCALA_LANGUAGE_NAME};
}

Ref<EditorSyntaxHighlighter> JvmStandardSyntaxHighlighter::_create() const {
    Ref<JvmStandardSyntaxHighlighter> result;
    result.instantiate();
    return result;
}

#endif
