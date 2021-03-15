#include "ref_db.h"

uint64_t RefDB::get_ref_id(Reference* ref) {
    static uint64_t id = 0;
    uintptr_t ptr = reinterpret_cast<uintptr_t>(ref);
    RefIndex index = ref_map[ptr];
    if (index.index == -1) {
        ref_map[ptr] = RefIndex{id};
        ref->reference();
        return id++;
    } else {
        return index.index;
    }
}

void RefDB::remove_ref(Reference* ref) {
    ref_map.erase(reinterpret_cast<uintptr_t>(ref));
    if (ref->unreference()) {
        memdelete(ref);
    }
}

RefDB &RefDB::get_instance() {
    static RefDB instance;
    return instance;
}

RefDB::RefDB() : ref_map{} {

}