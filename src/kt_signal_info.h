#ifndef GODOT_JVM_KT_SIGNAL_INFO_H
#define GODOT_JVM_KT_SIGNAL_INFO_H


#include <core/object.h>
#include "kt_property.h"
#include "java_instance_wrapper.h"

struct KtSignalInfo : public JavaInstanceWrapper<KtSignalInfo> {
    KtSignalInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtSignalInfo();

    String name;
    List<KtPropertyInfo*> arguments;

    MethodInfo get_member_info() const;
private:
    struct JNIMethods{
        jni::JavaMethodSignature GET_NAME{"getName", "()Ljava/lang/String;"};
        jni::JavaMethodSignature GET_ARGUMENTS{"getArguments", "()[Lgodot/core/KtPropertyInfo;"};
    };
    static JNIMethods jni_methods;
};


#endif //GODOT_JVM_KT_SIGNAL_INFO_H
