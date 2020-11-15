#ifndef GODOT_JVM_SHAREDBUFFER_H
#define GODOT_JVM_SHAREDBUFFER_H


#include <core/variant.h>

class SharedBuffer {
private:
    uint8_t* ptr;
    int position;
    int capacity;
public:
    SharedBuffer(uint8_t *p_ptr, int p_position, int p_capacity);
    ~SharedBuffer() = default;

    _FORCE_INLINE_ uint8_t* get_cursor();
    _FORCE_INLINE_ void increment_position(uint32_t increment);
    _FORCE_INLINE_ void decrement_position(uint32_t decrement);
};


#endif //GODOT_JVM_SHAREDBUFFER_H
