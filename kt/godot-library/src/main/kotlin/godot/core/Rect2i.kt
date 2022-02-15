package godot.core

import godot.util.RealT

class Rect2i(
    p_position: Vector2,
    p_size: Vector2
) {
    constructor(x: RealT, y: RealT, width: RealT, height: RealT) :
            this(Vector2(x, y), Vector2(width, height))

    //TODO/4.0: Implement
}