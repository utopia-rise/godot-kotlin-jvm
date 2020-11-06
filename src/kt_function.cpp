#include <utility>

#include "kt_function.h"
#include "gd_kotlin.h"

KtFunction::JNIMethods KtFunction::jni_methods{};
template<> jni::JClass JavaInstanceWrapper<KtFunction>::j_class(static_cast<jclass>(nullptr));

KtFunctionInfo::JNIMethods KtFunctionInfo::jni_methods{};
template<> jni::JClass JavaInstanceWrapper<KtFunctionInfo>::j_class(static_cast<jclass>(nullptr));

KtFunction::KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtFunction", p_wrapped, p_class_loader), parameter_count(-1) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId getFunctionInfoMethod{get_method_id(env, jni_methods.GET_FUNCTION_INFO)};
    method_info = new KtFunctionInfo(wrapped.call_object_method(env, getFunctionInfoMethod),
                                     GDKotlin::get_instance().get_class_loader());
    jni::MethodId getParameterCountMethod{get_method_id(env, jni_methods.GET_PARAMETER_COUNT)};
    parameter_count = wrapped.call_int_method(env, getParameterCountMethod);
}

KtFunction::~KtFunction() {
    delete method_info;
}

MethodInfo KtFunction::get_member_info() {
    return method_info->to_method_info();
}

StringName KtFunction::get_name() const {
    return method_info->name;
}

int KtFunction::get_parameter_count() const {
    return parameter_count;
}

KtFunctionInfo* KtFunction::get_kt_function_info() {
    return method_info;
}

Variant KtFunction::invoke(const KtObject* instance, const Variant** p_args, int args_count) {
    jni::Env env{jni::Jvm::current_env()};

    jni::MethodId methodId {get_method_id(env, jni_methods.INVOKE)};
    TransferContext* transferContext = GDKotlin::get_instance().transfer_context;
    Vector<KtVariant> args;
    for (int i = 0; i < args_count; i++) {
        args.push_back(KtVariant(*p_args[i]));
    }
    transferContext->write_args(env, args);
    bool refresh_buffer = wrapped.call_boolean_method(env, methodId, {instance->get_wrapped()});
    return transferContext->read_return_value(env, refresh_buffer).to_godot_variant();
}

KtFunctionInfo::KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtFunctionInfo", p_wrapped, p_class_loader) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId getNameMethod{get_method_id(env, jni_methods.GET_NAME)};
    name = env.from_jstring(wrapped.call_object_method(env, getNameMethod));
    jni::MethodId getPropertyInfosMethod{get_method_id(env, jni_methods.GET_ARGUMENTS)};
    jni::JObjectArray propertyInfoArray{wrapped.call_object_method(env, getPropertyInfosMethod)};
    for (int i = 0; i < propertyInfoArray.length(env); i++) {
        arguments.push_back(
                new KtPropertyInfo(propertyInfoArray.get(env, i), GDKotlin::get_instance().get_class_loader()));
    }
    jni::MethodId getReturnValMethod{get_method_id(env, jni_methods.GET_RETURN_VAL)};
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

MethodInfo KtFunctionInfo::to_method_info() const {
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
