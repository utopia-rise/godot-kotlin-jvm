extends Node3D


func provide_greeting_for_hierarchical_library() -> String:
	return $HierarchicalLibrary.provide_greeting()


func provide_greeting_for_flattened_library() -> String:
	return $FlattenedLibrary.provide_greeting()

func provide_greeting_for_fqname_library() -> String:
	return $FqNameLibrary.provide_greeting()
