package godot.benchmark.bunnymark

import godot.core.*
import godot.*
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass("BunnymarkV2")
class BunnymarkV2 : Node2D() {


    private var gravity = 500
    private var bunnySpeeds = ArrayList<Vector2>()
    private var label = Label()
    private var bunnies = Node2D()
    private lateinit var bunnyTexture: Texture
    private val randomNumberGenerator = RandomNumberGenerator()

    lateinit var screenSize: Vector2

    @RegisterFunction
    override fun _ready() {
        println("NOTICE MEE SENPAIII!")
        bunnyTexture = ResourceLoader.load("res://images/godot_bunny.png") as Texture
        println("NOTICE MEE SENPAIII!")
        addChild(bunnies)
        label.setPosition(Vector2(0, 20))
        addChild(label)
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        screenSize = getViewportRect().size
        label.text = "Bunnies: " + bunnies.getChildCount().toString()

        val bunny_children = bunnies.getChildren()
        for (i in 0 until bunny_children.size) {
            val bunny = bunny_children[i]!! as Sprite
            val pos = bunny.position
            val speed = bunnySpeeds[i]

            pos.x += speed.x * delta
            pos.y += speed.y * delta

            speed.y += gravity * delta

            if (pos.x > screenSize.x) {
                speed.x *= -1
                pos.x = screenSize.x
            }

            if (pos.x < 0) {
                speed.x *= -1.0
                pos.x = 0.0
            }

            if (pos.y > screenSize.y) {
                pos.y = screenSize.y
                if (randomNumberGenerator.randf() > 0.5) {
                    speed.y = -(randomNumberGenerator.randi() % 1100 + 50).toDouble()
                } else {
                    speed.y *= -0.85
                }
            }

            if (pos.y < 0) {
                speed.y = 0.0
                pos.y = 0.0
            }

            bunny.position = pos
            bunnySpeeds[i] = speed
        }
    }

    @RegisterFunction
    fun add_bunny() {
        val bunny = Sprite()
        bunny.texture = bunnyTexture
        bunnies.addChild(bunny)
        bunny.position = Vector2(screenSize.x / 2, screenSize.y / 2)
        bunnySpeeds.add(
            Vector2(randomNumberGenerator.randi() % 200 + 50, randomNumberGenerator.randi() % 200 + 50)
        )
    }

    @RegisterFunction
    fun remove_bunny() {
        val child_count = bunnies.getChildCount()
        if (child_count == 0L) return
        bunnies
            .getChild(child_count - 1)
            ?.let { bunny ->
                bunnies.removeChild(bunny)
            }
        bunnySpeeds.removeAt(child_count.toInt() - 1)
    }

    @RegisterFunction
    fun finish() {
        emitSignal("benchmark_finished", bunnySpeeds.size)
    }
}
