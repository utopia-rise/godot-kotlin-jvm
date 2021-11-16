#include "ref_db.h"
#include "logging.h"

uint64_t RefDB::get_ref_id(Reference* ref) {
    static uint64_t id = 0;
    RefIndex index;

    {
        auto ptr{reinterpret_cast<uint64_t>(ref)};
        MutexLock lock{mut};
        RefIndex* index_ptr{ref_map.getptr(ptr)};
        if (index_ptr) {
            index_ptr->counter++;
            return index_ptr->index;
        }

        if (freeIds.empty()) {
            index = RefIndex{id};
            id++;
        } else {
            index = freeIds.back()->get();
            freeIds.pop_back();
        }
        index.counter = 1;
        ref_map[ptr] = index;
    }

    if (ref->is_referenced()) {
        ref->reference();
    } else {
        ref->init_ref();
    }
    return index.index;
}

void RefDB::remove_ref(Reference* ref, uint32_t counter) {
    {
        auto ptr{reinterpret_cast<uint64_t>(ref)};
        MutexLock lock{mut};
        RefIndex* index_ptr{ref_map.getptr(ptr)};
        if (!index_ptr) {
            return;
        }
        index_ptr->counter -= counter;
        if (index_ptr->counter > 0) {
            return;
        }
#ifdef DEBUG_ENABLED
        JVM_ERR_FAIL_COND_MSG(index_ptr->counter < 0,
                              vformat("A reference %s has its JVM counter set below 0", ref->to_string()));
        index_ptr->counter = 0;
#endif
        freeIds.push_back(*index_ptr);
        ref_map.erase(ptr);
    }

    if (ref->unreference()) {
        memdelete(ref);
    }
}

RefDB& RefDB::get_instance() {
    static RefDB instance;
    return instance;
}

RefDB::RefDB() : ref_map(), freeIds(), mut() {

}