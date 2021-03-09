#include "ref_db.h"

uint64_t RefDB::get_ref_id(Reference* ref) {
    static uint64_t id = 0;
    auto ptr = reinterpret_cast<uintptr_t>(ref);
    RefIndex index = ref_map[ptr];
    if (index.index == -1) {
        index = freeIds.back()->get();
        freeIds.pop_back();
        if(index.index == -1){
            index = RefIndex{id};
            id++;
        }
        ref_map[ptr] = index;
        ref->reference();
    }
    return index.index;
}

void RefDB::remove_ref(Reference* ref) {
    auto ptr = reinterpret_cast<uintptr_t>(ref);
    RefIndex index = ref_map[ptr];

    freeIds.push_back(index);
    ref_map.erase(ptr);

    if (ref->unreference()) {
        memdelete(ref);
    }
}

RefDB &RefDB::get_instance() {
    static RefDB instance;
    return instance;
}

RefDB::RefDB() : ref_map(), freeIds() {

}