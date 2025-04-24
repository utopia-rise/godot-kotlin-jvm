#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H

#include "jvm/wrapper/jvm_instance_wrapper.h"
#include "kt_object.h"
#include "kt_property.h"
#include "kt_rpc_config.h"

JVM_INSTANCE_WRAPPER(KtFunctionInfo, "godot.core.KtFunctionInfo") {
    JVM_CLASS(KtFunctionInfo)

    // clang-format off
    JNI_OBJECT_METHOD(GET_NAME)
    JNI_OBJECT_METHOD(GET_ARGUMENTS)
    JNI_OBJECT_METHOD(GET_RETURN_VAL)
    JNI_OBJECT_METHOD(GET_RPC_CONFIG)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/godot::String;")
        INIT_JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
        INIT_JNI_METHOD(GET_RETURN_VAL, "getReturnVal", "()Lgodot/core/KtPropertyInfo;")
        INIT_JNI_METHOD(GET_RPC_CONFIG, "getRpcConfig", "()Lgodot/core/KtRpcConfig;")
    )

    // clang-format on
public:
    explicit KtFunctionInfo(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtFunctionInfo();

    godot::String name;
    godot::List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;
    KtRpcConfig* rpc_config;

    godot::MethodInfo to_method_info() const;
};

JVM_INSTANCE_WRAPPER(KtFunction, "godot.core.KtFunction") {
    JVM_CLASS(KtFunction)

    // clang-format off
    JNI_OBJECT_METHOD(GET_FUNCTION_INFO)
    JNI_INT_METHOD(GET_PARAMETER_COUNT)
    JNI_VOID_METHOD(INVOKE)
    JNI_OBJECT_METHOD(INVOKE_WITH_RETURN)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_FUNCTION_INFO, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")
        INIT_JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
        INIT_JNI_METHOD(INVOKE, "invoke", "(Lgodot/core/KtObject;)V")
        INIT_JNI_METHOD(INVOKE_WITH_RETURN, "invokeWithReturn", "(Lgodot/core/KtObject;)Ljava/lang/godot::Object;")
    )
    // clang-format on

private:
    int parameter_count;
    KtFunctionInfo* method_info;
    bool has_return_value;

public:
    explicit KtFunction(jni::Env& p_env, jni::JObject p_wrapped);
    ~KtFunction();

    godot::StringName get_name() const;
    int get_parameter_count() const;
    KtRpcConfig* get_rpc_config() const;

    godot::MethodInfo get_member_info();
    KtFunctionInfo* get_kt_function_info();

    void invoke(jni::Env& p_env, const KtObject* instance, const godot::Variant** p_args, int args_count, godot::Variant& r_ret);
};

#endif// GODOT_JVM_KT_FUNCTION_H
