#include "long_string_queue.h"

#include "jni/class_loader.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    LongStringQueue,
    INIT_JNI_METHOD(QUEUE_STRING)
    INIT_JNI_METHOD(SET_STRING_MAX_SIZE)
    INIT_NATIVE_METHOD("sendStringToCPP", "(Ljava/lang/String;)V", LongStringQueue::send_string_to_cpp)
)
// clang-format on

// If changed, remember to change also LongStringQueue::stringMaxSize on JVM side  and the StringTest.kt
int LongStringQueue::max_string_size = 512;

thread_local static List<String> string_queue;// NOLINT(cert-err58-cpp)

LongStringQueue::LongStringQueue(jni::JObject p_wrapped) : JavaSingletonWrapper<LongStringQueue>(p_wrapped) {}

void LongStringQueue::set_string_max_size(int max_size) {
    jni::Env env {jni::Jvm::current_env()};
    LongStringQueue::max_string_size = max_size;
    jni::MethodId method = jni_methods.SET_STRING_MAX_SIZE.method_id;
    jvalue buffer_size[1] = {jni::to_jni_arg(max_size)};
    wrapped.call_void_method(env, method, buffer_size);
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
    jni::MethodId method = jni_methods.QUEUE_STRING.method_id;
    jni::JString java_string = env.new_string(str.utf8().get_data());
    jvalue args[1] = {jni::to_jni_arg(java_string)};
    wrapped.call_void_method(env, method, args);
}

void LongStringQueue::send_string_to_cpp(JNIEnv* p_raw_env, jobject p_instance, jstring p_string) {
    jni::Env env {p_raw_env};
    const String nativeString = env.from_jstring(jni::JString {p_string});
    get_instance().queue_string(nativeString);
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