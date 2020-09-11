#ifndef GODOT_JVM_WRAPPER_H
#define GODOT_JVM_WRAPPER_H

#include "env.h"
#include "types.h"
#include "exceptions.h"
#include "init_args.h"
#include "jvm.h"
#include "jvm_loader.h"
#include "types.h"
#include "local_frame.h"

namespace jni {

    template<class T>
    inline T JObject::new_global_ref(Env& env) {
        auto ref = env.env->NewGlobalRef(obj);
        env.check_exceptions();
        return T{JObject(ref).obj};
    }

}

#endif //GODOT_JVM_WRAPPER_H
