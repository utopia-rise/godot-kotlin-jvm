#include "packed_vector3_array_bridge.h"

using namespace bridges;

PackedVector3ArrayBridge::~PackedVector3ArrayBridge() = default;

uintptr_t PackedVector3ArrayBridge::engine_convert_to_godot(JNIEnv* p_raw_env, jobject p_instance, jfloatArray p_array) {
    jni::Env env {p_raw_env};
    jni::JFloatArray arr {p_array};
    
    jint float_size = arr.length(env);
    uint64_t vector_size = float_size / 2;

    PackedVector3Array* vector_packed = memnew(PackedVector3Array);
    vector_packed->resize(vector_size);
    Vector3* ptr = vector_packed->ptrw();
    arr.get_array_elements(env, reinterpret_cast<jfloat*>(ptr), float_size);

    return reinterpret_cast<uintptr_t>(vector_packed);
}

jfloatArray PackedVector3ArrayBridge::engine_convert_to_jvm(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    jni::Env env {p_raw_env};
    PackedVector3Array* vector_packed {from_uint_to_ptr<PackedVector3Array>(p_raw_ptr)};

    uint64_t vector_size = vector_packed->size();
    jint float_size = vector_size * 2;

    jni::JFloatArray arr {env, float_size};
    const Vector3* ptr = vector_packed->ptr();
    arr.set_array_elements(env, reinterpret_cast<const jfloat*>(ptr), float_size);

    return reinterpret_cast<jfloatArray>(arr.get_wrapped());
}