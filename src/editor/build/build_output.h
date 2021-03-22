
#ifndef GODOT_JVM_BUILD_OUTPUT_H
#define GODOT_JVM_BUILD_OUTPUT_H

#include <core/error_list.h>
#include <core/ustring.h>

struct BuildOutput {
    Error result = Error::OK;
    String output{};
};

#endif //GODOT_JVM_BUILD_OUTPUT_H
