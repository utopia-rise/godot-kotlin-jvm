#ifndef GODOT_JVM_KT_OBJECT_H
#define GODOT_JVM_KT_OBJECT_H

#include "core/object/ref_counted.h"
#include "core/string/string_name.h"
#include "core/variant/variant.h"
#include "jni/wrapper.h"
#include "jvm_wrapper/jvm_instance_wrapper.h"

JVM_INSTANCE_WRAPPER(KtObject, "godot.core.KtObject") {
    JVM_CLASS(KtObject)

    // clang-format off
    JNI_VOID_METHOD(ON_DESTROY)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(ON_DESTROY, "_onDestroy", "()V")
    )
    // clang-format on

private:
    bool is_ref;

public:
    explicit KtObject(jni::Env& p_env, jni::JObject p_wrapped, bool p_is_ref);
    ~KtObject();
};

#endif// GODOT_JVM_KT_OBJECT_H
