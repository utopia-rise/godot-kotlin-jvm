#ifndef GODOT_JVM_JNI_LIFECYCLE_MANAGER_H
#define GODOT_JVM_JNI_LIFECYCLE_MANAGER_H

class JniLifecycleManager {
public:
    static void initialize_jni_classes();
    static void destroy_jni_classes();
};

#endif// GODOT_JVM_JNI_LIFECYCLE_MANAGER_H
