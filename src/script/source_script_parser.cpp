#include "source_script_parser.h"

#include "logging.h"

namespace {
constexpr const char* PACKAGE_KEYWORD = "package";
constexpr const char* CLASS_KEYWORD = "class";
constexpr const char* REGISTER_CLASS_ANNOTATION = "@RegisterClass";

_FORCE_INLINE_ bool is_end_of_source(const String& source, int index) {
    return index >= source.length();
}

bool is_identifier_character(char32_t character) {
    return (character >= U'0' && character <= U'9')
        || (character >= U'A' && character <= U'Z')
        || (character >= U'a' && character <= U'z')
        || character == U'_';
}

bool is_whitespace_or_linebreak(char32_t character) {
    return is_whitespace(character) || is_linebreak(character);
}

bool is_package_end(char32_t character) {
    return is_whitespace_or_linebreak(character) || character == U';' || character == U'/';
}

// Whitespace not always follows class names in valid Kotlin/Java/Scala declarations.
// Keep these delimiters so compact forms such as:
// - class Foo: Node()
// - class Foo<T>
// - class Foo()
// - class Foo{
// - class Foo /* ... */
// still stop exactly after "Foo".
bool is_class_name_end(char32_t character) {
    return is_whitespace_or_linebreak(character)
        || character == U':'
        || character == U'{'
        || character == U'<'
        || character == U'['
        || character == U'('
        || character == U'/';
}

bool skip_non_code_once(const String& source, int& index) {
    char32_t next_character = source[index];
    // Collapse any contiguous whitespace/newline run into one skip step.
    if (is_whitespace_or_linebreak(next_character)) {
        do {
            next_character = source[++index];
        } while (!is_end_of_source(source, index) && is_whitespace_or_linebreak(next_character));
        return true;
    }

    // At this point we already know the current character is not whitespace or new line.
    // comments must start with '/', so anything else is regular source code.
    if (next_character != U'/' || index >= source.length() - 1) {
        return false;
    }

    next_character = source[++index];
    // We already identified a leading '/', so a second '/' means we are inside a
    // single-line comment and can skip until the next line break.
    if (next_character == U'/') {
        while (!is_end_of_source(source, index) && !is_linebreak(next_character)) {
            next_character = source[++index];
        }
        return true;
    }

    // We already identified a leading '/' and previously tested for the '//' case; if the next character is not '*',
    // then this '/' does not start any supported comment form.
    if (next_character != U'*') {
        return false;
    }

    // We already identified the opening '/*', so skip until the matching closing '*/'.
    while (!is_end_of_source(source, index)) {
        bool is_comment_end = next_character == U'*';
        next_character = source[++index];

        if (is_end_of_source(source, index)) {
            JVM_LOG_WARNING("Cannot parse source, found unclosed multiline comment");
        }

        if (is_comment_end && next_character == U'/') {
            ++index;
            break;
        }
    }
    return true;
}

void skip_non_code(const String& source, int& index) {
    while (!is_end_of_source(source, index) && skip_non_code_once(source, index)) {}
}

bool matches_keyword_at(const String& source, int index, const String& keyword) {
    const int keyword_size = keyword.length();
    if (index < 0 || index + keyword_size > source.length()) {
        return false;
    }

    for (int i = 0; i < keyword_size; ++i) {
        if (source[index + i] != keyword[i]) {
            return false;
        }
    }

    const bool has_previous_character = index > 0;
    if (has_previous_character && is_identifier_character(source[index - 1])) {
        return false;
    }

    const int next_index = index + keyword_size;
    const bool has_next_character = next_index < source.length();
    if (has_next_character && is_identifier_character(source[next_index])) {
        return false;
    }

    return true;
}

int find_token(const String& source, int start_index, const String& token, bool exact_word) {
    while (!is_end_of_source(source, start_index)) {
        skip_non_code(source, start_index);
        if (is_end_of_source(source, start_index)) {
            return -1;
        }

        if (exact_word) {
            if (matches_keyword_at(source, start_index, token)) {
                return start_index;
            }
        } else if (source.find(token, start_index) == start_index) {
            return start_index;
        }

        ++start_index;
    }

    return -1;
}

String get_package_name(const String& source, int& r_register_class_search_start) {
    static String package_keyword {PACKAGE_KEYWORD};
    int package_keyword_index = find_token(source, 0, package_keyword, true);
    if (package_keyword_index == -1) {
        r_register_class_search_start = 0;
        return "";
    }

    int package_index = package_keyword_index + package_keyword.length();
    skip_non_code(source, package_index);

    char32_t next_character = source[package_index];
    int package_end_index = package_index;
    while (!is_end_of_source(source, package_end_index) && !is_package_end(next_character)) {
        next_character = source[++package_end_index];
    }

    r_register_class_search_start = package_end_index;
    return source.substr(package_index, package_end_index - package_index);
}

void skip_register_class_annotation_arguments(const String& source, int register_class_index, int& r_class_search_index) {
    int current_index = register_class_index + String(REGISTER_CLASS_ANNOTATION).length();
    skip_non_code(source, current_index);

    if (is_end_of_source(source, current_index) || source[current_index] != U'(') {
        r_class_search_index = current_index;
        return;
    }

    int depth = 0;
    while (!is_end_of_source(source, current_index)) {
        char32_t current_character = source[current_index];
        if (current_character == U'(') {
            ++depth;
        } else if (current_character == U'"') {
            ++current_index;
            while (!is_end_of_source(source, current_index)) {
                if (source[current_index] == U'"' && source[current_index - 1] != U'\\') {
                    break;
                }
                ++current_index;
            }

            if (is_end_of_source(source, current_index)) {
                JVM_LOG_WARNING("Cannot parse @RegisterClass argument, found unclosed string literal");
                r_class_search_index = source.length();
                return;
            }
        } else if (current_character == U')') {
            --depth;
            if (depth == 0) {
                ++current_index;
                break;
            }
        }
        ++current_index;
    }

    skip_non_code(source, current_index);
    r_class_search_index = current_index;
}
} // namespace

