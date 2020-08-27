#ifndef GODOT_LOADER_ENV_H
#define GODOT_LOADER_ENV_H
#include <jni.h>
#include "types.h"
#include "exceptions.h"
#include "core/ustring.h"

namespace jni {
    class Env {
    public:
       explicit Env(JNIEnv*);
        // todo delete copy ctor and assignment?
        Env(const Env&) = default;
        Env& operator=(const Env&) = default;

        void push_local_frame(int capacity);
        void pop_local_frame();

        JClass find_class(const char* name);

        JClass load_class(const char* name, JObject class_loader);

        JObject new_string(const char* str);
        String from_jstring(jni::JString str);

        bool exception_check();
        void exception_describe();
        void exception_clear();

        void check_exceptions();

        void* get_direct_buffer_address(const jni::JObject& buffer);
        int get_direct_buffer_capacity(const jni::JObject& buffer);

        bool is_valid();
    private:
        JNIEnv* env;

        friend class JObject;
        friend class JClass;
        friend class JArray;
        friend class JObjectArray;
    };
}


#endif //GODOT_LOADER_ENV_H
