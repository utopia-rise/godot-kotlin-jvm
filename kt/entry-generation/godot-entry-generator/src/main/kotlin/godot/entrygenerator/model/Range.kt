package godot.entrygenerator.model

import com.squareup.kotlinpoet.ClassName

enum class Range {
    NONE,
    OR_GREATER,
    OR_LESSER;

    internal fun asClassName(): ClassName {
        return ClassName("godot.registration.Range", name)
    }
}
