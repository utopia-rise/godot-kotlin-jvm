#ifndef GODOT_JVM_JAVA_ARCHIVE_H
#define GODOT_JVM_JAVA_ARCHIVE_H

#include <core/io/resource.h>

namespace godot {
    class JavaArchive : public Resource {
        GDCLASS(JavaArchive, Resource);

    protected:
        static void _bind_methods() {};
    };
} // namespace godot
#endif // GODOT_JVM_JAVA_ARCHIVE_H
