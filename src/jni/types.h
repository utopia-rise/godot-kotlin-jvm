#ifndef GODOT_LOADER_JOBJECT_H
#define GODOT_LOADER_JOBJECT_H

#include "env.h"

#include <core/templates/vector.h>
#include <jni.h>

namespace jni {

    class JObject;

    class JValue {
    public:
        jvalue value;

        JValue(JObject obj);

        JValue(jint i);

        JValue(jlong i);

        JValue(jboolean b);

        JValue(jfloat f);

        JValue(jdouble d);

        JValue(jbyte b);

        JValue(jchar c);

        JValue(jshort s);

        JValue() = default;
    };

    typedef jmethodID MethodId;
    typedef jfieldID FieldId;

    class JObject {
    public:
        jobject obj {nullptr};

        JObject() = default;
        JObject(jobject);

        // todo: delete copy ctor and assignment?
        JObject(const JObject&) = default;
        JObject& operator=(const JObject&) = default;

        jobject get_wrapped() const;

        template<class T>
        inline T new_global_ref(Env& env);

        void delete_global_ref(Env& p_env);

        template<class T>
        inline T new_weak_ref(Env& env);

        void delete_weak_ref(Env& p_env);

        void delete_local_ref(Env& p_env);

        template<bool CHECK_EXCEPTION = true>
        void call_void_method(Env& env, MethodId method, jvalue* args = {}) const;

        template<bool CHECK_EXCEPTION = true>
        JObject call_object_method(Env& env, MethodId method, jvalue* args = {}) const;

        jint call_int_method(Env& env, MethodId method, jvalue* args = {}) const;

        jlong call_long_method(Env& env, MethodId method, jvalue* args = {}) const;

        jdouble call_double_method(Env& env, MethodId method, jvalue* args = {}) const;

        jboolean call_boolean_method(Env& env, MethodId method, jvalue* args = {}) const;

        bool is_null();

        bool is_same_object(Env& env, const JObject& other) const;
    };

    template<bool CHECK_EXCEPTION>
    void JObject::call_void_method(Env& env, MethodId method, jvalue* args) const {
        env.env->CallVoidMethodA((jclass) obj, method, args);
#ifdef DEV_ENABLED
        env.check_exceptions();
#else
        if constexpr (CHECK_EXCEPTION){
            env.check_exceptions();
        }
#endif
    }

    template<bool CHECK_EXCEPTION>
    JObject JObject::call_object_method(Env& env, MethodId method, jvalue* args) const {
        JObject ret = env.env->CallObjectMethodA((jclass) obj, method, args);
#ifdef DEV_ENABLED
        env.check_exceptions();
#else
        if constexpr (CHECK_EXCEPTION){
            env.check_exceptions();
        }
#endif
        return ret;
    }

    class JString : public JObject {
    public:
        JString() = default;
        JString(jstring string) : JObject(string) {}
        explicit JString(JObject jObject) : JObject(jObject) {};
    };

    class JArray : public JObject {
    public:
        JArray() = default;
        JArray(jarray array) : JObject(array) {}
        explicit JArray(JObject jObject) : JObject(jObject) {};

        int length(Env& env);
    };

    class JObjectArray : public JArray {
    public:
        JObjectArray() = default;
        JObjectArray(jarray array) : JArray(array) {}
        explicit JObjectArray(JObject jObject) : JArray(jObject) {};

        void set(Env& env, int index, JObject value);

        JObject get(Env& env, int index);
    };

    class JByteArray : public JArray {
    public:
        JByteArray() = default;
        JByteArray(Env& env, jsize size = 0);
        JByteArray(jbyteArray array) : JArray(array) {}
        explicit JByteArray(JObject jObject) : JArray(jObject) {};

        void get_array_elements(Env& env, jbyte* arr, jsize size);
        void set_array_elements(Env& env, const jbyte* arr, jsize size);
    };

    class JIntArray : public JArray {
    public:
        JIntArray() = default;
        JIntArray(Env& env, jsize size = 0);
        JIntArray(jbyteArray array) : JArray(array) {}
        explicit JIntArray(JObject jObject) : JArray(jObject) {};

        void get_array_elements(Env& env, jint* arr, jsize size);
        void set_array_elements(Env& env, const jint* arr, jsize size);
    };

    class JLongArray : public JArray {
    public:
        JLongArray() = default;
        JLongArray(Env& env, jsize size = 0);
        JLongArray(jbyteArray array) : JArray(array) {}
        explicit JLongArray(JObject jObject) : JArray(jObject) {};

        void get_array_elements(Env& env, jlong* arr, jsize size);
        void set_array_elements(Env& env, const jlong* arr, jsize size);
    };

    class JFloatArray : public JArray {
    public:
        JFloatArray() = default;
        JFloatArray(Env& env, jsize size = 0);
        JFloatArray(jbyteArray array) : JArray(array) {}
        explicit JFloatArray(JObject jObject) : JArray(jObject) {};

        void get_array_elements(Env& env, jfloat* arr, jsize size);
        void set_array_elements(Env& env, const jfloat* arr, jsize size);
    };

    class JDoubleArray : public JArray {
    public:
        JDoubleArray() = default;
        JDoubleArray(Env& env, jsize size = 0);
        JDoubleArray(jbyteArray array) : JArray(array) {}
        explicit JDoubleArray(JObject jObject) : JArray(jObject) {};

        void get_array_elements(Env& env, jdouble* arr, jsize size);
        void set_array_elements(Env& env, const jdouble* arr, jsize size);
    };

    typedef JNINativeMethod JNativeMethod;

    class JClass : public JObject {
    public:
        explicit JClass(jclass cls) : JObject(cls) {}

        explicit JClass(jobject cls) : JObject(cls) {}

        JClass(const JClass&) = default;

        JClass& operator=(const JClass&) = default;

        JClass() : JClass((jclass) nullptr) {}

        JObject new_instance(Env& env, MethodId ctor, jvalue* args = {});

        JObjectArray new_object_array(Env& env, int size, JObject initial = {});

        MethodId get_constructor_method_id(Env& env, const char* signature);

        MethodId get_method_id(Env& env, const char* name, const char* signature);

        MethodId get_static_method_id(Env& env, const char* name, const char* signature);

        FieldId get_static_field_id(Env& env, const char* name, const char* signature);

        void register_natives(Env& env, Vector<JNativeMethod> methods);

        JObject call_static_object_method(Env& env, MethodId method, jvalue* args = {});

        JObject get_static_object_field(Env& env, FieldId field);

        bool is_assignable_from(Env& env, JClass p_other) const;
    };

}// namespace jni

#endif// GODOT_LOADER_JOBJECT_H