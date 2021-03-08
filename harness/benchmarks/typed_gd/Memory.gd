var objs: Array = Array()
var refs: Array = Array()

var size: int = 100

var rand_index: Array = Array()

func _init():
	for i in range(size):
		objs.append(Node.new())
		refs.append(File.new())
		rand_index.append(rand_range(0, size - 1))
				

func benchmark_obj_access() -> void:
	var obj: Node
	for i in range(size):
		obj = objs[rand_index[i]]
		
func benchmark_refs_access() -> void:
	var ref: File
	for i in range(size):
		ref = refs[rand_index[i]]
		
func benchmark_stress_object() -> void:
	for i in range(size):
		objs[i].free()
		objs[i] = Node.new()
		
func benchmark_stress_reference() -> void:
	for i in range(size):
		refs[i] = null
		refs[i] = File.new()
