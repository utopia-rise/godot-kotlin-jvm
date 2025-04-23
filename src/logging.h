#ifndef GODOT_JVM_LOGGING_H
#define GODOT_JVM_LOGGING_H

#include <classes/os.hpp>
#include <variant/string.hpp>
#include <variant/variant.hpp>


inline godot::String format_prefix{"Godot-JVM: "};

#define JVM_STRING_FORMAT(message, ...)  vformat(format_prefix + message,  ##__VA_ARGS__)

#define JVM_LOG_INFO(message, ...) print_line(JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_LOG_VERBOSE(message, ...) print_verbose(JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_LOG_WARNING(message, ...) WARN_PRINT(JVM_STRING_FORMAT(message, ##__VA_ARGS__))

#ifdef TOOLS_ENABLED
#define JVM_ERR_FAIL_MSG(message, ...) ERR_FAIL_EDMSG(JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_ERR_FAIL_V_MSG(ret_var, message, ...) \
    ERR_FAIL_V_EDMSG(ret_var, JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_ERR_FAIL_COND_MSG(condition, message, ...) \
    ERR_FAIL_COND_EDMSG(condition, JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_ERR_FAIL_COND_V_MSG(condition, ret_var, message, ...) \
    ERR_FAIL_COND_V_EDMSG(condition, ret_var, JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#else
#define JVM_ERR_FAIL_MSG(message, ...) ERR_FAIL_MSG(JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_ERR_FAIL_V_MSG(ret_var, message, ...) \
    ERR_FAIL_V_MSG(ret_var, JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_ERR_FAIL_COND_MSG(condition, message, ...) \
    ERR_FAIL_COND_MSG(condition, JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#define JVM_ERR_FAIL_COND_V_MSG(condition, ret_var, message, ...) \
    ERR_FAIL_COND_V_MSG(condition, ret_var, JVM_STRING_FORMAT(message, ##__VA_ARGS__))
#endif

#ifdef DEV_ENABLED
#define JVM_DEV_LOG(message, ...) JVM_LOG_INFO(message, ##__VA_ARGS__)
#define JVM_DEV_VERBOSE(message, ...) JVM_LOG_VERBOSE(message, ##__VA_ARGS__)
#define JVM_DEV_ASSERT(m_cond, message, ...)                                                                 \
    if (unlikely(!(m_cond))) {                                                                               \
        _err_print_error(FUNCTION_STR, __FILE__, __LINE__, JVM_STRING_FORMAT(message, ##__VA_ARGS__)); \
        _err_flush_stdout();                                                                                 \
        GENERATE_TRAP();                                                                                     \
    } else                                                                                                   \
        ((void) 0)
#else
#define JVM_DEV_LOG(message, ...)
#define JVM_DEV_VERBOSE(message, ...)
#define JVM_DEV_ASSERT(m_cond, message, ...)
#endif

#endif// GODOT_JVM_LOGGING_H