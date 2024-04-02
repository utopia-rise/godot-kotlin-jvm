#include "long_string_queue.h"

#include "jni/class_loader.h"

// If changed, remember to change also LongStringQueue::stringMaxSize on JVM side  and the StringTest.kt
int LongStringQueue::max_string_size = 512;

thread_local static List<String> string_queue;// NOLINT(cert-err58-cpp)


void LongStringQueue::set_string_max_size(jni::Env& p_env, int max_size) {
    LongStringQueue::max_string_size = max_size;
    jvalue buffer_size[1] = {jni::to_jni_arg(max_size)};
    wrapped.call_void_method(p_env, SET_STRING_MAX_SIZE, buffer_size);
}

String LongStringQueue::poll_string() {
    String ret = string_queue.front()->get();
    string_queue.pop_front();
    return ret;
}

void LongStringQueue::queue_string(const String& str) {
    string_queue.push_back(str);
}

void LongStringQueue::send_string_to_jvm(jni::Env& p_env, const String& str) {
    jni::JString java_string = p_env.new_string(str.utf8().get_data());
    jvalue args[1] = {jni::to_jni_arg(java_string)};
    wrapped.call_void_method(p_env, QUEUE_STRING, args);
}

void LongStringQueue::send_string_to_cpp(JNIEnv* p_raw_env, jobject p_instance, jstring p_string) {
    jni::Env env {p_raw_env};
    const String nativeString = env.from_jstring(jni::JString {p_string});
    queue_string(nativeString);
}

LongStringQueue::~LongStringQueue() = default;