extends Object

var ob
var objs: Array = Array()
var refs: Array = Array()
var cores: Array = Array()

var access_size: int = 1000
var stress_size: int = 100

func _init():
	for i in range(access_size):
		objs.append(Node.new())
		refs.append(RefCounted.new())
		cores.append(RID())

func _notification(what):
	if what == NOTIFICATION_PREDELETE:
		for i in range(access_size):
			objs[i].free()
		refs.clear()
		cores.clear()

func benchmark_access_obj() -> void:
	var obj: Node
	for i in range(access_size):
		obj = objs[i]
		
func benchmark_access_ref() -> void:
	var ref: RefCounted
	for i in range(access_size):
		ref = refs[i]
		
func benchmark_access_core() -> void:
	var core: RID
	for i in range(access_size):
		core = cores[i]
		
func benchmark_stress_object() -> void:
	var obj: Node
	for i in range(stress_size):
		obj = Node.new()
		obj.free()
	
func benchmark_stress_reference() -> void:
	var ref: RefCounted
	for i in range(stress_size):
		ref = RefCounted.new()
		
func benchmark_stress_core() -> void:
	var core: RID
	for i in range(stress_size):
		core = RID()
		
func benchmark_stress_z_mix() -> void:
	var core: RID
	var obj: Node
	var ref: RefCounted
	for i in range(stress_size):
		obj = Node.new()
		obj.free()
		core = RID()
		ref = RefCounted.new()
