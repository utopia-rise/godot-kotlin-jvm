extends Node2D

var bunnies: Array[Array] = []
var bunny_texture = load("res://images/godot_bunny.png") as Texture2D
var grav := 500
var screen_size := Vector2()

func _draw():
	for bunny in bunnies:
		draw_texture(bunny_texture, bunny[0] as Vector2)

func _process(delta):
	screen_size = get_viewport_rect().size
	
	for bunny in bunnies:
		var pos: Vector2 = bunny[0]
		var newPosition: Vector2 = bunny[1]
		
		pos.x += newPosition.x * delta
		pos.y += newPosition.y * delta
	
		newPosition.y += grav * delta
	
		if pos.x > screen_size.x:
			newPosition.x *= -1
			pos.x = screen_size.x
		
		if pos.x < 0:
			newPosition.x *= -1
			pos.x = 0
			
		if pos.y > screen_size.y:
			pos.y = screen_size.y
			if randf() > 0.5:
				newPosition.y = -(randi() % 1100 + 50)
			else:
				newPosition.y *= -0.85
			
		if pos.y < 0:
			newPosition.y = 0
			pos.y = 0
		
		bunny[0] = pos
		bunny[1] = newPosition
	queue_redraw()

func add_bunny():
	bunnies.append([Vector2(screen_size.x / 2, screen_size.y / 2), Vector2(randi() % 200 + 50, randi() % 200 + 50)])

func remove_bunny():
	if bunnies.size() == 0:
		return

	bunnies.pop_back()

func finish():
	emit_signal("benchmark_finished", bunnies.size())
