extends MainLoop
var iterations: int = 1000
var warmups: int = 3000
var commit: String

var classes = [
	"Simple"
]

var languages = [
	Language.new("GDScript", "gd", "res://gd/", false),
	Language.new("Typed GDScript", "gd", "res://typed_gd/", false),
	Language.new("Kotlin", "kt", "res://src/main/kotlin/godot/benchmark/", true),
	Language.new("C# Mono", "cs", "res://csharp/", true)
]

func _init():
	var args: Dictionary = __parse_args()
	print("Parsed arguments: %s" % str(args))

	if args.has("iterations"):
		iterations = args.iterations
	if args.has("warmups"):
		warmups = args.warmup
	if args.has("commit"):
		commit = args.commit
	else:
		commit = str(OS.get_datetime().hash())
			
	var report = Report.new(commit)
	
	for cls in classes:
		print("Starting class test: %s" % cls)
		var benchmarks: Array = Benchmarks.create(languages, cls)
		var test_name: String = ""
		for benchmark in benchmarks:
			var new_test_name = benchmark.name
			if test_name != new_test_name:
				test_name = new_test_name
				print("")
				print("Running benchmark (unit: op/s): %s " % test_name)
			__run_benchmark(benchmark, report)
	print("Benchmark tests are over!")
	__save_report(report)


func __run_benchmark(benchmark: Benchmark, report: Report):
	var stats = Stats.new()
	if benchmark.warmup:	
		for warmup in range(warmups):
			__do_run(warmup, benchmark, stats, true)
	for iteration in range(iterations):
		__do_run(iteration, benchmark, stats, false)
	var results: Array = stats.get_result_array()
	prints("%s:" % benchmark.lang.name, results[0], results[1], results[2], results[3], results[4], results[5])
	report.add(benchmark, stats.get_results())


func __do_run(iteration: int, benchmark: Benchmark, stats: Stats, is_warmup: bool):
	var start: float = OS.get_ticks_usec()
	##Loop is costly in GDScropt so to avoid measure the execution time of it, we manually execute the benchmark 30 times.
	##Godot doesnt' measure time with enough precision so we have to execute the benchmark multiple times to get more than a 1 micro second.
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	benchmark.exec()
	var duration: float = OS.get_ticks_usec() - start
	if not is_warmup:
		stats.add(duration/30)
		#print("[iteration=%d,run=%d] %dus" % [iteration, run, duration])

func __save_report(report: Report):
	var f = File.new()
	var path = "res://build/benchmark-results.json"
	print("Writing results at: %s" % path)
	f.open(path, File.WRITE_READ)
	f.store_string(report.to_json())
	f.close()

func __parse_args() -> Dictionary:
	var arguments = {}
	for argument in OS.get_cmdline_args():
		if argument.find("=") > -1:
			var key_value = argument.split("=")
			arguments[key_value[0].lstrip("--")] = key_value[1]
	return arguments
