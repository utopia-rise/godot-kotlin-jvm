#ifndef GODOT_JVM_LOGGING_H
#define GODOT_JVM_LOGGING_H

#include "core/os/os.h"

#include <core/string/print_string.h>

#define LOG_VERBOSE(message) print_verbose(vformat("Godot-JVM: %s", message))
#define LOG_INFO(message) print_line(vformat("Godot-JVM: %s", message))
#define LOG_WARNING(message) WARN_PRINT(vformat("Godot-JVM: %s", message))
#define LOG_ERROR(message) ERR_PRINT(vformat("Godot-JVM: %s", message))

#define JVM_ERR_FAIL_MSG(message) ERR_FAIL_EDMSG(vformat("Godot-JVM: %s", message))
#define JVM_ERR_FAIL_V_MSG(ret_var, message) ERR_FAIL_V_EDMSG(ret_var, vformat("Godot-JVM: %s", message))
#define JVM_ERR_FAIL_COND_MSG(condition, message) ERR_FAIL_COND_EDMSG(condition, vformat("Godot-JVM: %s", message))
#define JVM_ERR_FAIL_COND_V_MSG(condition, ret_var, message) \
    ERR_FAIL_COND_V_EDMSG(condition, ret_var, vformat("Godot-JVM: %s", message))

#ifdef DEBUG_ENABLED
#define JVM_CRASH_COND_MSG(condition, message)                                       \
    if (unlikely(condition)) { OS::get_singleton()->alert(message, "Fatal error"); } \
    CRASH_COND_MSG(condition, vformat("Godot-JVM: %s", message))
#define JVM_CRASH_NOW_MSG(message)                      \
    OS::get_singleton()->alert(message, "Fatal error"); \
    CRASH_NOW_MSG(vformat("Godot-JVM: %s", message))
#else
#define JVM_CRASH_COND_MSG(condition, message) CRASH_COND_MSG(condition, vformat("Godot-JVM: %s", message))
#define JVM_CRASH_NOW_MSG(message) CRASH_NOW_MSG(vformat("Godot-JVM: %s", message))
#endif

#ifdef DEV_ENABLED
#define LOG_DEV(message) LOG_INFO(message)
#define LOG_DEV_VERBOSE(message) LOG_VERBOSE(message)
#define JVM_DEV_ASSERT(m_cond, message)                                                        \
    if (unlikely(!(m_cond))) {                                                                 \
        _err_print_error(FUNCTION_STR, __FILE__, __LINE__, vformat("Godot-JVM: %s", message)); \
        _err_flush_stdout();                                                                   \
        GENERATE_TRAP();                                                                       \
    } else                                                                                     \
        ((void) 0)
#else
#define LOG_DEV(message)
#define LOG_DEV_VERBOSE(message)
#define DEV_ASSERT(m_cond, message)
#endif

#endif// GODOT_JVM_LOGGING_H