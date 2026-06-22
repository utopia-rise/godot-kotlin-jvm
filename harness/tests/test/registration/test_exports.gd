extends GdUnitTestSuite

const EXPORT_INSPECTOR_SCENE := preload("res://export_inspector_scene.tscn")


func test_reenabled_core_exports_are_registered_across_languages() -> void:
    var scene: Node = EXPORT_INSPECTOR_SCENE.instantiate()
    add_child(scene)

    _assert_reenabled_exports(scene.get_node(^"KotlinExportNode"))
    _assert_reenabled_exports(scene.get_node(^"JavaExportNode"))
    _assert_reenabled_exports(scene.get_node(^"ScalaExportNode"))

    scene.queue_free()
    await get_tree().process_frame


func _assert_reenabled_exports(instance: Object) -> void:
    var property_map := _property_map(instance)

    _assert_exported_property(property_map, "vector2i", TYPE_VECTOR2I)
    assert_that(instance.get("vector2i")).is_equal(Vector2i(1, 2))

    _assert_exported_property(property_map, "rect2i", TYPE_RECT2I)
    assert_that(instance.get("rect2i")).is_equal(Rect2i(1, 2, 3, 4))

    _assert_exported_property(property_map, "vector3i", TYPE_VECTOR3I)
    assert_that(instance.get("vector3i")).is_equal(Vector3i(1, 2, 3))

    _assert_exported_property(property_map, "projection_value", TYPE_PROJECTION)
    assert_that(str(instance.get("projection_value"))).is_equal(str(Projection()))

    _assert_exported_property(property_map, "packed_vector4_array", TYPE_PACKED_VECTOR4_ARRAY)
    assert_that(instance.get("packed_vector4_array").size()).is_equal(0)


func _property_map(instance: Object) -> Dictionary:
    var properties := {}
    for property: Dictionary in instance.get_property_list():
        properties[property["name"]] = property
    return properties


func _assert_exported_property(property_map: Dictionary, property_name: String, variant_type: int) -> void:
    assert_bool(property_map.has(property_name))\
        .override_failure_message("Expected exported property '%s' to be present in the inspector property list" % property_name)\
        .is_true()

    var property: Dictionary = property_map[property_name]
    assert_that(property["type"])\
        .override_failure_message("Expected exported property '%s' to keep its Variant type" % property_name)\
        .is_equal(variant_type)
    assert_bool((property["usage"] & PROPERTY_USAGE_EDITOR) != 0)\
        .override_failure_message("Expected exported property '%s' to remain marked as an editor-visible export" % property_name)\
        .is_true()
