extends Node2D

var bunnies = []
var grav = 500
var bunny_texture = load("res://images/godot_bunny.png")
var screen_size

func _process(delta):
	screen_size = get_viewport_rect().size
	
	for bunny in bunnies:
		var pos = bunny[0].position
		var newPosition = bunny[1]
		
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
		
		bunny[0].position = pos
		bunny[1] = newPosition

func add_bunny():
	var bunny = Sprite.new()
	bunny.set_texture(bunny_texture)
	add_child(bunny)
	bunny.position = Vector2(screen_size.x / 2, screen_size.y / 2)
	bunnies.append([bunny, Vector2(randi() % 200 + 50, randi() % 200 + 50)])

func remove_bunny():
	if bunnies.size() == 0:
		return
	var bunny = bunnies[bunnies.size() - 1]
	remove_child(bunny[0])
	bunnies.pop_back()

func finish():
	emit_signal("benchmark_finished", bunnies.size())