#ifdef TOOLS_ENABLED
StringName parse_source_script_info(const String& p_source_code) {
    if (p_source_code.is_empty()) { return {}; }

    static String register_class_annotation {REGISTER_CLASS_ANNOTATION};
    int register_class_search_start = 0;
    String package_name = get_package_name(p_source_code, register_class_search_start);
    const int register_class_index = find_token(p_source_code, register_class_search_start, register_class_annotation, false);
    if (register_class_index == -1) {
        return {};
    }

    int class_search_index = 0;
    skip_register_class_annotation_arguments(p_source_code, register_class_index, class_search_index);

    static String class_keyword {CLASS_KEYWORD};
    int class_keyword_index = find_token(p_source_code, class_search_index, class_keyword, true);
    if (class_keyword_index == -1) {
        return {};
    }

    int class_index = class_keyword_index + class_keyword.length();
    skip_non_code(p_source_code, class_index);

    char32_t next_character = p_source_code[class_index];
    int class_end_index = class_index;
    while (!is_end_of_source(p_source_code, class_end_index) && !is_class_name_end(next_character)) {
        next_character = p_source_code[++class_end_index];
    }

    String class_name = p_source_code.substr(class_index, class_end_index - class_index);
    if (class_name.is_empty()) { return {}; }
    const String fq_name = package_name.is_empty() ? class_name : vformat("%s.%s", package_name, class_name);
    return StringName(fq_name);
}
#else
StringName parse_source_script_info(const String& p_source_code) {
    if (p_source_code.is_empty()) { return {}; }

    const String fq_name = p_source_code.strip_edges();
    return fq_name.is_empty() ? StringName() : StringName(fq_name);
}
#endif
