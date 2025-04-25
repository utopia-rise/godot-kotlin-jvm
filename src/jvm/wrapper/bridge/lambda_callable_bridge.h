#ifndef GODOT_JVM_LAMBDA_CALLABLE_BRIDGE_H
#define GODOT_JVM_LAMBDA_CALLABLE_BRIDGE_H

#include "jvm/wrapper/jvm_singleton_wrapper.h"

namespace bridges {
    JVM_SINGLETON_WRAPPER(LambdaCallableBridge, "godot.core.LambdaCallable$Bridge") {
        SINGLETON_CLASS(LambdaCallableBridge)

        // clang-format off
        INIT_JNI_BINDINGS(
            INIT_NATIVE_METHOD("wrap_in_custom_callable", "(Lgodot/core/LambdaCallable;IIZ)J", LambdaCallableBridge::wrap_in_custom_callable)
        )
        // clang-format on

    public:
        static uintptr_t wrap_in_custom_callable(
          JNIEnv * p_raw_env,
          jobject p_instance,
          jobject p_kt_custom_callable_instance,
          jint p_variant_type_ordinal,
          jint p_hash_code,
          jboolean p_has_on_destroy
        );
    };
} // namespace bridges

#endif // GODOT_JVM_LAMBDA_CALLABLE_BRIDGE_H
