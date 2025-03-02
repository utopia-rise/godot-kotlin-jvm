// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * GLTFObjectModelProperty defines a mapping between a property in the glTF object model and a
 * NodePath in the Godot scene tree. This can be used to animate properties in a glTF file using the
 * `KHR_animation_pointer` extension, or to access them through an engine-agnostic script such as a
 * behavior graph as defined by the `KHR_interactivity` extension.
 * The glTF property is identified by JSON pointer(s) stored in [jsonPointers], while the Godot
 * property it maps to is defined by [nodePaths]. In most cases [jsonPointers] and [nodePaths] will
 * each only have one item, but in some cases a single glTF JSON pointer will map to multiple Godot
 * properties, or a single Godot property will be mapped to multiple glTF JSON pointers, or it might be
 * a many-to-many relationship.
 * [Expression] objects can be used to define conversions between the data, such as when glTF
 * defines an angle in radians and Godot uses degrees. The [objectModelType] property defines the type
 * of data stored in the glTF file as defined by the object model, see [GLTFObjectModelType] for
 * possible values.
 */
@GodotBaseType
public open class GLTFObjectModelProperty : RefCounted() {
  /**
   * If set, this [Expression] will be used to convert the property value from the glTF object model
   * to the value expected by the Godot property. This is useful when the glTF object model uses a
   * different unit system, or when the data needs to be transformed in some way. If `null`, the value
   * will be copied as-is.
   */
  public final inline var gltfToGodotExpression: Expression?
    @JvmName("gltfToGodotExpressionProperty")
    get() = getGltfToGodotExpression()
    @JvmName("gltfToGodotExpressionProperty")
    set(`value`) {
      setGltfToGodotExpression(value)
    }

  /**
   * If set, this [Expression] will be used to convert the property value from the Godot property to
   * the value expected by the glTF object model. This is useful when the glTF object model uses a
   * different unit system, or when the data needs to be transformed in some way. If `null`, the value
   * will be copied as-is.
   */
  public final inline var godotToGltfExpression: Expression?
    @JvmName("godotToGltfExpressionProperty")
    get() = getGodotToGltfExpression()
    @JvmName("godotToGltfExpressionProperty")
    set(`value`) {
      setGodotToGltfExpression(value)
    }

  /**
   * An array of [NodePath]s that point to a property, or multiple properties, in the Godot scene
   * tree. On import, this will either be set by [GLTFDocument], or by a [GLTFDocumentExtension] class.
   * For simple cases, use [appendPathToProperty] to add properties to this array.
   * In most cases [nodePaths] will only have one item, but in some cases a single glTF JSON pointer
   * will map to multiple Godot properties. For example, a [GLTFCamera] or [GLTFLight] used on multiple
   * glTF nodes will be represented by multiple Godot nodes.
   */
  public final inline var nodePaths: VariantArray<NodePath>
    @JvmName("nodePathsProperty")
    get() = getNodePaths()
    @JvmName("nodePathsProperty")
    set(`value`) {
      setNodePaths(value)
    }

  /**
   * The type of data stored in the glTF file as defined by the object model. This is a superset of
   * the available accessor types, and determines the accessor type. See [GLTFObjectModelType] for
   * possible values.
   */
  public final inline var objectModelType: GLTFObjectModelType
    @JvmName("objectModelTypeProperty")
    get() = getObjectModelType()
    @JvmName("objectModelTypeProperty")
    set(`value`) {
      setObjectModelType(value)
    }

  /**
   * The glTF object model JSON pointers used to identify the property in the glTF object model. In
   * most cases, there will be only one item in this array, but niche cases may require multiple
   * pointers. The items are themselves arrays which represent the JSON pointer split into its
   * components.
   */
  public final inline var jsonPointers: VariantArray<PackedStringArray>
    @JvmName("jsonPointersProperty")
    get() = getJsonPointers()
    @JvmName("jsonPointersProperty")
    set(`value`) {
      setJsonPointers(value)
    }

  /**
   * The type of data stored in the Godot property. This is the type of the property that the
   * [nodePaths] point to.
   */
  public final inline var variantType: VariantType
    @JvmName("variantTypeProperty")
    get() = getVariantType()
    @JvmName("variantTypeProperty")
    set(`value`) {
      setVariantType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(263, scriptIndex)
  }

