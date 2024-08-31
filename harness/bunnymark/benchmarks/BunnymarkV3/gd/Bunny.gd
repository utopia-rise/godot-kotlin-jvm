class_name Bunny
extends Sprite2D


var speed := Vector2()
var grav := 500
var screen_size := Vector2()


# Called when the node enters the scene tree for the first time.
func _ready():
    pass # Replace with function body.


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta):
    screen_size = get_viewport_rect().size
    var pos: Vector2 = self.position
    var speeds: Vector2 = self.speed
        
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

    self.speed = speed
    self.position = pos
