#include "kt_signal_info.h"
#include "jni/class_loader.h"

JNI_INIT_STATICS_FOR_CLASS(KtSignalInfo)

KtSignalInfo::KtSignalInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader) :
    JavaInstanceWrapper("godot.core.KtSignalInfo", p_wrapped, p_class_loader) {
    jni::Env env{jni::Jvm::current_env()};

    jni::MethodId get_name_method_id{get_method_id(env, jni_methods.GET_NAME)};
    name = env.from_jstring(wrapped.call_object_method(env, get_name_method_id));

    jni::MethodId get_arguments_method_id{get_method_id(env, jni_methods.GET_ARGUMENTS)};
    jni::JObjectArray args_array{wrapped.call_object_method(env, get_arguments_method_id)};
    for (int i = 0; i < args_array.length(env); i++) {
        arguments.push_back(new KtPropertyInfo(args_array.get(env, i), ClassLoader::get_default_loader()));
    }
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
