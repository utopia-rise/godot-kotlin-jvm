package godot.tests.registration

import godot.annotation.{ColorNoAlpha, Dir, DoubleRange, EnumTypeHint, ExpEasing, Export, File, FloatRange, IntFlag, IntRange, LongRange, MultilineText, PlaceHolderText, RegisterClass, RegisterProperty}
import godot.api.{Button, NavigationMesh, Node}
import godot.core.{AABB, Basis, Color, Dictionary, NodePath, PackedByteArray, PackedColorArray, PackedFloat32Array, PackedFloat64Array, PackedInt32Array, PackedInt64Array, PackedStringArray, PackedVector2Array, PackedVector3Array, Plane, Quaternion, RID, Rect2, StringName, Transform2D, Transform3D, VariantArray, Vector2, Vector3, Vector4, Vector4i}

@RegisterClass
class ScalaExport extends Node {
  @Export
  @RegisterProperty
  var button: Button = null

  @Export
  @RegisterProperty
  var booleanValue: Boolean = true

  @Export
  @RegisterProperty
  var byteValue: Byte = 1

  @Export
  @RegisterProperty
  var intValue: Int = 1

  @Export
  @RegisterProperty
  @IntRange(min = 1, max = 10)
  var intRangeValue: Int = 3

  @Export
  @RegisterProperty
  @IntFlag(names = Array("Player", "Enemy", "Npc"))
  var intFlagValue: Int = 0x3

  @Export
  @RegisterProperty
  var longValue: Long = 1L

  @Export
  @RegisterProperty
  @LongRange(min = 10L, max = 100L)
  var longRangeValue: Long = 42L

  @Export
  @RegisterProperty
  var floatValue: Float = 1f

  @Export
  @RegisterProperty
  @FloatRange(min = 0.5f, max = 5.5f, step = 0.5f)
  var floatRangeValue: Float = 2.5f

  @Export
  @RegisterProperty
  @ExpEasing()
  var easingValue: Float = 0.35f

  @Export
  @RegisterProperty
  var doubleValue: Double = 1.0

  @Export
  @RegisterProperty
  @DoubleRange(min = 1.25, max = 9.75, step = 0.25)
  var doubleRangeValue: Double = 4.75

  @Export
  @RegisterProperty
  var stringValue: String = "scala-export"

  @Export
  @RegisterProperty
  @File(extensions = Array("gd", "gdj"))
  var filePathValue: String = "res://test/core/test_core.gd"

  @Export
  @RegisterProperty
  @Dir()
  var directoryPathValue: String = "res://test/core"

  @Export
  @RegisterProperty
  @MultilineText()
  var multilineTextValue: String = "Scala export line 1\nScala export line 2"

  @Export
  @RegisterProperty
  @PlaceHolderText()
  var placeholderTextValue: String = "placeholder"

  // Scala enum export is intentionally omitted for now: the current entry generation
  // path produces invalid Kotlin for nested Scala enums when generating enum casters.

  // EnumFlag is intentionally left out for now: it requires exported enum set support,
  // and this branch is staying on the build-stable path until that export shape is covered.

  @Export
  @RegisterProperty
  var vector2: Vector2 = new Vector2(1, 2)

  // Not supported yet by this harness' entry generation for exported integer core variants.
  // @Export
  // @RegisterProperty
  // var vector2i: Vector2i = new Vector2i(1, 2)

  @Export
  @RegisterProperty
  var rect2: Rect2 = new Rect2(1.0, 2.0, 3.0, 4.0)

  // Not supported yet by this harness' entry generation for exported integer core variants.
  // @Export
  // @RegisterProperty
  // var rect2i: Rect2i = new Rect2i(1, 2, 3, 4)

  @Export
  @RegisterProperty
  var vector3: Vector3 = new Vector3(1, 2, 3)

  // Not supported yet by this harness' entry generation for exported integer core variants.
  // @Export
  // @RegisterProperty
  // var vector3i: Vector3i = new Vector3i(1, 2, 3)

  @Export
  @RegisterProperty
  var transform2D: Transform2D = new Transform2D(0, 1, 2, 3, 4, 5)

