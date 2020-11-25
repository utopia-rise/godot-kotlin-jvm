func benchmark_simple_add():
	var a = 1
	var b = 2
	return a + b

func benchmark_avg():
	var size = 10000
	var total = 0
	for i in range(size):
		total += i
	return total / size

func benchmark_vectors():
	var b = Transform()
	b = b.rotated(Vector3.UP, deg2rad(60))
	b = b.scaled(Vector3(0.5, 0.5, 0.5))

	var s = Vector3()
	for i in range(1000):
		var v = Vector3(i, i, i)
		v = b.xform(v)
		s = s + v

	return s

func benchmark_vectors2_only():
	var s = Vector2()
	for i in range(1000):
		var v = Vector2(i, i)
		s = s + v

	return s

func benchmark_icall():
	var node = Node.new()
	node.get_instance_id()
	return node

func benchmark_icall_with_loop():
	var node = Node.new()
	for i in range(1000):
		var child = Node.new()
		node.add_child(child)
		node.remove_child(child)
		child.free()
	return node

func benchmark_method_call():
	pass
