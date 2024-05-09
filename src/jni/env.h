#ifndef GODOT_LOADER_ENV_H
#define GODOT_LOADER_ENV_H

#include "logging.h"

#include <core/string/ustring.h>
#include <jni.h>

#ifdef TOOLS_ENABLED
#define HANDLE_JVM_EXCEPTIONS(condition, message) JVM_ERR_FAIL_COND_MSG(condition, message)
#elif DEBUG_ENABLED
#define HANDLE_JVM_EXCEPTIONS(condition, message) JVM_CRASH_COND_MSG(condition, message)
#else
#define HANDLE_JVM_EXCEPTIONS(condition, message) JVM_ERR_FAIL_COND_MSG(condition, message)
#endif

namespace jni {

    class JObject;
    class JClass;
    class JArray;
    class JObjectArray;
    class JByteArray;
    class JIntArray;
    class JLongArray;
    class JFloatArray;
    class JDoubleArray;
    class JString;

    class Env {
    public:
        explicit Env(JNIEnv*);

        Env(const Env&) = default;
        Env& operator=(const Env&) = default;

        JavaVM* get_jvm();

        void push_local_frame(int capacity);
        void pop_local_frame();

        JClass find_class(const char* name);

        JObject new_string(const char* str);
        String from_jstring(JString str);

        bool exception_check();
        void exception_describe();
        void exception_clear();

        void check_exceptions();

        void* get_direct_buffer_address(const jni::JObject& buffer);
        int get_direct_buffer_capacity(const jni::JObject& buffer);

        bool is_same_object(const jni::JObject& obj_1, const jni::JObject& obj_2);

        bool is_valid();

    private:
        JNIEnv* env;

        friend class JObject;
        friend class JClass;
        friend class JArray;
        friend class JObjectArray;
        friend class JByteArray;
        friend class JIntArray;
        friend class JLongArray;
        friend class JFloatArray;
        friend class JDoubleArray;
    };
}// namespace jni

#endif// GODOT_LOADER_ENV_H
