package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSValueParameter
import godot.entrygenerator.model.ValueParameter

fun KSValueParameter.mapToValueParameter(): ValueParameter {
    val resolvedType = type.resolve()
    return ValueParameter(
        requireNotNull(name?.asString()) {
            "name cannot be null for parameter"
        },
        requireNotNull(type.mapToType()) {
            "type cannot be null for parameter"
        },
        resolvedType.arguments.map {
            requireNotNull(it.type) {
                "typeArgument's type of type $type cannot be null"
            }.mapToType()
        }
    )
}
