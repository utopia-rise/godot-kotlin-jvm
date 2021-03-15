extends Object

var objs = Array()
var refs = Array()
var cores = Array()

var access_size = 1000
var stress_size = 100

func _init():
	for i in range(access_size):
		objs.append(Node.new())
		refs.append(File.new())
		cores.append(RID())
		
func _notification(what):
	if what == NOTIFICATION_PREDELETE:
		for i in range(access_size):
			objs[i].free()
		refs.clear()
		cores.clear()
				

func benchmark_access_obj():
	var obj
	for i in range(access_size):
		obj = objs[i]
		
func benchmark_access_ref():
	var ref
	for i in range(access_size):
		ref = refs[i]
		
func benchmark_access_core():
	var core
	for i in range(access_size):
		core = cores[i]
		
func benchmark_stress_object():
	var obj
	for i in range(stress_size):
		obj = Node.new()
		obj.free()
	
func benchmark_stress_reference():
	var ref
	for i in range(stress_size):
		ref = File.new()
		
func benchmark_stress_core():
	var core
	for i in range(stress_size):
		core = RID()
		
func benchmark_stress_z_mix():
	var core
	var obj
	var ref
	for i in range(stress_size):
		obj = Node.new()
		obj.free()
		core = RID()
		ref = File.new()

