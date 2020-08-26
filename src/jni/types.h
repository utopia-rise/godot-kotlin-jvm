#ifndef GODOT_LOADER_JOBJECT_H
#define GODOT_LOADER_JOBJECT_H
#include <jni.h>
#include <initializer_list>
#include <core/vector.h>

namespace jni {

    // forward declare
    class Env;
    class JObject;

    class JValue {
    public:
        jvalue value;

        JValue(JObject& obj);

        JValue(jint i);

        JValue(jlong i);

        JValue(jboolean b);

        JValue(jfloat f);

        JValue(jdouble d);

        JValue(jbyte b);

        JValue(jchar c);

        JValue(jshort s);
    };

    typedef jmethodID MethodId;
    typedef jfieldID FieldId;

    class JObject {
    public:
        jobject obj;
        explicit JObject(jobject);
        // todo: delete copy ctor and assignment?
        JObject(const JObject&) = default;
        JObject& operator=(const JObject&) = default;
        inline JObject() : JObject(nullptr) {}

        template <class T>
        inline T new_global_ref(Env& env);
        void delete_global_ref(Env& p_env);

        JObject call_object_method(Env& env, MethodId method, std::initializer_list<JValue> values = {});
        jint call_int_method(Env& env, MethodId method, std::initializer_list<JValue> values = {});
        jlong call_long_method(Env& env, MethodId method, std::initializer_list<JValue> values = {});
        jboolean call_boolean_method(Env& env, MethodId method, std::initializer_list<JValue> values = {});
        void call_void_method(Env& env, MethodId method, std::initializer_list<JValue> values = {});

        bool isNull ();
    };

    class JString : public JObject {
    public:
        explicit JString(jstring str) : JObject(str) {}
    };

    class JArray : public JObject {
    public:
        explicit JArray(jarray array) : JObject(array) {}

        int length(Env& env);
    };

    class JObjectArray : public JArray {
    public:
        explicit JObjectArray(jarray array) : JArray(array) {}

        void set(Env& env, int index, JObject value);
        JObject get(Env& env, int index);
    };


    typedef JNINativeMethod JNativeMethod;

    class JClass : public JObject {
    public:
        explicit JClass(jclass cls) : JObject(cls) {}
        explicit JClass(jobject cls) : JObject(cls) {}
        JClass(const JClass&) = default;
        JClass& operator=(const JClass&) = default;
        JClass(): JClass((jclass) nullptr) {}

        JObject new_instance(Env& env, MethodId ctor, std::initializer_list<JValue> values = {});
        JObjectArray new_object_array(Env& env, int size, JObject initial = {});
        MethodId get_constructor_method_id(Env& env, const char* signature);
        MethodId get_method_id(Env& env, const char* name, const char* signature);
        MethodId get_static_method_id(Env& env, const char* name, const char* signature);
        FieldId get_static_field_id(Env& env, const char* name, const char* signature);
        void register_natives(Env& env, Vector<JNativeMethod> methods);

        JObject call_static_object_method(Env& env, MethodId method, std::initializer_list<JValue> values = {});
        JObject get_static_object_field(Env& env, FieldId field);
    };

#define unpack_args(args) \
    auto args = std::vector<jvalue>(); for (auto value : values) {  args.emplace_back(value.value); }
}


#endif //GODOT_LOADER_JOBJECT_H
