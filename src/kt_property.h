#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include <core/object/object.h>
#include <core/multiplayer/multiplayer.h>
#include "jni/wrapper.h"
#include "kt_object.h"
#include "java_instance_wrapper.h"

struct KtPropertyInfo : public JavaInstanceWrapper<KtPropertyInfo> {
    KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;
    Multiplayer::RPCMode rpc_mode;
    bool visible_in_editor;

    PropertyInfo toPropertyInfo();

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_TYPE, "getType", "()I")
        JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        JNI_METHOD(GET_CLASS_NAME, "getClassName", "()Ljava/lang/String;")
        JNI_METHOD(GET_HINT, "getHint", "()I")
        JNI_METHOD(GET_HINT_STRING, "getHintString", "()Ljava/lang/String;")
        JNI_METHOD(GET_VISIBLE_IN_EDITOR, "getVisibleInEditor", "()Z")
        JNI_METHOD(GET_RPC_MODE, "getRpcModeId", "()I")
)
};

class KtProperty : JavaInstanceWrapper<KtProperty> {
private:
    KtPropertyInfo* propertyInfo;
    bool is_ref;

public:
    KtProperty(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtProperty();

    StringName get_name() const;
    Multiplayer::RPCMode get_rpc_mode() const;

    PropertyInfo get_member_info();

    void callGet(KtObject* instance, Variant& r_ret);
    void setCall(KtObject* instance, const Variant& p_value);

    void get_default_value(Variant& r_value);

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_KT_PROPERTY_INFO, "getKtPropertyInfo", "()Lgodot/core/KtPropertyInfo;")
        JNI_METHOD(IS_REF, "isRef", "()Z")
        JNI_METHOD(CALL_GET, "callGet", "(Lgodot/core/KtObject;)V")
        JNI_METHOD(CALL_SET, "callSet", "(Lgodot/core/KtObject;)V")
        JNI_METHOD(GET_DEFAULT_VALUE, "getDefaultValue", "()V")
)
};


#endif //GODOT_JVM_KT_PROPERTY_H
