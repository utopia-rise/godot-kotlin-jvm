#include "env.h"

#include "types.h"

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
#ifdef DEBUG_ENABLED
        if (jthrowable e = env->ExceptionOccurred()) {
            env->ExceptionClear(); // needs to be cleared now as otherwise it throws warnings at us in the following two jni calls that we do jni calls with a pending exception
            jclass string_writer_class {env->FindClass("java/io/StringWriter")};
            jmethodID string_writer_constructor {env->GetMethodID(string_writer_class, "<init>", "()V")};
            jobject string_writer {env->NewObject(string_writer_class, string_writer_constructor)};

            jclass print_writer_class {env->FindClass("java/io/PrintWriter")};
            jmethodID print_writer_constructor {env->GetMethodID(print_writer_class, "<init>", "(Ljava/io/Writer;)V")};
            jobject print_writer {env->NewObject(print_writer_class, print_writer_constructor, string_writer)};

            jclass throwable_class {env->FindClass("java/lang/Throwable")};
            jmethodID print_stack_trace_method {env->GetMethodID(throwable_class, "printStackTrace", "(Ljava/io/PrintWriter;)V")};
            env->CallVoidMethod(e, print_stack_trace_method, print_writer);

            if (exception_check()) {
                // if we get here, it means we got an exception while calling `printStackTrace`. Hence, we cannot retrieve the stacktrace. No need to report that to the user. We just return an empty string.
                exception_clear();
                return {};
            }

            jmethodID to_string_method {env->GetMethodID(string_writer_class, "toString", "()Ljava/lang/String;")};
            auto j_stack_trace_string {(jstring) env->CallObjectMethod(string_writer, to_string_method)};

            if (exception_check()) {
                // if we get here, it means we got an exception while calling `toString`. Hence, we cannot retrieve the stacktrace. No need to report that to the user. We just return an empty string.
                exception_clear();
                return {};
            }

            const char* c_stack_trace {env->GetStringUTFChars(j_stack_trace_string, nullptr)};
            String stack_trace {c_stack_trace};
            env->ReleaseStringUTFChars(j_stack_trace_string, c_stack_trace);

            return stack_trace;
        }
#else
        env->ExceptionDescribe();
#endif
        return {};
    }

    void Env::exception_clear() {
        // no op if DEBUG_ENABLED. Then the exception is cleared in exception_describe
#ifndef DEBUG_ENABLED
        env->ExceptionClear();
#endif
    }

    void Env::check_exceptions() {
        if (exception_check()) {
            String exception {exception_describe()};
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
