#include "long_string_queue.h"

#include "jni/class_loader.h"

// If changed, remember to change also LongStringQueue::stringMaxSize on JVM side  and the StringTest.kt
int LongStringQueue::max_string_size = 512;

thread_local static List<String> string_queue;// NOLINT(cert-err58-cpp)


void LongStringQueue::set_string_max_size(int max_size) {
    jni::Env env {jni::Jvm::current_env()};
    LongStringQueue::max_string_size = max_size;
    jvalue buffer_size[1] = {jni::to_jni_arg(max_size)};
    wrapped.call_void_method(env, SET_STRING_MAX_SIZE, buffer_size);
}

String LongStringQueue::poll_string() {
    String ret = string_queue.front()->get();
    string_queue.pop_front();
    return ret;
}

void LongStringQueue::queue_string(const String& str) {
    string_queue.push_back(str);
}

void LongStringQueue::send_string_to_jvm(const String& str) {
    jni::Env env {jni::Jvm::current_env()};
    jni::JString java_string = env.new_string(str.utf8().get_data());
    jvalue args[1] = {jni::to_jni_arg(java_string)};
    wrapped.call_void_method(env, QUEUE_STRING, args);
}

void LongStringQueue::send_string_to_cpp(JNIEnv* p_raw_env, jobject p_instance, jstring p_string) {
    jni::Env env {p_raw_env};
    const String nativeString = env.from_jstring(jni::JString {p_string});
    queue_string(nativeString);
}

LongStringQueue* LongStringQueue::init() {
    jni::Env env {jni::Jvm::current_env()};
    jni::JObject class_loader = ClassLoader::get_default_loader();

    jni::JClass long_string_queue_cls = env.load_class("godot.core.LongStringQueue", class_loader);
    jni::FieldId long_string_queue_instance_field = long_string_queue_cls.get_static_field_id(env, "INSTANCE", "Lgodot/core/LongStringQueue;");
    jni::JObject long_string_queue_instance = long_string_queue_cls.get_static_object_field(env, long_string_queue_instance_field);
    JVM_CRASH_COND_MSG(long_string_queue_instance.is_null(), "Failed to retrieve LongStringQueue instance");

    auto* instance {new LongStringQueue(long_string_queue_instance)};
    long_string_queue_cls.delete_local_ref(env);

    return instance;
}

LongStringQueue::~LongStringQueue() = default;