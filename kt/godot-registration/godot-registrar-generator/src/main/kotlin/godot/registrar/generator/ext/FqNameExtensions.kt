package godot.registrar.generator.ext

import godot.registrar.generator.RegistrarGenerator
import godot.registration.model.JvmType

fun String.fqNameIsJvmType(vararg jvmTypes: JvmType): Boolean = jvmTypes.any { jvmType ->
    RegistrarGenerator
        .jvmTypeFqNamesProvider(jvmType)
        .any { jvmTypeFqName -> jvmTypeFqName == this }
}

val JvmType.fqName: Set<String>
    get() = RegistrarGenerator.jvmTypeFqNamesProvider(this)
