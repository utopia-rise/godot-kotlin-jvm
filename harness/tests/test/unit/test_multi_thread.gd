extends "res://addons/gut/test.gd"


var results := Array()
var mutex := Mutex.new()

func test_should_do_multi_threading():
	var threads := Array()
	for i in range(0, 3):
		var thread = Thread.new()
		thread.start(_thread_assert)
		threads.append(thread)
	for thread in threads:
		thread.wait_to_finish()
	var expected_aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))
	for result in results:
		assert_eq(result, expected_aabb, "Should get same aabb")

func _thread_assert():
	var instance = CoreTypesIdentityTest.new()
	mutex.lock()
	results.append(instance.aabb)
	mutex.unlock()
	instance.free()
