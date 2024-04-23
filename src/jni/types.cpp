#include "types.h"

#include "env.h"

namespace jni {

    JValue::JValue(JObject obj) {
        value.l = obj.obj;
    }

    JValue::JValue(jint i) {
        value.i = i;
    }

    JValue::JValue(jlong i) {
        value.j = i;
    }

    JValue::JValue(jboolean b) {
        value.z = b;
    }

    JValue::JValue(jfloat f) {
        value.f = f;
    }

    JValue::JValue(jdouble d) {
        value.d = d;
    }

    JValue::JValue(jbyte b) {
        value.b = b;
    }

    JValue::JValue(jchar c) {
        value.c = c;
    }

    JValue::JValue(jshort s) {
        value.s = s;
    }

    JObject::JObject(jobject obj) : obj(obj) {}

    jobject JObject::get_wrapped() const{
        return obj;
    }

    void JObject::delete_global_ref(Env& p_env) {
        p_env.env->DeleteGlobalRef(obj);
        p_env.check_exceptions();
    }

    void JObject::delete_weak_ref(Env& p_env) {
        p_env.env->DeleteWeakGlobalRef(obj);
        p_env.check_exceptions();
    }

    void JObject::delete_local_ref(Env& p_env) {
        p_env.env->DeleteLocalRef(obj);
        p_env.check_exceptions();
    }

    bool JObject::is_null() {
        return obj == nullptr;
    }

    JObject JObject::call_object_method(Env& env, MethodId method, jvalue* args) const {
        auto ret = env.env->CallObjectMethodA((jclass) obj, method, args);
        env.check_exceptions();
        return JObject(ret);
    }

    jint JObject::call_int_method(Env& env, MethodId method, jvalue* args) const {
        auto ret = env.env->CallIntMethodA((jclass) obj, method, args);
        env.check_exceptions();
        return ret;
    }

    jdouble JObject::call_double_method(Env& env, MethodId method, jvalue* args) const {
        jdouble ret = env.env->CallDoubleMethodA((jclass) obj, method, args);
        env.check_exceptions();
        return ret;
    }

    jlong JObject::call_long_method(Env& env, MethodId method, jvalue* args) const {
        auto ret = env.env->CallLongMethodA((jclass) obj, method, args);
        env.check_exceptions();
        return ret;
    }

    jboolean JObject::call_boolean_method(Env& env, MethodId method, jvalue* args) const {
        auto ret = env.env->CallBooleanMethodA((jclass) obj, method, args);
        env.check_exceptions();
        return ret;
    }

    void JObject::call_void_method(Env& env, MethodId method, jvalue* args) const {
        env.env->CallVoidMethodA((jclass) obj, method, args);
        env.check_exceptions();
    }

    void JObject::call_void_method_noexcept(Env& env, MethodId method, jvalue* args) const {
        env.env->CallVoidMethodA((jclass) obj, method, args);
    }

    MethodId JClass::get_method_id(Env& env, const char* name, const char* signature) {
        auto id = env.env->GetMethodID((jclass) obj, name, signature);
        JVM_CRASH_COND_MSG(id == nullptr, vformat("Method not found: %s with signature: %s", name, signature));
        env.check_exceptions();
        return id;
    }

    MethodId JClass::get_static_method_id(Env& env, const char* name, const char* signature) {
        auto id = env.env->GetStaticMethodID((jclass) obj, name, signature);
        JVM_CRASH_COND_MSG(id == nullptr, vformat("Method not found: %s with signature: %s", name, signature));
        env.check_exceptions();
        return id;
    }

    FieldId JClass::get_static_field_id(Env& env, const char* name, const char* signature) {
        auto id = env.env->GetStaticFieldID((jclass) obj, name, signature);
        JVM_CRASH_COND_MSG(id == nullptr, vformat("Field not found: %s with signature: %s", name, signature));
        env.check_exceptions();
        return id;
    }

    void JClass::register_natives(Env& env, Vector<JNativeMethod> methods) {
        env.env->RegisterNatives((jclass) obj, methods.ptr(), methods.size());
        env.check_exceptions();
    }

    MethodId JClass::get_constructor_method_id(Env& env, const char* signature) {
        return get_method_id(env, "<init>", signature);
    }

    JObject JClass::new_instance(Env& env, MethodId ctor, jvalue* args) {
        auto ret = env.env->NewObjectA((jclass) obj, ctor, args);
        JVM_CRASH_COND_MSG(ret == nullptr, "Failed to instantiated object!");
        env.check_exceptions();
        return JObject(ret);
    }

