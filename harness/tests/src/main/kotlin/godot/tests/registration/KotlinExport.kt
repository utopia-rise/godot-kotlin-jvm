package godot.tests.registration

import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.File
import godot.annotation.FloatRange
import godot.annotation.IntFlag
import godot.annotation.IntRange
import godot.annotation.LongRange
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.Script
import godot.annotation.Visible
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.api.Button
import godot.api.NavigationMesh
import godot.api.Node
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.Quaternion
import godot.core.RID
import godot.core.Rect2
import godot.core.StringName
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.Vector4
import godot.core.Vector4i
import godot.core.variantArrayOf

@Script
class KotlinExport : Node() {
    enum class KotlinExportEnum {
        ENUM_1,
        ENUM_2,
    }

    @Export
    @Visible
    lateinit var button: Button

    @Export
    @Visible
    var booleanValue = true

    @Export
    @Visible
    var byteValue: Byte = 1

    @Export
    @Visible
    var intValue = 1

    @Export
    @Visible
    @IntRange(1, 10)
    var intRangeValue = 3

    @Export
    @Visible
    @IntFlag("Player", "Enemy", "Npc")
    var intFlagValue = 0b011

    @Export
    @Visible
    var longValue = 1L

    @Export
    @Visible
    @LongRange(10L, 100L)
    var longRangeValue = 42L

    @Export
    @Visible
    var floatValue = 1f

    @Export
    @Visible
    @FloatRange(0.5f, 5.5f, 0.5f)
    var floatRangeValue = 2.5f

    @Export
    @Visible
    @ExpEasing
    var easingValue = 0.35f

    @Export
    @Visible
    var doubleValue = 1.0

    @Export
    @Visible
    @DoubleRange(1.25, 9.75, 0.25)
    var doubleRangeValue = 4.75

    @Export
    @Visible
    var stringValue = "kotlin-export"

    @Export
    @Visible
    @File("gd", "gdj")
    var filePathValue = "res://test/core/test_core.gd"

    @Export
    @Visible
    @Dir
    var directoryPathValue = "res://test/core"

    @Export
    @Visible
    @MultilineText
    var multilineTextValue = "Kotlin export line 1\nKotlin export line 2"

    @Export
    @Visible
    @PlaceHolderText
    var placeholderTextValue = "placeholder"

    @Export
    @Visible
    @EnumTypeHint
    var enumValue = KotlinExportEnum.ENUM_1

    // EnumFlag is intentionally left out for now: it requires exported enum set support,
    // and this branch is staying on the build-stable path until that export shape is covered.

    @Export
    @Visible
    var vector2 = Vector2(1, 2)

    // Not supported yet by this harness' entry generation for exported integer core variants.
    // @Export
    // @Visible
    // var vector2i = Vector2i(1, 2)

    @Export
    @Visible
    var rect2 = Rect2(1.0, 2.0, 3.0, 4.0)

    // Not supported yet by this harness' entry generation for exported integer core variants.
    // @Export
    // @Visible
    // var rect2i = Rect2i(1, 2, 3, 4)

    @Export
    @Visible
    var vector3 = Vector3(1, 2, 3)

    // Not supported yet by this harness' entry generation for exported integer core variants.
    // @Export
    // @Visible
    // var vector3i = Vector3i(1, 2, 3)

    @Export
    @Visible
    var transform2D = Transform2D(0, 1, 2, 3, 4, 5)

    @Export
    @Visible
    var vector4 = Vector4(1, 2, 3, 4)

    @Export
    @Visible
    var vector4i = Vector4i(1, 2, 3, 4)

    @Export
    @Visible
    var plane = Plane(1, 2, 3, 4)

    @Export
    @Visible
    var quaternionValue = Quaternion(1, 2, 3, 4)

    @Export
    @Visible
    var aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))

    @Export
    @Visible
    var basisValue = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))

    @Export
    @Visible
    var transform3D =
        Transform3D(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))

    // Projection is intentionally omitted for now: this harness' entry generation rejects it as an exported property.

    @Export
    @Visible
    var color = Color(0.1, 0.2, 0.3, 0.4)

    @Export
    @Visible
    @ColorNoAlpha
    var colorNoAlpha = Color(0.6, 0.4, 0.2, 1.0)

    @Export
    @Visible
    var stringName = StringName("kotlin_export")

    @Export
    @Visible
    var nodePath = NodePath("CanvasLayer/Button")

    @Export
    @Visible
    var rid = RID()

    @Export
    @Visible
    var resourceTest = NavigationMesh()

    @Export
    @Visible
    var jvmId = 0

    @Export
    @Visible
    var intArray: VariantArray<Int> = variantArrayOf(1, 2, 3)

    @Export
    @Visible
    var stringArray: VariantArray<String> = variantArrayOf("one", "two")

    @Export
    @Visible
    var navMeshes = variantArrayOf(NavigationMesh())

    @Export
    @Visible
    var nullableArray = variantArrayOf<Any?>(NavigationMesh(), null)

    @Export
    @Visible
    var stringToIntDictionary: Dictionary<String, Int> = Dictionary()

    @Export
    @Visible
    var navMeshesDictionary: Dictionary<String, NavigationMesh> = Dictionary()

    @Export
    @Visible
    var nullableDictionary: Dictionary<String, Any?> = Dictionary()

    @Export
    @Visible
    var packedByteArray = PackedByteArray()

    @Export
    @Visible
    var packedInt32Array = PackedInt32Array()

    @Export
    @Visible
    var packedInt64Array = PackedInt64Array()

    @Export
    @Visible
    var packedFloat32Array = PackedFloat32Array()

    @Export
    @Visible
    var packedFloat64Array = PackedFloat64Array()

    @Export
    @Visible
    var packedStringArray = PackedStringArray()

    @Export
    @Visible
    var packedVector2Array = PackedVector2Array()

    @Export
    @Visible
    var packedVector3Array = PackedVector3Array()

    // PackedVector4Array is intentionally omitted for now: this harness' entry generation rejects it as an exported property.

    @Export
    @Visible
    var packedColorArray = PackedColorArray()

    init {
        stringToIntDictionary["one"] = 1
        stringToIntDictionary["two"] = 2

        navMeshesDictionary["AwesomeNavmesh"] = NavigationMesh()

        nullableDictionary["notnull"] = NavigationMesh()
        nullableDictionary["null"] = null
    }
}

