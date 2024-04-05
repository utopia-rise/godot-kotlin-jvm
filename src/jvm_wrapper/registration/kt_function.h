#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H

#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "kt_object.h"
#include "kt_property.h"
#include "kt_rpc_config.h"

JVM_INSTANCE_WRAPPER(KtFunctionInfo, "godot.core.KtFunctionInfo") {

    // clang-format off
    JNI_METHOD(GET_NAME)
    JNI_METHOD(GET_ARGUMENTS)
    JNI_METHOD(GET_RETURN_VAL)
    JNI_METHOD(GET_RPC_CONFIG)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        INIT_JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
        INIT_JNI_METHOD(GET_RETURN_VAL, "getReturnVal", "()Lgodot/core/KtPropertyInfo;")
        INIT_JNI_METHOD(GET_RPC_CONFIG, "getRpcConfig", "()Lgodot/core/KtRpcConfig;")
    )

    // clang-format on
public:
    explicit KtFunctionInfo(jni::JObject p_wrapped);
    ~KtFunctionInfo();

    String name;
    List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;
    KtRpcConfig* rpc_config;

    MethodInfo to_method_info() const;
};

JVM_INSTANCE_WRAPPER(KtFunction, "godot.core.KtFunction") {

    // clang-format off
    JNI_METHOD(GET_FUNCTION_INFO)
    JNI_METHOD(GET_PARAMETER_COUNT)
    JNI_METHOD(INVOKE)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(GET_FUNCTION_INFO, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")
        INIT_JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
        INIT_JNI_METHOD(INVOKE, "invoke", "(Lgodot/core/KtObject;)V")
    )

    // clang-format on

private:
    int parameter_count;
    KtFunctionInfo* method_info;

public:
    explicit KtFunction(jni::JObject p_wrapped);
    ~KtFunction();

    StringName get_name() const;
    int get_parameter_count() const;
    KtRpcConfig* get_rpc_config() const;

    MethodInfo get_member_info();
    KtFunctionInfo* get_kt_function_info();

    void invoke(const KtObject* instance, const Variant** p_args, int args_count, Variant& r_ret);
};

#endif// GODOT_JVM_KT_FUNCTION_H
