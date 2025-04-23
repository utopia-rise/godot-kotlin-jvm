#ifndef GODOT_JVM_JAVA_ARCHIVE_H
#define GODOT_JVM_JAVA_ARCHIVE_H

#include <core/io/resource.h>

class JavaArchive : public Resource {
    GDCLASS(JavaArchive, Resource);

protected:
    static void _bind_methods() {};
};

#endif// GODOT_JVM_JAVA_ARCHIVE_H
