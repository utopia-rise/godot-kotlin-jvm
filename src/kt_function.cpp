#include <utility>

#include "kt_function.h"
#include "gd_kotlin.h"

KtFunction::KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader)
    : JavaInstanceWrapper("godot.core.KtFunction", p_wrapped, p_class_loader) {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId getFunctionInfoMethod {get_method_id(env, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")};
    methodInfo = new KtFunctionInfo(wrapped.call_object_method(env, getFunctionInfoMethod), GDKotlin::get_instance().get_class_loader());
    name = StringName(methodInfo->name);
}

KtFunction::~KtFunction() {
    delete methodInfo;
}

MethodInfo* KtFunction::get_method_info() {
    return methodInfo;
}

StringName KtFunction::get_name() const {
    return name;
}

KtFunctionInfo::KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
    : JavaInstanceWrapper("godot.core.KtFunctionInfo", p_wrapped, p_class_loader) {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId getNameMethod { get_method_id(env, "getName", "()Ljava/lang/String;") };
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
}
