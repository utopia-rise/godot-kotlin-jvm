package godot.annotation.processor.classgraph.extensions

import io.github.classgraph.ClassMemberInfo

const val DELEGATE_SUFFIX = "\$delegate"

val ClassMemberInfo.fqdn: String
    get() = "${classInfo.name}\$$sanitizedName"

val ClassMemberInfo.sanitizedName: String
    get() = name.removeSuffix(DELEGATE_SUFFIX)
