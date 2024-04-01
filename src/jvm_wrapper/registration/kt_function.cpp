#include "kt_function.h"

#include "gd_kotlin.h"
#include "jni/class_loader.h"

KtFunction::KtFunction(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped), parameter_count(-1) {
    jni::Env env {jni::Jvm::current_env()};
    method_info = new KtFunctionInfo( CALL_JVM_METHOD(env, GET_FUNCTION_INFO));
    parameter_count = wrapped.call_int_method(env, GET_PARAMETER_COUNT);
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

    TransferContext& transferContext = TransferContext::get_instance();
    transferContext.write_args(env, p_args, args_count);
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    CALL_JVM_METHOD_WITH_ARG(env, INVOKE, call_args);
    transferContext.read_return_value(env, r_ret);
}

KtFunctionInfo::KtFunctionInfo(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {
    jni::Env env {jni::Jvm::current_env()};

    jni::JString string = CALL_JVM_METHOD(env, GET_NAME);
    name = env.from_jstring(string);

    jni::JObjectArray propertyInfoArray = CALL_JVM_METHOD(env, GET_ARGUMENTS);
    for (int i = 0; i < propertyInfoArray.length(env); i++) {
        arguments.push_back(new KtPropertyInfo(propertyInfoArray.get(env, i)));
    }

    return_val = new KtPropertyInfo(CALL_JVM_METHOD(env, GET_RETURN_VAL));
    rpc_config = new KtRpcConfig(CALL_JVM_METHOD(env, GET_RPC_CONFIG));

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
    for (auto argument : arguments) {
        pInfoList.push_back(argument->toPropertyInfo());
    }
    methodInfo.arguments = pInfoList;
    methodInfo.return_val = return_val->toPropertyInfo();
    return methodInfo;
}