    JObject JClass::call_static_object_method(Env& env, MethodId method, jvalue* args) {
        auto ret = env.env->CallStaticObjectMethodA((jclass) obj, method, args);
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
        JVM_CRASH_COND_MSG(ret == nullptr, "Failed to instantiated object array!");
        return JObjectArray(ret);
    }

    bool JClass::is_assignable_from(Env& env, JClass p_other) const {
        return static_cast<bool>(env.env->IsAssignableFrom(static_cast<jclass>(p_other.obj), static_cast<jclass>(obj)));
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

    JByteArray::JByteArray(Env& env, const jsize size) : JArray() {
        // Allocate an Array with reserved size;
        obj = env.env->NewByteArray(size);
    }

    JIntArray::JIntArray(Env& env, const jsize size) : JArray() {
        // Allocate an Array with reserved size;
        obj = env.env->NewIntArray(size);
    }

    JLongArray::JLongArray(Env& env, const jsize size) : JArray() {
        // Allocate an Array with reserved size;
        obj = env.env->NewLongArray(size);
    }

    JFloatArray::JFloatArray(Env& env, const jsize size) : JArray() {
        // Allocate an Array with reserved size;
        obj = env.env->NewFloatArray(size);
    }

    JDoubleArray::JDoubleArray(Env& env, const jsize size) : JArray() {
        // Allocate an Array with reserved size;
        obj = env.env->NewDoubleArray(size);
    }

    void JByteArray::get_array_elements(Env& env, jbyte* arr, const jsize size) {
        // Convert java array to native array
        jbyte* nativeArray = env.env->GetByteArrayElements((jbyteArray) obj, nullptr);

        // Copy elements
        std::copy(nativeArray, nativeArray + size, arr);

        // Release the original Java array
        env.env->ReleaseByteArrayElements((jbyteArray) obj, nativeArray, 0);
    }

    void JIntArray::get_array_elements(Env& env, jint* arr, const jsize size) {
        // Convert java array to native array
        jint* nativeArray = env.env->GetIntArrayElements((jintArray) obj, nullptr);

        // Copy elements
        std::copy(nativeArray, nativeArray + size, arr);

        // Release the original Java array
        env.env->ReleaseIntArrayElements((jintArray) obj, nativeArray, 0);
    }

    void JLongArray::get_array_elements(Env& env, jlong* arr, const jsize size) {
        // Convert java array to native array
        jlong* nativeArray = env.env->GetLongArrayElements((jlongArray) obj, nullptr);

        // Copy elements
        std::copy(nativeArray, nativeArray + size, arr);

        // Release the original Java array
        env.env->ReleaseLongArrayElements((jlongArray) obj, nativeArray, 0);
    }

    void JFloatArray::get_array_elements(Env& env, jfloat* arr, const jsize size) {
        // Convert java array to native array
        jfloat* nativeArray = env.env->GetFloatArrayElements((jfloatArray) obj, nullptr);

        // Copy elements
        std::copy(nativeArray, nativeArray + size, arr);

        // Release the original Java array
        env.env->ReleaseFloatArrayElements((jfloatArray) obj, nativeArray, 0);
    }

    void JDoubleArray::get_array_elements(Env& env, jdouble* arr, const jsize size) {
        // Convert java array to native array
        jdouble* nativeArray = env.env->GetDoubleArrayElements((jdoubleArray) obj, nullptr);

        // Copy elements
        std::copy(nativeArray, nativeArray + size, arr);

        // Release the original Java array
        env.env->ReleaseDoubleArrayElements((jdoubleArray) obj, nativeArray, 0);
    }

    void JByteArray::set_array_elements(Env& env, const jbyte* arr, const jsize size) {
        env.env->SetByteArrayRegion((jbyteArray) obj, 0, size, arr);
    }

    void JIntArray::set_array_elements(Env& env, const jint* arr, const jsize size) {
        env.env->SetIntArrayRegion((jintArray) obj, 0, size, arr);
    }

    void JLongArray::set_array_elements(Env& env, const jlong* arr, const jsize size) {
        env.env->SetLongArrayRegion((jlongArray) obj, 0, size, arr);
    }

    void JFloatArray::set_array_elements(Env& env, const jfloat* arr, const jsize size) {
        env.env->SetFloatArrayRegion((jfloatArray) obj, 0, size, arr);
    }

    void JDoubleArray::set_array_elements(Env& env, const jdouble* arr, const jsize size) {
        env.env->SetDoubleArrayRegion((jdoubleArray) obj, 0, size, arr);
    }

}// namespace jni