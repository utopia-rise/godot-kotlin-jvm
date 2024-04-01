#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include "core/object/ref_counted.h"
#include "core/string/string_name.h"
#include "core/variant/variant.h"
#include "jni/wrapper.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"

class KtObject : public JvmInstanceWrapper {
private:
    bool is_ref;

public:
    explicit KtObject(jni::JObject p_wrapped, bool p_is_ref);
    ~KtObject();

    const jni::JObject& get_wrapped() const;

    // clang-format off
    DECLARE_JNI_METHODS(
        JNI_METHOD(ON_DESTROY, "_onDestroy", "()V")
    )
    // clang-format on
};

#endif// GODOT_JVM_KT_OBJECT_H
