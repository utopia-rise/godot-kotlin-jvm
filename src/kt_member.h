#ifndef GODOT_JVM_KT_MEMBER_H
#define GODOT_JVM_KT_MEMBER_H


#include <core/string_name.h>

class KtMember {
public:
    virtual StringName get_name() const = 0;
};


#endif //GODOT_JVM_KT_MEMBER_H
