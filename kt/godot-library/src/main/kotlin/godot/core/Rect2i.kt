package godot.core

class Rect2i(
    p_position: Vector2i,
    p_size: Vector2i
) {
    constructor(x: Int, y: Int, width: Int, height: Int) :
            this(Vector2i(x, y), Vector2i(width, height))

    //TODO/4.0: Implement
}