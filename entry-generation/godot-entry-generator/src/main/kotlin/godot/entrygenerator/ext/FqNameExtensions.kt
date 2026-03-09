package godot.entrygenerator.ext

import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.model.JvmType

fun String.fqNameIsJvmType(vararg jvmTypes: JvmType): Boolean = jvmTypes.any { jvmType ->
    EntryGenerator
        .jvmTypeFqNamesProvider(jvmType)
        .any { jvmTypeFqName -> jvmTypeFqName == this }
}

val JvmType.fqName: Set<String>
    get() = EntryGenerator.jvmTypeFqNamesProvider(this)
