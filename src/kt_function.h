#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H


#include <core/object/object.h>
#include "kt_property.h"
#include "kt_object.h"
#include "java_instance_wrapper.h"

struct KtFunctionInfo : public JavaInstanceWrapper<KtFunctionInfo> {
    KtFunctionInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunctionInfo();

    String name;
    List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;
    // TODO: Fixed with https://github.com/utopia-rise/godot-kotlin-jvm/pull/369
//    Multiplayer::RPCMode rpc_mode;

    MethodInfo to_method_info() const;

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
        JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
        JNI_METHOD(GET_RETURN_VAL, "getReturnVal", "()Lgodot/core/KtPropertyInfo;")
        JNI_METHOD(GET_RPC_MODE_ID, "getRpcModeId", "()I")
)
};

class KtFunction : public JavaInstanceWrapper<KtFunction> {
private:
    int parameter_count;
    KtFunctionInfo* method_info;


public:
    KtFunction(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtFunction();

    StringName get_name() const;
    int get_parameter_count() const;

    // TODO: Fixed with https://github.com/utopia-rise/godot-kotlin-jvm/pull/369
//    Multiplayer::RPCMode get_rpc_mode() const;

    MethodInfo get_member_info();
    KtFunctionInfo* get_kt_function_info();

    void invoke(const KtObject* instance, const Variant** p_args, int args_count, Variant& r_ret);

DECLARE_JNI_METHODS(
        JNI_METHOD(GET_FUNCTION_INFO, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")
        JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
        JNI_METHOD(INVOKE, "invoke", "(Lgodot/core/KtObject;)V")
)
};


#endif //GODOT_JVM_KT_FUNCTION_H
