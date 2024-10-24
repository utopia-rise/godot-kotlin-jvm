#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include "core/object/object.h"
#include "jni/wrapper.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "kt_object.h"

JVM_INSTANCE_WRAPPER(KtPropertyInfo, "godot.core.KtPropertyInfo") {
    JVM_CLASS(KtPropertyInfo)

    // clang-format off
    JNI_INT_METHOD(GET_TYPE)
    JNI_OBJECT_METHOD(GET_NAME)
    JNI_OBJECT_METHOD(GET_CLASS_NAME)
    JNI_INT_METHOD(GET_HINT)
    JNI_OBJECT_METHOD(GET_HINT_STRING)
    JNI_LONG_METHOD(GET_USAGE)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_TYPE, "getType", "()I")
        INIT_JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_CLASS_NAME, "getClassName", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_HINT, "getHint", "()I")
        INIT_JNI_METHOD(GET_HINT_STRING, "getHintString", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_USAGE, "getUsage", "()J")
    )
    // clang-format on

public:
    explicit KtPropertyInfo(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;
    PropertyUsageFlags usage;

    PropertyInfo toPropertyInfo() const;


};

JVM_INSTANCE_WRAPPER(KtProperty, "godot.core.KtProperty") {
    JVM_CLASS(KtProperty)

    // clang-format off
    JNI_OBJECT_METHOD(GET_KT_PROPERTY_INFO)
    JNI_VOID_METHOD(CALL_GET)
    JNI_VOID_METHOD(CALL_SET)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_KT_PROPERTY_INFO, "getKtPropertyInfo", "()Lgodot/core/KtPropertyInfo;")
        INIT_JNI_METHOD(CALL_GET, "callGet", "(Lgodot/core/KtObject;)V")
        INIT_JNI_METHOD(CALL_SET, "callSet", "(Lgodot/core/KtObject;)V")
    )
    // clang-format on

    KtPropertyInfo* propertyInfo;

public:
    explicit KtProperty(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtProperty();

    StringName get_name() const;

    PropertyInfo get_member_info();

    void call_get(jni::Env& p_env, KtObject* instance, Variant& r_ret);
    void call_set(jni::Env& p_env, KtObject* instance, const Variant& p_value);
};

#endif// GODOT_JVM_KT_PROPERTY_H
