#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include "string_name_bridge.h"
#include "constants.h"

using namespace bridges;

JNI_INIT_STATICS_FOR_CLASS(StringNameBridge)

StringNameBridge::StringNameBridge(jni::JObject p_wrapped, jni::JObject p_class_loader) :
    JavaInstanceWrapper<StringNameBridge>(STRING_NAME_BRIDGE_CLASS_NAME, p_wrapped, p_class_loader){
    jni::JNativeMethod engine_call_constructor_method{
            "engine_call_constructor",
            "(I)J",
            (void *) StringNameBridge::engine_call_constructor
    };

    Vector<jni::JNativeMethod> methods;
    methods.push_back(engine_call_constructor_method);

    jni::Env env{jni::Jvm::current_env()};
    j_class.register_natives(env, methods);
    p_wrapped.delete_local_ref(env);
}

uintptr_t StringNameBridge::engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance, jint param_type) {
    if (param_type == 0) { //No arg
        return reinterpret_cast<uintptr_t>(memnew(StringName));
    } else {
        jni::Env env{p_raw_env};
        Variant args[1] = {};
        GDKotlin::get_instance().transfer_context->read_args(env, args);
        switch (param_type) {
            case 1: //arg StringName
                return reinterpret_cast<uintptr_t>(memnew(StringName(args[0].operator String())));
            case 2: //arg StringName
                return reinterpret_cast<uintptr_t>(memnew(StringName(args[0].operator StringName())));
        }
    }
}
