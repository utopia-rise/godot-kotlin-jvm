#pragma once

#ifdef TOOLS_ENABLED

#include <editor/script/syntax_highlighters.h>

class JvmStandardSyntaxHighlighter : public EditorStandardSyntaxHighlighter {
    GDCLASS(JvmStandardSyntaxHighlighter, EditorStandardSyntaxHighlighter)

public:
    PackedStringArray _get_supported_languages() const override;
    Ref<EditorSyntaxHighlighter> _create() const override;
};

#endif
