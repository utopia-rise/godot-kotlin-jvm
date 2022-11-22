#include "kt_function.h"
#include "gd_kotlin.h"
#include "jni/class_loader.h"

JNI_INIT_STATICS_FOR_CLASS(KtFunction)
JNI_INIT_STATICS_FOR_CLASS(KtFunctionInfo)

KtFunction::KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader)
        : JavaInstanceWrapper("godot.core.KtFunction", p_wrapped, p_class_loader), parameter_count(-1) {
    jni::Env env{jni::Jvm::current_env()};
    jni::MethodId getFunctionInfoMethod{get_method_id(env, jni_methods.GET_FUNCTION_INFO)};
    method_info = new KtFunctionInfo(wrapped.call_object_method(env, getFunctionInfoMethod),
                                     ClassLoader::get_default_loader());
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

// TODO: Fixed with https://github.com/utopia-rise/godot-kotlin-jvm/pull/369
//Multiplayer::RPCMode KtFunction::get_rpc_mode() const {
//    return method_info->rpc_mode;
//}

KtFunctionInfo* KtFunction::get_kt_function_info() {
    return method_info;
}

void KtFunction::invoke(const KtObject* instance, const Variant** p_args, int args_count, Variant& r_ret) {
    jni::Env env{jni::Jvm::current_env()};

    jni::MethodId methodId {get_method_id(env, jni_methods.INVOKE)};
    TransferContext* transferContext = GDKotlin::get_instance().transfer_context;
    transferContext->write_args(env, p_args, args_count);
    jvalue call_args[1] = {jni::to_jni_arg(instance->get_wrapped())};
    wrapped.call_void_method(env, methodId, call_args);
    transferContext->read_return_value(env, r_ret);
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
                new KtPropertyInfo(propertyInfoArray.get(env, i), ClassLoader::get_default_loader()));
    }
    jni::MethodId getReturnValMethod{get_method_id(env, jni_methods.GET_RETURN_VAL)};
    return_val = new KtPropertyInfo(wrapped.call_object_method(env, getReturnValMethod),
                                    ClassLoader::get_default_loader());
    // TODO: Fixed with https://github.com/utopia-rise/godot-kotlin-jvm/pull/369
//    jni::MethodId getRPCModeMethod{get_method_id(env, jni_methods.GET_RPC_MODE_ID)};
//    rpc_mode = static_cast<Multiplayer::RPCMode>(wrapped.call_int_method(env, getRPCModeMethod));
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
