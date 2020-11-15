#ifndef GODOT_JVM_KT_VARIANT_H
#define GODOT_JVM_KT_VARIANT_H


#include "wire/wire.pb.h"
#include "core/variant.h"
#include "jni/wrapper.h"
#include "SharedBuffer.h"

namespace ktvariant {

    static void get_variant_from_buffer(SharedBuffer& byte_buffer, Variant& res);
    static void send_variant_to_buffer(const Variant& variant, SharedBuffer& byte_buffer);

    static void initMethodArray();
    static void register_engine_types(jni::Env& p_env, jni::JObjectArray p_engine_types_names);
    static void clear_engine_types();
};


#endif //GODOT_JVM_KT_VARIANT_H
