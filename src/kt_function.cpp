#include "kt_function.h"

#include "gd_kotlin.h"
#include "jni/class_loader.h"

// clang-format off
JNI_INIT_STATICS_FOR_CLASS(
    KtFunction,
    INIT_JNI_METHOD(GET_FUNCTION_INFO)
    INIT_JNI_METHOD(GET_PARAMETER_COUNT)
    INIT_JNI_METHOD(INVOKE)
)

JNI_INIT_STATICS_FOR_CLASS(
    KtFunctionInfo,
    INIT_JNI_METHOD(GET_NAME)
    INIT_JNI_METHOD(GET_ARGUMENTS)
    INIT_JNI_METHOD(GET_RETURN_VAL)
    INIT_JNI_METHOD(GET_RPC_CONFIG)
)

// clang-format on

KtFunction::KtFunction(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped), parameter_count(-1) {
    jni::Env env {jni::Jvm::current_env()};
    jni::MethodId getFunctionInfoMethod {jni_methods.GET_FUNCTION_INFO.method_id};
    method_info = new KtFunctionInfo(wrapped.call_object_method(env, getFunctionInfoMethod));
    jni::MethodId getParameterCountMethod {jni_methods.GET_PARAMETER_COUNT.method_id};
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

KtRpcConfig* KtFunction::get_rpc_config() const {
    return method_info->rpc_config;
}

KtFunctionInfo* KtFunction::get_kt_function_info() {
    return method_info;
}

void KtFunction::invoke(const KtObject* instance, const Variant** p_args, int args_count, Variant& r_ret) {
    jni::Env env {jni::Jvm::current_env()};

    jni::MethodId methodId {jni_methods.INVOKE.method_id};
    TransferContext* transferContext = GDKotlin::get_instance().transfer_context;
    transferContext->write_args(env, p_args, args_count);
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, methodId, call_args);
    transferContext->read_return_value(env, r_ret);
}

KtFunctionInfo::KtFunctionInfo(jni::JObject p_wrapped) : JavaInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};

    jni::MethodId getNameMethod {jni_methods.GET_NAME.method_id};
    jni::JString string = wrapped.call_object_method(env, getNameMethod);
    name = env.from_jstring(string);

    jni::MethodId getPropertyInfosMethod {jni_methods.GET_ARGUMENTS.method_id};
    jni::JObjectArray propertyInfoArray {wrapped.call_object_method(env, getPropertyInfosMethod)};
    for (int i = 0; i < propertyInfoArray.length(env); i++) {
        arguments.push_back(new KtPropertyInfo(propertyInfoArray.get(env, i)));
    }

    jni::MethodId getReturnValMethod {jni_methods.GET_RETURN_VAL.method_id};
    return_val = new KtPropertyInfo(wrapped.call_object_method(env, getReturnValMethod));

    jni::MethodId getRpcConfigMethod {jni_methods.GET_RPC_CONFIG.method_id};
    rpc_config = new KtRpcConfig(wrapped.call_object_method(env, getRpcConfigMethod));

    propertyInfoArray.delete_local_ref(env);
    string.delete_local_ref(env);
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
    for (int i = 0; i < arguments.size(); ++i) {
        pInfoList.push_back(arguments[i]->toPropertyInfo());
    }
    methodInfo.arguments = pInfoList;
    methodInfo.return_val = return_val->toPropertyInfo();
    return methodInfo;
}
