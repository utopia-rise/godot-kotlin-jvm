var objs = Array()
var refs = Array()

var size = 100

var rand_index = Array()

func _init():
	for i in range(size):
		objs.append(Node.new())
		refs.append(File.new())
		rand_index.append(rand_range(0, size - 1))
				

func benchmark_obj_access():
	var obj
	for i in range(size):
		obj = objs[rand_index[i]]
		
func benchmark_refs_access():
	var ref
	for i in range(size):
		ref = refs[rand_index[i]]
		
func benchmark_stress_object():
	for i in range(size):
		objs[i].free()
		objs[i] = Node.new()
		
func benchmark_stress_reference():
	for i in range(size):
		refs[i] = null
		refs[i] = File.new()
