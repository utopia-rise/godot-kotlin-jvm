#include "packed_float_32_array_bridge.h"

#include "bridges_utils.h"

using namespace bridges;

uintptr_t PackedFloat32ArrayBridge::engine_convert_to_godot(JNIEnv* p_raw_env, jobject p_instance, jfloatArray p_array) {
    jni::Env env {p_raw_env};
    jni::JFloatArray arr {p_array};

    jint size {arr.length(env)};

    Vector<float> vec;
    vec.resize(size);
    arr.get_array_elements(env, reinterpret_cast<jfloat*>(vec.ptrw()), size);

    return reinterpret_cast<uintptr_t>(memnew(PackedFloat32Array(vec)));
}

jfloatArray PackedFloat32ArrayBridge::engine_convert_to_jvm(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    PackedFloat32Array* packed {from_uint_to_ptr<PackedFloat32Array>(p_raw_ptr)};
    auto size {static_cast<int>(packed->size())};

    jni::Env env {p_raw_env};
    jni::JFloatArray arr {env, size};
    arr.set_array_elements(env, reinterpret_cast<const jfloat*>(packed->ptr()), size);
    return reinterpret_cast<jfloatArray>(arr.get_wrapped());
}

PackedFloat32ArrayBridge::~PackedFloat32ArrayBridge() = default;