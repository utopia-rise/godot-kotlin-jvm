extends Node2D

var bunnies: Array[Array] = []
var bunny_texture = load("res://images/godot_bunny.png") as Texture2D
var grav := 500
var screen_size := Vector2()

func _process(delta):
	screen_size = get_viewport_rect().size
	
	for bunny in bunnies:
		var pos: Vector2 = (bunny[0] as Sprite2D).position
		var speed: Vector2 = bunny[1]
		
		pos.x += speed.x * delta
		pos.y += speed.y * delta
	
		speed.y += grav * delta
	
		if pos.x > screen_size.x:
			speed.x *= -1
			pos.x = screen_size.x
		
		if pos.x < 0:
			speed.x *= -1
			pos.x = 0
			
		if pos.y > screen_size.y:
			pos.y = screen_size.y
			if randf() > 0.5:
				speed.y = -(randi() % 1100 + 50)
			else:
				speed.y *= -0.85
			
		if pos.y < 0:
			speed.y = 0
			pos.y = 0
		
		bunny[0].position = pos
		bunny[1] = speed

func add_bunny():
	var bunny := Sprite2D.new()
	bunny.set_texture(bunny_texture)
	add_child(bunny)
	bunny.position = Vector2(screen_size.x / 2, screen_size.y / 2)
	bunnies.append([bunny, Vector2(randi() % 200 + 50, randi() % 200 + 50)])

func remove_bunny():
	if bunnies.size() == 0:
		return
	var bunny: Array = bunnies[bunnies.size() - 1]
	remove_child(bunny[0] as Sprite2D)
	bunnies.pop_back()
	(bunny[0] as Sprite2D).queue_free()

func finish():
	emit_signal("benchmark_finished", bunnies.size())
