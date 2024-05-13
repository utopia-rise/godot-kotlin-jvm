extends "res://addons/gut/test.gd"

var short_str: String = "Short String"

#A string of 511 character a so we obtain a 512 long string, the maximun size of the buffer.
#Change this value with the default value in LongStringQueue.kt and long_string_queue.cpp
var longest_short_str: String = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"

# Length of the previous string + 1
var shortest_long_str: String = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"

var long_str: String = """I'll pivot the lazy YAML middleware, that should abstraction the DAG virtual DOM!

The HTML stack is down, store the stateless Imagemagick so we can lazy eval the JSON Stack Overflow!

You can't mock the convention without gate-keeping the mobile YAML Kubernetes!

Try to pivot the YAML Slack, maybe it will sort the reliable service worker!

You can't transact the CS degree without gate-keeping the idiosyncratic UX website!

I'll optimize the object-oriented DOM state, that should open source the API abstraction!

So bubble-sorting the Stack Overflow won't do anything, we need to graph the minimum viable FIFO algorithm!

The OOP module is down, configure the behavior-driven context so we can inherit the DOM neck beard!

The SOAP middleware is down, f*** the serverless stream so we can circle back the LGTM constant!

You can't ship the continuous integration without blogging the junior IoT Stack Overflow!"""


func test_short_string() -> void:
	var script: Object = StringTest.new()
	assert_eq(short_str, script.get_short_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(short_str, script.identity(short_str), "String on JVM side should be same as gdscript one.")
	assert_eq(script.fill_the_buffer(short_str, short_str, short_str, short_str, short_str), true, "Should return true when buffer is filled")
	assert_eq(script.mix_string_and_variant(1, short_str, Vector2(1,1), short_str, 1.0), true, "Should return true when buffer is filled")
	script.free()
	
func test_longest_short_string() -> void:
	var script: Object = StringTest.new()
	assert_eq(longest_short_str, script.get_longest_short_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(longest_short_str, script.identity(longest_short_str), "String on JVM side should be same as gdscript one.")
	assert_eq(script.fill_the_buffer(longest_short_str, longest_short_str, longest_short_str, longest_short_str, longest_short_str), true, "Should return true when buffer is filled")
	assert_eq(script.mix_string_and_variant(1, longest_short_str, Vector2(1,1), longest_short_str, 1.0), true, "Should return true when buffer is filled")
	script.free()

func test_shortest_long_string() -> void:
	var script: Object = StringTest.new()
	assert_eq(shortest_long_str, script.get_shortest_long_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(shortest_long_str, script.identity(shortest_long_str), "String on JVM side should be same as gdscript one.")
	assert_eq(script.fill_the_buffer(shortest_long_str, shortest_long_str, shortest_long_str, shortest_long_str, shortest_long_str), true, "Should return true when buffer is filled")
	assert_eq(script.mix_string_and_variant(1, shortest_long_str, Vector2(1,1), shortest_long_str, 1.0), true, "Should return true when buffer is filled")
	script.free()

# TODO: enable again after fixed for windows!
#func test_long_string() -> void:
#	var script = StringTest.new()
#	assert_eq(long_str, script.get_long_string(), "String on JVM side should be same as gdscript one.")
#	assert_eq(long_str, script.identity(long_str), "String on JVM side should be same as gdscript one.")
#	assert_eq(script.fill_the_buffer(long_str, long_str, long_str, long_str, long_str), true, "Should return true when buffer is filled")
#	assert_eq(script.mix_string_and_variant(1, long_str, Vector2(1,1), long_str, 1.0), true, "Should return true when buffer is filled")
#	script.free()

func test_string_length() -> void:
	var script = StringTest.new()
	assert_eq(script.get_length(""), 0, "Should return the right size of the string")
	assert_eq(script.get_length("A"), 1, "Should return the right size of the string")
	assert_eq(script.get_length("abcde"), 5, "Should return the right size of the string")
	assert_eq("", script.identity(""), "String on JVM side should be same as gdscript one.")
	assert_eq("A", script.identity("A"), "String on JVM side should be same as gdscript one.")
	script.free()

func test_string_as_string_name() -> void:
	var script = StringTest.new()
	assert_eq(script.get_as_string_name("test1"), script.get_as_string_name("test1"), "Should return the same StringName instance")
	assert_ne(script.get_as_string_name("test1"), script.get_as_string_name("test2"), "Should return the different StringName instances")
	script.free()
