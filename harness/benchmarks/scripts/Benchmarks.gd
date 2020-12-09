extends Reference
class_name Benchmarks

static func create(langs: Array, name: String) -> Array:
	var benchmarks =  []
	var scripts: Array = []
	var methods: Array = []
	
	#Loading the script from every language and setting up the list of methods.
	for lang in langs:
		var path = __resolve_script(lang, name)
		print("Loading Script: " + path)
		var cls: Object = load(path)
		
		if cls == null:
			print("Not able to load %s, script is going to be ignored." % path)
			continue
			
		var method_dict_list = cls.get_script_method_list()
		var method_list: Array = []
		
		
		#[Script Instance, List of method names, Language instance]
		scripts.append([cls.new(), method_list, lang])
		
		for method_dict in method_dict_list:
			var method_name = method_dict["name"]
			
			#check the method name stats with "benchmark_" so we don't test methods like "init"
			if method_name.begins_with("benchmark_"):
				method_list.append(method_name)
	
				#If not already in the global method list, we add it.
				if !methods.has(method_name):
					methods.append(method_name)
				
	
	methods.sort()
	print("Tests to run:")
	##Loop over the methods, then the scripts so the results of the different languages for a same script are print next to each other.
	for method_name in methods:
		printt("	" + method_name)
		for script in scripts:
				if script[1].has(method_name):
					var benchmark_name = "%s::%s" % [name, method_name.replace("benchmark_", "")]
					var benchmark = Benchmark.new(script[0], benchmark_name, method_name, script[2])
					benchmarks.append(benchmark)
	return benchmarks


static func __resolve_script(lang: Language, script: String) -> String:
	var path = lang.directory + script + "." + lang.extension
	return path
