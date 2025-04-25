#include "kt_object.h"

#include "api/script/jvm_instance.h"
#include "api/script/jvm_script_manager.h"
#include "core/jvm_binding_manager.h"
#include "engine/utilities.h"
#include "jvm/wrapper/memory/transfer_context.h"

#include <classes/engine.hpp>

KtObject::KtObject(jni::Env& p_env, jni::JObject p_wrapped, bool p_is_ref) :
  JvmInstanceWrapper(p_env, p_wrapped),
  is_ref(p_is_ref) {}

void KtObject::script_instance_removed(jni::Env& p_env, uint32_t constructor_index) {
    jvalue args[1] = {jni::to_jni_arg(constructor_index)};
    wrapped.call_void_method(p_env, REMOVE_SCRIPT, args);
}

void KtObject::create_native_object(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index, jint p_script_index) {
    const godot::StringName& class_name {TypeManager::get_instance().get_engine_type_for_index(static_cast<int>(p_class_index))};
    godot::Object* ptr = godot::ClassDB::instantiate(class_name);

    auto raw_ptr = reinterpret_cast<uintptr_t>(ptr);

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(!ptr, "Failed to instantiate class %s", class_name);
#endif

    jni::Env env {p_raw_env};

    godot::JvmBindingManager::set_instance_binding(ptr);
    int script_index {static_cast<int>(p_script_index)};
    if (script_index != -1) {
        KtObject* kt_object = memnew(KtObject(env, jni::JObject(p_instance), is_ref_counted(ptr)));
        godot::Ref<godot::JvmScript> kotlin_script {godot::JvmScriptManager::get_instance()->get_named_script_from_index(script_index)};
        godot::JvmInstance* script = memnew(godot::JvmInstance(env, ptr, kt_object, kotlin_script.ptr()));
        ptr->set_script_instance(script);
    }

    TransferContext::get_instance().write_object_data(env, raw_ptr, godot::ObjectID(ptr->get_instance_id()));
}

void KtObject::get_singleton(JNIEnv* p_raw_env, jobject, jint p_class_index) {
    const godot::String& singleton_name {TypeManager::get_instance().get_engine_singleton_name_for_index(static_cast<int>(p_class_index))};
    godot::Object* singleton {godot::Engine::get_singleton()->get_singleton(singleton_name)};

    jni::Env env {p_raw_env};
    TransferContext::get_instance()
      .write_object_data(env, reinterpret_cast<uintptr_t>(singleton), godot::ObjectID(singleton->get_instance_id()));
}

void KtObject::free_object(JNIEnv*, jobject, jlong p_raw_ptr) {
    auto* owner = reinterpret_cast<godot::Object*>(static_cast<uintptr_t>(p_raw_ptr));

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(is_ref_counted(owner), "Can't 'free' a RefCounted godot::Object.");
#endif

    memdelete(owner);
}

KtObject::~KtObject() {
    if (is_ref) { return; }
    jni::Env env {jni::Jvm::current_env()};
    wrapped.call_void_method(env, ON_DESTROY);
}