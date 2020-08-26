#include <vector>
#include "types.h"
#include "env.h"

namespace jni {

    JObject::JObject(jobject obj) : obj(obj) {}

    void JObject::delete_global_ref(Env& p_env) {
        p_env.env->DeleteGlobalRef(obj);
        p_env.check_exceptions();
    }

    bool JObject::isNull() {
        return obj == nullptr;
    }

    JObject JObject::call_object_method(Env &env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallObjectMethodA((jclass) obj, method, args.data());
        env.check_exceptions();
        return JObject(ret);
    }

    jint JObject::call_int_method(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallIntMethodA((jclass) obj, method, args.data());
        env.check_exceptions();
        return ret;
    }

    jlong JObject::call_long_method(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallLongMethodA((jclass) obj, method, args.data());
        env.check_exceptions();
        return ret;
    }

    jboolean JObject::call_boolean_method(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallBooleanMethodA((jclass) obj, method, args.data());
        env.check_exceptions();
        return ret;
    }

    void JObject::call_void_method(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        env.env->CallVoidMethodA((jclass) obj, method, args.data());
        env.check_exceptions();
    }

    MethodId JClass::get_method_id(Env &env, const char *name, const char *signature) {
        auto id = env.env->GetMethodID((jclass) obj, name, signature);
        if (id == nullptr) {
            throw MethodNotFoundError(name, signature);
        }
        env.check_exceptions();
        return id;
    }

    MethodId JClass::get_static_method_id(Env &env, const char *name, const char *signature) {
        auto id = env.env->GetStaticMethodID((jclass) obj, name, signature);
        if (id == nullptr) {
            throw MethodNotFoundError(name, signature);
        }
        env.check_exceptions();
        return id;
    }

    FieldId JClass::get_static_field_id(Env& env, const char* name, const char* signature) {
        auto id = env.env->GetStaticFieldID((jclass) obj, name, signature);
        if (id == nullptr) {
            throw FieldNotFoundError(name, signature);
        }
        env.check_exceptions();
        return id;
    }

    void JClass::register_natives(Env& env, Vector<JNativeMethod> methods) {
        env.env->RegisterNatives((jclass) obj, methods.ptr(), methods.size());
        env.check_exceptions();
    }

    MethodId JClass::get_constructor_method_id(Env &env, const char *signature) {
        return get_method_id(env, "<init>", signature);
    }

    JObject JClass::new_instance(Env &env, MethodId ctor, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->NewObjectA((jclass) obj, ctor, args.data());
        if (ret == nullptr) {
            throw JniError("Failed to instantiated object!");
        }
        env.check_exceptions();
        return JObject(ret);
    }

    JObject JClass::call_static_object_method(Env &env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallStaticObjectMethodA((jclass) obj, method, args.data());
        env.check_exceptions();
        return JObject(ret);
    }

    JObject JClass::get_static_object_field(Env& env, FieldId field) {
        auto value = env.env->GetStaticObjectField((jclass) obj, field);
        env.check_exceptions();
        return JObject(value);
    }

    JObjectArray JClass::new_object_array(Env& env, int size, JObject initial) {
        auto ret = env.env->NewObjectArray(size, (jclass) obj, initial.obj);
        if (ret == nullptr) {
            throw JniError("Failed to instantiated object array!");
        }
        return JObjectArray(ret);
    }

    int JArray::length(Env& env) {
        return env.env->GetArrayLength((jarray) obj);
    }

    void JObjectArray::set(Env& env, int index, JObject value) {
        env.env->SetObjectArrayElement((jobjectArray) obj, index, value.obj);
    }

    JObject JObjectArray::get(Env& env, int index) {
        auto ret = env.env->GetObjectArrayElement((jobjectArray) obj, index);
        return JObject(ret);
    }
}