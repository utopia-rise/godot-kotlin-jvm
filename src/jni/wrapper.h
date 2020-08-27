#ifndef GODOT_JVM_WRAPPER_H
#define GODOT_JVM_WRAPPER_H

#include "env.h"
#include "types.h"

namespace jni {

    template<class T>
    inline T JObject::new_global_ref(Env& env) {
        auto ref = env.env->NewGlobalRef(obj);
        env.check_exceptions();
        return T{JObject(ref).obj};
    }

}

#endif //GODOT_JVM_WRAPPER_H
