#include "lambda_callable_bridge.h"

#include "jvm_wrapper/kotlin_callable_custom.h"

using namespace bridges;

uintptr_t LambdaCallableBridge::wrap_in_custom_callable(JNIEnv* p_raw_env, jobject p_instance,
                                                    jobject p_kt_custom_callable_instance, jint p_variant_type_ordinal,
                                                    jint p_hash_code, jboolean p_has_on_destroy) {
    jni::Env env {p_raw_env};
    return reinterpret_cast<uintptr_t>(
        memnew(KotlinCallableCustom(env, p_kt_custom_callable_instance, static_cast<Variant::Type>(p_variant_type_ordinal), p_hash_code, p_has_on_destroy))
    );
}

LambdaCallableBridge::~LambdaCallableBridge() = default;
