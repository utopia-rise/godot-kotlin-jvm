#include "kt_binding.h"

KtBinding::KtBinding(jni::JObject p_wrapped, jni::JObject p_class_loader) :
  JavaInstanceWrapper("godot.core.memory.GodotBinding", p_wrapped, p_class_loader) {
    jni::Env env {jni::Jvm::current_env()};
    p_wrapped.delete_local_ref(env);
}

KtBinding::~KtBinding() {

}