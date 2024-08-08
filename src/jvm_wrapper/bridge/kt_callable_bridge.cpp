#include "kt_callable_bridge.h"
#include "kotlin_callable_custom.h"

using namespace bridges;

uintptr_t KtCallableBridge::wrap_in_custom_callable(JNIEnv* p_raw_env, jobject p_instance,
                                                    jobject p_kt_custom_callable_instance, jint p_variant_type_ordinal,
                                                    jint p_hash_code) {
    jni::Env env {p_raw_env};
    return reinterpret_cast<uintptr_t>(
        memnew(KotlinCallableCustom(env, p_kt_custom_callable_instance, static_cast<Variant::Type>(p_variant_type_ordinal), p_hash_code))
    );
}
