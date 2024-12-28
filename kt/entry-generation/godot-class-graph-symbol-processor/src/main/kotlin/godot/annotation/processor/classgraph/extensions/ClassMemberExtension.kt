package godot.annotation.processor.classgraph.extensions

import io.github.classgraph.ClassMemberInfo

val ClassMemberInfo.fqdn: String
    get() = "${classInfo.name}\$$sanitizedName"

val ClassMemberInfo.sanitizedName: String
    get() = name.removeSuffix("\$delegate")
