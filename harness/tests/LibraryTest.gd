extends Node3D


# Called when the node enters the scene tree for the first time.
func _ready():
	print($NodeWithScriptFromLibrary.provide_greeting())
