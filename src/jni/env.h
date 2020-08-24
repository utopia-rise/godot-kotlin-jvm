#ifndef GODOT_LOADER_ENV_H
#define GODOT_LOADER_ENV_H
#include <jni.h>
#include "types.h"
#include "exceptions.h"

namespace jni {
    class Env {
    public:
       explicit Env(JNIEnv*);
        // todo delete copy ctor and assignment?
        Env(const Env&) = delete;
        Env& operator=(const Env&) = delete;

        void push_local_frame(int p_capacity);
        void pop_local_frame();

        JClass find_class(const char* p_name);

        JClass load_class(const char* p_name, JObject p_class_loader);

        JObject new_string(const char* p_str);
        std::string from_jstring(jni::JString p_str);

        bool exceptionCheck();
        void exceptionDescribe();
        void exceptionClear();

        void checkExceptions();

        void* get_direct_buffer_address(const jni::JObject& p_buffer);
        int get_direct_buffer_capacity(const jni::JObject& p_buffer);

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
