package godot.tests.registration;

import godot.annotation.EnumTypeHint;
import godot.annotation.ExpEasing;
import godot.annotation.Export;
import godot.annotation.File;
import godot.annotation.FloatRange;
import godot.annotation.IntFlag;
import godot.annotation.IntRange;
import godot.annotation.LongRange;
import godot.annotation.MultilineText;
import godot.annotation.PlaceHolderText;
import godot.annotation.RegisterClass;
import godot.annotation.RegisterProperty;
import godot.annotation.ColorNoAlpha;
import godot.annotation.Dir;
import godot.annotation.DoubleRange;
import godot.api.Button;
import godot.api.NavigationMesh;
import godot.api.Node;
import godot.core.AABB;
import godot.core.Basis;
import godot.core.Color;
import godot.core.Dictionary;
import godot.core.NodePath;
import godot.core.PackedByteArray;
import godot.core.PackedColorArray;
import godot.core.PackedFloat32Array;
import godot.core.PackedFloat64Array;
import godot.core.PackedInt32Array;
import godot.core.PackedInt64Array;
import godot.core.PackedStringArray;
import godot.core.PackedVector2Array;
import godot.core.PackedVector3Array;
import godot.core.Plane;
import godot.core.Quaternion;
import godot.core.RID;
import godot.core.Rect2;
import godot.core.StringName;
import godot.core.Transform2D;
import godot.core.Transform3D;
import godot.core.VariantArray;
import godot.core.Vector2;
import godot.core.Vector3;
import godot.core.Vector4;
import godot.core.Vector4i;

@RegisterClass
public class JavaExport extends Node {
    public enum JavaExportEnum {
        JAVA_EXPORT_ENUM_1,
        JAVA_EXPORT_ENUM_2,
    }

    @Export
    @RegisterProperty
    public Button button;

    @Export
    @RegisterProperty
    public boolean booleanValue = true;

    @Export
    @RegisterProperty
    public byte byteValue = 1;

    @Export
    @RegisterProperty
    public int intValue = 1;

    @Export
    @RegisterProperty
    @IntRange(min = 1, max = 10)
    public int intRangeValue = 3;

    @Export
    @RegisterProperty
    @IntFlag(names = {"Player", "Enemy", "Npc"})
    public int intFlagValue = 0b011;

    @Export
    @RegisterProperty
    public long longValue = 1L;

    @Export
    @RegisterProperty
    @LongRange(min = 10L, max = 100L)
    public long longRangeValue = 42L;

    @Export
    @RegisterProperty
    public float floatValue = 1f;

    @Export
    @RegisterProperty
    @FloatRange(min = 0.5f, max = 5.5f, step = 0.5f)
    public float floatRangeValue = 2.5f;

    @Export
    @RegisterProperty
    @ExpEasing
    public float easingValue = 0.35f;

    @Export
    @RegisterProperty
    public double doubleValue = 1.0;

    @Export
    @RegisterProperty
    @DoubleRange(min = 1.25, max = 9.75, step = 0.25)
    public double doubleRangeValue = 4.75;

    @Export
    @RegisterProperty
    public String stringValue = "java-export";

    @Export
    @RegisterProperty
    @File(extensions = {"gd", "gdj"})
    public String filePathValue = "res://test/core/test_core.gd";

    @Export
    @RegisterProperty
    @Dir
    public String directoryPathValue = "res://test/core";

    @Export
    @RegisterProperty
    @MultilineText
    public String multilineTextValue = "Java export line 1\nJava export line 2";

    @Export
    @RegisterProperty
    @PlaceHolderText
    public String placeholderTextValue = "placeholder";

    @Export
    @RegisterProperty
    @EnumTypeHint
    public JavaExportEnum enumValue = JavaExportEnum.JAVA_EXPORT_ENUM_1;

    // EnumFlag is intentionally left out for now: it requires exported enum set support,
    // and this branch is staying on the build-stable path until that export shape is covered.

    @Export
    @RegisterProperty
    public Vector2 vector2 = new Vector2(1, 2);

    // Not supported yet by this harness' entry generation for exported integer core variants.
    // @Export
    // @RegisterProperty
    // public Vector2i vector2i = new Vector2i(1, 2);

    @Export
    @RegisterProperty
    public Rect2 rect2 = new Rect2(1.0, 2.0, 3.0, 4.0);

    // Not supported yet by this harness' entry generation for exported integer core variants.
    // @Export
    // @RegisterProperty
    // public Rect2i rect2i = new Rect2i(1, 2, 3, 4);

