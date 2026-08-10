#pragma once

#ifdef TOOLS_ENABLED

#include <classes/editor_syntax_highlighter.hpp>
#include <templates/hash_set.hpp>
#include <variant/color.hpp>
#include <variant/dictionary.hpp>
#include <variant/packed_string_array.hpp>
#include <variant/string.hpp>

namespace godot {
    // NOTE: master's version subclassed the engine-internal `EditorStandardSyntaxHighlighter`
    // (from `editor/script/syntax_highlighters.h`), which has no GDExtension equivalent and pulled
    // its reserved-word lists directly from each registered `ScriptLanguage`. godot-cpp only exposes
    // the lower-level `EditorSyntaxHighlighter`/`SyntaxHighlighter` virtuals (`_get_line_syntax_highlighting`),
    // so this is a from-scratch reimplementation with a fixed, hand-maintained keyword list covering
    // Kotlin/Java/Scala rather than one sourced from the languages themselves. This is a simplified
    // subset of master's behavior: keyword, comment (line and block) and string-literal coloring only.
    // Numeric literal highlighting, per-language keyword sets, and nested/multiline block-comment state
    // tracking across lines are not implemented.
    //
    // This class must additionally be registered with the editor's ScriptEditor
    // (`ScriptEditor::register_syntax_highlighter`) once a godot-cpp path for that call is confirmed;
    // that registration is not available in godot-cpp today, so `register_types.cpp` (owned separately)
    // can only `GDREGISTER_CLASS` this type, not hook it into the script editor's highlighter list.
    class JvmStandardSyntaxHighlighter : public EditorSyntaxHighlighter {
        GDCLASS(JvmStandardSyntaxHighlighter, EditorSyntaxHighlighter)

        static const HashSet<String>& get_keywords();

    public:
        String _get_name() const override;
        PackedStringArray _get_supported_languages() const override;
        Ref<EditorSyntaxHighlighter> _create() const override;
        Dictionary _get_line_syntax_highlighting(int32_t p_line) const override;

    protected:
        static void _bind_methods();
    };
} // namespace godot

#endif
