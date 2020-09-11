var data = {}
var commit

func _init(commit):
    self.commit = commit

func add(benchmark, results):
    var name = benchmark.name
    var lang = benchmark.lang
    if not data.has(name):
        data[name] = {}

    data[name][lang] =  results

func to_json():
    var json = {}
    json["commit"] = self.commit
    json["data"]= self.data
    return JSON.print(json)
