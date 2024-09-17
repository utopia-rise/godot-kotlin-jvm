#ifndef GODOT_JVM_JVM_STACK_TRACE_H
#define GODOT_JVM_JVM_STACK_TRACE_H

#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {

    JVM_SINGLETON_WRAPPER(JvmStackTrace, "godot.core.JvmStackTrace") {
        SINGLETON_CLASS(JvmStackTrace)

        // clang-format off
        JNI_OBJECT_METHOD(GET_EXCEPTION_STACKTRACE)
        JNI_OBJECT_METHOD(GET_STACKTRACE)

        INIT_JNI_BINDINGS(
            INIT_JNI_METHOD(GET_EXCEPTION_STACKTRACE, "getExceptionStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/String;")
            INIT_JNI_METHOD(GET_STACKTRACE, "getCurrentStacktrace", "()Ljava/lang/String;")
          )
        // clang-format on

    public:
        static void print_exception_stacktrace(jni::Env p_env, jni::JThrowable p_throwable);

        // TODO: Use this method to get the JVM stacktrace when Godot will add the features to script https://github.com/godotengine/godot/pull/91006
        String get_jvm_stacktrace(jni::Env& p_env);
    };

}// namespace bridge

#endif// GODOT_JVM_JVM_STACK_TRACE_H
