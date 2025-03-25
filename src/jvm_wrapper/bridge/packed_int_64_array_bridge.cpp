#include "packed_int_64_array_bridge.h"

#include "bridges_utils.h"
#include "jvm_wrapper/memory/transfer_context.h"

using namespace bridges;

uintptr_t PackedInt64ArrayBridge::engine_convert_to_godot(JNIEnv* p_raw_env, jobject p_instance, jlongArray p_array) {
    jni::Env env {p_raw_env};
    jni::JLongArray arr {p_array};

    jint size {arr.length(env)};

    Vector<int64_t> vec;
    vec.resize(size);
    arr.get_array_elements(env, reinterpret_cast<jlong*>(vec.ptrw()), size);

    return reinterpret_cast<uintptr_t>(VariantAllocator::alloc(PackedInt64Array(vec)));
}

jlongArray PackedInt64ArrayBridge::engine_convert_to_jvm(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    PackedInt64Array* packed {from_uint_to_ptr<PackedInt64Array>(p_raw_ptr)};
    auto size {static_cast<int>(packed->size())};

    jni::Env env {p_raw_env};
    jni::JLongArray arr {env, size};
    arr.set_array_elements(env, reinterpret_cast<const jlong*>(packed->ptr()), size);
    return reinterpret_cast<jlongArray>(arr.get_wrapped());
}

PackedInt64ArrayBridge::~PackedInt64ArrayBridge() = default;