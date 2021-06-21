package godot.entrygenerator.model

import com.squareup.kotlinpoet.ClassName

enum class Range {
    NONE;

    internal fun asClassName(): ClassName {
        return ClassName("godot.registration.Range", name)
    }
}