  /**
   * Appends a [NodePath] to [nodePaths]. This can be used by [GLTFDocumentExtension] classes to
   * define how a glTF object model property maps to a Godot property, or multiple Godot properties.
   * Prefer using [appendPathToProperty] for simple cases. Be sure to also call [setTypes] once (the
   * order does not matter).
   */
  public final fun appendNodePath(nodePath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to nodePath)
    TransferContext.callMethod(ptr, MethodBindings.appendNodePathPtr, NIL)
  }

  /**
   * High-level wrapper over [appendNodePath] that handles the most common cases. It constructs a
   * new [NodePath] using [nodePath] as a base and appends [propName] to the subpath. Be sure to also
   * call [setTypes] once (the order does not matter).
   */
  public final fun appendPathToProperty(nodePath: NodePath, propName: StringName): Unit {
    TransferContext.writeArguments(NODE_PATH to nodePath, STRING_NAME to propName)
    TransferContext.callMethod(ptr, MethodBindings.appendPathToPropertyPtr, NIL)
  }

  /**
   * The GLTF accessor type associated with this property's [objectModelType]. See
   * [GLTFAccessor.accessorType] for possible values, and see [GLTFObjectModelType] for how the object
   * model type maps to accessor types.
   */
  public final fun getAccessorType(): GLTFAccessor.GLTFAccessorType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAccessorTypePtr, LONG)
    return GLTFAccessor.GLTFAccessorType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun getGltfToGodotExpression(): Expression? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGltfToGodotExpressionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Expression?)
  }

  public final fun setGltfToGodotExpression(gltfToGodotExpr: Expression?): Unit {
    TransferContext.writeArguments(OBJECT to gltfToGodotExpr)
    TransferContext.callMethod(ptr, MethodBindings.setGltfToGodotExpressionPtr, NIL)
  }

  public final fun getGodotToGltfExpression(): Expression? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGodotToGltfExpressionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Expression?)
  }

  public final fun setGodotToGltfExpression(godotToGltfExpr: Expression?): Unit {
    TransferContext.writeArguments(OBJECT to godotToGltfExpr)
    TransferContext.callMethod(ptr, MethodBindings.setGodotToGltfExpressionPtr, NIL)
  }

  public final fun getNodePaths(): VariantArray<NodePath> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodePathsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<NodePath>)
  }

  /**
   * Returns `true` if [nodePaths] is not empty. This is used during import to determine if a
   * [GLTFObjectModelProperty] can handle converting a glTF object model property to a Godot property.
   */
  public final fun hasNodePaths(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasNodePathsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNodePaths(nodePaths: VariantArray<NodePath>): Unit {
    TransferContext.writeArguments(ARRAY to nodePaths)
    TransferContext.callMethod(ptr, MethodBindings.setNodePathsPtr, NIL)
  }

  public final fun getObjectModelType(): GLTFObjectModelType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getObjectModelTypePtr, LONG)
    return GLTFObjectModelProperty.GLTFObjectModelType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setObjectModelType(type: GLTFObjectModelType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setObjectModelTypePtr, NIL)
  }

  public final fun getJsonPointers(): VariantArray<PackedStringArray> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJsonPointersPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PackedStringArray>)
  }

  /**
   * Returns `true` if [jsonPointers] is not empty. This is used during export to determine if a
   * [GLTFObjectModelProperty] can handle converting a Godot property to a glTF object model property.
   */
  public final fun hasJsonPointers(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasJsonPointersPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setJsonPointers(jsonPointers: VariantArray<PackedStringArray>): Unit {
    TransferContext.writeArguments(ARRAY to jsonPointers)
    TransferContext.callMethod(ptr, MethodBindings.setJsonPointersPtr, NIL)
  }

  public final fun getVariantType(): VariantType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVariantTypePtr, LONG)
    return VariantType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVariantType(variantType: VariantType): Unit {
    TransferContext.writeArguments(LONG to variantType.id)
    TransferContext.callMethod(ptr, MethodBindings.setVariantTypePtr, NIL)
  }

  /**
   * Sets the [variantType] and [objectModelType] properties. This is a convenience method to set
   * both properties at once, since they are almost always known at the same time. This method should
   * be called once. Calling it again with the same values will have no effect.
   */
  public final fun setTypes(variantType: VariantType, objModelType: GLTFObjectModelType): Unit {
    TransferContext.writeArguments(LONG to variantType.id, LONG to objModelType.id)
    TransferContext.callMethod(ptr, MethodBindings.setTypesPtr, NIL)
  }

  public enum class GLTFObjectModelType(
    id: Long,
  ) {
    /**
     * Unknown or not set object model type. If the object model type is set to this value, the real
     * type still needs to be determined.
     */
    GLTF_OBJECT_MODEL_TYPE_UNKNOWN(0),
    /**
     * Object model type "bool". Represented in the glTF JSON as a boolean, and encoded in a
     * [GLTFAccessor] as "SCALAR". When encoded in an accessor, a value of `0` is `false`, and any
     * other value is `true`.
     */
    GLTF_OBJECT_MODEL_TYPE_BOOL(1),
    /**
     * Object model type "float". Represented in the glTF JSON as a number, and encoded in a
     * [GLTFAccessor] as "SCALAR".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT(2),
    /**
     * Object model type "float[lb][rb]". Represented in the glTF JSON as an array of numbers, and
     * encoded in a [GLTFAccessor] as "SCALAR".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT_ARRAY(3),
    /**
     * Object model type "float2". Represented in the glTF JSON as an array of two numbers, and
     * encoded in a [GLTFAccessor] as "VEC2".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT2(4),
    /**
     * Object model type "float3". Represented in the glTF JSON as an array of three numbers, and
     * encoded in a [GLTFAccessor] as "VEC3".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT3(5),
    /**
     * Object model type "float4". Represented in the glTF JSON as an array of four numbers, and
     * encoded in a [GLTFAccessor] as "VEC4".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT4(6),
    /**
     * Object model type "float2x2". Represented in the glTF JSON as an array of four numbers, and
     * encoded in a [GLTFAccessor] as "MAT2".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT2X2(7),
    /**
     * Object model type "float3x3". Represented in the glTF JSON as an array of nine numbers, and
     * encoded in a [GLTFAccessor] as "MAT3".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT3X3(8),
    /**
     * Object model type "float4x4". Represented in the glTF JSON as an array of sixteen numbers,
     * and encoded in a [GLTFAccessor] as "MAT4".
     */
    GLTF_OBJECT_MODEL_TYPE_FLOAT4X4(9),
    /**
     * Object model type "int". Represented in the glTF JSON as a number, and encoded in a
     * [GLTFAccessor] as "SCALAR". The range of values is limited to signed integers. For
     * `KHR_interactivity`, only 32-bit integers are supported.
     */
    GLTF_OBJECT_MODEL_TYPE_INT(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GLTFObjectModelType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val appendNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "append_node_path", 1348162250)

    internal val appendPathToPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "append_path_to_property", 1331931644)

    internal val getAccessorTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_accessor_type", 1998183368)

    internal val getGltfToGodotExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_gltf_to_godot_expression", 2240072449)

    internal val setGltfToGodotExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_gltf_to_godot_expression", 1815845073)

    internal val getGodotToGltfExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_godot_to_gltf_expression", 2240072449)

    internal val setGodotToGltfExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_godot_to_gltf_expression", 1815845073)

    internal val getNodePathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_node_paths", 3995934104)

    internal val hasNodePathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "has_node_paths", 36873697)

    internal val setNodePathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_node_paths", 381264803)

    internal val getObjectModelTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_object_model_type", 1094778507)

    internal val setObjectModelTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_object_model_type", 4108684086)

    internal val getJsonPointersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_json_pointers", 3995934104)

    internal val hasJsonPointersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "has_json_pointers", 36873697)

    internal val setJsonPointersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_json_pointers", 381264803)

    internal val getVariantTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "get_variant_type", 3416842102)

    internal val setVariantTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_variant_type", 2887708385)

    internal val setTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFObjectModelProperty", "set_types", 4150728237)
  }
}
