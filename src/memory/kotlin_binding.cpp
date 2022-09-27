#include "kotlin_binding.h"

void KotlinBinding::refcount_incremented_unsafe() {
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
    //This function should only be called when we know the object is a RefCounter. We directly reinterpret the point to it
    RefCounted* ref = reinterpret_cast<RefCounted*>(owner);
    int refcount = ref->get_reference_count();

    if (refcount == 1 && !kt_object->is_ref_weak()) {
        //The JVM holds a reference to that object already, if the counter is equal to 1, it means the JVM is the only side with a reference to the object.
        //The reference is changed to a weak one so the JVM instance can be collected if it is not referenced anymore on the JVM side.
        kt_object->swap_to_weak_unsafe();
    }
    if (refcount == 0) {
        is_setup = false;
    }
    //Return true when the counter is 0, it means that the JVM and the native side are no longer using the reference, so it can be safely deleted.
    return refcount == 0;
}

KotlinBinding::KotlinBinding() :
        owner{nullptr}, kt_object{nullptr}, is_setup{false};

KotlinBinding::~KotlinBinding() {
    delete kt_object;
}