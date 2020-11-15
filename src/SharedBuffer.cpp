#include "SharedBuffer.h"


SharedBuffer::SharedBuffer(uint8_t *p_ptr, int p_position, int p_capacity) :
    ptr(p_ptr), position(p_position), capacity(p_capacity) {

}

uint8_t* SharedBuffer::get_cursor() {
    return ptr + position;
}

void SharedBuffer::increment_position(uint32_t increment) {
    position += increment;
    if (position >= capacity) position -= capacity;
}

void SharedBuffer::decrement_position(uint32_t decrement) {
    position -= decrement;
    if (position < 0) position += capacity;
}
