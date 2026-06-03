package godot.registrar.generator.generator.hintstring

import godot.registration.model.hint.property.EnumValue

/**
 * Renders enum constants into a Godot hint string: `"A,B"` for regular enums, or `"A:2,B:8"` when the user
 * supplied explicit values through `GodotEnum`. For a `FLAGS` hint the explicit value is the bit mask; for
 * an `ENUM` hint it is the selected integer.
 */
internal fun List<EnumValue>.toGodotHintString(): String =
    joinToString(",") { enumValue ->
        if (enumValue.value != null) "${enumValue.name}:${enumValue.value}" else enumValue.name
    }
