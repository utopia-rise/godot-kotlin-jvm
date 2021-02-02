package godot.benchmark.bunnymark.v3

import godot.RandomNumberGenerator
import godot.Sprite
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Vector2

@RegisterClass
class Bunny : Sprite() {

    var speed = Vector2()

    private var grav = 500
    private lateinit var screenSize: Vector2
    private val randomNumberGenerator = RandomNumberGenerator()

    @RegisterFunction
    override fun _process(delta: Double) {
        screenSize = getViewportRect().size
        val pos = position
        val sp = speed

        pos.x += sp.x * delta
        pos.y += sp.y * delta

        sp.y += grav * delta

        if (pos.x > screenSize.x) {
            sp.x *= -1
            pos.x = screenSize.x
        }

        if (pos.x < 0) {
            sp.x *= -1
            pos.x = 0.0
        }

        if (pos.y > screenSize.y) {
            pos.y = screenSize.y
            if (randomNumberGenerator.randf() > 0.5) {
                sp.y = -(randomNumberGenerator.randi() % 1100 + 50).toDouble()
            } else {
                sp.y *= -0.85
            }
        }

        if (pos.y < 0) {
            sp.y = 0.0
            pos.y = 0.0
        }

        position = pos
        speed = sp
    }
}