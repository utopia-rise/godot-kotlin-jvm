extends Node3D


# Called when the node enters the scene tree for the first time.
func _ready():
	print("MESSAGES:")
	print($HierarchicalLibrary.provide_greeting())
	print($FlattenedLibrary.provide_greeting())
	print($FqNameLibrary.provide_greeting())
