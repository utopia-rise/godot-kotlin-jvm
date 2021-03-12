var objs = Array()
var refs = Array()
var cores = Array()

var size = 1000

func _init():
	for i in range(size):
		objs.append(Node.new())
		refs.append(File.new())
		cores.append(RID())
				

func benchmark_obj_access():
	var obj
	for i in range(size):
		obj = objs[i]
		
func benchmark_ref_access():
	var ref
	for i in range(size):
		ref = refs[i]
		
func benchmark_core_access():
	var core
	for i in range(size):
		core = cores[i]
		
func benchmark_stress_object():
	var obj
	for i in range(size):
		obj = Node.new()
		obj.free()
	
func benchmark_stress_reference():
	var ref
	for i in range(size):
		ref = File.new()
		
func benchmark_stress_core():
	var core
	for i in range(size):
		core = RID()

