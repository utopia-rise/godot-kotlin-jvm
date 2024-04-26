#include "kotlin_binding.h"

#include "core/object/ref_counted.h"

void KotlinBinding::refcount_incremented_unsafe() {
    // The reference has not been set yet.
    if (!kt_binding) { return; }

    // This function should only be called when we know the object is a RefCounted. We directly reinterpret the pointer to it
    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount > 1 && kt_binding->is_ref_weak()) {
        // The JVM holds a reference to that object already, if the counter is greater than 1, it means the native side holds a reference as well.
        // The reference is changed to a strong one so the JVM instance is not collected if it is not referenced anymore on the JVM side.
        jni::Env env {jni::Jvm::current_env()};
        kt_binding->swap_to_strong_unsafe(env);
    }
}

bool KotlinBinding::refcount_decremented_unsafe() {
    // The reference has not been set, we delay the destruction of the object until the GC does the job.
    if (!kt_binding) { return false; }

    // This function should only be called when we know the object is a RefCounted. We directly reinterpret the pointer to it
    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount == 1 && !kt_binding->is_ref_weak()) {
        // The JVM holds a reference to that object already, if the counter is equal to 1, it means the JVM is the only side with a reference to the object.
        // The reference is changed to a weak one so the JVM instance can be collected if it is not referenced anymore on the JVM side.
        jni::Env env {jni::Jvm::current_env()};
        kt_binding->swap_to_weak_unsafe(env);
    }
    // Return true when the counter is 0, it means that the JVM and the native side are no longer using the reference, so it can be safely deleted.
    return refcount == 0;
}

void KotlinBinding::set_kt_binding(jni::JObject j_object) {
    JVM_DEV_ASSERT(!kt_binding, "Trying to set a KtBinding on an already bound Object");

    jni::Env env {jni::Jvm::current_env()};
    kt_binding = memnew(KtBinding(env, j_object));

    if (!owner->is_ref_counted()) {
        return;
    }

    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount == 1 && !kt_binding->is_ref_weak()) {
        // The JVM holds a reference to that object already, if the counter is equal to 1, it means the JVM is the only side with a reference to the object.
        // The reference is changed to a weak one so the JVM instance can be collected if it is not referenced anymore on the JVM side.
        kt_binding->swap_to_weak_unsafe(env);
    }
    status = BindingStatus::BOUND;
}

void KotlinBinding::unset_kt_binding() {
    if(!kt_binding) {return;}
    status = BindingStatus::READY;
    memdelete(kt_binding);
    kt_binding = nullptr;
}

bool KotlinBinding::is_ready() {
    return status != BindingStatus::CREATED;
}

bool KotlinBinding::is_bound() {
    return status == BindingStatus::BOUND;
}

KotlinBinding::KotlinBinding() : kt_binding(nullptr), owner(nullptr) {}

KotlinBinding::~KotlinBinding() {
    owner = nullptr;
    if (kt_binding != nullptr) {
        memdelete(kt_binding);
        kt_binding = nullptr;
    }
}

void KotlinBinding::set_ready() {
    status = BindingStatus::READY;
}
