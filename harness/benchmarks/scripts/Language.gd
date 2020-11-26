extends Reference
class_name Language

var name: String
var extension: String
var directory: String
var warmup: bool


func _init(p_name: String, p_extension: String, p_directory: String, p_warmup: bool):
	self.name = p_name
	self.extension = p_extension
	self.directory = p_directory
	self.warmup = p_warmup
