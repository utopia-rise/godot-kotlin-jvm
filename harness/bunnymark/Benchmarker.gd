extends Control

var fps_update_interval = 1.0
var elapsed_time = 0.0
var fps_label = null
var benchmark_container = null
var benchmark_node = null
var output_path = "user://benchmark_results.json"
var arg_bench = "--bench="
var arg_lang = "--lang="

# bunnymark
var bunnymark_target = 60.0
var bunnymark_target_error = 0.5
var benchmark_is_bunnymark = false
var bunnymark_update_interval = 2.0
var stable_updates_required = 3
var bunnymark_update_elapsed_time = 0.0
var stable_updates = 0

export(String, "BunnymarkV2", "BunnymarkV1Sprites", "BunnymarkV1DrawTexture") var benchmark: String = "BunnymarkV2"
export(String, "gd", "kt") var language: String = "gd"

func _ready():
	set_process(false)
	fps_label = get_node("Panel/FPS")
	benchmark_container = get_node("BenchmarkContainer")

	var args = OS.get_cmdline_args()
	for arg in args:
		if arg.substr(0, arg_bench.length()) == arg_bench:
			benchmark = arg.split("=")[1]
		elif arg.substr(0, arg_lang.length()) == arg_lang:
			language = arg.split("=")[1]

	start_benchmark(benchmark, language)

func _process(delta):
	elapsed_time += delta
	if elapsed_time >= fps_update_interval:
		fps_label.text = "FPS: " + str(Engine.get_frames_per_second())
		elapsed_time = 0.0
	if benchmark_is_bunnymark:
		update_bunnymark(delta)

func get_script_path(benchmark_name, language):
	if language == "kt":
		return "res://src/main/kotlin/godot/benchmark/bunnymark/" + benchmark_name + ".kt"
	else:
		return "res://benchmarks/" + benchmark_name + "/" + language + "/" + benchmark_name + "." + language

func start_benchmark(benchmark_name, language):
	var language_extension = language
	var script_path = get_script_path(benchmark_name, language)
	benchmark_is_bunnymark = benchmark_name.begins_with("Bunnymark")
	bunnymark_update_elapsed_time = bunnymark_update_interval
	var script = load(script_path)
	benchmark_node = Node2D.new()
	benchmark_node.set_script(script)
	benchmark_node.add_user_signal("benchmark_finished", ["output"])
	benchmark_node.connect("benchmark_finished", self, "benchmark_finished")
	benchmark_container.add_child(benchmark_node)
	if benchmark_node.has_method("add_bunny"):
		set_process(true)
	else:
		benchmark_finished(0)

func benchmark_finished(output):
	print("benchmark output: ", output)
	benchmark_container.remove_child(benchmark_node)
	write_result(output)
	get_tree().quit()

func write_result(output):
	print("written ", output)
	var file = File.new()
	file.open(output_path, File.READ)
	var parse_result = JSON.parse(file.get_as_text())
	var benchmark_file = null
	if parse_result.get_error() == 0:
		benchmark_file = parse_result.get_result()
	if benchmark_file == null or typeof(benchmark_file) != TYPE_DICTIONARY:
		benchmark_file = {
			"benchmark_results": {}
		}
	file.close()
	benchmark_file["benchmark_results"][benchmark + "_" + language] = output
	var dir = Directory.new()
	dir.remove(output_path)
	file = File.new()
	file.open(output_path, File.WRITE)
	benchmark_file["run_date"] = OS.get_datetime()
	file.store_string(JSON.print(benchmark_file))

func update_bunnymark(delta):
	bunnymark_update_elapsed_time += delta
	if bunnymark_update_elapsed_time > bunnymark_update_interval:
		var fps = Engine.get_frames_per_second()
		var difference = fps - bunnymark_target
		print(difference)
		var bunny_difference = 0
		if difference > bunnymark_target_error:
			bunny_difference = min(1000, max(1, floor(20 * difference)))
		elif difference < -bunnymark_target_error:
			bunny_difference = max(-1000, min(-1, -1*ceil(20 * difference)))
		if abs(difference) < bunnymark_target_error:
			stable_updates += 1
			if stable_updates == stable_updates_required:
				benchmark_node.finish()
		else:
			if bunny_difference > 0:
				for i in range(bunny_difference):
					benchmark_node.add_bunny()
			else:
				for i in range(-1*bunny_difference):
					benchmark_node.remove_bunny()

			stable_updates = 0

		bunnymark_update_elapsed_time = 0.0
