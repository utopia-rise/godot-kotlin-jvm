#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include "java_instance_wrapper.h"
#include "jni/wrapper.h"
#include "kt_object.h"

#include <core/object/object.h>

struct KtPropertyInfo : public JavaInstanceWrapper {
    KtPropertyInfo(jni::JObject p_wrapped);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;
    bool visible_in_editor;

    PropertyInfo toPropertyInfo();

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(GET_TYPE, "getType", "()I")
            JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
            JNI_METHOD(GET_CLASS_NAME, "getClassName", "()Ljava/lang/String;")
            JNI_METHOD(GET_HINT, "getHint", "()I")
            JNI_METHOD(GET_HINT_STRING, "getHintString", "()Ljava/lang/String;")
            JNI_METHOD(GET_VISIBLE_IN_EDITOR, "getVisibleInEditor", "()Z")
    )
    // clang-format on
};

class KtProperty : JavaInstanceWrapper {
private:
    KtPropertyInfo* propertyInfo;
    bool is_ref;

public:
    KtProperty(jni::JObject p_wrapped);
    ~KtProperty();

    StringName get_name() const;

    PropertyInfo get_member_info();

    void call_get(KtObject* instance, Variant& r_ret);
    void call_set(KtObject* instance, const Variant& p_value);

#ifdef TOOLS_ENABLED
    void safe_call_get(KtObject* instance, Variant& r_ret);
#endif

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(GET_KT_PROPERTY_INFO, "getKtPropertyInfo", "()Lgodot/core/KtPropertyInfo;")
            JNI_METHOD(IS_REF, "isRef", "()Z")
            JNI_METHOD(CALL_GET, "callGet", "(Lgodot/core/KtObject;)V")
            JNI_METHOD(CALL_SET, "callSet", "(Lgodot/core/KtObject;)V")
    )
    // clang-format on
};

#endif// GODOT_JVM_KT_PROPERTY_H
