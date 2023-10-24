extends RefCounted
class_name Benchmark

var instance: Object
var name: String
var method: String
var lang: Language
var warmup: bool

func _init(script: Script, name: String, method: String, lang: Language):
	self.instance = script.new()
	self.name = name
	self.method = method
	self.lang = lang
	self.warmup = lang.warmup

func exec():
	self.instance.call(method)
