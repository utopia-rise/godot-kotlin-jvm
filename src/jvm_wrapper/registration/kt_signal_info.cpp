#include "kt_signal_info.h"

#include "jni/class_loader.h"

KtSignalInfo::KtSignalInfo(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};

    jni::JString string = wrapped.call_object_method(env, GET_NAME);
    name = env.from_jstring(string);

    jni::JObjectArray args_array {wrapped.call_object_method(env, GET_ARGUMENTS)};

    for (int i = 0; i < args_array.length(env); i++) {
        arguments.push_back(new KtPropertyInfo(args_array.get(env, i)));
    }

    string.delete_local_ref(env);
    args_array.delete_local_ref(env);
}

KtSignalInfo::~KtSignalInfo() {
    for (auto i = 0; i < arguments.size(); i++) {
        delete arguments[i];
    }
}

MethodInfo KtSignalInfo::get_member_info() const {
    MethodInfo method_info;
    method_info.name = name;
    for (int i = 0; i < arguments.size(); i++) {
        method_info.arguments.push_back(arguments[i]->toPropertyInfo());
    }
    return method_info;
}
