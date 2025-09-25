package godot.core.bridge

import godot.core.GodotEnum

// TODO: Originally in Resource but can't include this class in core without including a large part of Godot API. Need to reconsider how to split the API for future custom API generation
enum class DeepDuplicateMode(
    override val value: Long,
) : GodotEnum {
    /**
     * No subresorces at all are duplicated. This is useful even in a deep duplication to have all
     * the arrays and dictionaries duplicated but still pointing to the original resources.
     */
    NONE(0),

    /**
     * Only subresources without a path or with a scene-local path will be duplicated.
     */
    INTERNAL(1),

    /**
     * Every subresource found will be duplicated, even if it has a non-local path. In other words,
     * even potentially big resources stored separately will be duplicated.
     */
    ALL(2)
}
