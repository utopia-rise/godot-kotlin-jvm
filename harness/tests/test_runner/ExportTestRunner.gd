extends "res://addons/gdUnit4/src/core/runners/GdUnitTestSessionRunner.gd"

const GdUnitSignals := preload("res://addons/gdUnit4/src/core/GdUnitSignals.gd")
const GdUnitSingleton := preload("res://addons/gdUnit4/src/core/GdUnitSingleton.gd")

const TEST_DIRECTORY := "res://test"

var _writer: GdUnitCSIMessageWriter = GdUnitCSIMessageWriter.new()
var _reporter: GdUnitConsoleTestReporter


func _ready() -> void:
	super()
	_reporter = GdUnitConsoleTestReporter.new(_writer, true)


func init_runner() -> void:
	var discovered: Array[GdUnitTestCase] = []
	var scanner := GdUnitTestSuiteScanner.new()
	for script in scanner.scan(TEST_DIRECTORY):
		GdUnitTestDiscoverer.discover_tests(script, func(test: GdUnitTestCase) -> void:
			discovered.append(test)
		)
	_test_cases = discovered

	if _test_cases.is_empty():
		_writer.prints_error("No test cases found under '%s', aborting export test run." % TEST_DIRECTORY)
		await quit(RETURN_ERROR)
		return

	_executor.fail_fast(false)
	_state = RUN


func _process(_delta: float) -> void:
	match _state:
		INIT:
			await init_runner()
		RUN:
			_test_session = GdUnitTestSession.new(_test_cases, "")
			GdUnitSignals.instance().gdunit_event.emit(GdUnitSessionStart.new())
			set_process(false)
			await _executor.run_and_wait(_test_cases)
			_state = STOP
			set_process(true)
			GdUnitSignals.instance().gdunit_event.emit(GdUnitSessionClose.new())
		STOP:
			_state = EXIT
			await quit(get_exit_code())


func quit(code: int) -> void:
	_state = EXIT
	await get_tree().process_frame
	await get_tree().physics_frame
	if _reporter != null:
		_reporter.test_session = null
	_reporter = null
	_test_session = null
	_writer = null
	GdUnitSingleton.dispose()
	GdUnitSignals.dispose()
	await super(code)


func _on_gdunit_event(event: GdUnitEvent) -> void:
	match event.type():
		GdUnitEvent.SESSION_START:
			_reporter.test_session = _test_session
		GdUnitEvent.SESSION_CLOSE:
			_reporter.test_session = null


func get_exit_code() -> int:
	if _reporter.total_failure_count() > 0 or _reporter.total_error_count() > 0:
		return RETURN_ERROR
	return RETURN_SUCCESS
