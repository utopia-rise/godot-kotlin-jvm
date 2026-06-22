#!/usr/bin/env -S godot -s
extends SceneTree
## Entry point for running GdUnit tests from an EXPORTED build.
##
## Invoked headless on the exported executable, e.g.:
##   tests.exe --headless -s res://test_runner/ExportTestMain.gd
##
## It mirrors how `GdUnitCmdTool.gd` bootstraps a runner (a SceneTree that adds
## the runner node to `root`), but uses our export-safe `ExportTestRunner`
## instead of the editor-coupled CLI runner. See README.md.

const ExportTestRunner := preload("res://test_runner/ExportTestRunner.gd")

var _runner: Node


func _initialize() -> void:
	_runner = ExportTestRunner.new()
	root.add_child(_runner)
