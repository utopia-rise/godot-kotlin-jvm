extends Reference
class_name Benchmark

var instance: Object
var name: String
var method: String
var lang: Language
var warmup: bool

func _init(instance: Object, name: String, method: String, lang: Language):
	self.instance = instance
	self.name = name
	self.method = method
	self.lang = lang

func exec():
	self.instance.call(method)
