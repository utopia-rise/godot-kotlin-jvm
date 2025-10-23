package godot.entrygenerator.model

import com.squareup.kotlinpoet.ClassName
import godot.tools.common.constants.GodotJvmTypes
import godot.tools.common.constants.godotRegistrationPackage

enum class Range {
    NONE,
    OR_GREATER,
    OR_LESSER;

    internal fun asClassName(): ClassName {
        return ClassName("$godotRegistrationPackage.${GodotJvmTypes.Annotations.range}", name)
    }
}
