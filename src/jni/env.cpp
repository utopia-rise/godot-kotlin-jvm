#include "env.h"

namespace jni {
    Env::Env(JNIEnv* env) {
        this->env = env;
    }

    void Env::push_local_frame(int p_capacity) {
        auto result = env->PushLocalFrame(p_capacity);
        if (result != JNI_OK) {
            throw JniError("Failed to push local frame!");
        }
    }

    void Env::pop_local_frame() {
        env->PopLocalFrame(nullptr);
    }

    bool Env::is_valid() {
        return env != nullptr;
    }

    JClass Env::find_class(const char *p_name) {
        auto cls = env->FindClass(p_name);
        if (cls == nullptr) {
            throw ClassNotFoundError(p_name);
        }
        return JClass(cls);
    }

    JClass Env::load_class(const char* p_name, JObject p_class_loader) {
        static jmethodID loadClassMethodId;

        if (loadClassMethodId == nullptr) {
            auto cls = find_class("java/lang/ClassLoader");
            loadClassMethodId = cls.getMethodId(*this, "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;");
        }
        auto str = new_string(p_name);
        auto ret = p_class_loader.callObjectMethod(*this, loadClassMethodId, {str});
        return JClass((jclass) ret.obj);
    }

    JObject Env::new_string(const char *p_str) {
        auto jstr = env->NewStringUTF(p_str);
        checkExceptions();
        return JObject(jstr);
    }

    bool Env::exceptionCheck() {
        return env->ExceptionCheck();
    }

    void Env::exceptionDescribe() {
        env->ExceptionDescribe();
    }

    void Env::exceptionClear() {
        env->ExceptionClear();
    }

    void Env::checkExceptions() {
        if (exceptionCheck()) {
            exceptionDescribe();
            exceptionClear();
            throw JniError("An exception has occurred!");
        }
    }

    void* Env::get_direct_buffer_address(const jni::JObject& p_buffer) {
        auto res = env->GetDirectBufferAddress(p_buffer.obj);
        checkExceptions();
        return res;
    }

    int Env::get_direct_buffer_capacity(const JObject& p_buffer) {
        auto capacity = env->GetDirectBufferCapacity(p_buffer.obj);
        checkExceptions();
        return capacity;
    }

    std::string Env::from_jstring(jni::JString p_str) {
        auto jstr = (jstring) p_str.obj;
        auto utfString = env->GetStringUTFChars(jstr, NULL);
        auto ret = std::string(utfString);
        checkExceptions();
        env->ReleaseStringUTFChars(jstr, utfString);
        return ret;
    }
}