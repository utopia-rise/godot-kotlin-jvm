#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include "core/object/object.h"
#include "jni/wrapper.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "kt_object.h"

JVM_INSTANCE_WRAPPER(KtPropertyInfo, "godot.core.KtPropertyInfo") {

    // clang-format off
    JNI_METHOD(GET_TYPE)
    JNI_METHOD(GET_NAME)
    JNI_METHOD(GET_CLASS_NAME)
    JNI_METHOD(GET_HINT)
    JNI_METHOD(GET_HINT_STRING)
    JNI_METHOD(GET_VISIBLE_IN_EDITOR)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_TYPE, "getType", "()I")
        INIT_JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_CLASS_NAME, "getClassName", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_HINT, "getHint", "()I")
        INIT_JNI_METHOD(GET_HINT_STRING, "getHintString", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_VISIBLE_IN_EDITOR, "getVisibleInEditor", "()Z")
    )
    // clang-format on

public:
    explicit KtPropertyInfo(jni::JObject p_wrapped);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;
    bool visible_in_editor;

    PropertyInfo toPropertyInfo();


};

JVM_INSTANCE_WRAPPER(KtProperty, "godot.core.KtProperty") {

    // clang-format off
    JNI_METHOD(GET_KT_PROPERTY_INFO)
    JNI_METHOD(IS_REF)
    JNI_METHOD(CALL_GET)
    JNI_METHOD(CALL_SET)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_KT_PROPERTY_INFO, "getKtPropertyInfo", "()Lgodot/core/KtPropertyInfo;")
        INIT_JNI_METHOD(IS_REF, "isRef", "()Z")
        INIT_JNI_METHOD(CALL_GET, "callGet", "(Lgodot/core/KtObject;)V")
        INIT_JNI_METHOD(CALL_SET, "callSet", "(Lgodot/core/KtObject;)V")
    )
    // clang-format on

    KtPropertyInfo* propertyInfo;
    bool is_ref;

public:
    explicit KtProperty(jni::JObject p_wrapped);
    ~KtProperty();

    StringName get_name() const;

    PropertyInfo get_member_info();

    void call_get(KtObject* instance, Variant& r_ret);
    void call_set(KtObject* instance, const Variant& p_value);

#ifdef TOOLS_ENABLED
    void safe_call_get(KtObject* instance, Variant& r_ret);
#endif
};

#endif// GODOT_JVM_KT_PROPERTY_H
