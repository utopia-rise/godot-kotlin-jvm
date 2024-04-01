#include "kt_signal_info.h"

#include "jni/class_loader.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    KtSignalInfo,
    INIT_JNI_METHOD(GET_NAME)
    INIT_JNI_METHOD(GET_ARGUMENTS)
)

// clang-format on

KtSignalInfo::KtSignalInfo(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};

    jni::MethodId get_name_method_id {jni_methods.GET_NAME.method_id};
    jni::JString string = wrapped.call_object_method(env, get_name_method_id);
    name = env.from_jstring(string);

    jni::MethodId get_arguments_method_id {jni_methods.GET_ARGUMENTS.method_id};
    jni::JObjectArray args_array {wrapped.call_object_method(env, get_arguments_method_id)};

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
