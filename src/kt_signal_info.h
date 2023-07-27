#ifndef GODOT_JVM_KT_SIGNAL_INFO_H
#define GODOT_JVM_KT_SIGNAL_INFO_H

#include "java_instance_wrapper.h"
#include "kt_property.h"

#include <core/object/object.h>

struct KtSignalInfo : public JavaInstanceWrapper {
    KtSignalInfo(jni::JObject p_wrapped);
    ~KtSignalInfo();

    String name;
    List<KtPropertyInfo*> arguments;

    MethodInfo get_member_info() const;

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
            JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
    )
    // clang-format on
};

#endif// GODOT_JVM_KT_SIGNAL_INFO_H
