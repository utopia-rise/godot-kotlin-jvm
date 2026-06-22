extends "res://addons/gdUnit4/src/core/runners/GdUnitTestSessionRunner.gd"
## Minimal GdUnit test runner for EXPORTED builds.
##
## This intentionally does NOT use `addons/gdUnit4/bin/GdUnitCmdTool.gd` /
## `GdUnitTestCIRunner`, because those entry points pull in editor-only code
## (command handler, inspector UI) that is not meant to run inside an exported
## game and either fails to load or hangs there.
##
## Instead we extend the decoupled `GdUnitTestSessionRunner` (made export-safe by
## gdUnit PR #973) and only use the discovery + execution core. See README.md.

const GdUnitTools := preload("res://addons/gdUnit4/src/core/GdUnitTools.gd")

## Directory (res://) that holds the GdUnit test suites to execute.
const TEST_DIRECTORY := "res://test"

var _total_failures := 0
var _total_errors := 0


## Discover the test suites and start the run. Called by the base runner state machine.
func init_runner() -> void:
	var discovered: Array[GdUnitTestCase] = []
	var scanner := GdUnitTestSuiteScanner.new()
	for script in scanner.scan(TEST_DIRECTORY):
		GdUnitTestDiscoverer.discover_tests(script, func(test: GdUnitTestCase) -> void:
			discovered.append(test)
		)
	_test_cases = discovered

	if _test_cases.is_empty():
		push_error("No test cases found under '%s', aborting export test run." % TEST_DIRECTORY)
		await quit(RETURN_ERROR)
		return

	# Run the whole suite (no fail-fast) so CI sees every failure in one run.
	_executor.fail_fast(false)
	_state = RUN


## Dispose gdUnit's Engine-metadata singletons (GdUnitSignals, etc.) BEFORE the
## engine tears down. Without this they outlive the GDScript language and crash
## on shutdown (SIGSEGV) — the same lingering-object teardown bug. Mirrors what
## GdUnitTestCIRunner.quit() does.
func quit(code: int) -> void:
	_state = EXIT
	GdUnitTools.dispose_all()
	await GdUnitMemoryObserver.gc_on_guarded_instances()
	await super(code)


## Tally failures/errors as each test case finishes, to derive the process exit code.
func _on_gdunit_event(event: GdUnitEvent) -> void:
	if event.type() == GdUnitEvent.TESTCASE_AFTER:
		_total_failures += event.failed_count()
		_total_errors += event.error_count()


## Map the aggregated result to a process exit code consumed by CI / Gradle.
func get_exit_code() -> int:
	if _total_failures + _total_errors > 0:
		prints("GdUnit export run finished with %d failure(s) and %d error(s)." % [_total_failures, _total_errors])
		return RETURN_ERROR
	prints("GdUnit export run finished: all tests passed.")
	return RETURN_SUCCESS