    @Export
    @RegisterProperty
    public Vector3 vector3 = new Vector3(1, 2, 3);

    // Not supported yet by this harness' entry generation for exported integer core variants.
    // @Export
    // @RegisterProperty
    // public Vector3i vector3i = new Vector3i(1, 2, 3);

    @Export
    @RegisterProperty
    public Transform2D transform2D = new Transform2D(0, 1, 2, 3, 4, 5);

    @Export
    @RegisterProperty
    public Vector4 vector4 = new Vector4(1, 2, 3, 4);

    @Export
    @RegisterProperty
    public Vector4i vector4i = new Vector4i(1, 2, 3, 4);

    @Export
    @RegisterProperty
    public Plane plane = new Plane(1, 2, 3, 4);

    @Export
    @RegisterProperty
    public Quaternion quaternionValue = new Quaternion(1, 2, 3, 4);

    @Export
    @RegisterProperty
    public AABB aabb = new AABB(new Vector3(1, 1, 1), new Vector3(2, 2, 2));

    @Export
    @RegisterProperty
    public Basis basisValue = new Basis(new Vector3(0, 1, 2), new Vector3(3, 4, 5), new Vector3(6, 7, 8));

    @Export
    @RegisterProperty
    public Transform3D transform3D = new Transform3D(
        new Vector3(0, 1, 2),
        new Vector3(3, 4, 5),
        new Vector3(6, 7, 8),
        new Vector3(9, 10, 11)
    );

    // Projection is intentionally omitted for now: this harness' entry generation rejects it as an exported property.

    @Export
    @RegisterProperty
    public Color color = new Color(0.1, 0.2, 0.3, 0.4);

    @Export
    @RegisterProperty
    @ColorNoAlpha
    public Color colorNoAlpha = new Color(0.6, 0.4, 0.2, 1.0);

    @Export
    @RegisterProperty
    public StringName stringName = new StringName("java_export");

    @Export
    @RegisterProperty
    public NodePath nodePath = new NodePath("Button");

    @Export
    @RegisterProperty
    public RID rid = new RID();

    @Export
    @RegisterProperty
    public NavigationMesh resourceTest = new NavigationMesh();

    @Export
    @RegisterProperty
    public int jvmId = 0;

    @Export
    @RegisterProperty
    public VariantArray<Integer> intArray = new VariantArray<>(Integer.class);

    @Export
    @RegisterProperty
    public VariantArray<String> stringArray = new VariantArray<>(String.class);

    @Export
    @RegisterProperty
    public VariantArray<NavigationMesh> navMeshes = new VariantArray<>(NavigationMesh.class);

    @Export
    @RegisterProperty
    public Dictionary<String, Integer> stringToIntDictionary = new Dictionary<>(String.class, Integer.class);

    @Export
    @RegisterProperty
    public Dictionary<String, NavigationMesh> navMeshesDictionary = new Dictionary<>(String.class, NavigationMesh.class);

    @Export
    @RegisterProperty
    public PackedByteArray packedByteArray = new PackedByteArray();

    @Export
    @RegisterProperty
    public PackedInt32Array packedInt32Array = new PackedInt32Array();

    @Export
    @RegisterProperty
    public PackedInt64Array packedInt64Array = new PackedInt64Array();

    @Export
    @RegisterProperty
    public PackedFloat32Array packedFloat32Array = new PackedFloat32Array();

    @Export
    @RegisterProperty
    public PackedFloat64Array packedFloat64Array = new PackedFloat64Array();

    @Export
    @RegisterProperty
    public PackedStringArray packedStringArray = new PackedStringArray();

    @Export
    @RegisterProperty
    public PackedVector2Array packedVector2Array = new PackedVector2Array();

    @Export
    @RegisterProperty
    public PackedVector3Array packedVector3Array = new PackedVector3Array();

    // PackedVector4Array is intentionally omitted for now: this harness' entry generation rejects it as an exported property.

    @Export
    @RegisterProperty
    public PackedColorArray packedColorArray = new PackedColorArray();

    public JavaExport() {
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);

        stringArray.add("one");
        stringArray.add("two");

        navMeshes.add(new NavigationMesh());

        stringToIntDictionary.set("one", 1);
        stringToIntDictionary.set("two", 2);

        navMeshesDictionary.set("AwesomeNavmesh", new NavigationMesh());
    }
}
