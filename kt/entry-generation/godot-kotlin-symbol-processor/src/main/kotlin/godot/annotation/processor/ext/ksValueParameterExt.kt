package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSValueParameter
import godot.annotation.processor.Settings
import godot.entrygenerator.model.ValueParameter

internal fun KSValueParameter.mapToValueParameter(
    settings: Settings,
): ValueParameter {
    val resolvedType = type.resolve()
    return ValueParameter(
        requireNotNull(name?.asString()) {
            "name cannot be null for parameter"
        },
        requireNotNull(type.mapToType(settings)) {
            "type cannot be null for parameter"
        },
        resolvedType.arguments.map {
            requireNotNull(it.type) {
                "typeArgument's type of type $type cannot be null"
            }.mapToType(settings)
        }
    )
}
