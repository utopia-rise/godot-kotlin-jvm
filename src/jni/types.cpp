#include <vector>
#include "types.h"
#include "env.h"

namespace jni {

    JObject::JObject(jobject obj) : obj(obj) {}

    JObject JObject::newGlobalRef(Env& env) {
        auto ref = env.env->NewGlobalRef(obj);
        env.checkExceptions();
        return JObject(ref);
    }

    void JObject::deleteGlobalRef(Env& env) {
        env.env->DeleteGlobalRef(obj);
        env.checkExceptions();
    }

    bool JObject::isNull() {
        return obj == nullptr;
    }

    JObject JObject::callObjectMethod(Env &env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallObjectMethodA((jclass) obj, method, args.data());
        env.checkExceptions();
        return JObject(ret);
    }

    jint JObject::callIntMethod(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallIntMethodA((jclass) obj, method, args.data());
        env.checkExceptions();
        return ret;
    }

    jlong JObject::callLongMethod(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallLongMethodA((jclass) obj, method, args.data());
        env.checkExceptions();
        return ret;
    }

    jboolean JObject::callBooleanMethod(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallBooleanMethodA((jclass) obj, method, args.data());
        env.checkExceptions();
        return ret;
    }

    void JObject::callVoidMethod(Env& env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        env.env->CallVoidMethodA((jclass) obj, method, args.data());
        env.checkExceptions();
    }

    MethodId JClass::getMethodId(Env &env, const char *name, const char *signature) {
        auto id = env.env->GetMethodID((jclass) obj, name, signature);
        if (id == nullptr) {
            throw MethodNotFoundError(name, signature);
        }
        env.checkExceptions();
        return id;
    }

    MethodId JClass::getStaticMethodId(Env &env, const char *name, const char *signature) {
        auto id = env.env->GetStaticMethodID((jclass) obj, name, signature);
        if (id == nullptr) {
            throw MethodNotFoundError(name, signature);
        }
        env.checkExceptions();
        return id;
    }

    FieldId JClass::getStaticFieldId(Env& env, const char* name, const char* signature) {
        auto id = env.env->GetStaticFieldID((jclass) obj, name, signature);
        if (id == nullptr) {
            throw FieldNotFoundError(name, signature);
        }
        env.checkExceptions();
        return id;
    }

    void JClass::registerNatives(Env& env, std::vector<JNativeMethod> methods) {
        env.env->RegisterNatives((jclass) obj, methods.data(), methods.size());
        env.checkExceptions();
    }

    MethodId JClass::getConstructorMethodId(Env &env, const char *signature) {
        return getMethodId(env, "<init>", signature);
    }

    JObject JClass::newInstance(Env &env, MethodId ctor, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->NewObjectA((jclass) obj, ctor, args.data());
        if (ret == nullptr) {
            throw JniError("Failed to instantiated object!");
        }
        env.checkExceptions();
        return JObject(ret);
    }

    JObject JClass::callStaticObjectMethod(Env &env, MethodId method, std::initializer_list<JValue> values) {
        unpack_args(args)
        auto ret = env.env->CallStaticObjectMethodA((jclass) obj, method, args.data());
        env.checkExceptions();
        return JObject(ret);
    }

    JObject JClass::getStaticObjectField(Env& env, FieldId field) {
        auto value = env.env->GetStaticObjectField((jclass) obj, field);
        env.checkExceptions();
        return JObject(value);
    }

    JObjectArray JClass::newObjectArray(Env& env, int size, JObject initial) {
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