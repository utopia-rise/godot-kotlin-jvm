#include "jvm_syntax_highlighter.h"

#ifdef TOOLS_ENABLED

#include "api/language/names.h"

#include <classes/text_edit.hpp>

using namespace godot;

namespace {
    inline bool is_identifier_start(char32_t c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_';
    }

    inline bool is_identifier_char(char32_t c) {
        return is_identifier_start(c) || (c >= '0' && c <= '9');
    }
} // namespace

// Hand-maintained keyword list covering Kotlin, Java and Scala (see the header-level note on why
// this isn't sourced from each ScriptLanguage's reserved word list like master's implementation did).
const HashSet<String>& JvmStandardSyntaxHighlighter::get_keywords() {
    static const HashSet<String> keywords {
        // Common / Kotlin
        "val", "var", "fun", "class", "object", "interface", "package", "import", "return", "if", "else",
        "when", "for", "while", "do", "break", "continue", "is", "as", "in", "null", "true", "false", "this",
        "super", "try", "catch", "finally", "throw", "override", "private", "protected", "public", "internal",
        "companion", "init", "constructor", "enum", "sealed", "data", "abstract", "final", "open", "lateinit",
        "annotation", "vararg", "out", "inline", "reified", "suspend", "typealias", "by", "get", "set",
        // Java / Scala shared
        "new", "static", "void", "extends", "implements", "throws", "int", "long", "double", "float", "boolean",
        "char", "byte", "short", "instanceof", "case", "match", "trait", "extends", "with", "def", "yield",
        "implicit", "lazy"
    };
    return keywords;
}

String JvmStandardSyntaxHighlighter::_get_name() const {
    return "Godot Kotlin/JVM";
}

PackedStringArray JvmStandardSyntaxHighlighter::_get_supported_languages() const {
    return {GODOT_JVM_LANGUAGE_NAME, GODOT_KOTLIN_LANGUAGE_NAME, GODOT_JAVA_LANGUAGE_NAME, GODOT_SCALA_LANGUAGE_NAME};
}

Ref<EditorSyntaxHighlighter> JvmStandardSyntaxHighlighter::_create() const {
    Ref<JvmStandardSyntaxHighlighter> result;
    result.instantiate();
    return result;
}

Dictionary JvmStandardSyntaxHighlighter::_get_line_syntax_highlighting(int32_t p_line) const {
    Dictionary color_map;

    TextEdit* text_edit = get_text_edit();
    if (text_edit == nullptr) { return color_map; }

    String line = text_edit->get_line(p_line);
    int64_t length = line.length();

    // Simplified fixed palette: EditorSyntaxHighlighter has no direct access to the editor theme's
    // script color scheme from here, unlike master's engine-internal base class which pulled it
    // automatically. See the header-level note for the full list of simplifications.
    static const Color keyword_color(0.45f, 0.62f, 0.91f);
    static const Color comment_color(0.5f, 0.5f, 0.5f);
    static const Color string_color(0.92f, 0.72f, 0.42f);
    static const Color default_color(0.85f, 0.85f, 0.85f);

    const HashSet<String>& keywords = get_keywords();

    auto set_color_at = [&](int64_t column, const Color& color) {
        Dictionary entry;
        entry["color"] = color;
        color_map[column] = entry;
    };

    int64_t i = 0;
    while (i < length) {
        char32_t c = line[i];

        // Line comment: rest of the line.
        if (c == '/' && i + 1 < length && line[i + 1] == '/') {
            set_color_at(i, comment_color);
            break;
        }

        // Block comment start. NOTE: state is not tracked across lines, so a block comment left open
        // at the end of a line will not continue to be highlighted on the following lines.
        if (c == '/' && i + 1 < length && line[i + 1] == '*') {
            int64_t start = i;
            int64_t end = line.find("*/", i + 2);
            set_color_at(start, comment_color);
            if (end == -1) { break; }
            i = end + 2;
            if (i < length) { set_color_at(i, default_color); }
            continue;
        }

        // String literal.
        if (c == '"') {
            int64_t start = i;
            int64_t j = i + 1;
            while (j < length && line[j] != '"') {
                if (line[j] == '\\') { j++; }
                j++;
            }
            set_color_at(start, string_color);
            i = j < length ? j + 1 : length;
            if (i < length) { set_color_at(i, default_color); }
            continue;
        }

        // Identifier / keyword.
        if (is_identifier_start(c)) {
            int64_t start = i;
            int64_t j = i + 1;
            while (j < length && is_identifier_char(line[j])) {
                j++;
            }
            if (keywords.has(line.substr(start, j - start))) {
                set_color_at(start, keyword_color);
                if (j < length) { set_color_at(j, default_color); }
            }
            i = j;
            continue;
        }

        i++;
    }

    return color_map;
}

void JvmStandardSyntaxHighlighter::_bind_methods() {}

#endif
