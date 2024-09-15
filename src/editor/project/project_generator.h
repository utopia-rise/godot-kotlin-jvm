
#ifdef TOOLS_ENABLED

#ifndef GODOT_JVM_PROJECTGENERATOR_H
#define GODOT_JVM_PROJECTGENERATOR_H

#include "logging.h"
#include "templates.h"

#include <core/core_bind.h>

class ProjectGenerator {
public:
    static void generate_jvm_files(bool erase_existing);
};

#endif// GODOT_JVM_PROJECTGENERATOR_H

#endif// TOOLS_ENABLED
