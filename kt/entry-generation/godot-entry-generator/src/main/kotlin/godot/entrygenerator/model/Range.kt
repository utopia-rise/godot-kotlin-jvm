package godot.entrygenerator.model

import com.squareup.kotlinpoet.ClassName
import godot.tools.common.names.Annotation

enum class Range {
    NONE,
    OR_GREATER,
    OR_LESSER;

    internal fun asClassName(): ClassName {
        return Annotation.range.nestedClass(name)
    }
}
