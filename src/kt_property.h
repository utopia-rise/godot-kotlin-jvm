#ifndef GODOT_JVM_KT_PROPERTY_H
#define GODOT_JVM_KT_PROPERTY_H

#include <core/object.h>
#include "jni/wrapper.h"
#include "java_instance_wrapper.h"
#include "kt_object.h"

struct KtPropertyInfo : public JavaInstanceWrapper {
    KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtPropertyInfo() = default;

    Variant::Type type;
    String name;
    StringName class_name;
    PropertyHint hint;
    String hint_string;

    PropertyInfo toPropertyInfo();

private:
    struct JNIMethods{
        jni::JavaMethodSignature GET_TYPE{"getType", "()I"};
        jni::JavaMethodSignature GET_NAME{"getName", "()Ljava/lang/String;"};
        jni::JavaMethodSignature GET_CLASS_NAME{"getClassName", "()Ljava/lang/String;"};
        jni::JavaMethodSignature GET_HINT{"getHint", "()I"};
        jni::JavaMethodSignature GET_HINT_STRING{"getHintString", "()Ljava/lang/String;"};
    };
    static JNIMethods jni_methods;
};

class KtProperty : JavaInstanceWrapper {
private:
    struct JNIMethods{
        jni::JavaMethodSignature GET_KT_PROPERTY_INFO{"getKtPropertyInfo", "()Lgodot/core/KtPropertyInfo;"};
        jni::JavaMethodSignature IS_REF{"isRef", "()Z"};
        jni::JavaMethodSignature CALL_GET{"callGet", "(Lgodot/core/KtObject;)Z"};
        jni::JavaMethodSignature CALL_SET{"callSet", "(Lgodot/core/KtObject;)V"};
        jni::JavaMethodSignature GET_DEFAULT_VALUE{"getDefaultValue", "()Z"};
    };
    static JNIMethods jni_methods;

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

    PropertyInfo get_member_info();

    void callGet(KtObject* instance, Variant& r_ret);
    void setCall(KtObject* instance, const Variant& p_value);

    void get_default_value(Variant& r_value);
};


#endif //GODOT_JVM_KT_PROPERTY_H
