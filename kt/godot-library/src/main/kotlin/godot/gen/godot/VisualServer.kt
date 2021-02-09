// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Image
import godot.VisualServer
import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Plane
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object VisualServer : Object() {
  final const val ARRAY_BONES: Long = 6

  final const val ARRAY_COLOR: Long = 3

  final const val ARRAY_COMPRESS_BONES: Long = 32768

  final const val ARRAY_COMPRESS_COLOR: Long = 4096

  final const val ARRAY_COMPRESS_DEFAULT: Long = 97280

  final const val ARRAY_COMPRESS_INDEX: Long = 131072

  final const val ARRAY_COMPRESS_NORMAL: Long = 1024

  final const val ARRAY_COMPRESS_TANGENT: Long = 2048

  final const val ARRAY_COMPRESS_TEX_UV: Long = 8192

  final const val ARRAY_COMPRESS_TEX_UV2: Long = 16384

  final const val ARRAY_COMPRESS_VERTEX: Long = 512

  final const val ARRAY_COMPRESS_WEIGHTS: Long = 65536

  final const val ARRAY_FLAG_USE_16_BIT_BONES: Long = 524288

  final const val ARRAY_FLAG_USE_2D_VERTICES: Long = 262144

  final const val ARRAY_FORMAT_BONES: Long = 64

  final const val ARRAY_FORMAT_COLOR: Long = 8

  final const val ARRAY_FORMAT_INDEX: Long = 256

  final const val ARRAY_FORMAT_NORMAL: Long = 2

  final const val ARRAY_FORMAT_TANGENT: Long = 4

  final const val ARRAY_FORMAT_TEX_UV: Long = 16

  final const val ARRAY_FORMAT_TEX_UV2: Long = 32

  final const val ARRAY_FORMAT_VERTEX: Long = 1

  final const val ARRAY_FORMAT_WEIGHTS: Long = 128

  final const val ARRAY_INDEX: Long = 8

  final const val ARRAY_MAX: Long = 9

  final const val ARRAY_NORMAL: Long = 1

  final const val ARRAY_TANGENT: Long = 2

  final const val ARRAY_TEX_UV: Long = 4

  final const val ARRAY_TEX_UV2: Long = 5

  final const val ARRAY_VERTEX: Long = 0

  final const val ARRAY_WEIGHTS: Long = 7

  final const val ARRAY_WEIGHTS_SIZE: Long = 4

  final const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0

  final const val BLEND_SHAPE_MODE_RELATIVE: Long = 1

  final const val CANVAS_ITEM_Z_MAX: Long = 4096

  final const val CANVAS_ITEM_Z_MIN: Long = -4096

  final const val CANVAS_LIGHT_FILTER_NONE: Long = 0

  final const val CANVAS_LIGHT_FILTER_PCF13: Long = 5

  final const val CANVAS_LIGHT_FILTER_PCF3: Long = 1

  final const val CANVAS_LIGHT_FILTER_PCF5: Long = 2

  final const val CANVAS_LIGHT_FILTER_PCF7: Long = 3

  final const val CANVAS_LIGHT_FILTER_PCF9: Long = 4

  final const val CANVAS_LIGHT_MODE_ADD: Long = 0

  final const val CANVAS_LIGHT_MODE_MASK: Long = 3

  final const val CANVAS_LIGHT_MODE_MIX: Long = 2

  final const val CANVAS_LIGHT_MODE_SUB: Long = 1

  final const val CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE: Long = 1

  final const val CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE: Long = 2

  final const val CANVAS_OCCLUDER_POLYGON_CULL_DISABLED: Long = 0

  final const val CUBEMAP_BACK: Long = 5

  final const val CUBEMAP_BOTTOM: Long = 2

  final const val CUBEMAP_FRONT: Long = 4

  final const val CUBEMAP_LEFT: Long = 0

  final const val CUBEMAP_RIGHT: Long = 1

  final const val CUBEMAP_TOP: Long = 3

  final const val ENV_BG_CANVAS: Long = 4

  final const val ENV_BG_CLEAR_COLOR: Long = 0

  final const val ENV_BG_COLOR: Long = 1

  final const val ENV_BG_COLOR_SKY: Long = 3

  final const val ENV_BG_KEEP: Long = 5

  final const val ENV_BG_MAX: Long = 7

  final const val ENV_BG_SKY: Long = 2

  final const val ENV_DOF_BLUR_QUALITY_HIGH: Long = 2

  final const val ENV_DOF_BLUR_QUALITY_LOW: Long = 0

  final const val ENV_DOF_BLUR_QUALITY_MEDIUM: Long = 1

  final const val ENV_SSAO_BLUR_1x1: Long = 1

  final const val ENV_SSAO_BLUR_2x2: Long = 2

  final const val ENV_SSAO_BLUR_3x3: Long = 3

  final const val ENV_SSAO_BLUR_DISABLED: Long = 0

  final const val ENV_SSAO_QUALITY_HIGH: Long = 2

  final const val ENV_SSAO_QUALITY_LOW: Long = 0

  final const val ENV_SSAO_QUALITY_MEDIUM: Long = 1

  final const val ENV_TONE_MAPPER_ACES: Long = 3

  final const val ENV_TONE_MAPPER_FILMIC: Long = 2

  final const val ENV_TONE_MAPPER_LINEAR: Long = 0

  final const val ENV_TONE_MAPPER_REINHARD: Long = 1

  final const val FEATURE_MULTITHREADED: Long = 1

  final const val FEATURE_SHADERS: Long = 0

  final const val GLOW_BLEND_MODE_ADDITIVE: Long = 0

  final const val GLOW_BLEND_MODE_REPLACE: Long = 3

  final const val GLOW_BLEND_MODE_SCREEN: Long = 1

  final const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2

  final const val INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

  final const val INFO_2D_ITEMS_IN_FRAME: Long = 6

  final const val INFO_DRAW_CALLS_IN_FRAME: Long = 5

  final const val INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

  final const val INFO_OBJECTS_IN_FRAME: Long = 0

  final const val INFO_SHADER_CHANGES_IN_FRAME: Long = 3

  final const val INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

  final const val INFO_TEXTURE_MEM_USED: Long = 10

  final const val INFO_USAGE_VIDEO_MEM_TOTAL: Long = 8

  final const val INFO_VERTEX_MEM_USED: Long = 11

  final const val INFO_VERTICES_IN_FRAME: Long = 1

  final const val INFO_VIDEO_MEM_USED: Long = 9

  final const val INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Long = 1

  final const val INSTANCE_FLAG_MAX: Long = 2

  final const val INSTANCE_FLAG_USE_BAKED_LIGHT: Long = 0

  final const val INSTANCE_GEOMETRY_MASK: Long = 30

  final const val INSTANCE_GI_PROBE: Long = 7

  final const val INSTANCE_IMMEDIATE: Long = 3

  final const val INSTANCE_LIGHT: Long = 5

  final const val INSTANCE_LIGHTMAP_CAPTURE: Long = 8

  final const val INSTANCE_MAX: Long = 9

  final const val INSTANCE_MESH: Long = 1

  final const val INSTANCE_MULTIMESH: Long = 2

  final const val INSTANCE_NONE: Long = 0

  final const val INSTANCE_PARTICLES: Long = 4

  final const val INSTANCE_REFLECTION_PROBE: Long = 6

  final const val LIGHT_DIRECTIONAL: Long = 0

  final const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED: Long = 1

  final const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE: Long = 0

  final const val LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL: Long = 0

  final const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS: Long = 1

  final const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS: Long = 2

  final const val LIGHT_OMNI: Long = 1

  final const val LIGHT_OMNI_SHADOW_CUBE: Long = 1

  final const val LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL: Long = 1

  final const val LIGHT_OMNI_SHADOW_DETAIL_VERTICAL: Long = 0

  final const val LIGHT_OMNI_SHADOW_DUAL_PARABOLOID: Long = 0

  final const val LIGHT_PARAM_ATTENUATION: Long = 4

  final const val LIGHT_PARAM_CONTACT_SHADOW_SIZE: Long = 7

  final const val LIGHT_PARAM_ENERGY: Long = 0

  final const val LIGHT_PARAM_MAX: Long = 15

  final const val LIGHT_PARAM_RANGE: Long = 3

  final const val LIGHT_PARAM_SHADOW_BIAS: Long = 13

  final const val LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE: Long = 14

  final const val LIGHT_PARAM_SHADOW_MAX_DISTANCE: Long = 8

  final const val LIGHT_PARAM_SHADOW_NORMAL_BIAS: Long = 12

  final const val LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET: Long = 9

  final const val LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET: Long = 10

  final const val LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET: Long = 11

  final const val LIGHT_PARAM_SPECULAR: Long = 2

  final const val LIGHT_PARAM_SPOT_ANGLE: Long = 5

  final const val LIGHT_PARAM_SPOT_ATTENUATION: Long = 6

  final const val LIGHT_SPOT: Long = 2

  final const val MATERIAL_RENDER_PRIORITY_MAX: Long = 127

  final const val MATERIAL_RENDER_PRIORITY_MIN: Long = -128

  final const val MAX_CURSORS: Long = 8

  final const val MAX_GLOW_LEVELS: Long = 7

  final const val MULTIMESH_COLOR_8BIT: Long = 1

  final const val MULTIMESH_COLOR_FLOAT: Long = 2

  final const val MULTIMESH_COLOR_NONE: Long = 0

  final const val MULTIMESH_CUSTOM_DATA_8BIT: Long = 1

  final const val MULTIMESH_CUSTOM_DATA_FLOAT: Long = 2

  final const val MULTIMESH_CUSTOM_DATA_NONE: Long = 0

  final const val MULTIMESH_TRANSFORM_2D: Long = 0

  final const val MULTIMESH_TRANSFORM_3D: Long = 1

  final const val NINE_PATCH_STRETCH: Long = 0

  final const val NINE_PATCH_TILE: Long = 1

  final const val NINE_PATCH_TILE_FIT: Long = 2

  final const val NO_INDEX_ARRAY: Long = -1

  final const val PARTICLES_DRAW_ORDER_INDEX: Long = 0

  final const val PARTICLES_DRAW_ORDER_LIFETIME: Long = 1

  final const val PARTICLES_DRAW_ORDER_VIEW_DEPTH: Long = 2

  final const val PRIMITIVE_LINES: Long = 1

  final const val PRIMITIVE_LINE_LOOP: Long = 3

  final const val PRIMITIVE_LINE_STRIP: Long = 2

  final const val PRIMITIVE_MAX: Long = 7

  final const val PRIMITIVE_POINTS: Long = 0

  final const val PRIMITIVE_TRIANGLES: Long = 4

  final const val PRIMITIVE_TRIANGLE_FAN: Long = 6

  final const val PRIMITIVE_TRIANGLE_STRIP: Long = 5

  final const val REFLECTION_PROBE_UPDATE_ALWAYS: Long = 1

  final const val REFLECTION_PROBE_UPDATE_ONCE: Long = 0

  final const val SCENARIO_DEBUG_DISABLED: Long = 0

  final const val SCENARIO_DEBUG_OVERDRAW: Long = 2

  final const val SCENARIO_DEBUG_SHADELESS: Long = 3

  final const val SCENARIO_DEBUG_WIREFRAME: Long = 1

  final const val SHADER_CANVAS_ITEM: Long = 1

  final const val SHADER_MAX: Long = 3

  final const val SHADER_PARTICLES: Long = 2

  final const val SHADER_SPATIAL: Long = 0

  final const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2

  final const val SHADOW_CASTING_SETTING_OFF: Long = 0

  final const val SHADOW_CASTING_SETTING_ON: Long = 1

  final const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3

  final const val TEXTURE_FLAGS_DEFAULT: Long = 7

  final const val TEXTURE_FLAG_ANISOTROPIC_FILTER: Long = 8

  final const val TEXTURE_FLAG_CONVERT_TO_LINEAR: Long = 16

  final const val TEXTURE_FLAG_FILTER: Long = 4

  final const val TEXTURE_FLAG_MIPMAPS: Long = 1

  final const val TEXTURE_FLAG_MIRRORED_REPEAT: Long = 32

  final const val TEXTURE_FLAG_REPEAT: Long = 2

  final const val TEXTURE_FLAG_USED_FOR_STREAMING: Long = 2048

  final const val TEXTURE_TYPE_2D: Long = 0

  final const val TEXTURE_TYPE_2D_ARRAY: Long = 3

  final const val TEXTURE_TYPE_3D: Long = 4

  final const val TEXTURE_TYPE_CUBEMAP: Long = 2

  final const val VIEWPORT_CLEAR_ALWAYS: Long = 0

  final const val VIEWPORT_CLEAR_NEVER: Long = 1

  final const val VIEWPORT_CLEAR_ONLY_NEXT_FRAME: Long = 2

  final const val VIEWPORT_DEBUG_DRAW_DISABLED: Long = 0

  final const val VIEWPORT_DEBUG_DRAW_OVERDRAW: Long = 2

  final const val VIEWPORT_DEBUG_DRAW_UNSHADED: Long = 1

  final const val VIEWPORT_DEBUG_DRAW_WIREFRAME: Long = 3

  final const val VIEWPORT_MSAA_16X: Long = 4

  final const val VIEWPORT_MSAA_2X: Long = 1

  final const val VIEWPORT_MSAA_4X: Long = 2

  final const val VIEWPORT_MSAA_8X: Long = 3

  final const val VIEWPORT_MSAA_DISABLED: Long = 0

  final const val VIEWPORT_MSAA_EXT_2X: Long = 5

  final const val VIEWPORT_MSAA_EXT_4X: Long = 6

  final const val VIEWPORT_RENDER_INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

  final const val VIEWPORT_RENDER_INFO_2D_ITEMS_IN_FRAME: Long = 6

  final const val VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5

  final const val VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

  final const val VIEWPORT_RENDER_INFO_MAX: Long = 8

  final const val VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME: Long = 0

  final const val VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3

  final const val VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

  final const val VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME: Long = 1

  final const val VIEWPORT_UPDATE_ALWAYS: Long = 3

  final const val VIEWPORT_UPDATE_DISABLED: Long = 0

  final const val VIEWPORT_UPDATE_ONCE: Long = 1

  final const val VIEWPORT_UPDATE_WHEN_VISIBLE: Long = 2

  final const val VIEWPORT_USAGE_2D: Long = 0

  final const val VIEWPORT_USAGE_2D_NO_SAMPLING: Long = 1

  final const val VIEWPORT_USAGE_3D: Long = 2

  final const val VIEWPORT_USAGE_3D_NO_EFFECTS: Long = 3

  val framePostDraw: Signal0 by signal()

  val framePreDraw: Signal0 by signal()

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_VISUALSERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun blackBarsSetImages(
    left: RID,
    top: RID,
    right: RID,
    bottom: RID
  ) {
    TransferContext.writeArguments(_RID to left, _RID to top, _RID to right, _RID to bottom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_BLACK_BARS_SET_IMAGES,
        NIL)
  }

  fun blackBarsSetMargins(
    left: Long,
    top: Long,
    right: Long,
    bottom: Long
  ) {
    TransferContext.writeArguments(LONG to left, LONG to top, LONG to right, LONG to bottom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_BLACK_BARS_SET_MARGINS,
        NIL)
  }

  fun cameraCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun cameraSetCullMask(camera: RID, layers: Long) {
    TransferContext.writeArguments(_RID to camera, LONG to layers)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_CULL_MASK,
        NIL)
  }

  fun cameraSetEnvironment(camera: RID, env: RID) {
    TransferContext.writeArguments(_RID to camera, _RID to env)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_ENVIRONMENT,
        NIL)
  }

  fun cameraSetFrustum(
    camera: RID,
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ) {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size, VECTOR2 to offset, DOUBLE to
        zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_FRUSTUM,
        NIL)
  }

  fun cameraSetOrthogonal(
    camera: RID,
    size: Double,
    zNear: Double,
    zFar: Double
  ) {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_ORTHOGONAL,
        NIL)
  }

  fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Double,
    zNear: Double,
    zFar: Double
  ) {
    TransferContext.writeArguments(_RID to camera, DOUBLE to fovyDegrees, DOUBLE to zNear, DOUBLE to
        zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_PERSPECTIVE,
        NIL)
  }

  fun cameraSetTransform(camera: RID, transform: Transform) {
    TransferContext.writeArguments(_RID to camera, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_TRANSFORM,
        NIL)
  }

  fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to camera, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_USE_VERTICAL_ASPECT, NIL)
  }

  fun canvasCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Double,
    color: Color
  ) {
    TransferContext.writeArguments(_RID to item, VECTOR2 to pos, DOUBLE to radius, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_CIRCLE,
        NIL)
  }

  fun canvasItemAddClipIgnore(item: RID, ignore: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to ignore)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_CLIP_IGNORE, NIL)
  }

  fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to item, VECTOR2 to from, VECTOR2 to to, COLOR to color,
        DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_LINE,
        NIL)
  }

  fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(1,1,1,1),
    texture: RID = RID(),
    normalMap: RID = RID()
  ) {
    TransferContext.writeArguments(_RID to item, _RID to mesh, TRANSFORM2D to transform, COLOR to
        modulate, _RID to texture, _RID to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_MESH,
        NIL)
  }

  fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID,
    normalMap: RID = RID()
  ) {
    TransferContext.writeArguments(_RID to item, _RID to mesh, _RID to texture, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_MULTIMESH, NIL)
  }

  fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: Long = 0,
    yAxisMode: Long = 0,
    drawCenter: Boolean = true,
    modulate: Color = Color(1,1,1,1),
    normalMap: RID = RID()
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, RECT2 to source, _RID to texture,
        VECTOR2 to topleft, VECTOR2 to bottomright, LONG to xAxisMode, LONG to yAxisMode, BOOL to
        drawCenter, COLOR to modulate, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_NINE_PATCH, NIL)
  }

  fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
    normalMap: RID
  ) {
    TransferContext.writeArguments(_RID to item, _RID to particles, _RID to texture, _RID to
        normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_PARTICLES, NIL)
  }

  fun canvasItemAddPolygon(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: RID = RID(),
    normalMap: RID = RID(),
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to item, POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to
        colors, POOL_VECTOR2_ARRAY to uvs, _RID to texture, _RID to normalMap, BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_POLYGON, NIL)
  }

  fun canvasItemAddPolyline(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to item, POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to
        colors, DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_POLYLINE, NIL)
  }

  fun canvasItemAddPrimitive(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    width: Double = 1.0,
    normalMap: RID = RID()
  ) {
    TransferContext.writeArguments(_RID to item, POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to
        colors, POOL_VECTOR2_ARRAY to uvs, _RID to texture, DOUBLE to width, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_PRIMITIVE, NIL)
  }

  fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_RECT,
        NIL)
  }

  fun canvasItemAddSetTransform(item: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_SET_TRANSFORM, NIL)
  }

  fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID = RID()
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, BOOL to tile, COLOR
        to modulate, BOOL to transpose, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT, NIL)
  }

  fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID = RID(),
    clipUv: Boolean = true
  ) {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect,
        COLOR to modulate, BOOL to transpose, _RID to normalMap, BOOL to clipUv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT_REGION, NIL)
  }

  fun canvasItemAddTriangleArray(
    item: RID,
    indices: PoolIntArray,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    bones: PoolIntArray = PoolIntArray(),
    weights: PoolRealArray = PoolRealArray(),
    texture: RID = RID(),
    count: Long = -1,
    normalMap: RID = RID(),
    antialiased: Boolean = false,
    antialiasingUseIndices: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to item, POOL_INT_ARRAY to indices, POOL_VECTOR2_ARRAY to
        points, POOL_COLOR_ARRAY to colors, POOL_VECTOR2_ARRAY to uvs, POOL_INT_ARRAY to bones,
        POOL_REAL_ARRAY to weights, _RID to texture, LONG to count, _RID to normalMap, BOOL to
        antialiased, BOOL to antialiasingUseIndices)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_TRIANGLE_ARRAY, NIL)
  }

  fun canvasItemClear(item: RID) {
    TransferContext.writeArguments(_RID to item)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_CLEAR, NIL)
  }

  fun canvasItemCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun canvasItemSetClip(item: RID, clip: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to clip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_CLIP,
        NIL)
  }

  fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2
  ) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_COPY_TO_BACKBUFFER, NIL)
  }

  fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)
  ) {
    TransferContext.writeArguments(_RID to item, BOOL to useCustomRect, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_CUSTOM_RECT, NIL)
  }

  fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_DISTANCE_FIELD_MODE, NIL)
  }

  fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_DRAW_BEHIND_PARENT, NIL)
  }

  fun canvasItemSetDrawIndex(item: RID, index: Long) {
    TransferContext.writeArguments(_RID to item, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_DRAW_INDEX, NIL)
  }

  fun canvasItemSetLightMask(item: RID, mask: Long) {
    TransferContext.writeArguments(_RID to item, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_LIGHT_MASK, NIL)
  }

  fun canvasItemSetMaterial(item: RID, material: RID) {
    TransferContext.writeArguments(_RID to item, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_MATERIAL, NIL)
  }

  fun canvasItemSetModulate(item: RID, color: Color) {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_MODULATE, NIL)
  }

  fun canvasItemSetParent(item: RID, parent: RID) {
    TransferContext.writeArguments(_RID to item, _RID to parent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_PARENT,
        NIL)
  }

  fun canvasItemSetSelfModulate(item: RID, color: Color) {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_SELF_MODULATE, NIL)
  }

  fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_SORT_CHILDREN_BY_Y, NIL)
  }

  fun canvasItemSetTransform(item: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_TRANSFORM, NIL)
  }

  fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_USE_PARENT_MATERIAL, NIL)
  }

  fun canvasItemSetVisible(item: RID, visible: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_VISIBLE, NIL)
  }

  fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_Z_AS_RELATIVE_TO_PARENT, NIL)
  }

  fun canvasItemSetZIndex(item: RID, zIndex: Long) {
    TransferContext.writeArguments(_RID to item, LONG to zIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_Z_INDEX, NIL)
  }

  fun canvasLightAttachToCanvas(light: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to light, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_ATTACH_TO_CANVAS, NIL)
  }

  fun canvasLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to occluder, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_ATTACH_TO_CANVAS, NIL)
  }

  fun canvasLightOccluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to occluder, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_ENABLED, NIL)
  }

  fun canvasLightOccluderSetLightMask(occluder: RID, mask: Long) {
    TransferContext.writeArguments(_RID to occluder, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_LIGHT_MASK, NIL)
  }

  fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID) {
    TransferContext.writeArguments(_RID to occluder, _RID to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_POLYGON, NIL)
  }

  fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to occluder, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_TRANSFORM, NIL)
  }

  fun canvasLightSetColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_COLOR,
        NIL)
  }

  fun canvasLightSetEnabled(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ENABLED, NIL)
  }

  fun canvasLightSetEnergy(light: RID, energy: Double) {
    TransferContext.writeArguments(_RID to light, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ENERGY, NIL)
  }

  fun canvasLightSetHeight(light: RID, height: Double) {
    TransferContext.writeArguments(_RID to light, DOUBLE to height)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_HEIGHT, NIL)
  }

  fun canvasLightSetItemCullMask(light: RID, mask: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ITEM_CULL_MASK, NIL)
  }

  fun canvasLightSetItemShadowCullMask(light: RID, mask: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ITEM_SHADOW_CULL_MASK, NIL)
  }

  fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Long,
    maxLayer: Long
  ) {
    TransferContext.writeArguments(_RID to light, LONG to minLayer, LONG to maxLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_LAYER_RANGE, NIL)
  }

  fun canvasLightSetMode(light: RID, mode: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_MODE,
        NIL)
  }

  fun canvasLightSetScale(light: RID, scale: Double) {
    TransferContext.writeArguments(_RID to light, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SCALE,
        NIL)
  }

  fun canvasLightSetShadowBufferSize(light: RID, size: Long) {
    TransferContext.writeArguments(_RID to light, LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_BUFFER_SIZE, NIL)
  }

  fun canvasLightSetShadowColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_COLOR, NIL)
  }

  fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_ENABLED, NIL)
  }

  fun canvasLightSetShadowFilter(light: RID, filter: Long) {
    TransferContext.writeArguments(_RID to light, LONG to filter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_FILTER, NIL)
  }

  fun canvasLightSetShadowGradientLength(light: RID, length: Double) {
    TransferContext.writeArguments(_RID to light, DOUBLE to length)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_GRADIENT_LENGTH, NIL)
  }

  fun canvasLightSetShadowSmooth(light: RID, smooth: Double) {
    TransferContext.writeArguments(_RID to light, DOUBLE to smooth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_SMOOTH, NIL)
  }

  fun canvasLightSetTexture(light: RID, texture: RID) {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_TEXTURE, NIL)
  }

  fun canvasLightSetTextureOffset(light: RID, offset: Vector2) {
    TransferContext.writeArguments(_RID to light, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_TEXTURE_OFFSET, NIL)
  }

  fun canvasLightSetTransform(light: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to light, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_TRANSFORM, NIL)
  }

  fun canvasLightSetZRange(
    light: RID,
    minZ: Long,
    maxZ: Long
  ) {
    TransferContext.writeArguments(_RID to light, LONG to minZ, LONG to maxZ)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_Z_RANGE, NIL)
  }

  fun canvasOccluderPolygonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Long) {
    TransferContext.writeArguments(_RID to occluderPolygon, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_SET_CULL_MODE, NIL)
  }

  fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PoolVector2Array,
    closed: Boolean
  ) {
    TransferContext.writeArguments(_RID to occluderPolygon, POOL_VECTOR2_ARRAY to shape, BOOL to
        closed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_SET_SHAPE, NIL)
  }

  fun canvasOccluderPolygonSetShapeAsLines(occluderPolygon: RID, shape: PoolVector2Array) {
    TransferContext.writeArguments(_RID to occluderPolygon, POOL_VECTOR2_ARRAY to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_SET_SHAPE_AS_LINES, NIL)
  }

  fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2
  ) {
    TransferContext.writeArguments(_RID to canvas, _RID to item, VECTOR2 to mirroring)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_SET_ITEM_MIRRORING, NIL)
  }

  fun canvasSetModulate(canvas: RID, color: Color) {
    TransferContext.writeArguments(_RID to canvas, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_SET_MODULATE,
        NIL)
  }

  fun directionalLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_DIRECTIONAL_LIGHT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun draw(swapBuffers: Boolean = true, frameStep: Double = 0.0) {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_DRAW, NIL)
  }

  fun environmentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Double,
    contrast: Double,
    saturation: Double,
    ramp: RID
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to brightness, DOUBLE to
        contrast, DOUBLE to saturation, _RID to ramp)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_ADJUSTMENT, NIL)
  }

  fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    energy: Double = 1.0,
    skyContibution: Double = 0.0
  ) {
    TransferContext.writeArguments(_RID to env, COLOR to color, DOUBLE to energy, DOUBLE to
        skyContibution)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_AMBIENT_LIGHT, NIL)
  }

  fun environmentSetBackground(env: RID, bg: Long) {
    TransferContext.writeArguments(_RID to env, LONG to bg)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_BACKGROUND, NIL)
  }

  fun environmentSetBgColor(env: RID, color: Color) {
    TransferContext.writeArguments(_RID to env, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_BG_COLOR, NIL)
  }

  fun environmentSetBgEnergy(env: RID, energy: Double) {
    TransferContext.writeArguments(_RID to env, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_BG_ENERGY, NIL)
  }

  fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Long) {
    TransferContext.writeArguments(_RID to env, LONG to maxLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_CANVAS_MAX_LAYER, NIL)
  }

  fun environmentSetDofBlurFar(
    env: RID,
    enable: Boolean,
    distance: Double,
    transition: Double,
    farAmount: Double,
    quality: Long
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to distance, DOUBLE to
        transition, DOUBLE to farAmount, LONG to quality)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_DOF_BLUR_FAR, NIL)
  }

  fun environmentSetDofBlurNear(
    env: RID,
    enable: Boolean,
    distance: Double,
    transition: Double,
    farAmount: Double,
    quality: Long
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to distance, DOUBLE to
        transition, DOUBLE to farAmount, LONG to quality)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_DOF_BLUR_NEAR, NIL)
  }

  fun environmentSetFog(
    env: RID,
    enable: Boolean,
    color: Color,
    sunColor: Color,
    sunAmount: Double
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, COLOR to color, COLOR to sunColor,
        DOUBLE to sunAmount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_FOG,
        NIL)
  }

  fun environmentSetFogDepth(
    env: RID,
    enable: Boolean,
    depthBegin: Double,
    depthEnd: Double,
    depthCurve: Double,
    transmit: Boolean,
    transmitCurve: Double
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to depthBegin, DOUBLE to
        depthEnd, DOUBLE to depthCurve, BOOL to transmit, DOUBLE to transmitCurve)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_FOG_DEPTH, NIL)
  }

  fun environmentSetFogHeight(
    env: RID,
    enable: Boolean,
    minHeight: Double,
    maxHeight: Double,
    heightCurve: Double
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to minHeight, DOUBLE to
        maxHeight, DOUBLE to heightCurve)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_FOG_HEIGHT, NIL)
  }

  fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levelFlags: Long,
    intensity: Double,
    strength: Double,
    bloomThreshold: Double,
    blendMode: Long,
    hdrBleedThreshold: Double,
    hdrBleedScale: Double,
    hdrLuminanceCap: Double,
    bicubicUpscale: Boolean
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to levelFlags, DOUBLE to
        intensity, DOUBLE to strength, DOUBLE to bloomThreshold, LONG to blendMode, DOUBLE to
        hdrBleedThreshold, DOUBLE to hdrBleedScale, DOUBLE to hdrLuminanceCap, BOOL to
        bicubicUpscale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_GLOW,
        NIL)
  }

  fun environmentSetSky(env: RID, sky: RID) {
    TransferContext.writeArguments(_RID to env, _RID to sky)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SKY,
        NIL)
  }

  fun environmentSetSkyCustomFov(env: RID, scale: Double) {
    TransferContext.writeArguments(_RID to env, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SKY_CUSTOM_FOV, NIL)
  }

  fun environmentSetSkyOrientation(env: RID, orientation: Basis) {
    TransferContext.writeArguments(_RID to env, BASIS to orientation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SKY_ORIENTATION, NIL)
  }

  fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Double,
    intensity: Double,
    radius2: Double,
    intensity2: Double,
    bias: Double,
    lightAffect: Double,
    aoChannelAffect: Double,
    color: Color,
    quality: Long,
    blur: Long,
    bilateralSharpness: Double
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to radius, DOUBLE to
        intensity, DOUBLE to radius2, DOUBLE to intensity2, DOUBLE to bias, DOUBLE to lightAffect,
        DOUBLE to aoChannelAffect, COLOR to color, LONG to quality, LONG to blur, DOUBLE to
        bilateralSharpness)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SSAO,
        NIL)
  }

  fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Long,
    fadeIn: Double,
    fadeOut: Double,
    depthTolerance: Double,
    roughness: Boolean
  ) {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to maxSteps, DOUBLE to fadeIn,
        DOUBLE to fadeOut, DOUBLE to depthTolerance, BOOL to roughness)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SSR,
        NIL)
  }

  fun environmentSetTonemap(
    env: RID,
    toneMapper: Long,
    exposure: Double,
    white: Double,
    autoExposure: Boolean,
    minLuminance: Double,
    maxLuminance: Double,
    autoExpSpeed: Double,
    autoExpGrey: Double
  ) {
    TransferContext.writeArguments(_RID to env, LONG to toneMapper, DOUBLE to exposure, DOUBLE to
        white, BOOL to autoExposure, DOUBLE to minLuminance, DOUBLE to maxLuminance, DOUBLE to
        autoExpSpeed, DOUBLE to autoExpGrey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_TONEMAP, NIL)
  }

  fun finish() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FINISH, NIL)
  }

  fun forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0) {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FORCE_DRAW, NIL)
  }

  fun forceSync() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FORCE_SYNC, NIL)
  }

  fun freeRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FREE_RID, NIL)
  }

  fun getRenderInfo(info: Long): Long {
    TransferContext.writeArguments(LONG to info)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getTestCube(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_TEST_CUBE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun getTestTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_TEST_TEXTURE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun getVideoAdapterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_VIDEO_ADAPTER_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getVideoAdapterVendor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_VIDEO_ADAPTER_VENDOR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getWhiteTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_WHITE_TEXTURE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun giProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun giProbeGetBias(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_BIAS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun giProbeGetBounds(probe: RID): AABB {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_BOUNDS,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  fun giProbeGetCellSize(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_CELL_SIZE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun giProbeGetDynamicData(probe: RID): PoolIntArray {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_DYNAMIC_DATA, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  fun giProbeGetDynamicRange(probe: RID): Long {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_DYNAMIC_RANGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun giProbeGetEnergy(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_ENERGY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun giProbeGetNormalBias(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_NORMAL_BIAS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun giProbeGetPropagation(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_PROPAGATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun giProbeGetToCellXform(probe: RID): Transform {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_TO_CELL_XFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun giProbeIsCompressed(probe: RID): Boolean {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_IS_COMPRESSED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun giProbeIsInterior(probe: RID): Boolean {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_IS_INTERIOR,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun giProbeSetBias(probe: RID, bias: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to bias)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_BIAS, NIL)
  }

  fun giProbeSetBounds(probe: RID, bounds: AABB) {
    TransferContext.writeArguments(_RID to probe, godot.core.VariantType.AABB to bounds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_BOUNDS,
        NIL)
  }

  fun giProbeSetCellSize(probe: RID, range: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to range)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_CELL_SIZE,
        NIL)
  }

  fun giProbeSetCompress(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_COMPRESS,
        NIL)
  }

  fun giProbeSetDynamicData(probe: RID, data: PoolIntArray) {
    TransferContext.writeArguments(_RID to probe, POOL_INT_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_DYNAMIC_DATA, NIL)
  }

  fun giProbeSetDynamicRange(probe: RID, range: Long) {
    TransferContext.writeArguments(_RID to probe, LONG to range)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_DYNAMIC_RANGE, NIL)
  }

  fun giProbeSetEnergy(probe: RID, energy: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_ENERGY,
        NIL)
  }

  fun giProbeSetInterior(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_INTERIOR,
        NIL)
  }

  fun giProbeSetNormalBias(probe: RID, bias: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to bias)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_NORMAL_BIAS, NIL)
  }

  fun giProbeSetPropagation(probe: RID, propagation: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to propagation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_PROPAGATION, NIL)
  }

  fun giProbeSetToCellXform(probe: RID, xform: Transform) {
    TransferContext.writeArguments(_RID to probe, TRANSFORM to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_TO_CELL_XFORM, NIL)
  }

  fun hasChanged(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_HAS_CHANGED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hasFeature(feature: Long): Boolean {
    TransferContext.writeArguments(LONG to feature)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hasOsFeature(feature: String): Boolean {
    TransferContext.writeArguments(STRING to feature)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_HAS_OS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun immediateBegin(
    immediate: RID,
    primitive: Long,
    texture: RID = RID()
  ) {
    TransferContext.writeArguments(_RID to immediate, LONG to primitive, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_BEGIN, NIL)
  }

  fun immediateClear(immediate: RID) {
    TransferContext.writeArguments(_RID to immediate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_CLEAR, NIL)
  }

  fun immediateColor(immediate: RID, color: Color) {
    TransferContext.writeArguments(_RID to immediate, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_COLOR, NIL)
  }

  fun immediateCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun immediateEnd(immediate: RID) {
    TransferContext.writeArguments(_RID to immediate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_END, NIL)
  }

  fun immediateGetMaterial(immediate: RID): RID {
    TransferContext.writeArguments(_RID to immediate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_GET_MATERIAL,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun immediateNormal(immediate: RID, normal: Vector3) {
    TransferContext.writeArguments(_RID to immediate, VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_NORMAL, NIL)
  }

  fun immediateSetMaterial(immediate: RID, material: RID) {
    TransferContext.writeArguments(_RID to immediate, _RID to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_SET_MATERIAL,
        NIL)
  }

  fun immediateTangent(immediate: RID, tangent: Plane) {
    TransferContext.writeArguments(_RID to immediate, PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_TANGENT, NIL)
  }

  fun immediateUv(immediate: RID, texUv: Vector2) {
    TransferContext.writeArguments(_RID to immediate, VECTOR2 to texUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_UV, NIL)
  }

  fun immediateUv2(immediate: RID, texUv: Vector2) {
    TransferContext.writeArguments(_RID to immediate, VECTOR2 to texUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_UV2, NIL)
  }

  fun immediateVertex(immediate: RID, vertex: Vector3) {
    TransferContext.writeArguments(_RID to immediate, VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_VERTEX, NIL)
  }

  fun immediateVertex2d(immediate: RID, vertex: Vector2) {
    TransferContext.writeArguments(_RID to immediate, VECTOR2 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_VERTEX_2D,
        NIL)
  }

  fun init() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INIT, NIL)
  }

  fun instanceAttachObjectInstanceId(instance: RID, id: Long) {
    TransferContext.writeArguments(_RID to instance, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  fun instanceAttachSkeleton(instance: RID, skeleton: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_ATTACH_SKELETON, NIL)
  }

  fun instanceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun instanceCreate2(base: RID, scenario: RID): RID {
    TransferContext.writeArguments(_RID to base, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_CREATE2, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun instanceGeometrySetAsInstanceLod(instance: RID, asLodOfInstance: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to asLodOfInstance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_AS_INSTANCE_LOD, NIL)
  }

  fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Long) {
    TransferContext.writeArguments(_RID to instance, LONG to shadowCastingSetting)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_CAST_SHADOWS_SETTING, NIL)
  }

  fun instanceGeometrySetDrawRange(
    instance: RID,
    min: Double,
    max: Double,
    minMargin: Double,
    maxMargin: Double
  ) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to min, DOUBLE to max, DOUBLE to
        minMargin, DOUBLE to maxMargin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_DRAW_RANGE, NIL)
  }

  fun instanceGeometrySetFlag(
    instance: RID,
    flag: Long,
    enabled: Boolean
  ) {
    TransferContext.writeArguments(_RID to instance, LONG to flag, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_FLAG, NIL)
  }

  fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_MATERIAL_OVERRIDE, NIL)
  }

  fun instanceSetBase(instance: RID, base: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to base)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_BASE, NIL)
  }

  fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Long,
    weight: Double
  ) {
    TransferContext.writeArguments(_RID to instance, LONG to shape, DOUBLE to weight)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_BLEND_SHAPE_WEIGHT, NIL)
  }

  fun instanceSetCustomAabb(instance: RID, aabb: AABB) {
    TransferContext.writeArguments(_RID to instance, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_CUSTOM_AABB, NIL)
  }

  fun instanceSetExterior(instance: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to instance, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_EXTERIOR,
        NIL)
  }

  fun instanceSetExtraVisibilityMargin(instance: RID, margin: Double) {
    TransferContext.writeArguments(_RID to instance, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_EXTRA_VISIBILITY_MARGIN, NIL)
  }

  fun instanceSetLayerMask(instance: RID, mask: Long) {
    TransferContext.writeArguments(_RID to instance, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_LAYER_MASK, NIL)
  }

  fun instanceSetScenario(instance: RID, scenario: RID) {
    TransferContext.writeArguments(_RID to instance, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_SCENARIO,
        NIL)
  }

  fun instanceSetSurfaceMaterial(
    instance: RID,
    surface: Long,
    material: RID
  ) {
    TransferContext.writeArguments(_RID to instance, LONG to surface, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_SURFACE_MATERIAL, NIL)
  }

  fun instanceSetTransform(instance: RID, transform: Transform) {
    TransferContext.writeArguments(_RID to instance, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_TRANSFORM,
        NIL)
  }

  fun instanceSetUseLightmap(
    instance: RID,
    lightmapInstance: RID,
    lightmap: RID
  ) {
    TransferContext.writeArguments(_RID to instance, _RID to lightmapInstance, _RID to lightmap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_USE_LIGHTMAP, NIL)
  }

  fun instanceSetVisible(instance: RID, visible: Boolean) {
    TransferContext.writeArguments(_RID to instance, BOOL to visible)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_VISIBLE,
        NIL)
  }

  fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): VariantArray<Any?> {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCES_CULL_AABB,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun instancesCullConvex(convex: VariantArray<Any?>, scenario: RID = RID()): VariantArray<Any?> {
    TransferContext.writeArguments(ARRAY to convex, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCES_CULL_CONVEX,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID()
  ): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCES_CULL_RAY,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_DIRECTIONAL_SET_BLEND_SPLITS, NIL)
  }

  fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Long) {
    TransferContext.writeArguments(_RID to light, LONG to rangeMode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_DIRECTIONAL_SET_SHADOW_DEPTH_RANGE_MODE, NIL)
  }

  fun lightDirectionalSetShadowMode(light: RID, mode: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_DIRECTIONAL_SET_SHADOW_MODE, NIL)
  }

  fun lightOmniSetShadowDetail(light: RID, detail: Long) {
    TransferContext.writeArguments(_RID to light, LONG to detail)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_OMNI_SET_SHADOW_DETAIL, NIL)
  }

  fun lightOmniSetShadowMode(light: RID, mode: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_OMNI_SET_SHADOW_MODE, NIL)
  }

  fun lightSetColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_COLOR, NIL)
  }

  fun lightSetCullMask(light: RID, mask: Long) {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_CULL_MASK,
        NIL)
  }

  fun lightSetNegative(light: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_NEGATIVE,
        NIL)
  }

  fun lightSetParam(
    light: RID,
    param: Long,
    value: Double
  ) {
    TransferContext.writeArguments(_RID to light, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_PARAM, NIL)
  }

  fun lightSetProjector(light: RID, texture: RID) {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_PROJECTOR,
        NIL)
  }

  fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_REVERSE_CULL_FACE_MODE, NIL)
  }

  fun lightSetShadow(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_SHADOW, NIL)
  }

  fun lightSetShadowColor(light: RID, color: Color) {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_SHADOW_COLOR,
        NIL)
  }

  fun lightSetUseGi(light: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_USE_GI, NIL)
  }

  fun lightmapCaptureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun lightmapCaptureGetBounds(capture: RID): AABB {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_BOUNDS,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  fun lightmapCaptureGetEnergy(capture: RID): Double {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_ENERGY, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_OCTREE, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Long {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_OCTREE_CELL_SUBDIV, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun lightmapCaptureGetOctreeCellTransform(capture: RID): Transform {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_OCTREE_CELL_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun lightmapCaptureSetBounds(capture: RID, bounds: AABB) {
    TransferContext.writeArguments(_RID to capture, godot.core.VariantType.AABB to bounds)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_BOUNDS, NIL)
  }

  fun lightmapCaptureSetEnergy(capture: RID, energy: Double) {
    TransferContext.writeArguments(_RID to capture, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_ENERGY, NIL)
  }

  fun lightmapCaptureSetOctree(capture: RID, octree: PoolByteArray) {
    TransferContext.writeArguments(_RID to capture, POOL_BYTE_ARRAY to octree)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_OCTREE, NIL)
  }

  fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Long) {
    TransferContext.writeArguments(_RID to capture, LONG to subdiv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_OCTREE_CELL_SUBDIV, NIL)
  }

  fun lightmapCaptureSetOctreeCellTransform(capture: RID, xform: Transform) {
    TransferContext.writeArguments(_RID to capture, TRANSFORM to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_OCTREE_CELL_TRANSFORM, NIL)
  }

  fun makeSphereMesh(
    latitudes: Long,
    longitudes: Long,
    radius: Double
  ): RID {
    TransferContext.writeArguments(LONG to latitudes, LONG to longitudes, DOUBLE to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MAKE_SPHERE_MESH, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun materialCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun materialGetParam(material: RID, parameter: String): Any? {
    TransferContext.writeArguments(_RID to material, STRING to parameter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_GET_PARAM,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun materialGetParamDefault(material: RID, parameter: String): Any? {
    TransferContext.writeArguments(_RID to material, STRING to parameter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_GET_PARAM_DEFAULT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun materialGetShader(shaderMaterial: RID): RID {
    TransferContext.writeArguments(_RID to shaderMaterial)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_GET_SHADER,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun materialSetLineWidth(material: RID, width: Double) {
    TransferContext.writeArguments(_RID to material, DOUBLE to width)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_LINE_WIDTH, NIL)
  }

  fun materialSetNextPass(material: RID, nextMaterial: RID) {
    TransferContext.writeArguments(_RID to material, _RID to nextMaterial)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_NEXT_PASS,
        NIL)
  }

  fun materialSetParam(
    material: RID,
    parameter: String,
    value: Any
  ) {
    TransferContext.writeArguments(_RID to material, STRING to parameter, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_PARAM,
        NIL)
  }

  fun materialSetRenderPriority(material: RID, priority: Long) {
    TransferContext.writeArguments(_RID to material, LONG to priority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_RENDER_PRIORITY, NIL)
  }

  fun materialSetShader(shaderMaterial: RID, shader: RID) {
    TransferContext.writeArguments(_RID to shaderMaterial, _RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_SHADER,
        NIL)
  }

  fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: Long,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = VariantArray(),
    compressFormat: Long = 97280
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to primitive, ARRAY to arrays, ARRAY to
        blendShapes, LONG to compressFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_ADD_SURFACE_FROM_ARRAYS, NIL)
  }

  fun meshClear(mesh: RID) {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_CLEAR, NIL)
  }

  fun meshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun meshGetBlendShapeCount(mesh: RID): Long {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_BLEND_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshGetBlendShapeMode(mesh: RID): VisualServer.BlendShapeMode {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_BLEND_SHAPE_MODE, LONG)
    return VisualServer.BlendShapeMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun meshGetCustomAabb(mesh: RID): AABB {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_CUSTOM_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  fun meshGetSurfaceCount(mesh: RID): Long {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_SURFACE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshRemoveSurface(mesh: RID, index: Long) {
    TransferContext.writeArguments(_RID to mesh, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_REMOVE_SURFACE,
        NIL)
  }

  fun meshSetBlendShapeCount(mesh: RID, amount: Long) {
    TransferContext.writeArguments(_RID to mesh, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SET_BLEND_SHAPE_COUNT, NIL)
  }

  fun meshSetBlendShapeMode(mesh: RID, mode: Long) {
    TransferContext.writeArguments(_RID to mesh, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SET_BLEND_SHAPE_MODE, NIL)
  }

  fun meshSetCustomAabb(mesh: RID, aabb: AABB) {
    TransferContext.writeArguments(_RID to mesh, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SET_CUSTOM_AABB,
        NIL)
  }

  fun meshSurfaceGetAabb(mesh: RID, surface: Long): AABB {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  fun meshSurfaceGetArray(mesh: RID, surface: Long): PoolByteArray {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAY,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Long): Long {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAY_INDEX_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshSurfaceGetArrayLen(mesh: RID, surface: Long): Long {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAY_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshSurfaceGetArrays(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun meshSurfaceGetFormat(mesh: RID, surface: Long): Long {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshSurfaceGetFormatOffset(
    format: Long,
    vertexLen: Long,
    indexLen: Long,
    arrayIndex: Long
  ): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexLen, LONG to indexLen, LONG to
        arrayIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_FORMAT_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshSurfaceGetFormatStride(
    format: Long,
    vertexLen: Long,
    indexLen: Long
  ): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexLen, LONG to indexLen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_FORMAT_STRIDE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun meshSurfaceGetIndexArray(mesh: RID, surface: Long): PoolByteArray {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_INDEX_ARRAY, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  fun meshSurfaceGetMaterial(mesh: RID, surface: Long): RID {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_MATERIAL, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Long): VisualServer.PrimitiveType {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_PRIMITIVE_TYPE, LONG)
    return VisualServer.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_SKELETON_AABB, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Long,
    material: RID
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  fun meshSurfaceUpdateRegion(
    mesh: RID,
    surface: Long,
    offset: Long,
    data: PoolByteArray
  ) {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, LONG to offset, POOL_BYTE_ARRAY to
        data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_UPDATE_REGION, NIL)
  }

  fun multimeshAllocate(
    multimesh: RID,
    instances: Long,
    transformFormat: Long,
    colorFormat: Long,
    customDataFormat: Long = 0
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to instances, LONG to transformFormat,
        LONG to colorFormat, LONG to customDataFormat)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_ALLOCATE,
        NIL)
  }

  fun multimeshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun multimeshGetAabb(multimesh: RID): AABB {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  fun multimeshGetInstanceCount(multimesh: RID): Long {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_INSTANCE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun multimeshGetMesh(multimesh: RID): RID {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_MESH,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun multimeshGetVisibleInstances(multimesh: RID): Long {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_VISIBLE_INSTANCES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun multimeshInstanceGetColor(multimesh: RID, index: Long): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  fun multimeshInstanceGetCustomData(multimesh: RID, index: Long): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_CUSTOM_DATA, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  fun multimeshInstanceGetTransform(multimesh: RID, index: Long): Transform {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun multimeshInstanceGetTransform2d(multimesh: RID, index: Long): Transform2D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM_2D, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Long,
    color: Color
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_COLOR, NIL)
  }

  fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Long,
    customData: Color
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, COLOR to customData)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_CUSTOM_DATA, NIL)
  }

  fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM, NIL)
  }

  fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Long,
    transform: Transform2D
  ) {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM_2D, NIL)
  }

  fun multimeshSetAsBulkArray(multimesh: RID, array: PoolRealArray) {
    TransferContext.writeArguments(_RID to multimesh, POOL_REAL_ARRAY to array)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_SET_AS_BULK_ARRAY, NIL)
  }

  fun multimeshSetMesh(multimesh: RID, mesh: RID) {
    TransferContext.writeArguments(_RID to multimesh, _RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_SET_MESH,
        NIL)
  }

  fun multimeshSetVisibleInstances(multimesh: RID, visible: Long) {
    TransferContext.writeArguments(_RID to multimesh, LONG to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_SET_VISIBLE_INSTANCES, NIL)
  }

  fun omniLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_OMNI_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun particlesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun particlesGetCurrentAabb(particles: RID): AABB {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_GET_CURRENT_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  fun particlesGetEmitting(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_GET_EMITTING,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun particlesIsInactive(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_IS_INACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun particlesRequestProcess(particles: RID) {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_REQUEST_PROCESS, NIL)
  }

  fun particlesRestart(particles: RID) {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_RESTART, NIL)
  }

  fun particlesSetAmount(particles: RID, amount: Long) {
    TransferContext.writeArguments(_RID to particles, LONG to amount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_AMOUNT,
        NIL)
  }

  fun particlesSetCustomAabb(particles: RID, aabb: AABB) {
    TransferContext.writeArguments(_RID to particles, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_CUSTOM_AABB, NIL)
  }

  fun particlesSetDrawOrder(particles: RID, order: Long) {
    TransferContext.writeArguments(_RID to particles, LONG to order)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_DRAW_ORDER, NIL)
  }

  fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Long,
    mesh: RID
  ) {
    TransferContext.writeArguments(_RID to particles, LONG to pass, _RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_DRAW_PASS_MESH, NIL)
  }

  fun particlesSetDrawPasses(particles: RID, count: Long) {
    TransferContext.writeArguments(_RID to particles, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_DRAW_PASSES, NIL)
  }

  fun particlesSetEmissionTransform(particles: RID, transform: Transform) {
    TransferContext.writeArguments(_RID to particles, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_EMISSION_TRANSFORM, NIL)
  }

  fun particlesSetEmitting(particles: RID, emitting: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to emitting)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_EMITTING,
        NIL)
  }

  fun particlesSetExplosivenessRatio(particles: RID, ratio: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_EXPLOSIVENESS_RATIO, NIL)
  }

  fun particlesSetFixedFps(particles: RID, fps: Long) {
    TransferContext.writeArguments(_RID to particles, LONG to fps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_FIXED_FPS, NIL)
  }

  fun particlesSetFractionalDelta(particles: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_FRACTIONAL_DELTA, NIL)
  }

  fun particlesSetLifetime(particles: RID, lifetime: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to lifetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_LIFETIME,
        NIL)
  }

  fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to oneShot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_ONE_SHOT,
        NIL)
  }

  fun particlesSetPreProcessTime(particles: RID, time: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to time)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_PRE_PROCESS_TIME, NIL)
  }

  fun particlesSetProcessMaterial(particles: RID, material: RID) {
    TransferContext.writeArguments(_RID to particles, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_PROCESS_MATERIAL, NIL)
  }

  fun particlesSetRandomnessRatio(particles: RID, ratio: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_RANDOMNESS_RATIO, NIL)
  }

  fun particlesSetSpeedScale(particles: RID, scale: Double) {
    TransferContext.writeArguments(_RID to particles, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_SPEED_SCALE, NIL)
  }

  fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_USE_LOCAL_COORDINATES, NIL)
  }

  fun reflectionProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_AS_INTERIOR, NIL)
  }

  fun reflectionProbeSetCullMask(probe: RID, layers: Long) {
    TransferContext.writeArguments(_RID to probe, LONG to layers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_CULL_MASK, NIL)
  }

  fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_ENABLE_BOX_PROJECTION, NIL)
  }

  fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean) {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_ENABLE_SHADOWS, NIL)
  }

  fun reflectionProbeSetExtents(probe: RID, extents: Vector3) {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_EXTENTS, NIL)
  }

  fun reflectionProbeSetIntensity(probe: RID, intensity: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to intensity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTENSITY, NIL)
  }

  fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color) {
    TransferContext.writeArguments(_RID to probe, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTERIOR_AMBIENT, NIL)
  }

  fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTERIOR_AMBIENT_ENERGY, NIL)
  }

  fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to contrib)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTERIOR_AMBIENT_PROBE_CONTRIBUTION,
        NIL)
  }

  fun reflectionProbeSetMaxDistance(probe: RID, distance: Double) {
    TransferContext.writeArguments(_RID to probe, DOUBLE to distance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_MAX_DISTANCE, NIL)
  }

  fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3) {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_ORIGIN_OFFSET, NIL)
  }

  fun reflectionProbeSetUpdateMode(probe: RID, mode: Long) {
    TransferContext.writeArguments(_RID to probe, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_UPDATE_MODE, NIL)
  }

  fun requestFrameDrawnCallback(
    where: Object,
    method: String,
    userdata: Any
  ) {
    TransferContext.writeArguments(OBJECT to where, STRING to method, ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REQUEST_FRAME_DRAWN_CALLBACK, NIL)
  }

  fun scenarioCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun scenarioSetDebug(scenario: RID, debugMode: Long) {
    TransferContext.writeArguments(_RID to scenario, LONG to debugMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_DEBUG,
        NIL)
  }

  fun scenarioSetEnvironment(scenario: RID, environment: RID) {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_ENVIRONMENT, NIL)
  }

  fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID) {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_FALLBACK_ENVIRONMENT, NIL)
  }

  fun scenarioSetReflectionAtlasSize(
    scenario: RID,
    size: Long,
    subdiv: Long
  ) {
    TransferContext.writeArguments(_RID to scenario, LONG to size, LONG to subdiv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_REFLECTION_ATLAS_SIZE, NIL)
  }

  fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true
  ) {
    TransferContext.writeArguments(OBJECT to image, COLOR to color, BOOL to scale, BOOL to
        useFilter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_BOOT_IMAGE, NIL)
  }

  fun setDebugGenerateWireframes(generate: Boolean) {
    TransferContext.writeArguments(BOOL to generate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_DEBUG_GENERATE_WIREFRAMES, NIL)
  }

  fun setDefaultClearColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_DEFAULT_CLEAR_COLOR, NIL)
  }

  fun shaderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun shaderGetCode(shader: RID): String {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_GET_CODE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun shaderGetDefaultTextureParam(shader: RID, name: String): RID {
    TransferContext.writeArguments(_RID to shader, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_GET_DEFAULT_TEXTURE_PARAM, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun shaderGetParamList(shader: RID): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_GET_PARAM_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun shaderSetCode(shader: RID, code: String) {
    TransferContext.writeArguments(_RID to shader, STRING to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_SET_CODE, NIL)
  }

  fun shaderSetDefaultTextureParam(
    shader: RID,
    name: String,
    texture: RID
  ) {
    TransferContext.writeArguments(_RID to shader, STRING to name, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_SET_DEFAULT_TEXTURE_PARAM, NIL)
  }

  fun skeletonAllocate(
    skeleton: RID,
    bones: Long,
    is2dSkeleton: Boolean = false
  ) {
    TransferContext.writeArguments(_RID to skeleton, LONG to bones, BOOL to is2dSkeleton)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_ALLOCATE, NIL)
  }

  fun skeletonBoneGetTransform(skeleton: RID, bone: Long): Transform {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun skeletonBoneGetTransform2d(skeleton: RID, bone: Long): Transform2D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_GET_TRANSFORM_2D, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_SET_TRANSFORM, NIL)
  }

  fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Long,
    transform: Transform2D
  ) {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_SET_TRANSFORM_2D, NIL)
  }

  fun skeletonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun skeletonGetBoneCount(skeleton: RID): Long {
    TransferContext.writeArguments(_RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun skyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun skySetTexture(
    sky: RID,
    cubeMap: RID,
    radianceSize: Long
  ) {
    TransferContext.writeArguments(_RID to sky, _RID to cubeMap, LONG to radianceSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKY_SET_TEXTURE, NIL)
  }

  fun spotLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SPOT_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun sync() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SYNC, NIL)
  }

  fun textureAllocate(
    texture: RID,
    width: Long,
    height: Long,
    depth3d: Long,
    format: Long,
    type: Long,
    flags: Long = 7
  ) {
    TransferContext.writeArguments(_RID to texture, LONG to width, LONG to height, LONG to depth3d,
        LONG to format, LONG to type, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_ALLOCATE, NIL)
  }

  fun textureBind(texture: RID, number: Long) {
    TransferContext.writeArguments(_RID to texture, LONG to number)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_BIND, NIL)
  }

  fun textureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun textureCreateFromImage(image: Image, flags: Long = 7): RID {
    TransferContext.writeArguments(OBJECT to image, LONG to flags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_CREATE_FROM_IMAGE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun textureDebugUsage(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_DEBUG_USAGE,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun textureGetData(texture: RID, cubeSide: Long = 0): Image? {
    TransferContext.writeArguments(_RID to texture, LONG to cubeSide)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_DATA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  fun textureGetDepth(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_DEPTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun textureGetFlags(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_FLAGS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun textureGetFormat(texture: RID): Image.Format {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_FORMAT,
        LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun textureGetHeight(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun textureGetPath(texture: RID): String {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun textureGetTexid(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_TEXID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun textureGetType(texture: RID): VisualServer.TextureType {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_TYPE, LONG)
    return VisualServer.TextureType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun textureGetWidth(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_WIDTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun textureSetData(
    texture: RID,
    image: Image,
    layer: Long = 0
  ) {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_DATA, NIL)
  }

  fun textureSetDataPartial(
    texture: RID,
    image: Image,
    srcX: Long,
    srcY: Long,
    srcW: Long,
    srcH: Long,
    dstX: Long,
    dstY: Long,
    dstMip: Long,
    layer: Long = 0
  ) {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to srcX, LONG to srcY,
        LONG to srcW, LONG to srcH, LONG to dstX, LONG to dstY, LONG to dstMip, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_DATA_PARTIAL, NIL)
  }

  fun textureSetFlags(texture: RID, flags: Long) {
    TransferContext.writeArguments(_RID to texture, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_FLAGS, NIL)
  }

  fun textureSetPath(texture: RID, path: String) {
    TransferContext.writeArguments(_RID to texture, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_PATH, NIL)
  }

  fun textureSetShrinkAllX2OnSetData(shrink: Boolean) {
    TransferContext.writeArguments(BOOL to shrink)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_SHRINK_ALL_X2_ON_SET_DATA, NIL)
  }

  fun textureSetSizeOverride(
    texture: RID,
    width: Long,
    height: Long,
    depth: Long
  ) {
    TransferContext.writeArguments(_RID to texture, LONG to width, LONG to height, LONG to depth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_SIZE_OVERRIDE, NIL)
  }

  fun texturesKeepOriginal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURES_KEEP_ORIGINAL,
        NIL)
  }

  fun viewportAttachCamera(viewport: RID, camera: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to camera)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_ATTACH_CAMERA,
        NIL)
  }

  fun viewportAttachCanvas(viewport: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_ATTACH_CANVAS,
        NIL)
  }

  fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Long = 0
  ) {
    TransferContext.writeArguments(_RID to viewport, RECT2 to rect, LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_ATTACH_TO_SCREEN, NIL)
  }

  fun viewportCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun viewportDetach(viewport: RID) {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_DETACH, NIL)
  }

  fun viewportGetRenderInfo(viewport: RID, info: Long): Long {
    TransferContext.writeArguments(_RID to viewport, LONG to info)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun viewportGetTexture(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_GET_TEXTURE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  fun viewportRemoveCanvas(viewport: RID, canvas: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_REMOVE_CANVAS,
        NIL)
  }

  fun viewportSetActive(viewport: RID, active: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_ACTIVE,
        NIL)
  }

  fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Long,
    sublayer: Long
  ) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, LONG to layer, LONG to
        sublayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_CANVAS_STACKING, NIL)
  }

  fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D
  ) {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, TRANSFORM2D to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_CANVAS_TRANSFORM, NIL)
  }

  fun viewportSetClearMode(viewport: RID, clearMode: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to clearMode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_CLEAR_MODE, NIL)
  }

  fun viewportSetDebugDraw(viewport: RID, draw: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to draw)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_DEBUG_DRAW, NIL)
  }

  fun viewportSetDisable3d(viewport: RID, disabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_DISABLE_3D, NIL)
  }

  fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_DISABLE_ENVIRONMENT, NIL)
  }

  fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D) {
    TransferContext.writeArguments(_RID to viewport, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_GLOBAL_CANVAS_TRANSFORM, NIL)
  }

  fun viewportSetHdr(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_HDR, NIL)
  }

  fun viewportSetHideCanvas(viewport: RID, hidden: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to hidden)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_HIDE_CANVAS, NIL)
  }

  fun viewportSetHideScenario(viewport: RID, hidden: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to hidden)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_HIDE_SCENARIO, NIL)
  }

  fun viewportSetMsaa(viewport: RID, msaa: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_MSAA, NIL)
  }

  fun viewportSetParentViewport(viewport: RID, parentViewport: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to parentViewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_PARENT_VIEWPORT, NIL)
  }

  fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_RENDER_DIRECT_TO_SCREEN, NIL)
  }

  fun viewportSetScenario(viewport: RID, scenario: RID) {
    TransferContext.writeArguments(_RID to viewport, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SCENARIO,
        NIL)
  }

  fun viewportSetShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Long,
    subdivision: Long
  ) {
    TransferContext.writeArguments(_RID to viewport, LONG to quadrant, LONG to subdivision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SHADOW_ATLAS_QUADRANT_SUBDIVISION, NIL)
  }

  fun viewportSetShadowAtlasSize(viewport: RID, size: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SHADOW_ATLAS_SIZE, NIL)
  }

  fun viewportSetSize(
    viewport: RID,
    width: Long,
    height: Long
  ) {
    TransferContext.writeArguments(_RID to viewport, LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SIZE, NIL)
  }

  fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_TRANSPARENT_BACKGROUND, NIL)
  }

  fun viewportSetUpdateMode(viewport: RID, updateMode: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to updateMode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_UPDATE_MODE, NIL)
  }

  fun viewportSetUsage(viewport: RID, usage: Long) {
    TransferContext.writeArguments(_RID to viewport, LONG to usage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_USAGE,
        NIL)
  }

  fun viewportSetUseArvr(viewport: RID, useArvr: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to useArvr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_USE_ARVR,
        NIL)
  }

  fun viewportSetVflip(viewport: RID, enabled: Boolean) {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_VFLIP,
        NIL)
  }

  enum class ReflectionProbeUpdateMode(
    id: Long
  ) {
    REFLECTION_PROBE_UPDATE_ONCE(0),

    REFLECTION_PROBE_UPDATE_ALWAYS(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightDirectionalShadowDepthRangeMode(
    id: Long
  ) {
    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),

    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BlendShapeMode(
    id: Long
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PrimitiveType(
    id: Long
  ) {
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6),

    PRIMITIVE_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureType(
    id: Long
  ) {
    TEXTURE_TYPE_2D(0),

    TEXTURE_TYPE_CUBEMAP(2),

    TEXTURE_TYPE_2D_ARRAY(3),

    TEXTURE_TYPE_3D(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentSSAOQuality(
    id: Long
  ) {
    ENV_SSAO_QUALITY_LOW(0),

    ENV_SSAO_QUALITY_MEDIUM(1),

    ENV_SSAO_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentDOFBlurQuality(
    id: Long
  ) {
    ENV_DOF_BLUR_QUALITY_LOW(0),

    ENV_DOF_BLUR_QUALITY_MEDIUM(1),

    ENV_DOF_BLUR_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class RenderInfo(
    id: Long
  ) {
    INFO_OBJECTS_IN_FRAME(0),

    INFO_VERTICES_IN_FRAME(1),

    INFO_MATERIAL_CHANGES_IN_FRAME(2),

    INFO_SHADER_CHANGES_IN_FRAME(3),

    INFO_SURFACE_CHANGES_IN_FRAME(4),

    INFO_DRAW_CALLS_IN_FRAME(5),

    INFO_2D_ITEMS_IN_FRAME(6),

    INFO_2D_DRAW_CALLS_IN_FRAME(7),

    INFO_USAGE_VIDEO_MEM_TOTAL(8),

    INFO_VIDEO_MEM_USED(9),

    INFO_TEXTURE_MEM_USED(10),

    INFO_VERTEX_MEM_USED(11);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class NinePatchAxisMode(
    id: Long
  ) {
    NINE_PATCH_STRETCH(0),

    NINE_PATCH_TILE(1),

    NINE_PATCH_TILE_FIT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportRenderInfo(
    id: Long
  ) {
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),

    VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),

    VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    VIEWPORT_RENDER_INFO_2D_ITEMS_IN_FRAME(6),

    VIEWPORT_RENDER_INFO_2D_DRAW_CALLS_IN_FRAME(7),

    VIEWPORT_RENDER_INFO_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportClearMode(
    id: Long
  ) {
    VIEWPORT_CLEAR_ALWAYS(0),

    VIEWPORT_CLEAR_NEVER(1),

    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightOmniShadowDetail(
    id: Long
  ) {
    LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),

    LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShaderMode(
    id: Long
  ) {
    SHADER_SPATIAL(0),

    SHADER_CANVAS_ITEM(1),

    SHADER_PARTICLES(2),

    SHADER_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MultimeshTransformFormat(
    id: Long
  ) {
    MULTIMESH_TRANSFORM_2D(0),

    MULTIMESH_TRANSFORM_3D(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowCastingSetting(
    id: Long
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportDebugDraw(
    id: Long
  ) {
    VIEWPORT_DEBUG_DRAW_DISABLED(0),

    VIEWPORT_DEBUG_DRAW_UNSHADED(1),

    VIEWPORT_DEBUG_DRAW_OVERDRAW(2),

    VIEWPORT_DEBUG_DRAW_WIREFRAME(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportUsage(
    id: Long
  ) {
    VIEWPORT_USAGE_2D(0),

    VIEWPORT_USAGE_2D_NO_SAMPLING(1),

    VIEWPORT_USAGE_3D(2),

    VIEWPORT_USAGE_3D_NO_EFFECTS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentBG(
    id: Long
  ) {
    ENV_BG_CLEAR_COLOR(0),

    ENV_BG_COLOR(1),

    ENV_BG_SKY(2),

    ENV_BG_COLOR_SKY(3),

    ENV_BG_CANVAS(4),

    ENV_BG_KEEP(5),

    ENV_BG_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MultimeshCustomDataFormat(
    id: Long
  ) {
    MULTIMESH_CUSTOM_DATA_NONE(0),

    MULTIMESH_CUSTOM_DATA_8BIT(1),

    MULTIMESH_CUSTOM_DATA_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightOmniShadowMode(
    id: Long
  ) {
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),

    LIGHT_OMNI_SHADOW_CUBE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureFlags(
    id: Long
  ) {
    TEXTURE_FLAG_MIPMAPS(1),

    TEXTURE_FLAG_REPEAT(2),

    TEXTURE_FLAG_FILTER(4),

    TEXTURE_FLAGS_DEFAULT(7),

    TEXTURE_FLAG_ANISOTROPIC_FILTER(8),

    TEXTURE_FLAG_CONVERT_TO_LINEAR(16),

    TEXTURE_FLAG_MIRRORED_REPEAT(32),

    TEXTURE_FLAG_USED_FOR_STREAMING(2048);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Features(
    id: Long
  ) {
    FEATURE_SHADERS(0),

    FEATURE_MULTITHREADED(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class InstanceType(
    id: Long
  ) {
    INSTANCE_NONE(0),

    INSTANCE_MESH(1),

    INSTANCE_MULTIMESH(2),

    INSTANCE_IMMEDIATE(3),

    INSTANCE_PARTICLES(4),

    INSTANCE_LIGHT(5),

    INSTANCE_REFLECTION_PROBE(6),

    INSTANCE_GI_PROBE(7),

    INSTANCE_LIGHTMAP_CAPTURE(8),

    INSTANCE_MAX(9),

    INSTANCE_GEOMETRY_MASK(30);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentSSAOBlur(
    id: Long
  ) {
    ENV_SSAO_BLUR_DISABLED(0),

    ENV_SSAO_BLUR_1x1(1),

    ENV_SSAO_BLUR_2x2(2),

    ENV_SSAO_BLUR_3x3(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentToneMapper(
    id: Long
  ) {
    ENV_TONE_MAPPER_LINEAR(0),

    ENV_TONE_MAPPER_REINHARD(1),

    ENV_TONE_MAPPER_FILMIC(2),

    ENV_TONE_MAPPER_ACES(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentGlowBlendMode(
    id: Long
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MultimeshColorFormat(
    id: Long
  ) {
    MULTIMESH_COLOR_NONE(0),

    MULTIMESH_COLOR_8BIT(1),

    MULTIMESH_COLOR_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CanvasLightShadowFilter(
    id: Long
  ) {
    CANVAS_LIGHT_FILTER_NONE(0),

    CANVAS_LIGHT_FILTER_PCF3(1),

    CANVAS_LIGHT_FILTER_PCF5(2),

    CANVAS_LIGHT_FILTER_PCF7(3),

    CANVAS_LIGHT_FILTER_PCF9(4),

    CANVAS_LIGHT_FILTER_PCF13(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ScenarioDebugMode(
    id: Long
  ) {
    SCENARIO_DEBUG_DISABLED(0),

    SCENARIO_DEBUG_WIREFRAME(1),

    SCENARIO_DEBUG_OVERDRAW(2),

    SCENARIO_DEBUG_SHADELESS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportUpdateMode(
    id: Long
  ) {
    VIEWPORT_UPDATE_DISABLED(0),

    VIEWPORT_UPDATE_ONCE(1),

    VIEWPORT_UPDATE_WHEN_VISIBLE(2),

    VIEWPORT_UPDATE_ALWAYS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayFormat(
    id: Long
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ParticlesDrawOrder(
    id: Long
  ) {
    PARTICLES_DRAW_ORDER_INDEX(0),

    PARTICLES_DRAW_ORDER_LIFETIME(1),

    PARTICLES_DRAW_ORDER_VIEW_DEPTH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CanvasLightMode(
    id: Long
  ) {
    CANVAS_LIGHT_MODE_ADD(0),

    CANVAS_LIGHT_MODE_SUB(1),

    CANVAS_LIGHT_MODE_MIX(2),

    CANVAS_LIGHT_MODE_MASK(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightDirectionalShadowMode(
    id: Long
  ) {
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightParam(
    id: Long
  ) {
    LIGHT_PARAM_ENERGY(0),

    LIGHT_PARAM_SPECULAR(2),

    LIGHT_PARAM_RANGE(3),

    LIGHT_PARAM_ATTENUATION(4),

    LIGHT_PARAM_SPOT_ANGLE(5),

    LIGHT_PARAM_SPOT_ATTENUATION(6),

    LIGHT_PARAM_CONTACT_SHADOW_SIZE(7),

    LIGHT_PARAM_SHADOW_MAX_DISTANCE(8),

    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(9),

    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(10),

    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(11),

    LIGHT_PARAM_SHADOW_NORMAL_BIAS(12),

    LIGHT_PARAM_SHADOW_BIAS(13),

    LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    LIGHT_PARAM_MAX(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayType(
    id: Long
  ) {
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CanvasOccluderPolygonCullMode(
    id: Long
  ) {
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),

    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),

    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class InstanceFlags(
    id: Long
  ) {
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),

    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    INSTANCE_FLAG_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportMSAA(
    id: Long
  ) {
    VIEWPORT_MSAA_DISABLED(0),

    VIEWPORT_MSAA_2X(1),

    VIEWPORT_MSAA_4X(2),

    VIEWPORT_MSAA_8X(3),

    VIEWPORT_MSAA_16X(4),

    VIEWPORT_MSAA_EXT_2X(5),

    VIEWPORT_MSAA_EXT_4X(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightType(
    id: Long
  ) {
    LIGHT_DIRECTIONAL(0),

    LIGHT_OMNI(1),

    LIGHT_SPOT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CubeMapSide(
    id: Long
  ) {
    CUBEMAP_LEFT(0),

    CUBEMAP_RIGHT(1),

    CUBEMAP_BOTTOM(2),

    CUBEMAP_TOP(3),

    CUBEMAP_FRONT(4),

    CUBEMAP_BACK(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
