#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include <core/object.h>
#include "jni/wrapper.h"
#include "kt_object.h"
#include "java_instance_wrapper.h"
#include <core/io/multiplayer_api.h>

struct KtPropertyInfo : public JavaInstanceWrapper<KtPropertyInfo> {
    KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;
    MultiplayerAPI::RPCMode rpc_mode;

    PropertyInfo toPropertyInfo();

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_TYPE, "getType", "()I")
        JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        JNI_METHOD(GET_CLASS_NAME, "getClassName", "()Ljava/lang/String;")
        JNI_METHOD(GET_HINT, "getHint", "()I")
        JNI_METHOD(GET_HINT_STRING, "getHintString", "()Ljava/lang/String;")
        JNI_METHOD(GET_RPC_MODE, "getRpcModeId", "()I")
)
};

class KtProperty : JavaInstanceWrapper<KtProperty> {
private:
    KtPropertyInfo* propertyInfo;
    Variant default_value;
    bool is_default_value_initialized;
    bool is_ref;

    void initialize_default_value();

public:
    KtProperty(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtProperty();

    StringName get_name() const;
    MultiplayerAPI::RPCMode get_rpc_mode() const;

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
