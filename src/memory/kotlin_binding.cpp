#include "kotlin_binding.h"

void KotlinBinding::refcount_incremented_unsafe() {
    //The reference has not been set yet.
    if(!kt_object) { return;}

    //This function should only be called when we know the object is a RefCounter. We directly reinterpret the point to it
    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount > 1 && kt_object->is_ref_weak()) {
        //The JVM holds a reference to that object already, if the counter is greater than 1, it means the native side holds a reference as well.
        //The reference is changed to a strong one so the JVM instance is not collected if it is not referenced anymore on the JVM side.
        kt_object->swap_to_strong_unsafe();
    }
}

bool KotlinBinding::refcount_decremented_unsafe() {
    //The reference has not been set, we delay the destruction of the object until the GC does the job.
    if(!kt_object) { return false;}

    //This function should only be called when we know the object is a RefCounter. We directly reinterpret the point to it
    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount == 1 && !kt_object->is_ref_weak()) {
        //The JVM holds a reference to that object already, if the counter is equal to 1, it means the JVM is the only side with a reference to the object.
        //The reference is changed to a weak one so the JVM instance can be collected if it is not referenced anymore on the JVM side.
        kt_object->swap_to_weak_unsafe();
    }
    //Return true when the counter is 0, it means that the JVM and the native side are no longer using the reference, so it can be safely deleted.
    return refcount == 0;
}

void KotlinBinding::set_kt_object(KtObject* p_kt_object) {
    if(!owner->is_ref_counted()) { return; }
    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount == 1 && !kt_object->is_ref_weak()) {
        //The JVM holds a reference to that object already, if the counter is equal to 1, it means the JVM is the only side with a reference to the object.
        //The reference is changed to a weak one so the JVM instance can be collected if it is not referenced anymore on the JVM side.
        kt_object->swap_to_weak_unsafe();
    }

    kt_object = p_kt_object;
}

bool KotlinBinding::is_ready() {
    return kt_object != nullptr;
}

KotlinBinding::KotlinBinding() : kt_object(nullptr), owner(nullptr) {

}

KotlinBinding::~KotlinBinding() {
    delete kt_object;
}