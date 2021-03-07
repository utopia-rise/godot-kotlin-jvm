#ifndef GODOT_JVM_GP_PRINT_BRIDGE_H
#define GODOT_JVM_GP_PRINT_BRIDGE_H

#include <modules/kotlin_jvm/src/java_instance_wrapper.h>


namespace bridges {

    class GDPrintBridge : public JavaInstanceWrapper<GDPrintBridge> {
    public:
        GDPrintBridge(jni::JObject p_wrapped, jni::JObject p_class_loader);
        ~GDPrintBridge() = default;

        static void print(JNIEnv* p_raw_env, jobject p_instance);
        static void print_err(JNIEnv* p_raw_env, jobject p_instance);
        static void print_raw(JNIEnv* p_raw_env, jobject p_instance);


    DECLARE_JNI_METHODS()
    };

}


#endif //GODOT_JVM_GP_PRINT_BRIDGE_H
