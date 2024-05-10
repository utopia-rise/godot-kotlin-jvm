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
        jclass cls = env->FindClass(String(name).replace(".", "/").utf8());
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

    String Env::exception_describe() {
#ifdef TOOLS_ENABLED
        jthrowable e = env->ExceptionOccurred();

        if (e != nullptr) {
            try {
                jclass stringWriterClass = env->FindClass("java/io/StringWriter");
                jmethodID stringWriterConstructor = env->GetMethodID(stringWriterClass, "<init>", "()V");
                jobject stringWriter = env->NewObject(stringWriterClass, stringWriterConstructor);

                jclass printWriterClass = env->FindClass("java/io/PrintWriter");
                jmethodID printWriterConstructor = env->GetMethodID(printWriterClass, "<init>", "(Ljava/io/Writer;)V");
                jobject printWriter = env->NewObject(printWriterClass, printWriterConstructor, stringWriter);

                jclass throwableClass = env->FindClass("java/lang/Throwable");
                jmethodID printStackTraceMethod = env->GetMethodID(throwableClass, "printStackTrace", "(Ljava/io/PrintWriter;)V");
                env->CallVoidMethod(e, printStackTraceMethod, printWriter);

                jmethodID toStringMethod = env->GetMethodID(stringWriterClass, "toString", "()Ljava/lang/String;");
                auto jStackTraceString = (jstring) env->CallObjectMethod(stringWriter, toStringMethod);

                // Convert Java String to C++ string
                const char* cStackTrace = env->GetStringUTFChars(jStackTraceString, nullptr);
                String stackTrace {cStackTrace};
                // Release memory
                env->ReleaseStringUTFChars(jStackTraceString, cStackTrace);

                return stackTrace;
            } catch (...) {
                return {};
            }
        }
#else
        env->ExceptionDescribe();
#endif
        return {};
    }

    void Env::exception_clear() {
        env->ExceptionClear();
    }

    void Env::check_exceptions() {
        if (exception_check()) {
            String exception = exception_describe();
            exception_clear();

            if (exception.is_empty()) {
                exception = "An exception has occurred!";
            }
            HANDLE_JVM_EXCEPTIONS(true, exception);
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

    JavaVM* Env::get_jvm() {
        JavaVM* jvm;
        env->GetJavaVM(&jvm);
        return jvm;
    }
}// namespace jni