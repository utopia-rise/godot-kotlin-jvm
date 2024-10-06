#include "jvm_stack_trace.h"

using namespace bridges;

void JvmStackTrace::print_exception_stacktrace(jni::Env p_env, jni::JThrowable p_throwable) {
    jvalue args[1] = {jni::to_jni_arg(p_throwable)};
    jni::JString str {get_instance().wrapped.call_object_method(p_env, GET_EXCEPTION_STACKTRACE, args)};
    String string {p_env.from_jstring(str)};
    str.delete_local_ref(p_env);
    JVM_ERR_FAIL_MSG(string);
}

String JvmStackTrace::get_jvm_stacktrace(jni::Env& p_env) {
    jni::JString str {wrapped.call_object_method(p_env, GET_STACKTRACE)};
    String ret {p_env.from_jstring(str)};
    str.delete_local_ref(p_env);
    return ret;
}

JvmStackTrace::~JvmStackTrace() = default;