  @Export
  @RegisterProperty
  var vector4: Vector4 = new Vector4(1, 2, 3, 4)

  @Export
  @RegisterProperty
  var vector4i: Vector4i = new Vector4i(1, 2, 3, 4)

  @Export
  @RegisterProperty
  var plane: Plane = new Plane(1, 2, 3, 4)

  @Export
  @RegisterProperty
  var quaternionValue: Quaternion = new Quaternion(1, 2, 3, 4)

  @Export
  @RegisterProperty
  var aabb: AABB = new AABB(new Vector3(1, 1, 1), new Vector3(2, 2, 2))

  @Export
  @RegisterProperty
  var basisValue: Basis = new Basis(new Vector3(0, 1, 2), new Vector3(3, 4, 5), new Vector3(6, 7, 8))

  @Export
  @RegisterProperty
  var transform3D: Transform3D = new Transform3D(
    new Vector3(0, 1, 2),
    new Vector3(3, 4, 5),
    new Vector3(6, 7, 8),
    new Vector3(9, 10, 11)
  )

  // Projection is intentionally omitted for now: this harness' entry generation rejects it as an exported property.

  @Export
  @RegisterProperty
  var color: Color = new Color(0.1, 0.2, 0.3, 0.4)

  @Export
  @RegisterProperty
  @ColorNoAlpha()
  var colorNoAlpha: Color = new Color(0.6, 0.4, 0.2, 1.0)

  @Export
  @RegisterProperty
  var stringName: StringName = new StringName("scala_export")

  @Export
  @RegisterProperty
  var nodePath: NodePath = new NodePath("Button")

  @Export
  @RegisterProperty
  var rid: RID = new RID()

  @Export
  @RegisterProperty
  var resourceTest: NavigationMesh = new NavigationMesh()

  @Export
  @RegisterProperty
  var jvmId: Int = 0

  @Export
  @RegisterProperty
  var intArray: VariantArray[Integer] = new VariantArray[Integer](classOf[Integer])

  @Export
  @RegisterProperty
  var stringArray: VariantArray[String] = new VariantArray[String](classOf[String])

  @Export
  @RegisterProperty
  var navMeshes: VariantArray[NavigationMesh] = new VariantArray[NavigationMesh](classOf[NavigationMesh])

  @Export
  @RegisterProperty
  var stringToIntDictionary: Dictionary[String, Integer] = new Dictionary[String, Integer](classOf[String], classOf[Integer])

  @Export
  @RegisterProperty
  var navMeshesDictionary: Dictionary[String, NavigationMesh] = new Dictionary[String, NavigationMesh](classOf[String], classOf[NavigationMesh])

  @Export
  @RegisterProperty
  var packedByteArray: PackedByteArray = new PackedByteArray()

  @Export
  @RegisterProperty
  var packedInt32Array: PackedInt32Array = new PackedInt32Array()

  @Export
  @RegisterProperty
  var packedInt64Array: PackedInt64Array = new PackedInt64Array()

  @Export
  @RegisterProperty
  var packedFloat32Array: PackedFloat32Array = new PackedFloat32Array()

  @Export
  @RegisterProperty
  var packedFloat64Array: PackedFloat64Array = new PackedFloat64Array()

  @Export
  @RegisterProperty
  var packedStringArray: PackedStringArray = new PackedStringArray()

  @Export
  @RegisterProperty
  var packedVector2Array: PackedVector2Array = new PackedVector2Array()

  @Export
  @RegisterProperty
  var packedVector3Array: PackedVector3Array = new PackedVector3Array()

  // PackedVector4Array is intentionally omitted for now: this harness' entry generation rejects it as an exported property.

  @Export
  @RegisterProperty
  var packedColorArray: PackedColorArray = new PackedColorArray()

  intArray.add(1)
  intArray.add(2)
  intArray.add(3)

  stringArray.add("one")
  stringArray.add("two")

  navMeshes.add(new NavigationMesh())

  stringToIntDictionary.set("one", 1)
  stringToIntDictionary.set("two", 2)

  navMeshesDictionary.set("AwesomeNavmesh", new NavigationMesh())
}
