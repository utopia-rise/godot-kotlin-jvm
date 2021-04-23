extends "res://addons/gut/test.gd"

var short_str: String = "Short String"
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

#A string of 511 character a so we obtain a 512 long string, the maximun size of the buffer.
#Change this value with the default value in LongStringQueue.kt and long_string_queue.cpp
var longest_short_str: String = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"


func test_short_string() -> void:
	var script = godot_tests_coretypes_StringTest.new()
	assert_eq(short_str, script.get_short_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(short_str, script.identity(short_str), "String on JVM side should be same as gdscript one.")


func test_long_string() -> void:
	var script = godot_tests_coretypes_StringTest.new()
	assert_eq(long_str, script.get_long_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(long_str, script.identity(long_str), "String on JVM side should be same as gdscript one.")
	
func test_flood_string() -> void:
	var script = godot_tests_coretypes_StringTest.new()
	assert_eq(script.fill_the_buffer(longest_short_str, longest_short_str, longest_short_str, longest_short_str, longest_short_str), true, "Should return true when buffer is filled")
