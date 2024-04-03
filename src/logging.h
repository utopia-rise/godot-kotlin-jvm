//
// Created by cedric on 05.02.21.
//

#ifndef GODOT_JVM_LOGGING_H
#define GODOT_JVM_LOGGING_H

#include "core/os/os.h"

#include <core/string/print_string.h>

#define LOG_VERBOSE(message) print_verbose(vformat("Godot-JVM: %s", message))

#define LOG_INFO(message) print_line(vformat("Godot-JVM: %s", message))

#define LOG_WARNING(message) WARN_PRINT(vformat("Godot-JVM: %s", message))

#define LOG_ERROR(message) ERR_PRINT(vformat("Godot-JVM: %s", message))

#ifdef DEV_ENABLED
#define LOG_DEV(message) LOG_INFO(message)
#define LOG_DEV_VERBOSE(message) LOG_VERBOSE(message)
#else
#define LOG_DEV(message)
#define LOG_VERBOSE(message)
#endif

#define JVM_ERR_FAIL_COND_MSG(condition, message) ERR_FAIL_COND_MSG(condition, vformat("Godot-JVM: %s", message))

#define JVM_ERR_FAIL_COND_V_MSG(condition, ret_var, message) \
    ERR_FAIL_COND_V_MSG(condition, ret_var, vformat("Godot-JVM: %s", message))

#ifdef DEBUG_ENABLED
#define JVM_CRASH_COND_MSG(condition, message)                                       \
    if (unlikely(condition)) { OS::get_singleton()->alert(message, "Fatal error"); } \
    CRASH_COND_MSG(condition, vformat("Godot-JVM: %s", message))
#else
#define JVM_CRASH_COND_MSG(condition, message) CRASH_COND_MSG(condition, vformat("Godot-JVM: %s", message))
#endif

#ifdef DEBUG_ENABLED
#define JVM_CRASH_NOW_MSG(message)                      \
    OS::get_singleton()->alert(message, "Fatal error"); \
    CRASH_NOW_MSG(vformat("Godot-JVM: %s", message))
#else
#define JVM_CRASH_NOW_MSG(message) CRASH_NOW_MSG(vformat("Godot-JVM: %s", message))
#endif
#endif// GODOT_JVM_LOGGING_H
