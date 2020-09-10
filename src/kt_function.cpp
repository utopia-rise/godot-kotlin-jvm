#include <utility>

#include "kt_function.h"
#include "gd_kotlin.h"

KtFunction::KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtFunction", p_wrapped, p_class_loader), parameterCount(-1) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId getFunctionInfoMethod{get_method_id(env, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")};
    methodInfo = new KtFunctionInfo(wrapped.call_object_method(env, getFunctionInfoMethod),
                                    GDKotlin::get_instance().get_class_loader());
    jni::MethodId getParameterCountMethod{get_method_id(env, "getParameterCount", "()I")};
    parameterCount = wrapped.call_int_method(env, getParameterCountMethod);
}

KtFunction::~KtFunction() {
    delete methodInfo;
}

MethodInfo KtFunction::get_member_info() {
    return methodInfo->toMethodInfo();
}

StringName KtFunction::get_name() const {
    return methodInfo->name;
}

int KtFunction::getParameterCount() const {
    return parameterCount;
}

KtFunctionInfo* KtFunction::get_kt_function_info() {
    return methodInfo;
}

Variant KtFunction::invoke(jni::JObject instance, const Variant** p_args) {
    jni::Env env{jni::Jvm::current_env()};

    jni::MethodId methodId {get_method_id(env, "invoke", "(Lgodot/core/KtObject;)Z")};
    TransferContext* transferContext = GDKotlin::get_instance().transfer_context;
    TransferContext::SharedBuffer buffer = transferContext->get_buffer(env);
    Vector<KtVariant> args;
    for (int i = 0; i < methodInfo->arguments.size(); i++) {
        args.push_back(KtVariant(p_args[i]));
    }
    transferContext->write_args(env, buffer, args);
    if (wrapped.call_boolean_method(env, methodId, {instance})) {
        buffer = transferContext->get_buffer(env);
    }
    return transferContext->read_return_value(env, buffer).to_godot_variant();
}

KtFunctionInfo::KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtFunctionInfo", p_wrapped, p_class_loader) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId getNameMethod{get_method_id(env, "getName", "()Ljava/lang/String;")};
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
    jni::MethodId getPropertyInfosMethod{get_method_id(env, "getArguments", "()[Lgodot/core/KtPropertyInfo;")};
    jni::JObjectArray propertyInfoArray{wrapped.call_object_method(env, getPropertyInfosMethod)};
    for (int i = 0; i < propertyInfoArray.length(env); i++) {
        arguments.push_back(
                new KtPropertyInfo(propertyInfoArray.get(env, i), GDKotlin::get_instance().get_class_loader()));
    }
    jni::MethodId getReturnValMethod{get_method_id(env, "getReturnVal", "()Lgodot/core/KtPropertyInfo;")};
    return_val = new KtPropertyInfo(wrapped.call_object_method(env, getReturnValMethod),
                                    GDKotlin::get_instance().get_class_loader());
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
