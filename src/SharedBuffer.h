#ifndef GODOT_JVM_SHAREDBUFFER_H
#define GODOT_JVM_SHAREDBUFFER_H


#include <core/variant.h>

struct SharedBuffer {
    uint8_t* ptr;
    uint8_t* position;
    int capacity;
};


#endif //GODOT_JVM_SHAREDBUFFER_H
