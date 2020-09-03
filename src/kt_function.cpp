#include <utility>

#include "kt_function.h"
#include "gd_kotlin.h"

KtFunction::KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader)
    : JavaInstanceWrapper("godot.core.KtFunction", p_wrapped, p_class_loader), parameterCount(-1) {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId getFunctionInfoMethod {get_method_id(env, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")};
    methodInfo = new KtFunctionInfo(wrapped.call_object_method(env, getFunctionInfoMethod), GDKotlin::get_instance().get_class_loader());
    name = methodInfo->name;
    jni::MethodId getParameterCountMethod { get_method_id(env, "getParameterCount", "()I") };
    parameterCount = wrapped.call_int_method(env, getParameterCountMethod);
}

KtFunction::~KtFunction() {
    delete methodInfo;
}

MethodInfo KtFunction::get_method_info() {
    return methodInfo->toMethodInfo();
}

StringName KtFunction::get_name() const {
    return name;
}

int KtFunction::getParameterCount() const {
    return parameterCount;
}

KtPropertyInfo::KtPropertyInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtPropertyInfo", p_wrapped, p_class_loader) {
    jni::Env env = jni::Jvm::current_env();
    jni::MethodId getTypeMethod { get_method_id(env, "getType", "()I") };
    type = KtVariant::fromWireType(static_cast<wire::Value::TypeCase>(wrapped.call_int_method(env, getTypeMethod)));
    jni::MethodId getNameMethod { get_method_id(env, "getName", "()Ljava/lang/String;") };
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
    jni::MethodId getClassNameMethod { get_method_id(env, "getClassName", "()Ljava/lang/String;") };
    class_name = env.from_jstring(wrapped.call_object_method(env, getClassNameMethod));
    jni::MethodId getPropertyHintMethod { get_method_id(env, "getHint", "()I") };
    hint = static_cast<PropertyHint>(wrapped.call_int_method(env, getPropertyHintMethod));
    jni::MethodId getHintStringMethod { get_method_id(env, "getHintString", "()Ljava/lang/String;") };
    hint_string = env.from_jstring(wrapped.call_object_method(env, getHintStringMethod));
}

PropertyInfo KtPropertyInfo::toPropertyInfo() {
    PropertyInfo info;
    info.type = type;
    info.name = name;
    info.class_name = class_name;
    info.hint = hint;
    info.hint_string = hint_string;
    return info;
}

KtFunctionInfo::KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtFunctionInfo", p_wrapped, p_class_loader) {
    jni::Env env { jni::Jvm::current_env() };
    jni::MethodId getNameMethod { get_method_id(env, "getName", "()Ljava/lang/String;") };
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
    jni::MethodId getPropertyInfosMethod { get_method_id(env, "getArguments", "()[Lgodot/core/KtPropertyInfo;") };
    jni::JObjectArray propertyInfoArray { wrapped.call_object_method(env, getPropertyInfosMethod) };
    for (int i = 0; i < propertyInfoArray.length(env); i++) {
        arguments.push_back(new KtPropertyInfo(propertyInfoArray.get(env, i), GDKotlin::get_instance().get_class_loader()));
    }
    jni::MethodId getReturnValMethod { get_method_id(env, "getReturnVal", "()Lgodot/core/KtPropertyInfo;") };
    return_val = new KtPropertyInfo(wrapped.call_object_method(env, getReturnValMethod), GDKotlin::get_instance().get_class_loader());
}

KtFunctionInfo::~KtFunctionInfo() {
    delete return_val;

    List<KtPropertyInfo*>::Element* current = arguments.front();
    while (current) {
        KtPropertyInfo* propertyInfo = current->get();
        delete propertyInfo;
        current = current->next();
    }
    arguments.clear();
}

MethodInfo KtFunctionInfo::toMethodInfo() const {
    MethodInfo methodInfo;
    methodInfo.name = name;
    List<PropertyInfo> pInfoList;
    for (int i = 0; i < arguments.size(); i++) {
        pInfoList.push_back(arguments[i]->toPropertyInfo());
    }
    methodInfo.arguments = pInfoList;
    methodInfo.return_val = return_val->toPropertyInfo();
    return methodInfo;
}
