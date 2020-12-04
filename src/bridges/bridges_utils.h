#ifndef GODOT_JVM_BRIDGES_UTILS_H
#define GODOT_JVM_BRIDGES_UTILS_H

#include <core/array.h>
#include <modules/kotlin_jvm/src/jni/wrapper.h>

namespace bridges {

    template <class T>
    static inline T* as_container(jlong raw_ptr) {
        return reinterpret_cast<T*>(static_cast<uintptr_t>(raw_ptr));
    }
}

#endif //GODOT_JVM_BRIDGES_UTILS_H
