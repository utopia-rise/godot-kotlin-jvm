#ifndef GODOT_JVM_UTILITIES_H
#define GODOT_JVM_UTILITIES_H

#include <classes/object.hpp>
#include <variant/string_name.hpp>


//https://github.com/godotengine/godot/blob/1f787b63a54b74a5238653883fe1a531200b675e/core/string/string_name.h#L233C1-L233C121
#define SNAME(m_arg) ([]() -> const godot::StringName & { static godot::StringName sname = godot::StringName(m_arg, true); return sname; })()

_ALWAYS_INLINE_ bool is_ref_counted(godot::Object* obj) {
    //https://github.com/godotengine/godot/blob/1f787b63a54b74a5238653883fe1a531200b675e/core/object/object_id.h#L44
    return (obj->get_instance_id() & (uint64_t(1) << 63)) != 0;
}

static uint64_t hash64(const godot::String& str) {
    /* simple djb2 hashing */

    const char32_t *chr = str.ptr();
    uint64_t hashv = 5381;
    uint64_t c = *chr++;

    while (c) {
        hashv = ((hashv << 5) + hashv) + c; /* hash * 33 + c */
        c = *chr++;
    }

    return hashv;
}

#endif // GODOT_JVM_UTILITIES_H
