#ifndef GODOT_JVM_KT_METHOD_H
#define GODOT_JVM_KT_METHOD_H


#include <core/object.h>
#include "kt_member.h"

class KtMethod : KtMember {
private:
    StringName name;
    MethodInfo methodInfo;

    bool methodInfoFetched;
public:
    KtMethod() = delete;
    explicit KtMethod(StringName p_name);
    ~KtMethod() = default;

    StringName get_name() const override { return name; }

    const MethodInfo& get_method_info();
};


#endif //GODOT_JVM_KT_METHOD_H
