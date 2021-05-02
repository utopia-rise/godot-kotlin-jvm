#ifndef GODOT_JVM_LONG_STRING_QUEUE_H
#define GODOT_JVM_LONG_STRING_QUEUE_H

#include "java_singleton_wrapper.h"

class LongStringQueue : public JavaSingletonWrapper<LongStringQueue> {

private:

    LongStringQueue(jni::JObject p_wrapped,  jni::JObject& p_class_loader);

public:

    static int max_string_size;

    void set_string_max_size(int max_size);

    String poll_string();

    void queue_string(String str);

    void send_string_to_jvm(String str);

    static void send_string_to_cpp(JNIEnv* p_raw_env, jobject p_instance, jstring p_string);

    static LongStringQueue* init();

DECLARE_JNI_METHODS(
        JNI_METHOD(QUEUE_STRING, "queueString", "(Ljava/lang/String;)V")
        JNI_METHOD(SET_STRING_MAX_SIZE, "setStringMaxSize", "(I)V")
)

};

#endif //GODOT_JVM_LONG_STRING_QUEUE_H
