package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSValueParameter
import godot.entrygenerator.model.ValueParameter
import java.io.File

internal fun KSValueParameter.mapToValueParameter(
    isFqNameRegistrationEnabled: Boolean,
    classNamePrefix: String?,
    projectBaseDir: File,
    ): ValueParameter {
    val resolvedType = type.resolve()
    return ValueParameter(
        requireNotNull(name?.asString()) {
            "name cannot be null for parameter"
        },
        requireNotNull(type.mapToType(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir)) {
            "type cannot be null for parameter"
        },
        resolvedType.arguments.map {
            requireNotNull(it.type) {
                "typeArgument's type of type $type cannot be null"
            }.mapToType(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir)
        }
    )
}
