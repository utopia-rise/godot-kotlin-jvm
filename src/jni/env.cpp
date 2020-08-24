#include "env.h"

namespace jni {
    Env::Env(JNIEnv* env) {
        this->env = env;
    }

    void Env::pushLocalFrame(int capacity) {
        auto result = env->PushLocalFrame(capacity);
        if (result != JNI_OK) {
            throw JniError("Failed to push local frame!");
        }
    }

    void Env::popLocalFrame() {
        env->PopLocalFrame(nullptr);
    }

    bool Env::isValid() {
        return env != nullptr;
    }

    JClass Env::findClass(const char *name) {
        auto cls = env->FindClass(name);
        if (cls == nullptr) {
            throw ClassNotFoundError(name);
        }
        return JClass(cls);
    }

    JClass Env::load_class(const char* p_name, JObject p_class_loader) {
        static jmethodID loadClassMethodId;

        if (loadClassMethodId == nullptr) {
            auto cls = findClass("java/lang/ClassLoader");
            loadClassMethodId = cls.getMethodId(*this, "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;");
        }
        auto str = newString(p_name);
        auto ret = p_class_loader.callObjectMethod(*this, loadClassMethodId, {str});
        return JClass((jclass) ret.obj);
    }

    JObject Env::newString(const char *str) {
        auto jstr = env->NewStringUTF(str);
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

    void* Env::getDirectBufferAddress(const jni::JObject& buffer) {
        auto res = env->GetDirectBufferAddress(buffer.obj);
        checkExceptions();
        return res;
    }

    int Env::getDirectBufferCapacity(const JObject& buffer) {
        auto capacity = env->GetDirectBufferCapacity(buffer.obj);
        checkExceptions();
        return capacity;
    }

    std::string Env::fromJString(jni::JString str) {
        auto jstr = (jstring) str.obj;
        auto utfString = env->GetStringUTFChars(jstr, NULL);
        auto ret = std::string(utfString);
        checkExceptions();
        env->ReleaseStringUTFChars(jstr, utfString);
        return ret;
    }
}