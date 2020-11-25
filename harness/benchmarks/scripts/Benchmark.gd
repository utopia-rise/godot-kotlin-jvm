var instance
var name
var method
var lang
var warmup

func _init(instance, name, method, lang, warmup):
    self.instance = instance
    self.name = name
    self.method = method
    self.lang = lang
    self.warmup = warmup

func exec():
    self.instance.call(method)

func _to_string():
    return "[name=%s, lang=%s]" % [self.name, self.lang]