#include "kt_object.h"

#include "api/script/jvm_instance.h"
#include "jvm/wrapper/bridge/bridges_utils.h"
#include "core/instance_creator.h"
#include "core/jvm_binding_manager.h"
#include "engine/utilities.h"
#include "jvm/wrapper/memory/transfer_context.h"

#include <classes/engine.hpp>
#include <core/object.hpp>

KtObject::KtObject(jni::Env& p_env, jni::JObject p_wrapped, bool p_is_ref) :
  JvmInstanceWrapper(p_env, p_wrapped),
  is_ref(p_is_ref) {}

void KtObject::script_instance_removed(jni::Env& p_env, uint32_t constructor_index) {
    jvalue args[1] = {jni::to_jni_arg(constructor_index)};
    wrapped.call_void_method(p_env, REMOVE_SCRIPT, args);
}

void KtObject::create_native_object(JNIEnv* p_raw_env, jobject p_instance, jint p_class_index, jlong p_script_ptr) {
    const godot::StringName& class_name {TypeManager::get_instance().get_engine_type_for_index(static_cast<int>(p_class_index))};
    // Not godot::ClassDB::instantiate(): that forwards to the script-facing ClassDB singleton, which boxes a RefCounted result in a Ref<RefCounted> inside a Variant — converting that straight to Object* and letting the Variant go out of scope...
    godot::GodotObject* raw_ptr_value {godot::InstanceCreator::instantiate(class_name)};

#ifdef DEBUG_ENABLED
    JVM_ERR_FAIL_COND_MSG(!raw_ptr_value, "Failed to instantiate class %s", class_name);
#endif

    jni::Env env {p_raw_env};

    // set_instance_binding()/is_ref_counted() work directly on the raw pointer — no godot-cpp wrapper is created (or needed) for any of this.
    godot::JvmBindingManager::set_instance_binding(raw_ptr_value);
    bool is_rc = is_ref_counted(raw_ptr_value);

    if (auto* kotlin_script = bridges::from_uint_to_ptr<godot::JvmScript>(p_script_ptr)) {
        // A godot-cpp wrapper is only needed from here on: JvmInstance::create_instance_data() keeps it as instance_data->owner for later wrapper-method calls (e.g. notify_property_list_changed() in jvm_placeholder_instance.cpp).
        godot::Object* ptr = godot::internal::get_object_instance_binding(raw_ptr_value);
        KtObject* kt_object = memnew(KtObject(env, jni::JObject(p_instance), is_rc));
        auto* instance_data = godot::JvmInstance::create_instance_data(env, ptr, kt_object, kotlin_script);
        GDExtensionScriptInstancePtr script_instance = godot::internal::gdextension_interface_script_instance_create3(
          &godot::JvmInstance::jvm_script_instance_info,
          instance_data
        );
        godot::internal::gdextension_interface_object_set_script_instance(raw_ptr_value, script_instance);
    }

    TransferContext::get_instance().write_object_data(
      env,
      reinterpret_cast<uintptr_t>(raw_ptr_value),
      godot::ObjectID(godot::internal::gdextension_interface_object_get_instance_id(raw_ptr_value))
    );
}

void KtObject::get_singleton(JNIEnv* p_raw_env, jobject, jint p_class_index) {
    const godot::String& singleton_name {TypeManager::get_instance().get_engine_singleton_name_for_index(static_cast<int>(p_class_index))};
    godot::Object* singleton {godot::Engine::get_singleton()->get_singleton(singleton_name)};

    jni::Env env {p_raw_env};
    TransferContext::get_instance()
      .write_object_data(env, reinterpret_cast<uintptr_t>(singleton->_owner), godot::ObjectID(singleton->get_instance_id()));
}

void KtObject::free_object(JNIEnv*, jobject, jlong p_raw_ptr) {
    // p_raw_ptr is the raw engine pointer — go through get_object_instance_binding to get the corresponding godot-cpp wrapper.
    auto* owner = godot::internal::get_object_instance_binding(reinterpret_cast<godot::GodotObject*>(static_cast<uintptr_t>(p_raw_ptr)));

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
