#ifndef GODOT_JVM_GD_PRINT_GLUE_H
#define GODOT_JVM_GD_PRINT_GLUE_H

#include "java_instance_wrapper.h"

class GDPrintGlue : public JavaInstanceWrapper<GDPrintGlue> {
public:
    GDPrintGlue(jni::JObject p_wrapped, jni::JObject p_class_loader);

    GDPrintGlue(const GDPrintGlue &) = delete;

    void operator=(const GDPrintGlue &) = delete;

private:
    static void print(JNIEnv *p_env, jobject p_this, jstring p_message);

    static void print_err(JNIEnv *p_env, jobject p_this, jstring p_message);

    static void print_raw(JNIEnv *p_env, jobject p_this, jstring p_message);

DECLARE_JNI_METHODS()
};


#endif //GODOT_JVM_GD_PRINT_GLUE_H
