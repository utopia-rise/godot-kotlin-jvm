#include "env.h"

#include "jvm.h"

namespace jni {

    Env::Env(JNIEnv* env) {
        this->env = env;
    }

    void Env::push_local_frame(int capacity) {
        auto result = env->PushLocalFrame(capacity);
        JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to push local frame!");
    }

    void Env::pop_local_frame() {
        env->PopLocalFrame(nullptr);
    }

    bool Env::is_valid() {
        return env != nullptr;
    }

    //Support fully qualified class names with "a/b/c" and "a.b.c" format
    JClass Env::find_class(const char* name) {
        const char* corrected_name = String(name).replace(".", "/").utf8();
        jclass cls = env->FindClass(corrected_name);
        JVM_CRASH_COND_MSG(cls == nullptr, vformat("Class not found: %s", name));
        return JClass(cls);
    }

    JObject Env::new_string(const char* str) {
        auto jstr = env->NewStringUTF(str);
        check_exceptions();
        return JObject(jstr);
    }

    bool Env::exception_check() {
        return env->ExceptionCheck();
    }

    void Env::exception_describe() {
        env->ExceptionDescribe();
    }

    void Env::exception_clear() {
        env->ExceptionClear();
    }

    void Env::check_exceptions() {
        if (exception_check()) {
            exception_describe();
            exception_clear();
            HANDLE_JVM_EXCEPTIONS(true, "An exception has occurred!");
        }
    }

    void* Env::get_direct_buffer_address(const jni::JObject& buffer) {
        void* res = env->GetDirectBufferAddress(buffer.obj);
        check_exceptions();
        return res;
    }

    int Env::get_direct_buffer_capacity(const JObject& buffer) {
        auto capacity = env->GetDirectBufferCapacity(buffer.obj);
        check_exceptions();
        return capacity;
    }

    bool Env::is_same_object(const JObject& obj_1, const JObject& obj_2) {
        return env->IsSameObject(obj_1.obj, obj_2.obj);
    }

    String Env::from_jstring(jni::JString str) {
        auto jstr = (jstring) str.obj;
        auto utfString = env->GetStringUTFChars(jstr, nullptr);
        auto ret = String(utfString);
        check_exceptions();
        env->ReleaseStringUTFChars(jstr, utfString);
        return ret;
    }
}// namespace jni