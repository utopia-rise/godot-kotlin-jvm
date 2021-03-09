#ifndef GODOT_JVM_REF_DB_H
#define GODOT_JVM_REF_DB_H

#include <cstdint>
#include "core/hash_map.h"
#include "core/reference.h"
#include "core/list.h"

class RefDB {
private:
    RefDB();
    ~RefDB() = default;

    struct RefIndex{
        uint64_t index = -1;
    };

    HashMap<uintptr_t, RefIndex> ref_map;
    List<RefIndex> freeIds;

public:
    uint64_t get_ref_id(Reference* ref);
    void remove_ref(Reference* ref);
    static RefDB& get_instance();
};

#endif //GODOT_JVM_REF_DB_H
