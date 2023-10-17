extends Node2D

var grav := 500
var bunny_texture := load("res://images/godot_bunny.png") as Texture2D
var bunny_speeds := []
var label := Label.new()
var bunnies := Node2D.new()
var screen_size := Vector2()

func _ready():
	add_child(bunnies)

	label.position = Vector2(0, 20)
	add_child(label)

func _process(delta):
	screen_size = get_viewport_rect().size
	label.text = "Bunnies: " + str(bunnies.get_child_count())
	
	var bunny_children := bunnies.get_children()
	for i in range(0, bunny_children.size()):
		var bunny: Sprite2D = bunny_children[i]
		var pos: Vector2 = bunny.position
		var speed: Vector2 = bunny_speeds[i]
		
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
		
		bunny.position = pos
		bunny_speeds[i] = speed

func add_bunny():
	var bunny := Sprite2D.new()
	bunny.set_texture(bunny_texture)
	bunnies.add_child(bunny)
	bunny.position = Vector2(screen_size.x / 2, screen_size.y / 2)
	bunny_speeds.push_back(Vector2(randi() % 200 + 50, randi() % 200 + 50))

func remove_bunny():
	var child_count := bunnies.get_child_count()
	if child_count == 0:
		return
	var bunny: Sprite2D = bunnies.get_child(child_count - 1)
	bunny_speeds.pop_back()
	bunnies.remove_child(bunny)
	bunny.queue_free()

func finish():
	emit_signal("benchmark_finished", bunnies.get_child_count())
