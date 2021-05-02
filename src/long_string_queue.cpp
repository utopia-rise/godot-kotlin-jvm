#include "long_string_queue.h"
#include "jni/class_loader.h"

JNI_INIT_STATICS_FOR_SINGLETON(LongStringQueue)

// If changed, remember to change also LongStringQueue::stringMaxSize on JVM side  and the StringTest.kt
int LongStringQueue::max_string_size = 512;

thread_local static List<String> string_queue;

LongStringQueue::LongStringQueue(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaSingletonWrapper<LongStringQueue>("godot.core.LongStringQueue", p_wrapped, p_class_loader) {

    jni::JNativeMethod send_string_to_cpp_method{
            "sendStringToCPP",
            "(Ljava/lang/String;)V",
            (void*) LongStringQueue::send_string_to_cpp
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(send_string_to_cpp_method);
    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
}

void LongStringQueue::set_string_max_size(int max_size) {
    jni::Env env{jni::Jvm::current_env()};
    LongStringQueue::max_string_size = max_size;
    jni::MethodId method = get_method_id(env, jni_methods.SET_STRING_MAX_SIZE);
    jvalue buffer_size[1] = {jni::to_jni_arg(max_size)};
    wrapped.call_void_method(env, method, buffer_size);
}

String LongStringQueue::poll_string() {
    return string_queue.front()->get();
}

void LongStringQueue::queue_string(const String str) {
    string_queue.push_back(str);
}

void LongStringQueue::send_string_to_jvm(String str) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId method = get_method_id(env, jni_methods.QUEUE_STRING);
    jni::JString java_string = env.new_string(str.utf8().get_data());
    jvalue args[1] = {jni::to_jni_arg(java_string)};
    wrapped.call_object_method(env, method, args);
}

void LongStringQueue::send_string_to_cpp(JNIEnv* p_raw_env, jobject p_instance, jstring p_string) {
    jni::Env env{p_raw_env};
    const String nativeString = env.from_jstring(jni::JString{p_string});
    get_instance().queue_string(nativeString);
}

LongStringQueue* LongStringQueue::init(){
    jni::Env env{jni::Jvm::current_env()};
    jni::JObject class_loader = ClassLoader::get_default_loader();
    jni::JClass long_string_queue_cls = env.load_class("godot.core.LongStringQueue", class_loader);

    jni::FieldId long_string_queue_instance_field =
            long_string_queue_cls.get_static_field_id(
                    env, "INSTANCE",
                    "Lgodot/core/LongStringQueue;"
            );

    jni::JObject long_string_queue_instance =
            long_string_queue_cls.get_static_object_field(
                    env,
                    long_string_queue_instance_field
            );

    JVM_CRASH_COND_MSG(
            long_string_queue_instance.is_null(),
            "Failed to retrieve LongStringQueue instance"
    )

    auto* instance{new LongStringQueue(long_string_queue_instance, class_loader)};

    long_string_queue_cls.delete_local_ref(env);
    long_string_queue_instance.delete_local_ref(env);

    return instance;
}