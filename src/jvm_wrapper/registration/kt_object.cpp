#include "kt_object.h"

#include "binding/kotlin_binding_manager.h"
#include "jvm_wrapper/bridge/bridges_utils.h"
#include "script/jvm_script_manager.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "script//jvm_instance.h"

KtObject::KtObject(jni::Env& p_env, jni::JObject p_wrapped, bool p_is_ref) : JvmInstanceWrapper(p_env, p_wrapped), is_ref(p_is_ref) {}

void KtObject::script_instance_removed(jni::Env& p_env, uint32_t constructor_index) {
    jvalue args[1] = {jni::to_jni_arg(constructor_index)};
    wrapped.call_void_method(p_env, REMOVE_SCRIPT, args);
}

void KtObject::create_native_object(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index, jlong p_script_ptr) {
    const StringName& class_name {TypeManager::get_instance().get_engine_type_for_index(static_cast<int>(p_class_index))};
    Object* ptr = ClassDB::instantiate(class_name);

    auto raw_ptr = reinterpret_cast<uintptr_t>(ptr);

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(!ptr, "Failed to instantiate class %s", class_name);
#endif

    jni::Env env {p_raw_env};

    KotlinBindingManager::set_instance_binding(ptr);
    if (NamedScript* kotlin_script = bridges::from_uint_to_ptr<NamedScript>(p_script_ptr)) {
        KtObject* kt_object = memnew(KtObject(env, jni::JObject(p_instance), ptr->is_ref_counted()));
        JvmInstance* script = memnew(JvmInstance(env, ptr, kt_object, kotlin_script));
        ptr->set_script_instance(script);
    }

    TransferContext::get_instance().write_object_data(env, raw_ptr, ptr->get_instance_id());
}

void KtObject::get_singleton(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index) {
    const String& singleton_name {TypeManager::get_instance().get_engine_singleton_name_for_index(static_cast<int>(p_class_index))};
    Object* singleton {Engine::get_singleton()->get_singleton_object(singleton_name)};

    jni::Env env {p_raw_env};
    TransferContext::get_instance().write_object_data(env, reinterpret_cast<uintptr_t>(singleton), singleton->get_instance_id());
}

void KtObject::free_object(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr) {
    auto* owner = reinterpret_cast<Object*>(static_cast<uintptr_t>(p_raw_ptr));

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(owner->is_ref_counted(), "Can't 'free' a RefCounted Object.");
#endif

    memdelete(owner);
}

KtObject::~KtObject() {
    if (is_ref) { return; }
    jni::Env env {jni::Jvm::current_env()};
    wrapped.call_void_method(env, ON_DESTROY);
}