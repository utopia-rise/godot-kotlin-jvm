extends Reference
class_name Stats

const SEC_IN_USEC = 1000000.0

var data = []
var sorted = false

func add(time):
	data.append(time)

func get_avg():
	var total = 0.0
	for i in data:
		total += i
	return total / len(data)

func get_median():
	var copy = data.duplicate()
	copy.sort()
	var length = len(copy)
	var middle = length / 2
	if length % 2 == 1:
		return copy[middle]
	else:
		return (copy[middle - 1] + copy[middle]) / 2.0

func get_percentile(percentile):
	var copy = data.duplicate()
	copy.sort()
	var index = int(percentile * len(copy))
	return copy[index]

func get_min():
	var copy = data.duplicate()
	copy.sort()
	return copy[-1]

func get_max():
	var copy = data.duplicate()
	copy.sort()
	return copy[0]

func get_results():
	var result = {}
	result["raw"] = data.duplicate()
	result["min"] = __to_op_per_s(get_min())
	result["max"] = __to_op_per_s(get_max())
	result["avg"] = __to_op_per_s(get_avg())
	result["median"] = __to_op_per_s(get_median())
	result["p95"] = __to_op_per_s(get_percentile(0.95))
	result["p99"] = __to_op_per_s(get_percentile(0.95))
	return result

func __to_op_per_s(value):
	if value == 0:
		return value
	return SEC_IN_USEC / value

func _to_string():
	var results = get_results()
	var _min = results.min
	var _max = results.max
	var avg = results.avg
	var median = results.median
	var pc95 = results.p95
	var pc99 = results.p99
	var args = [_min, _max, avg, median, pc95, pc99]
	return "AVG=%d op/s, MEDIAN=%d op/s, MIN=%d, MAX=%d 95PC=%d op/s, 99PC=%d op/s" % args
