extends Node2D

var bunny_texture := load("res://images/godot_bunny.png") as Texture2D
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

func add_bunny():
    var bunny: Bunny = Bunny.new()
    bunny.set_texture(bunny_texture)
    bunny.speed = Vector2(randi() % 200 + 50, randi() % 200 + 50)
    bunnies.add_child(bunny)
    bunny.position = Vector2(screen_size.x / 2, screen_size.y / 2)

func remove_bunny():
    var child_count: int = bunnies.get_child_count()
    if child_count == 0:
        return
    var bunny: Bunny = bunnies.get_child(child_count - 1)
    bunnies.remove_child(bunny)
    bunny.queue_free()

func finish():
    emit_signal("benchmark_finished", bunnies.get_child_count())
