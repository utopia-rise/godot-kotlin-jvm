extends MainLoop

var Benchmarks = load("res://scripts/Benchmarks.gd")
var Stats = load("res://scripts/Stats.gd")
var Report = load("res://scripts/Report.gd")

var classes = [
	"Simple"
]
var languages = [
	["gd", false],
	["kt", true],
	["csharp", true]
]

func _init():
	var args = __parse_args()
	print("Parsed arguments: %s" % str(args))
	var report = Report.new(args.commit)
	var factory = Benchmarks.new()
	for cls in classes:
		for lang in languages:
			for benchmark in factory.create(lang[0], lang[1], cls):
				__run_benchmark(benchmark, report)
	__save_report(report)


func __run_benchmark(benchmark, report, iterations=1000, warmups=3000):
	var stats = Stats.new()
	print("Running benchmark: %s" % str(benchmark))
	if benchmark.warmup:
		for warmup in range(warmups):
			__do_run(warmup, benchmark, stats, true)
	for iteration in range(iterations):
		__do_run(iteration, benchmark, stats, false)
	print("Results: %s" % str(stats))
	report.add(benchmark, stats.get_results())


func __do_run(iteration, benchmark, stats, is_warmup):
    var start: float = OS.get_ticks_usec()
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

func __save_report(report):
	var f = File.new()
	f.open("res://build/benchmark-results.json", File.WRITE_READ)
	f.store_string(report.to_json())
	f.close()

func __parse_args():
	var arguments = {}
	for argument in OS.get_cmdline_args():
		if argument.find("=") > -1:
			var key_value = argument.split("=")
			arguments[key_value[0].lstrip("--")] = key_value[1]
	return arguments
