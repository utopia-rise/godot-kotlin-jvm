var objs: Array = Array()
var refs: Array = Array()
var cores: Array = Array()

var size: int = 1000

func _init():
	for i in range(size):
		objs.append(Node.new())
		refs.append(File.new())
		cores.append(RID())
				

func benchmark_obj_access() -> void:
	var obj: Node
	for i in range(size):
		obj = objs[i]
		
func benchmark_ref_access() -> void:
	var ref: File
	for i in range(size):
		ref = refs[i]
		
func benchmark_core_access() -> void:
	var core: RID
	for i in range(size):
		core = cores[i]
		
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
