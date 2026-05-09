package godot.entrygenerator.model

import com.squareup.kotlinpoet.ClassName
import godot.tools.common.names.Registration

enum class Range {
    NONE,
    OR_GREATER,
    OR_LESSER;

    internal fun asClassName(): ClassName {
        return Registration.range.nestedClass(name)
    }
}
