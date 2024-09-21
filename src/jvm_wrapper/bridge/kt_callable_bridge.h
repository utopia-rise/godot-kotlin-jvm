#ifndef GODOT_JVM_KT_CALLABLE_BRIDGE_H
#define GODOT_JVM_KT_CALLABLE_BRIDGE_H


#include "jvm_wrapper/jvm_singleton_wrapper.h"

namespace bridges {
    JVM_SINGLETON_WRAPPER(KtCallableBridge, "godot.core.KtCallable$Bridge") {
        SINGLETON_CLASS(KtCallableBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
            INIT_NATIVE_METHOD("wrap_in_custom_callable", "(Lgodot/core/KtCallable;II)J", KtCallableBridge::wrap_in_custom_callable)
        )
        // clang-format on

    public:
        static uintptr_t wrap_in_custom_callable(JNIEnv* p_raw_env, jobject p_instance, jobject p_kt_custom_callable_instance, jint p_variant_type_ordinal, jint p_hash_code);
    };
}


#endif //GODOT_JVM_KT_CALLABLE_BRIDGE_H
