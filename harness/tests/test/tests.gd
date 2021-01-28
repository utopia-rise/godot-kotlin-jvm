extends Node


func _on_gut_ready():
  # always put them in this order
  $Gut.export_if_tests_found()
  $Gut.import_tests_if_none_found()
