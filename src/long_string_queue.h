#ifndef GODOT_JVM_LONG_STRING_QUEUE_H
#define GODOT_JVM_LONG_STRING_QUEUE_H

#include "java_instance_wrapper.h"

class LongStringQueue : public JavaInstanceWrapper<LongStringQueue> {

private:

    static LongStringQueue* instance;

    LongStringQueue(jni::JObject p_wrapped, jni::JObject p_class_loader);
    ~LongStringQueue() = default;
    LongStringQueue(const LongStringQueue&) = delete;
    void operator=(const LongStringQueue&) = delete;

public:

    static int max_string_size;

    static void init(jni::Env& p_env, jni::JObject p_class_loader);

    static LongStringQueue* get_instance();

    void set_string_max_size(int max_size);

    String poll_string();

    void queue_string(const String str);

    void send_string_to_jvm(String str);

    static void send_string_to_cpp(JNIEnv* p_raw_env, jobject p_instance, jstring p_string);

private:

DECLARE_JNI_METHODS(
        JNI_METHOD(QUEUE_STRING, "queueString", "(Ljava/lang/String;)V")
        JNI_METHOD(SET_STRING_MAX_SIZE, "setStringMaxSize", "(Ljava/lang/String;)V")
)

};

#endif //GODOT_JVM_LONG_STRING_QUEUE_H
