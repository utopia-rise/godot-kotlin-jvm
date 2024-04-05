#ifndef GODOT_JVM_KT_SIGNAL_INFO_H
#define GODOT_JVM_KT_SIGNAL_INFO_H

#include "core/object/object.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "kt_property.h"

JVM_INSTANCE_WRAPPER(KtSignalInfo, "godot.core.KtSignalInfo") {

    // clang-format off
    JNI_METHOD(GET_NAME)
    JNI_METHOD(GET_ARGUMENTS)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
    )
    // clang-format on

public:
    explicit KtSignalInfo(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtSignalInfo();

    String name;
    List<KtPropertyInfo*> arguments;

    MethodInfo get_member_info() const;


};

#endif// GODOT_JVM_KT_SIGNAL_INFO_H
