var objs: Array = Array()
var refs: Array = Array()
var cores: Array = Array()

var size: int = 100

var rand_index: Array = Array()

func _init():
	for i in range(size):
		objs.append(Node.new())
		refs.append(File.new())
		cores.append(RID())
		rand_index.append(rand_range(0, size - 1))
				

func benchmark_obj_access() -> void:
	var obj: Node
	for i in range(size):
		obj = objs[rand_index[i]]
		
func benchmark_ref_access() -> void:
	var ref: File
	for i in range(size):
		ref = refs[rand_index[i]]
		
func benchmark_core_access() -> void:
	var core: RID
	for i in range(size):
		core = cores[rand_index[i]]
		
func benchmark_stress_object() -> void:
	var obj: Object
	for i in range(size):
		obj = Node.new()
		obj.free()
	
func benchmark_stress_reference() -> void:
	var ref: File
	for i in range(size):
		ref = File.new()
		
func benchmark_stress_core() -> void:
	var core: RID
	for i in range(size):
		core = RID()
