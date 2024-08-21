#include "packed_float_64_array_bridge.h"

#include "bridges_utils.h"

using namespace bridges;

uintptr_t PackedFloat64ArrayBridge::engine_convert_to_godot(JNIEnv* p_raw_env, jobject p_instance, jdoubleArray p_array) {
    jni::Env env {p_raw_env};
    jni::JDoubleArray arr {p_array};

    jint size {arr.length(env)};

    Vector<double> vec;
    vec.resize(size);
    arr.get_array_elements(env, reinterpret_cast<jdouble*>(vec.ptrw()), size);

    return reinterpret_cast<uintptr_t>(memnew(PackedFloat64Array(vec)));
}

jdoubleArray PackedFloat64ArrayBridge::engine_convert_to_jvm(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    PackedFloat64Array* packed {from_uint_to_ptr<PackedFloat64Array>(p_raw_ptr)};
    auto size {static_cast<int>(packed->size())};

    jni::Env env {p_raw_env};
    jni::JDoubleArray arr {env, size};
    arr.set_array_elements(env, reinterpret_cast<const jdouble*>(packed->ptr()), size);
    return reinterpret_cast<jdoubleArray>(arr.get_wrapped());
}

PackedFloat64ArrayBridge::~PackedFloat64ArrayBridge() = default;