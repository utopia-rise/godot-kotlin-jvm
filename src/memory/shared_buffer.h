#ifndef GODOT_JVM_SHARED_BUFFER_H
#define GODOT_JVM_SHARED_BUFFER_H

#include "core/variant/variant.h"

class SharedBuffer {
private:
    uint8_t* ptr;
    int position;
    int capacity;

public:
    SharedBuffer();

    SharedBuffer(uint8_t* p_ptr, int p_position, int p_capacity);

    ~SharedBuffer() = default;

    _FORCE_INLINE_ uint8_t* get_cursor() const {
        return ptr + position;
    }

    _FORCE_INLINE_ void increment_position(uint32_t increment) {
        position += increment;
    }

    _FORCE_INLINE_ void decrement_position(uint32_t decrement) {
        position -= decrement;
    }

    _FORCE_INLINE_ bool is_init() const {
        return ptr != nullptr;
    }

    _FORCE_INLINE_ void rewind() {
        position = 0;
    }
};

#endif //GODOT_JVM_SHARED_BUFFER_H
