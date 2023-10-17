package godot.benchmark.bunnymark

import godot.core.*
import godot.*
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterSignal
import godot.signals.signal

@RegisterClass("BunnymarkV2")
class BunnymarkV2 : Node2D() {

	@RegisterSignal
	val benchmarkFinished by signal<Int>("bunnyCount")

	private val gravity = 500
	private val bunnySpeeds = mutableListOf<Vector2>()
	private val label = Label()
	private val bunnies = Node2D()
	private val bunnyTexture = ResourceLoader.load("res://images/godot_bunny.png") as Texture2D
	private val randomNumberGenerator = RandomNumberGenerator()

	private lateinit var screenSize: Vector2

	@RegisterFunction
	override fun _ready() {
		randomNumberGenerator.randomize()
		addChild(bunnies)
		label.setPosition(Vector2(0, 20))
		addChild(label)
	}

	@RegisterFunction
	override fun _process(delta: Double) {
		screenSize = getViewportRect().size
		label.text = "Bunnies: " + bunnies.getChildCount().toString()

		val bunnyChildren = bunnies.getChildren()
		for (i in 0 until bunnyChildren.size) {
			val bunny = bunnyChildren[i] as Sprite2D
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
	fun addBunny() {
		val bunny = Sprite2D()
		bunny.texture = bunnyTexture
		bunnies.addChild(bunny)
		bunny.position = Vector2(screenSize.x / 2, screenSize.y / 2)
		bunnySpeeds.add(
			Vector2(randomNumberGenerator.randi() % 200 + 50, randomNumberGenerator.randi() % 200 + 50)
		)
	}

	@RegisterFunction
	fun removeBunny() {
		val childCount = bunnies.getChildCount()
		if (childCount == 0) return
		bunnies
			.getChild(childCount - 1)
			?.let { bunny ->
				bunnies.removeChild(bunny)
                bunny.queueFree()
			}
		bunnySpeeds.removeAt(childCount.toInt() - 1)
	}

	@RegisterFunction
	fun finish() {
        benchmarkFinished.emit(bunnySpeeds.size)
	}
}
