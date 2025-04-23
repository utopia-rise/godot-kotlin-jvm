#include "packed_color_array_bridge.h"

using namespace bridges;

PackedColorArrayBridge::~PackedColorArrayBridge() = default;

uintptr_t PackedColorArrayBridge::engine_convert_to_godot(JNIEnv* p_raw_env, jobject p_instance, jfloatArray p_array) {
    jni::Env env {p_raw_env};
    jni::JFloatArray arr {p_array};

    jint float_size = arr.length(env);
    uint64_t color_size = float_size / 4;

    PackedColorArray* color_packed = VariantAllocator::alloc(PackedColorArray());
    color_packed->resize(color_size);
    Color* ptr = color_packed->ptrw();
    arr.get_array_elements(env, reinterpret_cast<jfloat*>(ptr), float_size);

    return reinterpret_cast<uintptr_t>(color_packed);
}

jfloatArray PackedColorArrayBridge::engine_convert_to_jvm(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    PackedColorArray* color_packed {from_uint_to_ptr<PackedColorArray>(p_raw_ptr)};

    uint64_t color_size = color_packed->size();
    jint float_size = color_size * 4;

    jni::JFloatArray arr {env, float_size};
    const Color* ptr = color_packed->ptr();
    arr.set_array_elements(env, reinterpret_cast<const jfloat*>(ptr), float_size);

    return reinterpret_cast<jfloatArray>(arr.get_wrapped());
}
