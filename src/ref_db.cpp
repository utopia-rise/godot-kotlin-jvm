#include "ref_db.h"
#include "logging.h"

uint64_t RefDB::get_ref_id(Reference* ref) {
    static uint64_t id = 0;
    auto ptr = reinterpret_cast<uintptr_t>(ref);
    auto lock = MutexLock(mut);

    RefIndex* index_ptr = ref_map.getptr(ptr);
    if (!index_ptr) {
        RefIndex index;
        if (freeIds.empty()) {
            index = RefIndex{id};
            id++;
        } else {
            index = freeIds.back()->get();
            freeIds.pop_back();
        }
        ref_map[ptr] = index;
        ref->reference();
        return index.index;
    } else {
        return index_ptr->index;
    }

}

void RefDB::remove_ref(Reference* ref) {
    auto ptr = reinterpret_cast<uintptr_t>(ref);

    {
        auto lock = MutexLock(mut);
        RefIndex index = ref_map[ptr];

        freeIds.push_back(index);
        ref_map.erase(ptr);
    }

    if (ref->unreference()) {
        memdelete(ref);
    }
}

RefDB &RefDB::get_instance() {
    static RefDB instance;
    return instance;
}

RefDB::RefDB() : ref_map(), freeIds(), mut(Mutex::create(false)) {

}