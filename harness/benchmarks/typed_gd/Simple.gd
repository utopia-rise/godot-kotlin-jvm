extends Object

func benchmark_simple_add() -> int:
	var a: int  = 1
	var b: int = 2
	return a + b

func benchmark_avg() -> int:
	var size: int = 10000
	var total: int = 0
	for i in range(size):
		total += i
	return total / size

func benchmark_vectors() -> Vector3:
	var b: Transform3D = Transform3D()
	b = b.rotated(Vector3.UP, deg_to_rad(60))
	b = b.scaled(Vector3(0.5, 0.5, 0.5))

	var s: Vector3 = Vector3()
	for i in range(1000):
		var v: Vector3 = Vector3(i, i, i)
		v = b * (v)
		s = s + v

	return s

func benchmark_vectors2_only() -> Vector2:
	var s: Vector2 = Vector2()
	for i in range(1000):
		var v: Vector2 = Vector2(i, i)
		s = s + v

	return s

func benchmark_icall() -> void:
	var node: Node = Node.new()
	node.get_instance_id()
	node.free()
	return

func benchmark_icall_with_loop() -> void:
	var node: Node = Node.new()
	for i in range(100):
		var child: Node = Node.new()
		node.add_child(child)
		node.remove_child(child)
		child.free()
	node.free()
	return

func benchmark_method_call() -> void:
	pass
